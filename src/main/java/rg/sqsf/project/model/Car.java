package rg.sqsf.project.model;

public class Car {
    private Integer id;

    private String name;

    private String type;

    private Double money;

    private Double capacity;

    private String fdjtype;

    private Double pailiang;

    private String qdtype;

    private Double youhao;

    private String colortype;

    private String ly;

    private String kt;

    private String dh;

    private Integer seatnumber;

    private Integer state;
    private String uptime;

    private String sdtype;

    private Integer fbstate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Double getCapacity() {
        return capacity;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    public String getFdjtype() {
        return fdjtype;
    }

    public void setFdjtype(String fdjtype) {
        this.fdjtype = fdjtype == null ? null : fdjtype.trim();
    }

    public Double getPailiang() {
        return pailiang;
    }

    public void setPailiang(Double pailiang) {
        this.pailiang = pailiang;
    }

    public String getQdtype() {
        return qdtype;
    }

    public void setQdtype(String qdtype) {
        this.qdtype = qdtype == null ? null : qdtype.trim();
    }

    public Double getYouhao() {
        return youhao;
    }

    public void setYouhao(Double youhao) {
        this.youhao = youhao;
    }

    public String getColortype() {
        return colortype;
    }

    public void setColortype(String colortype) {
        this.colortype = colortype == null ? null : colortype.trim();
    }

    public String getLy() {
        return ly;
    }

    public void setLy(String ly) {
        this.ly = ly == null ? null : ly.trim();
    }

    public String getKt() {
        return kt;
    }

    public void setKt(String kt) {
        this.kt = kt == null ? null : kt.trim();
    }

    public String getDh() {
        return dh;
    }

    public void setDh(String dh) {
        this.dh = dh == null ? null : dh.trim();
    }

    public Integer getSeatnumber() {
        return seatnumber;
    }

    public void setSeatnumber(Integer seatnumber) {
        this.seatnumber = seatnumber;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getUptime() {
        return uptime;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime;
    }

    public String getSdtype() {
        return sdtype;
    }

    public void setSdtype(String sdtype) {
        this.sdtype = sdtype == null ? null : sdtype.trim();
    }

    public Integer getFbstate() {
        return fbstate;
    }

    public void setFbstate(Integer fbstate) {
        this.fbstate = fbstate;
    }
}