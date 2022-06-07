package cn.edu.ldu.watercloud.entity;

/**
 * @author wuyt
 * @data 2022/6/7
 * @apiNote
 */
public class Buy {
    private int id;
    private double amount;
    private double price;
    private String provider;
    private int year;
    private int month;
    private int day;

    public Buy(int id, double amount, double price, String provider, int year, int month, int day) {
        this.id = id;
        this.amount = amount;
        this.price = price;
        this.provider = provider;
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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
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
        return "Buy{" +
                "id=" + id +
                ", amount=" + amount +
                ", price=" + price +
                ", provider='" + provider + '\'' +
                ", year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
