import java.util.Scanner;

// Main Class
public class TestFunction extends Function {
        // Main method and inheritance the Function
	public static void main(String arg[]) {
                // Scanner for input the number.
		Scanner input = new Scanner(System.in);
                // Create the Method class and Function class
		Method Haha = new Method();
		Function Hoho = new Function();

		System.out.println("Please enter the x");
		double x = input.nextInt();

		System.out.println("The First Answer is " + Haha.geta(Hoho.f(x)));
		System.out.println("The Second Answer is " + Haha.getb(Hoho.f(x)));
		System.out.println("The Third Answer is " + Haha.getc(Hoho.f(x)));
		System.out.println("The Fourth Answer is " + Haha.getd(Hoho.f(x)));
		System.out.println("The Fifth Answer is " + Haha.gete(Hoho.f(x)));
		System.out.println("The Sixth Answer is " + Haha.getf(Hoho.f(x)));
	}
}
