package cn.domain;

public class Anchor {
    private Integer id; //主键ID
    private String nickname; //主播昵称
    private Integer uid; //直播间ID
    private String uname; //直播间名称
    private String address; //直播间地址
    private Integer cid; //分类ID
    private Category category; //对应分类

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "Anchor{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", uid=" + uid +
                ", uname='" + uname + '\'' +
                ", address='" + address + '\'' +
                ", cid=" + cid +
                ", category=" + category +
                '}';
    }
}
