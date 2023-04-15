package EnterpriseServiceBus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:esbconfig.xml")
public class EnterpriseServiceBusApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnterpriseServiceBusApplication.class, args);
	}

}
