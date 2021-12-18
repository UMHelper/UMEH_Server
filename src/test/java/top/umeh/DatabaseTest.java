package top.umeh;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootTest
public class DatabaseTest {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    void databaseTest(){
        Long num = jdbcTemplate.queryForObject ("select count(*) from prof", Long.class);
        System.out.println (num);
    }

    @Autowired
    DruidDataSource dataSource;

    @Test
    void druidDataSourceTest(){
        System.out.println (dataSource.getDataSourceStat ());
    }
}
