package com.cursoceat.controller;

public class CuentaCorriente {
	public String nombre;
	String dni;
	private double saldo;
	static private String nombreBanco="Ïnternaional Java Bank";
	
	
	
	//metodos getter y setter de nombreBanco
	
	public static String getNombreBanco() {
		return nombreBanco;
	}
	public static void setNombreBanco(String nombreBanco) {
		CuentaCorriente.nombreBanco = nombreBanco;
	}
	public CuentaCorriente(String nombre, String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}
	public CuentaCorriente(String dni, double saldo) {
		super();
		this.dni = dni;
		this.saldo = saldo;
	}
	
	boolean egreso(double cantidad) {
		boolean operacionPosible;
		if(saldo>=cantidad) {
			saldo-=cantidad;
			System.out.println("Tu nuevo saldo es "+saldo);
			operacionPosible=true;
		}else {
			System.out.println("No tiene saldo!...");
			operacionPosible=false;
		}
		
		return operacionPosible;
	}
	
	void ingreso(double cantidad) {
		saldo+=cantidad;
		System.out.println("Tu nuevo saldo es: "+saldo);
	}

	void mostrarInformacion() {
		System.out.println("Nombre: \t"+ nombre);
		System.out.println("DNI: \t"+dni);
		System.out.println("Saldo: \t"+saldo);
		
	}
	

}
