package br.com.caelum.eats.pagamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EatsPagamentoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EatsPagamentoServiceApplication.class, args);
	}

}
