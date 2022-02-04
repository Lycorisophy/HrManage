package cn.lysoy.hr;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author lysoy
 */
@SpringBootApplication
@MapperScan(basePackages = {"cn.lysoy.hr.mapper"})
public class HrApplicationApplication {
    public static void main(String[] args) {
        SpringApplication.run(HrApplicationApplication.class, args);
    }
}
