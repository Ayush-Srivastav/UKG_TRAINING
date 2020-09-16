package day1;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int min=1 , max=9;
		int from=1 , to=9;
		System.out.print("*\t|");
		for(int i=from ; i<=to ; i++) {
			System.out.print("\t"+i);
		}
		System.out.print("\n--");
		for(int i=from ; i<=to ; i++) {
			System.out.print("\t--");
		}
		System.out.println();
		for(int i=from; i<=to ; i++) {
			System.out.print(i+"\t|");
			for(int j=min ; j<=max ; j++) {
				System.out.print("\t"+(i*j));
			}
			System.out.println();
		}
	}

}
