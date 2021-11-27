package pl.coderslab.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.coderslab.beans.*;

@Configuration
@ComponentScan(basePackages = "pl.coderslab.beans")
public class AppConfig {

}
