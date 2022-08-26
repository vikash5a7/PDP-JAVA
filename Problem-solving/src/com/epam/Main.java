package com.epam;

public class Main {
	public static void main(String[] args) {
		Vikash v = new Vikash() {
			
			@Override
			public void addFeatures() {
				System.out.println("hi");
				
			}
		};
		
		v.addFeatures();
	}

}
