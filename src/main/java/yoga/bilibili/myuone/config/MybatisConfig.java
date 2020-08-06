package yoga.bilibili.myuone.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "yoga.bilibili.myuone.dao")
public class MybatisConfig {
}
