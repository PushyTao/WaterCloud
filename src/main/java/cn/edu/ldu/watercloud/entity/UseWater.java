package cn.edu.ldu.watercloud.entity;

/**
 * @author wuyt
 * @data 2022/6/7
 * @apiNote
 */
public class UseWater {
    private int id;
    private int meterid;
    private int userid;
    private int amount;
    private int year;
    private int month;
    private int day;

    public UseWater(int id, int meterid, int userid, int amount, int year, int month, int day) {
        this.id = id;
        this.meterid = meterid;
        this.userid = userid;
        this.amount = amount;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMeterid() {
        return meterid;
    }

    public void setMeterid(int meterid) {
        this.meterid = meterid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
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

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "UseWater{" +
                "id=" + id +
                ", meterid=" + meterid +
                ", userid=" + userid +
                ", amount=" + amount +
                ", year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
