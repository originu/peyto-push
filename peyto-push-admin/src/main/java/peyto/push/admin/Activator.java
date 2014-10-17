package peyto.push.admin;

import java.io.IOException;

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

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run( Activator.class, args );

		// localhost:9000
		
		Process p = null; 
		try {
			Thread.sleep( 1000 );
			String[]	params	= { "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe", "localhost:9000" };
			p = Runtime.getRuntime().exec( params );
			p.waitFor();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(p.exitValue());
		}
	}
}
