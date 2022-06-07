package cn.edu.ldu.watercloud.entity;

/**
 * @author wuyt
 * @data 2022/6/7
 * @apiNote
 */
public class Pay {
    private int id;
    private int projid;
    private int meterid;
    private int year;
    private int month;

    public Pay(int id, int projid, int meterid, int year, int month) {
        this.id = id;
        this.projid = projid;
        this.meterid = meterid;
        this.year = year;
        this.month = month;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProjid() {
        return projid;
    }

    public void setProjid(int projid) {
        this.projid = projid;
    }

    public int getMeterid() {
        return meterid;
    }

    public void setMeterid(int meterid) {
        this.meterid = meterid;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "Pay{" +
                "id=" + id +
                ", projid=" + projid +
                ", meterid=" + meterid +
                ", year=" + year +
                ", month=" + month +
                '}';
    }
}
