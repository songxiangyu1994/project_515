package top.gnibbuq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("top.gnibbuq.mapper")
@SpringBootApplication
public class Project515Application {

    public static void main(String[] args) {
        SpringApplication.run(Project515Application.class, args);
    }

}
