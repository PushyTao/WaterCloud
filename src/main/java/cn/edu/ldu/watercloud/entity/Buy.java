package cn.edu.ldu.watercloud.entity;

import lombok.*;

/**
 * @author wuyt
 * @data 2022/6/7
 * @apiNote
 */
@Data//lombok
@NoArgsConstructor//无参构造
@Getter
@Setter
@AllArgsConstructor//全参构造
@ToString
public class Buy {
    private int id;
    private double amount;
    private double price;
    private String provider;
    private int year;
    private int month;
    private int day;
}
