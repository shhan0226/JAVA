package scan;

import java.io.*;
import java.util.*;

public class ScannerTest {
	public static void main(String args[]) {
		System.out.print("->");

		try {
			Scanner sc = new Scanner(System.in);
			while (sc.hasNextInt()) {
				int i = sc.nextInt();
				System.out.println(i);
			}

			System.out.println("------------------");
			while (sc.hasNext()) {
				String s = sc.next();
				System.out.println(s);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
