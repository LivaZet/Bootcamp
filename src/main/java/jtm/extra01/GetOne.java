package jtm.extra01;

public class GetOne {

	public int iterations(int number) {
		// TODO #1: Implement method which processes the passed positive number
		// value until it's
		// reduced to 1.
		// If the number is even then divide it by 2. If it is odd then multiply
		// it by 3 and add 1. Count how many iterations
		// it takes to do this calculation and return that count. For example:
		// passed number is 6. Path to completion would be:
		// 6->3->10->5->16->8->4->2->1. Iteration count=8.
		// HINT: Use while loop.
		int iterationCount = 0;
		while (number != 1 && number != 0) {
			if (number % 2 == 0) {
				number = number / 2;
			} else if (number % 2 != 0) {
				number = number * 3 + 1;
			}
			iterationCount++;
		}

		return iterationCount;
	}

	public static int theMostComplexNo(int maxNumber) {
		// TODO #2: Calculate how many iterations each number from 1 to
		// maxNumber (including) to get value till 1.
		// Return the number, which takes most iterations to do that.
		// E.g. if 3 is passed, then calculate iteration steps for 1, 2 and 3.
		// And return 3, because it has the biggest count of iterations.
		// (If count of iterations is the same for several numbers, return
		// smallest number).

		int iterationCount = 0;
		int result = 0;
		for (int x = 0; x <= maxNumber; x++) {
			while (maxNumber != 1 && maxNumber != 0) {
				if (maxNumber % 2 == 0) {
					maxNumber = maxNumber / 2;
				} else if (maxNumber % 2 != 0) {
					maxNumber = maxNumber * 3 + 1;
				}
				iterationCount++;
			}
			return result = iterationCount;
		}
		return result;
		
	}
}