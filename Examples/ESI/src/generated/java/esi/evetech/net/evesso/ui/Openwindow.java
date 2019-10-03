package esi.evetech.net.evesso.ui;

import esi.evetech.net.Evesso;
import esi.evetech.net.evesso.ui.openwindow.Contract;
import esi.evetech.net.evesso.ui.openwindow.Information;
import esi.evetech.net.evesso.ui.openwindow.Marketdetails;
import esi.evetech.net.evesso.ui.openwindow.Newmail;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Openwindow
    extends DelegateTransfer<Evesso>
{
    public final Contract contract;
    public final Information information;
    public final Marketdetails marketdetails;
    public final Newmail newmail;

    public Openwindow(Evesso delegate) {
        super(delegate);
        contract = new Contract((delegate));
        information = new Information((delegate));
        marketdetails = new Marketdetails((delegate));
        newmail = new Newmail((delegate));
    }
}
