package cn.edu.ldu.watercloud;

import cn.edu.ldu.watercloud.mapper.ProjectMapper;
import cn.edu.ldu.watercloud.mapper.UseWaterMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
	@Test
	public void testQueryByQuarter() {
		double ans = useWaterMapper.queryByQuarter();
		System.out.println(ans);
	}

}
