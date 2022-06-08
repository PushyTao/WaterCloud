package cn.edu.ldu.watercloud.controller;

import cn.edu.ldu.watercloud.entity.ChargeFormMonthly;
import cn.edu.ldu.watercloud.mapper.ProjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/water")
@CrossOrigin(origins = "http://127.0.0.1:5500", allowedHeaders = "*", allowCredentials = "true")
public class DayAndMonthChargeController {
    @Autowired
    ProjectMapper projectMapper;
    @PostMapping("/selectChargeFormMonthly")
    public List<ChargeFormMonthly> MonthlyCharge() {


        //现将年月日切分出来
        List<ChargeFormMonthly> monthly_charges = new ArrayList<>();

        monthly_charges =projectMapper.monthly_charge();

        for (ChargeFormMonthly i: monthly_charges){
            System.out.println(i.toString());
        }
        System.out.println("???");
        return monthly_charges;
    }

}
