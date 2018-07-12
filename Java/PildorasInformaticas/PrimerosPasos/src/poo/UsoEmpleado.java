package poo;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class UsoEmpleado {

	public static void main(String[] args) {
		
		Jefatura jefe_RRHH = new Jefatura("Juan ", 55000, 2006, 9, 25);
		Empleado2[] misempleados  = new Empleado2[5];
		misempleados[0] = new Empleado2("Paco Gomez ", 85000, 1990, 03, 21);
		misempleados[1] = new Empleado2("Ana Lopez ", 95000, 1995, 06, 02);
		misempleados[2] = new Empleado2("Maria Martin ", 105000, 2002, 03, 15);
		misempleados[3] = jefe_RRHH;
		misempleados[4] = new Jefatura("Maria ", 95000, 1999, 5, 26);
		
		Jefatura jefa_finanzas = (Jefatura) misempleados[4];
		jefa_finanzas.estableceIncentivo(65000);
		
		System.out.println(jefa_finanzas.tomarDecisiones("Dar mas dias de Vacaciones a los empleados"));
		
		System.out.println("El Jefe " + jefa_finanzas.dameNombre() + "Tene un bono de  " + jefa_finanzas.establece_bonus(500));
		
		System.out.println(misempleados[3].dameNombre() + "Tiene un bonus de " + misempleados[3].establece_bonus(200));
		
		
		for (Empleado2 empleado : misempleados) {
			empleado.setSueldo(5);
		}
		
		Arrays.sort(misempleados);
		
		for (Empleado2 e : misempleados) {
			System.out.println("Nombre: " + e.dameNombre() + 
								" : Sueldo : " + e.getSueldo()+ 
								"Fecha de Alta : " + e.getAltaContrato());
		}
	}
}

class Empleado {
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private double porcentaje; 
	
	// Constructor de la clase Empleado
		public Empleado(String nom, double sue, int agno, int mes, int dia){
			nombre = nom;
			sueldo = sue;
			GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
			altaContrato = calendario.getTime();
		}
		
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		
		double aumento = sueldo * porcentaje / 100;
		sueldo += aumento;
	}

	public Date getAltaContrato() {
		return altaContrato;
	}

	public void setAltaContrato(Date altaContrato) {
		this.altaContrato = altaContrato;
	}
}
