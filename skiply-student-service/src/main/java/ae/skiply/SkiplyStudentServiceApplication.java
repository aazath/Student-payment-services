package ae.skiply;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableWebMvc
//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
@EnableSwagger2
public class SkiplyStudentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkiplyStudentServiceApplication.class, args);
	}

	
}
