package view;

import br.edu.fateczl.ordenacao.quicksort.QuickSort;

public class Principal {

	public static void main(String[] args) {
		QuickSort qs = new QuickSort();
		int [] vetor1 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		int tamanho1 = vetor1.length;
		int [] vetor2 = {44, 43, 42, 41, 40, 39, 38};
		int tamanho2 = vetor2.length;
		int [] vetor3 = {31, 32, 33, 34, 99, 98, 97, 96};
		int tamanho3 = vetor3.length;
		
		int [] vetor1ord = qs.quickSort(vetor1, 0, tamanho1 - 1);
		int [] vetor2ord = qs.quickSort(vetor2, 0, tamanho2 - 1);
		int [] vetor3ord = qs.quickSort(vetor3, 0, tamanho3 - 1);
		
		System.out.println("Vetor 1:");
		for (int i : vetor1ord) {
			System.out.print(i + " ");	
		}
		System.out.println("\nVetor ordenado\n");
		
		System.out.println("Vetor 2:");
		for (int i : vetor2ord) {
			System.out.print(i + " ");
		}
		System.out.println("\nVetor ordenado\n");
		
		System.out.println("Vetor 3:");
		for (int i : vetor3ord) {
			System.out.print(i + " ");	
		}
		System.out.println("\nVetor ordenado\n");
		
	}

}
