package com.kodilla.zadanie_4_1__powtorzenie_kolekcji;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class Zadanie41PowtorzenieKolekcjiApplication {

	public static void main(String[] args) {
		SpringApplication.run(Zadanie41PowtorzenieKolekcjiApplication.class, args);

		List<String> companies = new ArrayList<>();
		companies.add("DELL");
		companies.add("APPLE");
		companies.add("SAMSUNG");
		companies.add("SONY");
		companies.add("ALCATEL");

		String concatenatedCompanies = "";
		for (int i = 0; i < 5; i++) {
			concatenatedCompanies += companies.get(i);
			if (i < 4) concatenatedCompanies += ", ";
		}

		System.out.println(concatenatedCompanies);
	}

}
