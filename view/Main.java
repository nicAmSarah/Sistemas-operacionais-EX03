package view;

import javax.swing.JOptionPane;

import controller.Identificar;

public class Main {
	
	public static void main (String[] args) {
		
		int tamanho = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o tamanho do vetor"));
		
		if(tamanho > 100) {
			JOptionPane.showMessageDialog(null,"Invalido, digite um valor que seja menor que 100");
		}else {
			int[] vet = new int[tamanho];
			for (int i = 0; i < tamanho; i++) {
				vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor")); 
			}
			Identificar verificar = new Identificar();
			verificar.identificarVet(vet);
			
			
		}
		
	}
	
}
