package jtm.tasks.fundamentals;

public class PhoneNumber {

	/*
	 * TODO
	 * 
	 * Write a function that accepts an array of 10 integers (between 0 and 9),
	 * that returns a string of those numbers in the form of a phone number.
	 * 
	 * Example: createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) //
	 * => returns "(123) 456-7890"
	 * 
	 * The returned format must be correct in order to complete this challenge.
	 * Don't forget the space after the closing parentheses!
	 */

	public static String createPhoneNumber(int[] numbers) {

		// //for (int i=0; i < numbers.length; i++){
		// //str = str + numbers[i];
		//
		// String result1 = null;
		// String result2 = null;
		// String result3 = null;
		// String result4 = null;
		// String ob = "(";
		// String cb = ")";
		// String str = "";
		// String str1 = "";
		// String str2 = "";
		// String str3 = "";
		// for (int i=0; i < numbers.length; i++){
		// if (i <= 2){
		// str += i + 1;
		// result1 = ob + str + cb + " ";
		// }else if (i > 2 && i <=5 ){
		// str1 +=i + 1;
		// result2 = result1 + str1 + "-";
		// }else if (i > 5 && i < 9){
		// str2 +=i + 1;
		// result3 = result2 + str2;
		// }else if (i == 0){
		// //str2 +=i + 1;
		// result4 = result3 + i;
		// }
		// }
		//
		// return result3;
		// }

		String str = "";
		for (int i=0; i < numbers.length; i++){
			if (i == 0){
				str = str + "(";
			}else if (i == 3){
				str = str + ") ";
			}else if (i == 6){
				str = str + "-";
			}
			str = str + numbers[i];
		}
		return str;
	}
}

//Super gudrais variants:

//StringBuilder str = new StringBuilder();
//for (int i=0; i < numbers.length; i++){
//	if (i == 3){
//		str.append(") ");
//	}else if (i == 6){
//		str.append("-");
//	}
//	str.append(numbers[i]);
//}
//return str.toString();
//}}
