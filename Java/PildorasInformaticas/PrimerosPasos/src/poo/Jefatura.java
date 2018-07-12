package poo;

public class Jefatura extends Empleado2 implements Jefes{
	
	public Jefatura(String nom, double sue, int agno, int mes, int dia) {
		super(nom, sue, agno, mes, dia);
	}
	
	public void estableceIncentivo(double b ){
		incentivo = b;
	}
	
	public double getSueldo(){
		double sueldoJefe = super.getSueldo();
		
		return sueldoJefe + incentivo;
	}
	
	private double incentivo;

	@Override
	public String tomarDecisiones(String decision) {
		return "Un miembro de la direccion a tomado la decision de: " + decision;
	}

	@Override
	public double establece_bonus(double gratificacion) {
		double prima = 2000;
		return Trabajadores.BONUS_BASE+gratificacion+prima;
	}

}
