package ar.edu.utn.frsf.isi.dan.pago;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Leandro Heraldo Tricarique
 * @author Francisco Tomas Gautero
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class DanMsPagoApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(DanMsPagoApplication.class, args);
	}
}
