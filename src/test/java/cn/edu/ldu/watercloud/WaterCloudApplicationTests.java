package cn.edu.ldu.watercloud;

import cn.edu.ldu.watercloud.dao.UseWaterDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WaterCloudApplicationTests {

	@Autowired
	private UseWaterDao useWaterDao;

	@Test
	void contextLoads() {
//		List<UserMonthCount> ans;
//		ans=useWaterDao.FindByYearAndQuarper(2022,8);
//		for (UserMonthCount an : ans) {
//			System.out.println(an);
//		}
	}

}
