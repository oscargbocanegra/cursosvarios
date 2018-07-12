package poo;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.util.*;

public class PruebaTemporizador {

	public static void main(String[] args) {
		DameLaHora oyente = new DameLaHora(); 
		Timer mitemporizador = new Timer(5000,oyente);
		mitemporizador.start();
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para detener");
		System.exit(0);
	}
}

class DameLaHora implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Date ahora = new Date();
		System.out.println("Te ppongo la hora cada 5 sg: " + ahora);
		//Toolkit.getDefaultToolkit().beep(); //Funcion que pone el sonido de windows
	}
}