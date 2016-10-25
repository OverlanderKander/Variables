
public class Variables {

	public static void main(String[] args) {
		int a = 63;
		int b = 45;
		
		b = a;
		
		System.out.println("a is " + a);
		System.out.println("b is " + b);
		
		a = a + 10;
		
		System.out.println("a is now " + a);
		System.out.println("b is still " + b);
		
		a += 10; // extended assignment operator

		a = a + 1; // increment (binary operator)
		a +=1; // increment (binary operator)
		a++; // increment (unary operator)

		System.out.println("a is now " + a);
		System.out.println("b is still " + b);
	}

}
