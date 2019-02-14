package rg.sqsf.project.model;

public class Message {
    private Integer msgid;

    private String msgcontent;

    private Integer msgtype;

    private String msgtime;

    private Integer msgstate;

    private Integer carid;

    private Integer userid;

    public Integer getMsgid() {
        return msgid;
    }

    public void setMsgid(Integer msgid) {
        this.msgid = msgid;
    }

    public String getMsgcontent() {
        return msgcontent;
    }

    public void setMsgcontent(String msgcontent) {
        this.msgcontent = msgcontent == null ? null : msgcontent.trim();
    }

    public Integer getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(Integer msgtype) {
        this.msgtype = msgtype;
    }

    public String getMsgtime() {
        return msgtime;
    }

    public void setMsgtime(String msgtime) {
        this.msgtime = msgtime == null ? null : msgtime.trim();
    }

    public Integer getMsgstate() {
        return msgstate;
    }

    public void setMsgstate(Integer msgstate) {
        this.msgstate = msgstate;
    }

    public Integer getCarid() {
        return carid;
    }

    public void setCarid(Integer carid) {
        this.carid = carid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}