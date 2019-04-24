import java.util.Scanner;

public class Pertemuan2 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int angka =0;
		System.out.println("Input sebuah bilangan : ");
        angka=scan.nextInt();
        if (angka % 2 == 1) {
            System.out.printf(angka+" merupakan bilangan GANJIL ");
        }
        else
            System.out.printf(angka+" merupakan bilangan GENAP ");

	}

}
