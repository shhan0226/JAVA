package scan;

import java.io.*;
import java.util.*;

public class ScanHasNext {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(new BufferedReader(new FileReader("./data/abc.txt")));

		while (s.hasNext()) {
			System.out.println(s.next());
		}
		s.close();
	}

}
