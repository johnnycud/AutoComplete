package autoCompletePackage;

import java.util.ArrayList;

public class Insertion {
	
	public static void sort(Comparable[] searchDataList){
		int N = searchDataList.length;
		for(int i=0; i < N; i++){
			for(int j =i; j > 0; j--){
				if (less(searchDataList[j], searchDataList[j-1]))
					exch(searchDataList, j, j-1);
					else break;	
				}
			}
		
		
	}
	private static boolean less(Comparable<Comparable> v, Comparable w){
		
		return v.compareTo(w) < 0;
	}
	
	private static void exch(Comparable[] a, int i, int j){
		
		Comparable<?> swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}
	public static void sort(ArrayList<String> searchDataList) {
		// TODO Auto-generated method stub
		
	}

}
