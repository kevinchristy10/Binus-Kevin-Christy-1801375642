import java.util.Scanner;

public class Gaji {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int gaji=0;
		int tanggungan =0;
		int gajibersih;
		int pajak;
		System.out.println("Masukan Gaji:");
		gaji = scan.nextInt();
		System.out.println("Masukan Tanggungan");
		tanggungan = scan.nextInt();
		if(gaji>50000000){
			pajak = (gaji-tanggungan-50000000)*5/100;
			gajibersih = gaji-pajak;
			System.out.println("Gajibersih"+ gajibersih);
		}else if (gaji >150000000){
			pajak = (gaji-tanggungan-50000000)*10/100;
			gajibersih = gaji-pajak;
			System.out.println("gajibersih " + gajibersih);
		}else if (gaji >250000000){
			pajak = (gaji-tanggungan-50000000)*15/100;
			gajibersih = gaji-pajak;
			System.out.println("gajibersih" + gajibersih);
		}else if (gaji<=50000000){
			gajibersih = gaji-tanggungan;
			System.out.println("gaji anda tidak dikenakan pajak"+ gajibersih);
		}

	}

}
