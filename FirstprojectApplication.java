package com.generation.firstproject;

import java.io.Console;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.generation.firstproject.models.Pera;
import com.generation.firstproject.models.Perro;


@SpringBootApplication
public class FirstprojectApplication {


	public static void main(String[] args) {
		SpringApplication.run(FirstprojectApplication.class, args);
		Console console = System.console();
		Perro perroDefault = new Perro(); //creando un perro con el constructor por defecto
		Perro perroCompleto = new Perro("popo","liso","salchicha",true);
		Perro perroQuiltro = new Perro("pipi","rulos","quiltro",true);

		perroDefault.setNombre("copi-copi");
		perroDefault.setPelaje("pelo duro");
		perroDefault.setRaza("gucci");
		perroDefault.setVacunado(true);

		System.out.println("aaaa"+perroCompleto.toString());
		System.out.println(perroQuiltro.toString());

		perroDefault.ladrar();
		System.out.println(perroCompleto.truco("da la pata"));
		System.out.println(perroDefault.getNombre());


		Pera pera = new Pera("dulce",10,"verdosa",100f,"lisa","mediana", 50);
		System.out.println(pera);
		



	}

	
}


