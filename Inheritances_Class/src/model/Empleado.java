package model;

import java.util.Scanner;

public class Empleado extends Persona
{
	protected String cargo;
	protected double salario;
	static Scanner sc = new Scanner(System.in);
	
	public Empleado()
	{
		System.out.print("Nuevo Empleado");
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void entrarCargoSalario()
	{
		System.out.print("Ingrese su cargo por la empresa: ");
		this.cargo = sc.next();
		System.out.print("Ingrese su sueldo mensual: $");
		this.salario = sc.nextDouble(); //Dado que el sueldo es con centavos (en la mayoria de los casos), se sugiere que se utilice double.
	}

	/*
	 * La idea es que vaya mostrando los detalles con cada salto de linea. Por eso se sugiere que se utilice println para cada detalle.
	 */
	public void mostrarDatosEmpleado()
	{
		System.out.println("Cargo: "+cargo+"\nSueldo: $"+salario+" mensuales");
	}
}
