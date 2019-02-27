package com.cg.billing.client;

import java.util.Scanner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainClass {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
		
		//Scanner sc = new Scanner(System.in);
		
		//System.out.println("Welcome To Mobile Billing System");
		//System.out.println("1. Add New Customer ");
		//System.out.println("2. Check Available Plans ");
		//System.out.println("3. Generate Bill ");
	}
}