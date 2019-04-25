import java.util.Scanner;

public class Gslc1 {
	
	 public static void main(String[] args) {
		 Scanner scan = new Scanner (System.in);
	        int menu=0;
	        int harga=0;
	        int jumlah=0;
	        int total=0;
	        int diskon=0;
	        System.out.println("list menu");
	        System.out.println("1. baju 30.000");
	        System.out.println("2. kaos 20.000");
	        System.out.println("3. kemeja 100.000");
	        System.out.println("4. celana 150.000");
	        System.out.println("5. sweater 200.000");
	        System.out.println("pilihan barang ");
	        menu = scan.nextInt();
	        switch(menu){
	            case 1: System.out.println(" baju  ");
	                    harga = 30000;
	                    System.out.print("jumlah barang yang ingin di beli ");
	                    jumlah = scan.nextInt();
	                    total = harga*jumlah;
	                    if(total>=1){
	                        diskon = (total*10)/100;
	                        System.out.println("Anda mendapat diskon sebesar  "+diskon);
	                        total = total - diskon;
	                    }
	                    break;

	            case 2: System.out.println(" kaos ");
	                    harga = 20000;
	                    System.out.print("jumalh barang yg ingin di beli");
	                    jumlah = scan.nextInt();
	                    total = harga*jumlah;
	                    if(total>=1){
	                        diskon = (total*10)/100;
	                        System.out.println("Anda mendapat diskon sebesar "+diskon);
	                        total = total - diskon;
	                    }
	                    break;
	            case 3: System.out.println("kemeja");
	                    harga = 100000;
	                    System.out.print("jumlah barang yg ingin di beli");
	                    jumlah = scan.nextInt();
	                    total = harga*jumlah;
	                    if(total>=1){
	                        diskon = (total*15)/100;
	                        System.out.println("Anda mendapat diskon sebesar  "+diskon);
	                        total = total - diskon;
	                    }
	                    break;
	            case 4: System.out.println(" celana ");
	                    harga = 150000;
	                    System.out.print("jumlah barang yg ingin di beli");
	                    jumlah = scan.nextInt();
	                    total = harga*jumlah;
	                    if(total>=1){
	                        diskon = (total*20)/100;
	                        System.out.println("Anda mendapat diskon sebesar  "+diskon);
	                        total = total - diskon;
	                    }
	                    break;
	            case 5: System.out.println("swater");
	                    harga = 200000;
	                    System.out.print("jumlah barang yg ingin di beli ");
	                    jumlah = scan.nextInt();
	                    total = harga*jumlah;
	                    if(total>=1){
	                        diskon = (total*15)/100;
	                        System.out.println("Anda mendapat diskon sebesar  "+diskon);
	                        total = total - diskon;
	                    }
	                    break;
	        }
	        System.out.println("Total = "+total);
	    }
}
