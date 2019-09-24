package api.github.com.definitions;

import api.github.com.definitions.branch.Commit;
import api.github.com.definitions.comparecommits.Files;

public class CompareCommits {
    public long ahead_by;
    public Commit base_commit;
    public long behind_by;
    public Commit[] commits;
    public String diff_url;
    public Files[] files;
    public String html_url;
    public String patch_url;
    public String permalink_url;
    public String status;
    public long total_commits;
    public String url;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        CompareCommits othersame = ((CompareCommits) other);
        if (ahead_by!= othersame.ahead_by) {
            return false;
        }
        if ((base_commit!= othersame.base_commit)&&((base_commit == null)||(!base_commit.equals(othersame.base_commit)))) {
            return false;
        }
        if (behind_by!= othersame.behind_by) {
            return false;
        }
        if ((commits!= othersame.commits)&&((commits == null)||(!commits.equals(othersame.commits)))) {
            return false;
        }
        if ((diff_url!= othersame.diff_url)&&((diff_url == null)||(!diff_url.equals(othersame.diff_url)))) {
            return false;
        }
        if ((files!= othersame.files)&&((files == null)||(!files.equals(othersame.files)))) {
            return false;
        }
        if ((html_url!= othersame.html_url)&&((html_url == null)||(!html_url.equals(othersame.html_url)))) {
            return false;
        }
        if ((patch_url!= othersame.patch_url)&&((patch_url == null)||(!patch_url.equals(othersame.patch_url)))) {
            return false;
        }
        if ((permalink_url!= othersame.permalink_url)&&((permalink_url == null)||(!permalink_url.equals(othersame.permalink_url)))) {
            return false;
        }
        if ((status!= othersame.status)&&((status == null)||(!status.equals(othersame.status)))) {
            return false;
        }
        if (total_commits!= othersame.total_commits) {
            return false;
        }
        if ((url!= othersame.url)&&((url == null)||(!url.equals(othersame.url)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((((Long.hashCode(ahead_by)+((base_commit == null)? 0 :base_commit.hashCode()))+ Long.hashCode(behind_by))+((commits == null)? 0 :commits.hashCode()))+((diff_url == null)? 0 :diff_url.hashCode()))+((files == null)? 0 :files.hashCode()))+((html_url == null)? 0 :html_url.hashCode()))+((patch_url == null)? 0 :patch_url.hashCode()))+((permalink_url == null)? 0 :permalink_url.hashCode()))+((status == null)? 0 :status.hashCode()))+ Long.hashCode(total_commits))+((url == null)? 0 :url.hashCode()));
    }
}
