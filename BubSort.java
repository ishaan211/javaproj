package highPerformanceAlgoImp;

import java.util.Scanner;
public class BubSort {
	/*BUBBLE SORT--check 1st element with 2nd then 3rd and so on till the end of the array
	 * in place - algo(which means we do the sorting in the same array and doesnot create another array)
	 * o(n**2)---takes 100 steps to sort 10 items, 10000 steps to sort 100 items
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intarr = {20,35,-15,7,55,1,-22};
		System.out.println("Which algorithm do you want to want to implement ?...Press the number accordingly...");
		System.out.println("1. Bubble Sort");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		if(a == 1) {
		for(int lastunsortedindex = intarr.length-1; lastunsortedindex > 0; lastunsortedindex--) {
			for(int i = 0;i < lastunsortedindex; i++) {
				if(intarr[i] > intarr[i+1]) {
					swap(intarr,i,i+1);
				}
			}
		}
		System.out.println("Bubble sort starts here");
		for(int i = 0;i < intarr.length;i++) {
			
			System.out.println(intarr[i]);
				
		}
		System.out.println("Bubble sort ends here");
	}else{
		System.out.println("Invalid option");
	}
	} 
	public static void swap(int[] arr, int i, int j) {
		//yahan pe i and j vo elements h jinhe hume swap krna h
		if(i == j) {
			return;
		}
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
