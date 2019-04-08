package fr.lelouet.jswaggermaker.client.common.impl.securities;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.lelouet.jswaggermaker.client.common.impl.ATransfer;
import fr.lelouet.jswaggermaker.client.common.impl.securities.oauth.AccessToken;
import fr.lelouet.jswaggermaker.client.common.impl.securities.oauth.OAuthTools;

public class Oauth2 extends ATransfer {

	private static final Logger logger = LoggerFactory.getLogger(Oauth2.class);

	private final String basicAuth;

	private final String refreshToken;

	private final String authURL;

	private AccessToken accessToken = null;

	public Oauth2(String refreshToken, String basicAuth, String authURL) {
		this.basicAuth = basicAuth;
		this.refreshToken = refreshToken;
		this.authURL = authURL;
	}

	public boolean isNull() {
		return basicAuth == null || refreshToken == null;
	}

	protected String getAccessToken() {
		if (accessToken == null || accessToken.expire < System.currentTimeMillis()) {
			logger.trace("fetching access token");
			accessToken = OAuthTools.getAccessToken(basicAuth, refreshToken, authURL);
		}
		return accessToken == null ? null : accessToken.token;
	}

	@Override
	protected String addConnection(String url, Map<String, String> props, Map<String, Object> transmit) {
		props.put("Authorization", "Bearer " + getAccessToken());
		return url;
	}

	@Override
	public int hashCode() {
		return (basicAuth != null ? basicAuth.hashCode() : 0) + (refreshToken != null ? refreshToken.hashCode() : 0);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || obj.getClass() != Oauth2.class) {
			return false;
		}
		Oauth2 o = (Oauth2) obj;
		return (refreshToken == null && o.refreshToken == null
				|| refreshToken != null && refreshToken.equals(o.refreshToken))
				&& (basicAuth == null && o.basicAuth == null || basicAuth != null && basicAuth.equals(o.basicAuth));
	}

	// getting the roles

	// private ObservableSet<String> roles;
	//
	// @Override
	// public ObservableSet<String> getRoles() {
	// if (roles == null) {
	// synchronized (this) {
	// if (roles == null) {
	// ObsObjHolder<R_get_characters_character_id_roles> r =
	// cache.characters.roles(verify().CharacterID);
	// roles = FXCollections.observableSet();
	// r.follow((o, old, newroles) -> {
	// synchronized (roles) {
	// Set<String> roleslist = Arrays.asList(newroles.roles).stream().map(role ->
	// role.toString)
	// .collect(Collectors.toSet());
	// roles.retainAll(roleslist);
	// roles.addAll(roleslist);
	// logger.debug("new roles for " + verify().CharacterName + " are " + roles);
	// }
	// });
	// }
	// }
	// }
	// return roles;
	// }


}
