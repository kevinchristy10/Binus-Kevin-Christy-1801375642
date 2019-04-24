
public class Pertemuan3 {
	 public static void main (String[] args) {
		 System.out.println("Inilah Bilangan Prima lima pertama ");
		 int bilangan=0;
		 int bagi=0;
		 	for(bilangan=1;bilangan<12;bilangan++) {
		 		int i=0;
		 		for(bagi=1;bagi<12;bagi++) {
		 			if(bilangan%bagi==0) {
		 				i++;
		 			}

	  }
	   if ((i==2)&&(bilangan!=1)){
	      System.out.println(bilangan);
	   }

	 }

	 }
}
