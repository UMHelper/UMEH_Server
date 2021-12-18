package top.umeh.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Box
 */
@Configuration
public class DataSourceConfig {

    @ConfigurationProperties("spring.datasource")
    @Bean
    public DruidDataSource druidDataSource() throws SQLException {
        DruidDataSource druidDataSource=new DruidDataSource ();
        druidDataSource.setFilters ("stat,wall");
        return druidDataSource;
    }

    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        StatViewServlet statViewServlet = new StatViewServlet ();
        ServletRegistrationBean<StatViewServlet> registrationBean = new ServletRegistrationBean<> (statViewServlet,"/druid/*");
        Map<String,String> parameters=new HashMap<> ();
        parameters.put ("loginUsername","umeh");
        parameters.put ("loginPassword","123456");
        parameters.put ("resetEnable","true");
        registrationBean.setInitParameters (parameters);

        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        WebStatFilter webStatFilter=new WebStatFilter ();
        FilterRegistrationBean<WebStatFilter> registrationBean = new FilterRegistrationBean<> (webStatFilter);
        registrationBean.setUrlPatterns (Arrays.asList ("/*"));
        Map<String,String> parameters=new HashMap<> ();
        parameters.put ("exclusions","*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        registrationBean.setInitParameters (parameters);

        return registrationBean;
    }
}
