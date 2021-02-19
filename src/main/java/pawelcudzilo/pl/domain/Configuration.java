package pawelcudzilo.pl.domain;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan
@EnableAutoConfiguration
//@EnableJpaRepositories(basePackages = "pawelcudzilo.pl.domain.core.repository")
public class Configuration {
}
