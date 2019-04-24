import java.util.Scanner;

public class Fibonaci {
	 public static void main(String[] args) {
		 
		 	Scanner scan = new Scanner(System.in);
	        System.out.print("Masukan Banyak Bilangan fibonaci Yang Ditampilkan : ");
	        int a =scan.nextInt();
	        int i;
	        int f = 1;
	        int f2 = 1;
	        int fib = 1;
	        for (i = 1; i <= a; i++) {
	            System.out.print(f2 + ", ");
	            fib = f + f2;
	            f = f2;
	            f2 = fib;
	            
        }
	}
}
