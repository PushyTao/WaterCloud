package cn.edu.ldu.watercloud.utils;

import cn.edu.ldu.watercloud.entity.ResultUWQuarter;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

import java.io.File;
import java.io.IOException;
import java.util.List;


/**
 * @program: WaterCloud
 * @description: 支持导出为excel的类
 * @author: jinjiale
 * @create: 2022-06-08 14:46
 **/
public class DownloadUtils {

    public void download(List<ResultUWQuarter> list1,ResultUWQuarter titles){
        File file = new File("D:\\\\test.xls");
        //判断file是否存在
        if(file.exists()){
            file.delete();
            System.out.println("原有表单删除成功");
        }
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //创建工作簿
        WritableWorkbook workbook = null;
        try {
            workbook = Workbook.createWorkbook(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        WritableSheet sheet1 = workbook.createSheet("sheet1", 0);
        Label label=null;
        //设置列名
        label=new Label(0,0,titles.getUsername());
        try {
            sheet1.addCell(label);
        } catch (WriteException e) {
            e.printStackTrace();
        }
        label=new Label(1,0,titles.getUid());
        try {
            sheet1.addCell(label);
        } catch (WriteException e) {
            e.printStackTrace();
        }
        label=new Label(2,0,titles.getYear());
        try {
            sheet1.addCell(label);
        } catch (WriteException e) {
            e.printStackTrace();
        }
        label=new Label(3,0,new Double(titles.getCnt1()).intValue()+"月");
        try {
            sheet1.addCell(label);
        } catch (WriteException e) {
            e.printStackTrace();
        }
        label=new Label(4,0,new Double(titles.getCnt2()).intValue()+"月");
        try {
            sheet1.addCell(label);
        } catch (WriteException e) {
            e.printStackTrace();
        }
        label=new Label(5,0,new Double(titles.getCnt3()).intValue()+"月");
        try {
            sheet1.addCell(label);
        } catch (WriteException e) {
            e.printStackTrace();
        }

        //方便定义行
        int count=0;
        //将list中的数据添加至工作簿中
        for (ResultUWQuarter quarter : list1) {
            count++;
            label=new Label(0,count,quarter.getUsername());
            try {
                sheet1.addCell(label);
            } catch (WriteException e) {
                e.printStackTrace();
            }
            label=new Label(1,count,quarter.getUid());
            try {
                sheet1.addCell(label);
            } catch (WriteException e) {
                e.printStackTrace();
            }
            label=new Label(2,count,quarter.getYear());
            try {
                sheet1.addCell(label);
            } catch (WriteException e) {
                e.printStackTrace();
            }
            label=new Label(3,count,String.valueOf(quarter.getCnt1()));
            try {
                sheet1.addCell(label);
            } catch (WriteException e) {
                e.printStackTrace();
            }
            label=new Label(4,count,String.valueOf(quarter.getCnt2()));
            try {
                sheet1.addCell(label);
            } catch (WriteException e) {
                e.printStackTrace();
            }
            label=new Label(5,count,String.valueOf(quarter.getCnt3()));
            try {
                sheet1.addCell(label);
            } catch (WriteException e) {
                e.printStackTrace();
            }


        }
        try {
            workbook.write();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (WriteException e) {
            e.printStackTrace();
        }
    }

}
