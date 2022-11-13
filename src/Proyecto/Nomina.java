package Proyecto;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Nomina {
	static ArrayList<Empleado> empleados=new ArrayList<Empleado>();

	public Nomina(ArrayList<Empleado> empleados) {
		super();
		this.empleados = empleados;
	}

	public Nomina() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}

	@Override
	public String toString() {
		return "Nomina [empleados=" + empleados + "]";
	}
	
	
	public static void addEmpleados(Empleado nuevo) {
		empleados.add(nuevo);
	}
	
	


	public static void CalcularEmp(){
		int a=0;
		for (Empleado b : empleados) {
			if (b.getCargo().equalsIgnoreCase("Empleado")) {
				b.setBase(1000000.00*b.getCantidadSalarios());
				b.setSalarioMinimo(0.75*(b.getBase()));
				a++;
			}
		}
	}
	
	public static void CalcularProf() {
		int a=0;
		double total = 0.0;
		for (Empleado b : empleados) {
			int totalhoras = 0;
			for(int i=0; i < b.getAsignaturas().size(); i++){
				totalhoras = totalhoras + b.getAsignaturas().get(i).getNumeroHoras();
			}
			
			System.out.println(totalhoras);
			
			
			if (b.getCargo().equalsIgnoreCase("Profesor")) {
				if(b.getDependencia().equalsIgnoreCase("Catedra")) {
					b.setBase(1000000.00*0.5);
					//b.setSalarioMinimo((0.75*(b.getBase()))*totalhoras);
				}
				else if(b.getDependencia().equalsIgnoreCase("Instructor")){
					b.setBase(1000000.00*1);
					//b.setSalarioMinimo((0.75*(b.getBase()))*totalhoras);
				}
				else if(b.getDependencia().equalsIgnoreCase("Asistente")){
					b.setBase(1000000.00*1.5);
					//b.setSalarioMinimo(((b.getBase())*totalhoras)*0.75);
				}
				else if(b.getDependencia().equalsIgnoreCase("Asociado")){
					b.setBase(1000000.00*2);
					//b.setSalarioMinimo((0.75*(b.getBase()))*totalhoras);
					
				}
				else if(b.getDependencia().equalsIgnoreCase("Titular")){
					b.setBase(1000000.00*2.5);					
				}
				
				DecimalFormat df = new DecimalFormat("#");
			    df.setMaximumFractionDigits(8);
	            total = (b.getBase())*totalhoras;
	            System.out.println(df.format(total));
				b.setSalarioMinimo(total*0.75);
				
				
				System.out.println(total);
				System.out.println(b.getSalarioMinimo());
				a++;
			}
		}
	}
	
	public static void CalcularMon(Double ValorHT){
		int a=0;
		for (Empleado b : empleados) {
			if (b.getCargo().equalsIgnoreCase("Monitor")) {
				b.setBase(ValorHT*(b.getCantidadSalarios()));
				b.setSalarioMinimo(b.getBase());
				a++;
			}
		}
	}
	
	public static void imprimirEmpleados () {
		for (Empleado b :empleados) {
			System.out.println(b);
		}
	}
	
	
	public static void listado_empleados()
	{	
		String string = "";
		for (int i=0; i<getEmpleados().size();i++) {
			string+= "Nombre: " + getEmpleados().get(i).getNombre() + "\n";
			string+= "Id: " + getEmpleados().get(i).getId() + "\n";
			System.out.println(string);
		}
		
	}
		
	
	
	public static Empleado Buscar(String c,String b) { 
		if (c != null) {
			for (Empleado v : empleados) {
				if (v.getNombre().equalsIgnoreCase(c)||v.getId().equalsIgnoreCase(b)) {
					return v;

				}
			}

		}
		return null;
	}
	
	/*
	public static void AgregarP(String nombre, String id, String dependencia, String cargo) {
			Empleado b=new Empleado(nombre, id, dependencia, cargo);
             empleados.add(b);
		}
	
	
	public static void Agregar(String nombre, String id, String dependencia, Double salarioMinimo) {
		
			Empleado b=new Empleado(nombre, id, dependencia, salarioMinimo);
			empleados.add(b);
			
	}*/
}
