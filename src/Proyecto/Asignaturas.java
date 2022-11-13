package Proyecto;

import java.util.ArrayList;

public class Asignaturas {
	private int numeroHoras;
	private String nombre;
	public Asignaturas(int numeroHoras, String nombre) {
		super();
		this.numeroHoras = numeroHoras;
		this.nombre = nombre;
	}
	
	/*
	public Asignaturas() {
		super();
		// TODO Auto-generated constructor stub
	}*/
	public int getNumeroHoras() {
		return numeroHoras;
	}
	public void setNumeroHoras(int numeroHoras) {
		this.numeroHoras = numeroHoras;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Asignaturas [numeroHoras=" + numeroHoras + ", nombre=" + nombre + "]";
	}
	
	public static void addAsignatura(String nombre,String nom_asig, int horas, ArrayList<Empleado> empl) {
		ArrayList<Asignaturas> lista = new ArrayList<Asignaturas>();
		//Empleado nuevo = new Empleado();
		//Nomina nomina = new Nomina();
		//Asignaturas asig = new Asignaturas();
		//lista = empl.getAsignaturas();
		System.out.println(empl);
		for(int i=0; i < empl.size(); i++){	
			System.out.println(empl.get(i).getNombre());
			if (empl.get(i).getNombre().equalsIgnoreCase(nombre)){
				lista = empl.get(i).getAsignaturas();
				System.out.println("sdfsdfs");
				
				Asignaturas asig = new Asignaturas(horas,nom_asig);
				lista.add(asig);
				empl.get(i).setAsignaturas(lista);
									
			}
			}
		/*for(int r=0; r < getEmpleados().size(); r++){	
			System.out.println(nuevo.getNombre());
			System.out.println(nuevo.getAsignaturas());	
					
			
				}		*/		
		}
	
}
