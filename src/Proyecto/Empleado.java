package Proyecto;

import java.util.ArrayList;

public class Empleado {
	protected String nombre;
	protected String id;
	protected String dependencia;
	protected String cargo;
	protected double cantidadSalarios;
	protected double salarioMinimo;
	protected double base;
	private String escalafon;
	private double valorHora;
	ArrayList<Asignaturas> asignaturas=new ArrayList<Asignaturas>();
	
	public Empleado(String nombre, String id, String dependencia, String cargo, double cantidadSalarios,
			 ArrayList<Asignaturas> asignaturas) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.dependencia = dependencia;
		this.cargo = cargo;
		this.cantidadSalarios = cantidadSalarios;
		this.asignaturas = asignaturas;
	}
	
	/*
	public Empleado(String nombre, String iD, String dependencia, Double valorSM) {
		this.nombre = nombre;
		id = iD;
		this.dependencia = dependencia;
		this.cantidadSalarios = cantidadSalarios;
	}*/
	/*
	 * Metodo constructor sobrecargado que recibe como parametros el nombre, id,
	 *  dependencia y valor del salario minimo de un empleado.
	 */
	
	/*
	public Empleado(String nombre2, String iD2, String dep, String cargo2) {
		this.nombre = nombre2;
		id = iD2;
		this.dependencia = dep;
		this.cargo = cargo2;
	}*/
	
	/*
	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}*/
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDependencia() {
		return dependencia;
	}
	public void setDependencia(String dependencia) {
		this.dependencia = dependencia;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getCantidadSalarios() {
		return cantidadSalarios;
	}
	public void setCantidadSalarios(double cantidadSalarios) {
		this.cantidadSalarios = cantidadSalarios;
	}
	public double getSalarioMinimo() {
		return salarioMinimo;
	}
	public void setSalarioMinimo(double salarioMinimo) {
		this.salarioMinimo = salarioMinimo;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	
	
	public String getEscalafon() {
		return escalafon;
	}
	public void setEscalafon(String escalafon) {
		this.escalafon = escalafon;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	public ArrayList<Asignaturas> getAsignaturas() {
		return asignaturas;
	}
	public void setAsignaturas(ArrayList<Asignaturas> asignaturas) {
		this.asignaturas = asignaturas;
	}
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", id=" + id + ", dependencia=" + dependencia + ", cargo=" + cargo
				+ ", cantidadSalarios=" + cantidadSalarios + ", salarioMinimo=" + salarioMinimo + ", base=" + base
				+ ", escalafon=" + escalafon + ", valorHora=" + valorHora + ", asignaturas=" + asignaturas + "]";
	}
	
	
	
	
}
