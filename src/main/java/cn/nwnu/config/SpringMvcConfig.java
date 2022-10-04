package cn.nwnu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author TurnHug
 * @date 2022/10/2 21:09
 */
@Configuration
@ComponentScan("cn.nwnu")
@EnableWebMvc
public class SpringMvcConfig {
}
