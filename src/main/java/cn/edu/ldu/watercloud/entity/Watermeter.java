package cn.edu.ldu.watercloud.entity;


/**
 * @author wuyt
 * @data 2022/6/7
 * @apiNote
 */
public class Watermeter {
    private int id;
    private double settleflow;
    private double totalflow;
    private double lastflow;
    private double banalnce;
    private double status;

    public Watermeter(int id, double settleflow, double totalflow, double lastflow, double banalnce, double status) {
        this.id = id;
        this.settleflow = settleflow;
        this.totalflow = totalflow;
        this.lastflow = lastflow;
        this.banalnce = banalnce;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public double getSettleflow() {
        return settleflow;
    }

    public double getTotalflow() {
        return totalflow;
    }

    public double getLastflow() {
        return lastflow;
    }

    public double getBanalnce() {
        return banalnce;
    }

    public double getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSettleflow(double settleflow) {
        this.settleflow = settleflow;
    }

    public void setTotalflow(double totalflow) {
        this.totalflow = totalflow;
    }

    public void setLastflow(double lastflow) {
        this.lastflow = lastflow;
    }

    public void setBanalnce(double banalnce) {
        this.banalnce = banalnce;
    }

    public void setStatus(double status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Watermeter{" +
                "id=" + id +
                ", settleflow=" + settleflow +
                ", totalflow=" + totalflow +
                ", lastflow=" + lastflow +
                ", banalnce=" + banalnce +
                ", status=" + status +
                '}';
    }
}
