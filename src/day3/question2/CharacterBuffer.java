package day3.question2;

import java.io.*;

public class CharacterBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new FileWriter(new File("data_write.txt")))) {
			System.out.println("Enter text or simply press return to stop :");
			String line = null;
			while (!(line = br.readLine()).equals("")) {
				bw.write(line + "\n");
				bw.flush();
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
