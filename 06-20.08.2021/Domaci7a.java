package primer5;

public class Domaci7a {

	public static void main(String[] args) {

		String[] grad = { "Lisabon", "London", "Helsinki", "Prag", "Madrid" };

		for (int i = 0; i < grad.length; i++) {
			if (grad[i].equals("Prag")) {
				break;
			}
			System.out.println(grad[i]);
		}
	}
}
