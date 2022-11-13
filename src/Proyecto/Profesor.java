package Proyecto;

import java.util.ArrayList;

public class Profesor extends Empleado {
	private String escalafon;
	private double valorHora;
	ArrayList<Asignaturas> asignaturas=new ArrayList<Asignaturas>();
	
	
	public Profesor(String nombre, String id, String dependencia, String cargo, int cantidadSalarios,
			double salarioMinimo, String escalafon, double valorHora, ArrayList<Asignaturas> asignaturas) {
		super(nombre, id, dependencia, cargo);
		this.escalafon = escalafon;
		this.valorHora = valorHora;
		this.asignaturas = asignaturas;
	}
	
	
	public Profesor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Profesor(String nombre, String id, String dependencia, String cargo, int cantidadSalarios,
			double salarioMinimo) {
		super(nombre, id, dependencia, cargo);
		// TODO Auto-generated constructor stub
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
		return "Profesor [escalafon=" + escalafon + ", valorHora=" + valorHora + ", asignaturas=" + asignaturas + "]";
	}
	
	
}
