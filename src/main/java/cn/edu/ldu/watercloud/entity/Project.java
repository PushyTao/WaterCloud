package cn.edu.ldu.watercloud.entity;

/**
 * @author wuyt
 * @data 2022/6/7
 * @apiNote
 */
public class Project {
    private int id;
    private String projname;
    private double price;

    public Project(int id, String projname, double price) {
        this.id = id;
        this.projname = projname;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjname() {
        return projname;
    }

    public void setProjname(String projname) {
        this.projname = projname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", projname='" + projname + '\'' +
                ", price=" + price +
                '}';
    }
}
