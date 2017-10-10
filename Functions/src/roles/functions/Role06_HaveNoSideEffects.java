package roles.functions;

public class Role06_HaveNoSideEffects {

	public static void main(String[] args) {
		System.out.print(addTwoNumber(6,9));
	}

	private static int addTwoNumber(int firstNumber, int secondNumber) {
		int subTwoNumber = firstNumber - secondNumber;
		return firstNumber + secondNumber;
	}

}
