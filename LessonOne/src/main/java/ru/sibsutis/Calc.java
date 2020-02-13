
    import java.util.Scanner;


    class Calc{
    	public static final void main(String[] argv){
		Integer first, second, result = 0;
		Scanner input = new Scanner(System.in);
		first = input.nextInt();
		String znak = input.next();
		second = input.nextInt();
		switch(znak){
			case "+":
				result = first + second;
				break;
			case "-":
				result = first + second;
				break;
			case "*":
				result = first * second;
				break;
			case "/":
				if(second == 0){
					System.out.println("Error, division by 0");
					return;
				}else
					result = first / second;
				break;
		}
		System.out.println("Result is " + result);
	}
    }
