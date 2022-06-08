package cn.edu.ldu.watercloud.entity;

import java.util.Arrays;

/**
 * @program: WaterCloud
 * @description: 用户报表按季的结果类
 * @author: jinjiale
 * @create: 2022-06-08 08:18
 **/
public class ResultUWQuarter {
    private String username;
    private String uid;
    private String year;
    private double cnt1;
    private double cnt2;
    private double cnt3;

    public double getCnt1() {
        return cnt1;
    }

    public void setCnt1(double cnt1) {
        this.cnt1 = cnt1;
    }

    public double getCnt2() {
        return cnt2;
    }

    public void setCnt2(double cnt2) {
        this.cnt2 = cnt2;
    }

    public double getCnt3() {
        return cnt3;
    }

    public void setCnt3(double cnt3) {
        this.cnt3 = cnt3;
    }


    public ResultUWQuarter() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "ResultUWQuarter{" +
                "username='" + username + '\'' +
                ", uid=" + uid +
                ", year=" + year +
                ", cnt1=" + cnt1 +
                ", cnt2=" + cnt2 +
                ", cnt3=" + cnt3 +
                '}';
    }

    public ResultUWQuarter(String username, String uid, String year, double cnt1, double cnt2, double cnt3) {
        this.username = username;
        this.uid = uid;
        this.year = year;
        this.cnt1 = cnt1;
        this.cnt2 = cnt2;
        this.cnt3 = cnt3;
    }
}
