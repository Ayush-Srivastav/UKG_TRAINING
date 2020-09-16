package day1;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayToBeCopied = {1,2,3,4,5,6,7,8,9};
		System.out.println("Original Array");
		for(int item : arrayToBeCopied)
			System.out.print(item+" ");
		int[] copiedArray = copyOf(arrayToBeCopied);
		System.out.println("\nCopied Array");
		for(int item : copiedArray)
			System.out.print(item+" ");
		
	}
	
	public static int[] copyOf(int[] array) {
		int[] copiedArray = new int[array.length];
		for(int i=0 ; i<array.length ; i++) {
			copiedArray[i] = array[i];
		}
		return copiedArray;
	}

}
