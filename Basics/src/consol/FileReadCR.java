package consol;

import java.io.*;

public class FileReadCR {

	public static void main(String args[]) {
		int ivalue;
		double dvalue;
		char cvalue;
		String svalue;

		try {
			ConsoleReader in = new ConsoleReader(new FileReader("./data/data.txt"));

			ivalue = in.readInt();
			System.out.println("value = " + ivalue);
			dvalue = in.readDouble();
			System.out.println("value = " + dvalue);
			cvalue = in.readChar();
			System.out.println("value = " + cvalue);
			svalue = in.readString();
			System.out.println("value = " + svalue);

		} catch (Exception e) {
			System.out.println("타입에 맞지 않은 입력입니다.");
		}
	}

}
