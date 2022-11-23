package a2311;

import java.util.Scanner;

public class exe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int[][] arr = new int[5][4];
		int mediaFinal, notaTotal=0, maiorNota=0, matriculaMaiorNota=0, notaFinalTotal=0, mediaFinalTotal=0;
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<4; j++) {
				System.out.println("Digite o número da matrícula do aluno " +(i+1) +": ");
				arr[i][j] = ler.nextInt();
				j++;
				
				System.out.println("Digite a média das provas do aluno " +(i+1) +": ");
				arr[i][j] = ler.nextInt();
				notaTotal+=arr[i][j];
				j++;
				
				System.out.println("Digite a média dos trabalhos do aluno " +(i+1) +": " );
				arr[i][j] = ler.nextInt();
				notaTotal+=arr[i][j];
				j++;
				
				mediaFinal=notaTotal/2;
				notaTotal=0;
				notaFinalTotal+=mediaFinal;
				mediaFinalTotal=notaFinalTotal/5;
				
				arr[i][j] = mediaFinal;
				j++;
				
				if(mediaFinal>maiorNota) {
					maiorNota=mediaFinal;
					matriculaMaiorNota=arr[i][0];
				}
				
			}
		}
		for(int i=0; i<5; i++) {
			System.out.printf("\n");
			for(int j=0; j<4; j++) {
				System.out.printf(arr[i][j] +" ");
			}
		}
		System.out.println("\n\nMaior nota da turma: " +maiorNota +"\nMatrícula do aluno com a maior nota: " +matriculaMaiorNota +"\nMédia final da turma: " +mediaFinalTotal);

	}

}
