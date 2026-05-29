package com.distribuida;

import com.distribuida.model.Cliente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibreriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibreriaApplication.class, args);
		System.out.println("Hola mundo desde spring boot");
		Cliente cliente = new Cliente(
				1
				,"1782701985"
				,"Alan"
				,"Brito"
				,"Quito"
				,"0978654895"
				,"abrito@correo.edu"
		);
		System.out.println(cliente.toString());
	}



}