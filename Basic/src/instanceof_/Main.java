package instanceof_;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal A = new Animal();
		Dog B = new Dog();

		if (A instanceof Dog) {
			System.out.println("부모가 자식으로 형변환");
		}
		
		if (B instanceof Animal) {
			System.out.println("자식이 부모로 형변환");
		}

	}

}
