package rg.sqsf.project.model;

public class News {
    private Integer newid;

    private String newtitle;

    private String newcontent;

    private String newtime;
    private String newupdatetime;

    private Integer newstate;

    public Integer getNewid() {
        return newid;
    }

    public void setNewid(Integer newid) {
        this.newid = newid;
    }

    public String getNewtitle() {
        return newtitle;
    }

    public void setNewtitle(String newtitle) {
        this.newtitle = newtitle == null ? null : newtitle.trim();
    }

    public String getNewcontent() {
        return newcontent;
    }

    public void setNewcontent(String newcontent) {
        this.newcontent = newcontent == null ? null : newcontent.trim();
    }

    public String getNewtime() {
        return newtime;
    }

    public void setNewtime(String newtime) {
        this.newtime = newtime == null ? null : newtime.trim();
    }

    public String getNewupdatetime() {
        return newupdatetime;
    }

    public void setNewupdatetime(String newupdatetime) {
        this.newupdatetime = newupdatetime;
    }

    public Integer getNewstate() {
        return newstate;
    }

    public void setNewstate(Integer newstate) {
        this.newstate = newstate;
    }
}