
public class FizzBuzz {

	public static void main(String[] args) {
		printFizzBuzz(100);

	}
	
	//Suppose endNumber not bigger than 100
	public static void printFizzBuzz(int endNumber) {
		for(int i=1; i<=endNumber; i++) {
			//Judge the number from 10 to 100
			if(i>9) {
				int judgeOne = i%10;
				int judgeTwo = (i/10)%10;
				
				//print FizzBuzz
				if(((0 == i%3) || 3 == judgeTwo || 3 == judgeOne)
					&&((0 == i%5) || 5 == judgeTwo || 5 == judgeOne)) {
					System.out.println("FizzBuzz");
				}
				else if (((0 == i%3) || 3 == judgeTwo || 3 == judgeOne)
					&&!((0 == i%5) || 5 == judgeTwo || 5 == judgeOne)) {
					System.out.println("Fizz");
				}
				else if (!((0 == i%3) || 3 == judgeTwo || 3 == judgeOne)
						&&((0 == i%5) || 5 == judgeTwo || 5 == judgeOne)) {
					System.out.println("Buzz");
				}
				else {
					System.out.println(i);
				}
			}
			//Judge the number from 1 to 9
			//In this case, there will never be FizzBuzz
			else {
				if(0 == i%3) {
					System.out.println("Fizz");
				}
				else if(0 == i%5) {
					System.out.println("Buzz");
				}
				else {
					System.out.println(i);
				}
			}
		}
		
	}

}
