package cn.nwnu.config;

import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author TurnHug
 * @date 2022/10/2 21:07
 */
@Configuration
@ComponentScan({"cn.nwnu.dao","cn.nwnu.service"})
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class,MybatisConfig.class})
@EnableTransactionManagement
@EnableAspectJAutoProxy
public class SpringConfig {

}
