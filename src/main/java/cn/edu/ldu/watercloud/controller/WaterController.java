package cn.edu.ldu.watercloud.controller;

import cn.edu.ldu.watercloud.entity.ChargeDay;
import cn.edu.ldu.watercloud.entity.ChargeFormMonthly;
import cn.edu.ldu.watercloud.entity.ProjectMonthRecordStatistics;
import cn.edu.ldu.watercloud.entity.WaterFeeByMonth;
import cn.edu.ldu.watercloud.mapper.ProjectMapper;
import cn.edu.ldu.watercloud.mapper.ProjectMonthRecordStatisticsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Calendar;
import java.util.List;

@RestController
@RequestMapping("/water")
@CrossOrigin(origins = "http://127.0.0.1:5500", allowedHeaders = "*", allowCredentials = "true")
public class WaterController {

    @Autowired
    ProjectMapper projectMapper;

    @PostMapping("/selectChargeFormDaily")
    public List<ChargeDay> charge_day(){
        return projectMapper.selectByUserAndUseWaterAndProject();
    }
    @PostMapping("/selectWaterInfo")
    public List<ChargeFormMonthly> projectMonth() {
        return projectMapper.monthly_charge();
    }

    //业务：项目月记录总分项统计表,controller
    @Autowired
    ProjectMonthRecordStatisticsMapper tmp;
    @PostMapping("/monthStatistics")
    public List<ProjectMonthRecordStatistics> monthStatistics() {
        Calendar nowYearMonth = Calendar.getInstance();
        int year = nowYearMonth.get(Calendar.YEAR);
        int month = nowYearMonth.get(Calendar.MONTH) + 1;
        int yearmonthCur = year * 100 + month;
        int yearPre = year,monthPre=month-1;
        int yearNext = year,monthNext=month+1;
        if(month == 1) {
            yearPre = year - 1;
            monthPre = 12;
        }
        if(month == 12) {
            yearNext = year + 1;
            monthNext = 1;
        }
        return tmp.queryAll(yearPre * 100 + monthPre,yearmonthCur,
                yearNext * 100 + monthNext);
    }

    @PostMapping("/selectWaterFeeMonthly")
    public List<WaterFeeByMonth> MonthlyFee(){
        Calendar nowYearMonth = Calendar.getInstance();
        int year = nowYearMonth.get(Calendar.YEAR);
        int month = nowYearMonth.get(Calendar.MONTH) + 1;
        return tmp.queryWaterFee(year,month);
    }
}
