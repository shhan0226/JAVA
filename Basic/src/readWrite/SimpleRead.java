package readWrite;

import java.io.IOException;

public class SimpleRead {

	public static void main(String args[]) {
		int b = 0, count = 0;

		try {
			b = System.in.read();
			while (b != -1) {
				System.out.println((char) b);
				System.out.println(" ==> total byte:" + count + " / " + b);
				count++;
				b = System.in.read();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
