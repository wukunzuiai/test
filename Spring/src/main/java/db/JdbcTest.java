package db;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTest {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("/springjdbc.xml");
		JdbcTemplate jdbc = ac.getBean(JdbcTemplate.class);
		String sql = "insert into jdbc_test values(?,?)";
		for (int i = 0; i < 20; i++) {
			//新建
			jdbc.update(sql,i,"test"+i);
		}
	}
}
