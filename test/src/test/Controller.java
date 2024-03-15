package test;

import bubbleSort.Biblioteca.BubbleSort;
import mergeSort.Biblioteca.MergeSort;
import quickSort.library.Quicksort;

public class Controller {

	public Controller() {
		super();
	}
	public void comparativoBubble(int[] vet) {
		BubbleSort bbs = new BubbleSort();
		double tinicial = System.nanoTime();
		bbs.bubble_sort(vet);
		double tfinal = System.nanoTime();
		double ttotal = (tfinal - tinicial) / 1000000.0;
		System.out.println(ttotal+" - BubbleSort");
	}
	
	public void comparativoMerge(int[] vet, int inicio, int fim) {
		MergeSort mrg = new MergeSort();
		double tinicial = System.nanoTime();
		mrg.MergeSorting(vet, inicio, fim);
		double tfinal = System.nanoTime();
		double ttotal = (tfinal - tinicial) / 1000000.0;
		System.out.println(ttotal+" - MergeSort");
	}
	public void comparativoQuick(int[] vet, int inicio, int fim) {
		Quicksort qck = new Quicksort();
		double tinicial = System.nanoTime();
		qck.QuickSort(vet, inicio, fim);
		double tfinal = System.nanoTime();
		double ttotal = (tfinal - tinicial) / 1000000.0;
		System.out.println(ttotal+" - QuickSort");
	}
}
