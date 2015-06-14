package com.yiyilabs;

import com.github.javafaker.Faker;

public class PersonGenerator {

	private static final Faker FAKER = new Faker();

	public PersonGenerator() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return FAKER.name().fullName();
	}

}
