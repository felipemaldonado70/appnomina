package Proyecto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Interfaz {
	public static void main(String args[]) throws NumberFormatException, IOException {
		int opcion = 0;
		String pausa;
		Scanner s = new Scanner(System.in);
		Scanner op = new Scanner(System.in);
		Nomina nomina = new Nomina();
		ArrayList<Empleado> empl = null;
		
		do {
			System.out.println("0. salir ");
			System.out.println("1. Cargar los empleados de una empresa a partir de un archivo de texto ");
			System.out.println("2. Adicionar una asignatura a un profesor,");
			System.out.println("3. Adicionar una asignatura a un monitor");
			System.out.println("4. Calcular el salario de un Empleado");
			System.out.println("5. Calcular el salario de un Profesor");
			System.out.println("6. Calcular el salario de un Monitor");
			System.out.println("7. Listar los empleados que deben pagar Retención en la Fuente");
			System.out.println("8. Generar la nómina en un archivo");
			System.out.println("9. Hacer persistir la nómina/Salvarla en un archivo binario.");

			System.out.print("Digite la opcion que desea:");
			opcion = op.nextInt();
			switch (opcion) {
				case 1:
					//File archivo = new File ("C:\\archivo.txt");
					String N = "Nomina.txt";
					Leer n1 = new Leer();
					empl = n1.cargarEmpleados(N);
					
					Nomina.imprimirEmpleados();
					//Nomina.listado_empleados();
					System.out.print("Presione enter para continuar... ");
					String pausa1 = s.nextLine();
				break;	
				case 2:
					//lista = nomina.getEmpleados();
					System.out.print("Digite el nombre del empleado: ");
					String nom_emp = s.nextLine();
					System.out.print("Digite el nombre de la asignatura a agregar: ");
					String asignatura = s.nextLine();
					System.out.print("Digite cantidad horas: ");
					String horas = s.nextLine();
					
					empl.get(0);
					Asignaturas.addAsignatura(nom_emp,asignatura,Integer.parseInt(horas),empl);
					Nomina.imprimirEmpleados();
					System.out.print("Presione enter para continuar... ");
					String pausa2 = s.nextLine();
					
				break;	
				case 3:
				break;	
				case 4:
					Nomina.CalcularEmp();
					Nomina.imprimirEmpleados();
					System.out.print("Presione enter para continuar... ");
					pausa = s.nextLine();
				break;	
				case 5:
					//System.out.println("Digite el numero de horas de clase que dicto");
					//double numeroH = s.nextDouble();
					Nomina.CalcularProf();
					Nomina.imprimirEmpleados();
					System.out.print("Presione enter para continuar... ");
					pausa = s.nextLine();
				break;	
				case 6:
					System.out.println("Digite el valor de hora");
					double ValorH = s.nextDouble();
					Nomina.CalcularMon(ValorH);
					Nomina.imprimirEmpleados();
				break;	
				case 7:
				break;	
				case 8:
				break;	
				case 9:
				break;	
			}
		} while (opcion != 0);
		s.close();
		op.close();
	}
}
