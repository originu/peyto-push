package peyto.push.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @author kevin
 *
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Activator {

	public static void main(String[] args) {
		SpringApplication.run( Activator.class, args );
	}
}
