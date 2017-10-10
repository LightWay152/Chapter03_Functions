package roles.functions;

public class Role07_CommandQuerySeparation {

	public static void main(String[] args) {
		System.out.print(subTwoEvenNumber(true,6,9));
	}

	private static String subTwoEvenNumber(boolean isTwoEvenNumber, int firstNumber, int secondNumber) {
		if(firstNumber % 2 == 0){
			if(secondNumber % 2 == 0){
				isTwoEvenNumber = true;
				return firstNumber + secondNumber + "";
			}
			else{
				isTwoEvenNumber = false;
				return "Have not even number, do not calculate!";
			}
		}
		else{
			isTwoEvenNumber = false;
			return "Have not even number, do not calculate!";
		}
	}

}
