package a2311;

import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[][] arr = new int[10][3];
		int contadorN1=0, contadorN2=0, contadorN3=0, aux=999, n1, n2, n3;
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<3; j++) {
				System.out.println("Digite a nota do aluno " +(i+1) +" na prova " +(j+1) +": ");
				n1 = ler.nextInt();
				arr[i][j] = n1;
				j++;
				
				System.out.println("Digite a nota do aluno " +(i+1) +" na prova " +(j+1) +": ");
				n2 = ler.nextInt();
				arr[i][j] = n2;
				j++;
				
				System.out.println("Digite a nota do aluno " +(i+1) +" na prova " +(j+1) +": ");
				n3 = ler.nextInt();
				arr[i][j] = n3;
				j++;
				if(n1<n2 & n1<n3 | n1==n2 | n1==n3) {
					contadorN1++;
				}else if(n2<n1 & n2<n3 | n2==n1 | n2==n3) {
					contadorN2++;
				}else if(n3<n1 & n3<n2 | n3==n1 | n3==n2) {
					contadorN3++;
				}
			}
		}
		System.out.println("Prova 1 - Prova 2 - Prova 3 ");
		for(int i=0; i<10; i++) {
			System.out.printf("\nAluno " +(i+1) +" - ");
			for(int j=0; j<3; j++) {
				System.out.printf(arr[i][j] +" ");
			}
	}
		System.out.println("\nQuantidade de alunos com a pior nota na prova 1: " +contadorN1 +"\nQuantidade de alunos com a pior nota na prova 2: "
				+ contadorN2 +"\nQuantidade de alunos com a pior nota na prova 3: " +contadorN3);
		

	}
	}
