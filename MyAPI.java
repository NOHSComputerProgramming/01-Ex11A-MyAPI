import java.util.Scanner;

public class MyAPI {
	Scanner input;
	boolean isSubmission = false;
	
	public MyAPI(boolean isSubmission){
			input = new Scanner(System.in);
			this.isSubmission = isSubmission;
	}
	
	public  int getRandomInt(int start, int stop){
		int randomNum = 1;
		int range = stop - start;
		randomNum = (int)(Math.random()*(range+1)) + start;
		return randomNum;
	}
	
	//getGCD of any two numbers
	public  int getGCD(int anyNum1, int anyNum2){
		int i = 1;
		int gcd = 1;
		while(i<=anyNum1 && i<=anyNum2){
			if(anyNum1 % i == 0 && anyNum2 % i == 0){
				gcd = i;
			}
			i++;
		}
		
		return gcd;
	}
	
	
	//check for primes
	public  boolean isPrime(int anyNumber){
		for(int i=2;i<=anyNumber-1;i++){
			if(anyNumber % i == 0){
				return false;
			}
		}
		return true;
	}

	//getLetterGrade given a percent
	public  String getLetterGrade(double p){
		if(p>=90){
			return "A";
		}
		else if(p >= 80){
			return "B";
		}
		else if(p >= 70){
			return "C";
		}
		else if(p >= 60){
			return "D";
		}
		else{
			return "F";
		}
	}
	
	public  double getDouble(String prompt){
		if(!this.isSubmission){
			System.out.print(prompt);
		}
		double answer = input.nextDouble();
	
		return answer;
	}
	
	public  int getInt(String prompt){
		if(!this.isSubmission){
			System.out.print(prompt);
		}
		int answer = input.nextInt();
		return answer;
	}

	public  String getString(String prompt) {
		if(!this.isSubmission){
			System.out.print(prompt);
		}
		String answer = input.next();
		return answer;
	}
	
	public  String getMultipleStrings(String prompt) {
		if(!this.isSubmission){
			System.out.print(prompt);
		}
		String answer = input.nextLine();
		return answer;
	}
  
	
	
}