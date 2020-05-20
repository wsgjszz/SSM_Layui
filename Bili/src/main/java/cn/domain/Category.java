package cn.domain;

public class Category {
    private Integer id; //主键ID
    private String cname; //分类名称

    public Category() {
    }

    public Category(Integer id) {
        this.id = id;
    }

    public Category(String cname) {
        this.cname = cname;
    }

    public Category(Integer id, String cname) {
        this.id = id;
        this.cname = cname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", cname='" + cname + '\'' +
                '}';
    }
}
