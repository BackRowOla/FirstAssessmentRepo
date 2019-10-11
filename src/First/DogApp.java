package First;

import java.util.ArrayList;
import java.util.List;

public class DogApp {

	public static void main(String[] args) {

		method(52);
	}

	public static void method(int a) {
		// String result;

		//List<String> list = new ArrayList();

		for (int i = 1; i <= 100; i++) {
			if (i != a) {
				if (i % 10 == 1 && i != 11) {
					//list.add(i + "st");
					System.out.println(i + "st");
				} else if (i % 10 == 2 && i != 12) {
					//list.add(i + "nd");
					System.out.println(i + "nd");
				} else if (i % 10 == 3 && i != 13) {
					//list.add(i + "rd");
					System.out.println(i + "rd");
				}else {
					//list.add(i + "th");
					System.out.println(i + "th");
				}
			}
		}
	}
}


//if (i > 3 && i < 21) {
//	list.add(i + "th");
//	System.out.println(i + "th");
//} else 