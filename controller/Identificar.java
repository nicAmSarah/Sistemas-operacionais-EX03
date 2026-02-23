package controller;

import javax.swing.JOptionPane;

public class Identificar {
	
	public Identificar() {
		
	}
	
	public void identificarVet(int[]vet) {
		for(int numero : vet) {
			if(numero % 2 != 0) {
				JOptionPane.showMessageDialog(null, "o valor " + numero + " é impar");
			}else if(numero % 10 == 0){
				JOptionPane.showMessageDialog(null, numero + " é par e múltiplo de 10");				
			}
			

		}
	}
}
