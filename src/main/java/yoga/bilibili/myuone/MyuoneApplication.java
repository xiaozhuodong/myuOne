package yoga.bilibili.myuone;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("yoga.bilibili.myuone.dao")
public class MyuoneApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyuoneApplication.class, args);
    }

}
