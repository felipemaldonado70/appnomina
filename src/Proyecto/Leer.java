package Proyecto;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Leer {
	private  ArrayList<Empleado> empleados;
	private  ArrayList<Asignaturas> asignaturas;
	public ArrayList<Empleado> cargarEmpleados(String nombre) throws IOException, NumberFormatException{
		FileReader fr = null;
	    BufferedReader br = null;
		Nomina nomina = new Nomina();		
		try {
			empleados = new ArrayList<Empleado>();
			
			System.out.println("Working Directory = " + System.getProperty("user.dir"));
			fr = new FileReader(nombre);
			br = new BufferedReader(fr);
			String linea = new String();
			while(!(linea = br.readLine()).equalsIgnoreCase("FIN")) {
				String dependencia = "";
				Double cant_salarios = 0.0;
				asignaturas = new ArrayList<Asignaturas>();
			
				String[] sp = linea.split("%");
				//nuevo.setNombre(sp[0]);
				//nuevo.setId(sp[1]);
				//nuevo.setCargo(sp[2]);
				
				for(int i=0; i < sp.length; i++){					
					System.out.println(sp[i]);
				}
				
				linea = br.readLine();
				if (sp[2].equalsIgnoreCase("Profesor")) {	
					//nuevo.setNombre(nuevo.getNombre());
				    //nuevo.setId(nuevo.getId());
					//nuevo.setCargo(sp[2]);
					//
					dependencia = linea;
					System.out.println(dependencia);
					linea = br.readLine();
					//nuevo.setDependencia(linea);					
				}
				if (sp[2].equalsIgnoreCase("Empleado")) {
					cant_salarios = Double.parseDouble(linea);
					//nuevo.setCantidadSalarios(Double.parseDouble(linea));	
					linea = br.readLine();
				}

				//linea = br.readLine();
				while(linea.contains(",")) {
					String[] sp1 = linea.split(",");
					//asig.setNombre(sp1[0]);
					//asig.setNumeroHoras();
					
					Asignaturas asig = new Asignaturas(Integer.parseInt(sp1[1]),sp1[0]);
					asignaturas.add(asig);
					//nuevo.setAsignaturas(asignaturas);
					
					for(int i=0; i < sp1.length; i++){
						System.out.println(sp1[i]);}
					linea = br.readLine();
				}
				//linea = br.readLine();
				//linea = br.readLine();
				//linea = br.readLine();
				
				Empleado nuevo = new Empleado(sp[0],sp[1],dependencia,sp[2],cant_salarios,asignaturas);
				
			
				//emp1 = nuevo.Empleado();
				
				empleados.add(nuevo);
				nomina.setEmpleados(empleados);
				System.out.println("asdasd");
		}
		
			System.out.println("asdasd");
			
		} catch(IOException ex){
			throw new IOException("Error al cargar el archivo");
		} //catch(NumberFormatException ex) {
			//throw new NumberFormatException("Error en alguno de los datos del empleado");
		//}
		return empleados;
	}
	/**
	 * @return the empleados
	 */
	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}
	/**
	 * @param empleados the empleados to set
	 */
	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}
}
