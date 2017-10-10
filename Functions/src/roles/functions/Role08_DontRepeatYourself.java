package roles.functions;

public class Role08_DontRepeatYourself {

	public static void main(String[] args) {
		System.out.print(addTwoOddNumber(6,9));
		System.out.println();
		System.out.print(subTwoOddNumber(6,9));
	}

	private static String subTwoOddNumber(int numberA, int numberB) {
		if(numberA % 3 == 0){
			if(numberB % 3 == 0){
				return numberA - numberB + "";
			}
			else{
				return "A, B does not even number, do not calculate!";
			}
		}
		else{
			return "A, B does not even number, do not calculate!";
		}
	}
	private static String addTwoOddNumber(int numberA, int numberB) {
		if(numberA % 3 == 0){
			if(numberB % 3 == 0){
				return numberA + numberB + "";
			}
			else{
				return "A, B does not even number, do not calculate!";
			}
		}
		else{
			return "A, B does not even number, do not calculate!";
		}
	}
	
}
