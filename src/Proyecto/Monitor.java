package Proyecto;

import java.util.ArrayList;

public class Monitor extends Empleado{
	private double valorHora;
	ArrayList<Asignaturas> asignaturas=new ArrayList<Asignaturas>();
	
	
	public Monitor(String nombre, String id, String dependencia, String cargo, int cantidadSalarios,
			double salarioMinimo, double valorHora, ArrayList<Asignaturas> asignaturas) {
		super(nombre, id, dependencia, salarioMinimo);
		this.valorHora = valorHora;
		this.asignaturas = asignaturas;
	}
	
	
	public Monitor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Monitor(String nombre, String id, String dependencia, String cargo, int cantidadSalarios,
			double salarioMinimo) {
		super(nombre, id, dependencia, salarioMinimo);
		// TODO Auto-generated constructor stub
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
		return "Monitor [valorHora=" + valorHora + ", asignaturas=" + asignaturas + "]";
	}

	
}
