package poo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.Timer;

public class PruebaTemporizadorDos {

	public static void main(String[] args) {
		
		Reloj miReloj = new Reloj(3000, true);
		miReloj.enMarcha();
		JOptionPane.showMessageDialog(null, "Pulse Aceptar para Terminar");
		System.exit(0);
	}
}

class Reloj{
	public Reloj(int intervalo, boolean sonido){
		this.intervalo=intervalo;
		this.sonido=sonido;
	}
	
	public void enMarcha() {
		ActionListener oyente = new DameLaHoraDos();
		Timer miTemporizador = new Timer (intervalo, oyente);
		miTemporizador.start();

	}
	private int intervalo;
	private boolean sonido;
	
	//Clase Interna
	private class DameLaHoraDos implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent evento) {
			Date ahora = new Date ();
			System.out.println("Te pongo la hora cada 3 sg: " + ahora);
			if(sonido){
				Toolkit.getDefaultToolkit().beep();
			}
			
			
		}
		
		
	}
}