package cn.edu.fjjx.online_xdclass;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("cn.edu.fjjx.online_xdclass.mapper")
@EnableTransactionManagement
public class OnlineXdclassApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineXdclassApplication.class, args);
    }

}
