package com.sc.oops.abstractpack;

public class VehiclesImplementation extends Vehicles{


	public void car() {
		System.out.println("road");
		
	}


	public void ship() {
		System.out.println("water");
		
	}

	
	@Override
	public void train(String train) {
		
		System.out.println("rail");
		super.train(train);
		}
	
	public static void main(String[] args) {
		
		VehiclesImplementation vi= new VehiclesImplementation();
		
		vi.car();
		vi.ship();
		vi.train("express");
		
	}
}
