package roles.functions;

public class Role05_FunctionArguments {
	static String firstName = "Nguyen";
	static String middleName = "Van";
	static String lastName = "Teo";
	static String nickName = "Cu Teo";

	public static void main(String[] args) {
		System.out.print(displayFullNameAndNickName(firstName,middleName,lastName,nickName));
	}

	private static String displayFullNameAndNickName(String firstName, String middleName, String lastName, String nickName) {
		String fullNameAndNickName = "Full Name: " + firstName + " " + middleName + " " + lastName + " - NickName: " + nickName;
		return fullNameAndNickName;
	}

}
