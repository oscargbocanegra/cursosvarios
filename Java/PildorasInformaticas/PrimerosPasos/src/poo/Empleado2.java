package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado2 extends Persona implements Comparable, Trabajadores{

	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private double porcentaje;
	private int Id;
	private static int IdSiguiente;

	// Constructor de la clase Empleado
	public Empleado2(String nom, double sue, int agno, int mes, int dia) {
		super(nom);
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
		altaContrato = calendario.getTime();
		++IdSiguiente;
		Id = IdSiguiente;
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

	@Override
	public String dameDescripcion() {
		return "Este empleado tiene un Id = "  + Id + "y un sueldo de: " + sueldo;
	}

	@Override
	public int compareTo(Object miObjeto) {
		
		Empleado2 otroempleado = (Empleado2) miObjeto;
		
		if(this.sueldo<otroempleado.sueldo){
			return -1;
		}
		
		if(this.sueldo>otroempleado.sueldo){
			return 1;
		}
		
		return 0;
	}

	@Override
	public double establece_bonus(double gratificacion) {
		return Trabajadores.BONUS_BASE + gratificacion;
	}
}
