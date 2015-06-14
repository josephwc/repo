package com.yiyilabs;

import com.github.javafaker.Faker;

public class Person {

	private static final Faker FAKER = new Faker();

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return FAKER.name().fullName();
	}

}
