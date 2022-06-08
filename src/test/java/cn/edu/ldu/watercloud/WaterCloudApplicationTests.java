package cn.edu.ldu.watercloud;

import cn.edu.ldu.watercloud.entity.ChargeFormMonthly;
import cn.edu.ldu.watercloud.entity.Daily_charge;
//import cn.edu.ldu.watercloud.entity.Monthly_charge;
import cn.edu.ldu.watercloud.entity.ProjectMonthRecordStatistics;
import cn.edu.ldu.watercloud.mapper.ProjectMapper;
import cn.edu.ldu.watercloud.mapper.ProjectMonthRecordStatisticsMapper;
import cn.edu.ldu.watercloud.mapper.UseWaterMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@SpringBootTest
class WaterCloudApplicationTests {

	@Autowired
	ProjectMapper projectMapper;

	@Autowired
	UseWaterMapper useWaterMapper;
	@Test
	void contextLoads() {
		System.out.println(projectMapper.selectByUserAndUseWaterAndProject());
	}
	/*@Test
	public void testQueryByQuarter() {
		double ans = useWaterMapper.queryByQuarter(1);
		System.out.println(ans);
	}*/
	@Test
	public void testQuery() {
		List ret = new ArrayList<>();
		ret.add("wuyt");
		ret.add("1");
		ret.add("2022");
		ret.add("1");
		ret.add("2");
		ret.add("3");
//		ret.add(String.valueOf(useWaterMapper.queryByQuarter()));
//        useWaterMapper.queryByQuarter();
//		return ret;
		System.out.println(ret.toString());
	}

	@Test
	public void test_Daily_charge_and_Monthly_charge(){
		List<ChargeFormMonthly> list2 = projectMapper.monthly_charge();
		for (ChargeFormMonthly i: list2){
			System.out.println(i.toString());
		}
	}

	@Autowired
	ProjectMonthRecordStatisticsMapper projectMonthRecordStatisticsMapper;
	@Test
	public void testLongSQL() {
		List<ProjectMonthRecordStatistics> t = projectMonthRecordStatisticsMapper.queryAll(202205, 202206, 202207);
		System.out.println(t);
	}
	@Autowired
	ProjectMonthRecordStatisticsMapper tmp;
	@Test
	public void testLongSQLQuery() {
		Calendar t = Calendar.getInstance();
		int year = t.get(Calendar.YEAR);
		int month = t.get(Calendar.MONTH) + 1;
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
		System.out.println(yearPre*100 + monthPre);
		System.out.println(yearNext * 100 + monthNext);
		List<ProjectMonthRecordStatistics> tt = tmp.queryAll(yearPre * 100 + monthPre, yearmonthCur,
				yearNext * 100 + monthNext);
		tt.forEach(System.out::println);
	}
}
