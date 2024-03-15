package main;

import java.util.Random;

import test.Controller;

public class Principal {

	public static void main(String[] args) {
		Controller tst = new Controller();
		int[] vet = new int [1500];
		Random gerador = new Random();
		int tamanho = vet.length;
		for(int i = 0; i < 1500; i++) {
			vet[i] = gerador.nextInt();
		}
		tst.comparativoBubble(vet);
		tst.comparativoMerge(vet, tamanho, tamanho);
		tst.comparativoQuick(vet, tamanho, tamanho);
	}

}
