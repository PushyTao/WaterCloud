package cn.edu.ldu.watercloud.entity;

import lombok.*;

import java.util.Date;

/**
 * @author wuyt
 * @data 2022/6/7
 * @apiNote
 */
@Data//lombok
@NoArgsConstructor//无参构造
@AllArgsConstructor//全参构造
public class User {
    private int id;
    private String name;
    private int meterid;
    private int projid;
    private Date jointime;
    private int ifexit;
    private Date exittime;
}
