package test;

import java.util.HashMap;
import java.util.Scanner;

import sort.Insertion;
import sort.Merge;
import sort.MergeSort;
import sort.Selection;

public class Sorting {

	public static void main(String[] args) {
		
		long startTime = System.nanoTime();
		int g[] = {31,41,59,26,41,58};
		//int g[] = {1,2,3,4,5,6,11,10,9,8,7};
		//Insertion isort = new Insertion(g);
		MergeSort m = new MergeSort();
		//Selection s = new Selection();
		m.mergeSort(g,0,g.length-1);
		System.out.println("the sorted array is " );
		m.print();
		for(int i = 0;i < g.length;i++){
			System.out.println(g[i]);
		}
		long stopTime = System.nanoTime();
		System.out.println("\n" + "the time taken by the sorting algorithm in nanosconds is " + ((stopTime - startTime)));

	}
	
}
