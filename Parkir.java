import java.util.Scanner;

public class Parkir {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int tarifParkir=0;
		int totaljamparkir;
		double jumlahbayar;
		int jammasuk;
		int jamkeluar;
		int jenis;
		String nopol;
		
		System.out.println("Masukan no pol:");
		nopol = scan.nextLine();
		System.out.println("jam masuk");
		jammasuk= scan.nextInt();
		System.out.println("Jam keluar");
		jamkeluar=scan.nextInt();
		System.out.println("jenis kendaraan");
		System.out.println("1.Motor");
		System.out.println("2.Mobil");
		System.out.println("masukan jenis kendaraan");
		jenis=scan.nextInt();

		totaljamparkir = jamkeluar-jammasuk;
		switch (jenis){
		case 1 :
		tarifParkir = totaljamparkir * 3000;
		break;
		case 2 :
		tarifParkir = totaljamparkir * 5000;
		break;

		default:
		tarifParkir = 0;
		break;
		}

		System.out.println("biaya parkir");

		if (jenis == 1){
		System.out.println("motor:");
			
		}else if (jenis == 2) {
		System.out.println("Mobil");
		}else {
		System.out.println("jenis ga terdaftar");
		}
		System.out.println("No Polisi : " + nopol);
		System.out.println("Jam Masuk : " + jammasuk );
		System.out.println( "jam keluar"+ jamkeluar);
		System.out.println("lama parkir" + totaljamparkir );
		System.out.println("harga parkir" + tarifParkir);
	}

}
