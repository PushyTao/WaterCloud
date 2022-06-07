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
public class Pay {
    private int id;
    private int projid;
    private int meterid;
    private int year;
    private int month;


}
