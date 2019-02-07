package model;

import java.util.Scanner;
/**
 * This project is based on Ricardo "Camargod" Camargo's class. The idea is to complete this project and leaving Persona as the Superclass or inherited class. Any question please ask me in WhatsApp
 * or send me an email to geblarot96@gmail.com
 * @author Gabe
 *
 */
public class Persona 
{
	protected String nombre;
	protected int edad, documento;
	static Scanner sc = new Scanner(System.in);
	
	public Persona()
	{
		
	}
	/*
	 * Getters and Setters creados por default
	 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getDocumento() {
		return documento;
	}

	public void setDocumento(int documento) {
		this.documento = documento;
	}
	/*
	 * Aqui se ponen los datos de la nueva persona segun la empresa
	 */
	
	public void entrarDatosPersonales() 
	{
		System.out.print("Entrar nombre completo: ");
		sc.nextLine(); // Se usa nextLine para captar el nombre completo CON ESPACIOS
		System.out.print("Ingresar edad: ");
		sc.nextInt();
		System.out.print("Ingresar documento: ");
		sc.nextInt();
		
	}
	/*
	 * La idea es que vaya mostrando los detalles con cada salto de linea. Por eso se sugiere que se utilice println para cada detalle.
	 */
	public void mostrarDatosPersonales() 
	{
		System.out.println("Nombres y Apellidos: "+nombre+"\nEdad: "+edad+"\nDocumento de Identidad: "+documento);
	}
	
}
