
public class Main {
	public static void main (String [] args){
		
		System.out.println("================");
		System.out.println("TOKO ADA APA AJA");
		System.out.println("================");
		System.out.println("");

		Admin adm = new Admin();
		adm.input_Admin();

		Elektronik e = new Elektronik();
		e.tampil();
			
		Laporan l = new Laporan();
		l.cetak();
} 
}