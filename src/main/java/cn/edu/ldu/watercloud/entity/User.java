package cn.edu.ldu.watercloud.entity;

import java.util.Date;

/**
 * @author wuyt
 * @data 2022/6/7
 * @apiNote
 */
public class User {
    private int id;
    private String name;
    private int meterid;
    private int projid;
    private Date jointime;
    private int ifexit;
    private Date exittime;

    public User(int id, String name, int meterid, int projid, Date jointime, int ifexit, Date exittime) {
        this.id = id;
        this.name = name;
        this.meterid = meterid;
        this.projid = projid;
        this.jointime = jointime;
        this.ifexit = ifexit;
        this.exittime = exittime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMeterid() {
        return meterid;
    }

    public void setMeterid(int meterid) {
        this.meterid = meterid;
    }

    public int getProjid() {
        return projid;
    }

    public void setProjid(int projid) {
        this.projid = projid;
    }

    public Date getJointime() {
        return jointime;
    }

    public void setJointime(Date jointime) {
        this.jointime = jointime;
    }

    public int getIfexit() {
        return ifexit;
    }

    public void setIfexit(int ifexit) {
        this.ifexit = ifexit;
    }

    public Date getExittime() {
        return exittime;
    }

    public void setExittime(Date exittime) {
        this.exittime = exittime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", meterid=" + meterid +
                ", projid=" + projid +
                ", jointime=" + jointime +
                ", ifexit=" + ifexit +
                ", exittime=" + exittime +
                '}';
    }
}
