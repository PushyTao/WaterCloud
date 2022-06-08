package cn.edu.ldu.watercloud.controller;

import cn.edu.ldu.watercloud.dao.UseWaterDao;
import cn.edu.ldu.watercloud.entity.ResultUWQuarter;
import cn.edu.ldu.watercloud.entity.User;
import cn.edu.ldu.watercloud.utils.DownloadUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

/**
 * @program: WaterCloud
 * @description: 用户报表的控制类
 * @author: jinjiale0626
 * @create: 2022-06-07 17:33
 **/
@CrossOrigin
@RestController
public class UseWaterQuarterController {
    @Autowired
    private UseWaterDao useWaterDao;
    double[] cnt=new double[3];
    @RequestMapping("/tmp") //默认的跳转页面
    public List<ResultUWQuarter> UserMana(Model model){
        List<ResultUWQuarter>giv=new LinkedList<>();
        List<User> userList=useWaterDao.getAllUser();
        for (User user : userList) {
            ResultUWQuarter resultUWQuarter=new ResultUWQuarter();
            resultUWQuarter.setUsername(user.getName());
            resultUWQuarter.setUid(String.valueOf(user.getId()));
            resultUWQuarter.setYear("2022");///默认
            for(int i=4;i<=6;i++){
                Double t=useWaterDao.FindByYearAndQuarper(2022,i,user.getId());
                if(t==null)
                    cnt[(i-1)%3]=0;
                else{
                    cnt[(i-1)%3]=t.doubleValue();
                    /*System.out.println(user.getId());
                    System.out.println(cnt[(i-1)%3]);
                    System.out.println("==============================");*/
                }
            }
            resultUWQuarter.setCnt1(cnt[0]);
            resultUWQuarter.setCnt2(cnt[1]);
            resultUWQuarter.setCnt3(cnt[2]);
            giv.add(resultUWQuarter);
        }
//        System.out.println("===============UserMana=================");
        for (ResultUWQuarter resultUWQuarter : giv) {
            System.out.println(resultUWQuarter);
        }
//        System.out.println("==============UserMana==================");
        return giv;
    }

    @PostMapping("/find")
    @ResponseBody
    public List<ResultUWQuarter> form(String year, String select1){
        System.out.println(year);
        System.out.println(select1);
        int cnt_year= Integer.parseInt(year);
        int cnt_month=Integer.parseInt(select1);
        List<ResultUWQuarter>giv=new LinkedList<>();
        List<User> userList=useWaterDao.getAllUser();
        for (User user : userList) {
            ResultUWQuarter resultUWQuarter=new ResultUWQuarter();
            resultUWQuarter.setUsername(user.getName());
            resultUWQuarter.setUid(String.valueOf(user.getId()));
            resultUWQuarter.setYear(year);///默认
            for(int i=(cnt_month-1)*3+1;i<=(cnt_month-1)*3+3;i++){
                Double t=useWaterDao.FindByYearAndQuarper(cnt_year,i,user.getId());
                if(t==null)
                    cnt[(i-1)%3]=0;
                else {
                    cnt[(i - 1) % 3] = t.doubleValue();
                    /*System.out.println(user.getId());
                    System.out.println(cnt[(i - 1) % 3]);*/
//                    System.out.println("==============================");
                }
            }
            resultUWQuarter.setCnt1(cnt[0]);
            resultUWQuarter.setCnt2(cnt[1]);
            resultUWQuarter.setCnt3(cnt[2]);
            giv.add(resultUWQuarter);
        }
        System.out.println("===============form=================");
        for (ResultUWQuarter resultUWQuarter : giv) {
            System.out.println(resultUWQuarter);
        }
        System.out.println("==============form==================");
        return giv;
    }
    @RequestMapping("/tmp_month") //默认的跳转页面
    public List<ResultUWQuarter> TmpMonth(){
        List<ResultUWQuarter> resultUWQuarters=new LinkedList<>();
        System.out.println("==============TmpMonth==================");
        ResultUWQuarter resultUWQuarter=new ResultUWQuarter();
        resultUWQuarter.setUsername("用户名称");
        resultUWQuarter.setUid("用户编码");
        resultUWQuarter.setYear("年份");
        resultUWQuarter.setCnt1(4);
        resultUWQuarter.setCnt2(5);
        resultUWQuarter.setCnt3(6);
        resultUWQuarters.add(resultUWQuarter);
        System.out.println("==============TmpMonth==================");
        return resultUWQuarters;
    }
    @RequestMapping("/find_month")
    public List<ResultUWQuarter> FindMonth(String year, String select1){
        int cnt_year= Integer.parseInt(year);
        int cnt_month=Integer.parseInt(select1);
        List<ResultUWQuarter> resultUWQuarters=new LinkedList<>();
        System.out.println("==============FindMonth==================");
        ResultUWQuarter resultUWQuarter=new ResultUWQuarter();
        resultUWQuarter.setUsername("用户名称");
        resultUWQuarter.setUid("用户编码");
        resultUWQuarter.setYear("年份");
        resultUWQuarter.setCnt1((cnt_month-1)*3+1);
        resultUWQuarter.setCnt2((cnt_month-1)*3+2);
        resultUWQuarter.setCnt3((cnt_month-1)*3+3);
        resultUWQuarters.add(resultUWQuarter);
        System.out.println("==============FindMonth==================");
        return resultUWQuarters;
    }

    @RequestMapping("/download")
    public void Download(String year,String select1){
        List<ResultUWQuarter> list= form(year,select1);
        List<ResultUWQuarter> list1=FindMonth(year,select1);
        DownloadUtils downloadUtils=new DownloadUtils();
        downloadUtils.download(list,list1.get(0));
    }
}
