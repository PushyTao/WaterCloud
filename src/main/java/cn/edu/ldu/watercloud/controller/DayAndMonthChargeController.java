package cn.edu.ldu.watercloud.controller;

import cn.edu.ldu.watercloud.entity.Daily_charge;
import cn.edu.ldu.watercloud.entity.Monthly_charge;
import cn.edu.ldu.watercloud.entity.result.WaterFormYear;
import cn.edu.ldu.watercloud.mapper.ProjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/yiqing_war/water")
@CrossOrigin(origins = "http://127.0.0.1:8080", allowedHeaders = "*", allowCredentials = "true")
public class DayAndMonthChargeController {
    @Autowired
    ProjectMapper projectMapper;
    @PostMapping("/selectChargeFormMonthly")
    public List<Monthly_charge> MonthlyCharge() {

        String datetemp = "2022-06-07";
        //现将年月日切分出来
        List<Monthly_charge> monthly_charges = new ArrayList<>();
        String[] arr = datetemp.split("-");
        int year = Integer.parseInt(arr[0]);
        int month = Integer.parseInt(arr[1]);
        monthly_charges =projectMapper.monthly_charge(year,month);

        for (Monthly_charge i: monthly_charges){
            System.out.println(i.toString());
        }
        System.out.println("???");
        return monthly_charges;
    }

}
