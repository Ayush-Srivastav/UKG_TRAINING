package day1;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min=1, max=8;
		for(int i=min ; i<=max ; i++) {
			for(int j=min ; j<=i ; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
