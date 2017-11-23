import java.util.Scanner;
public class Elektronik extends Barang {
public void tampil(){
	
	String merek = "samsung";
	String harga = "10jt";
	String warna = "gold";
	String jenis = "smartphone";

	System.out.println("");
	System.out.println("INPUT BARANG");
	System.out.println("==============================");
	Scanner input = new Scanner (System.in);
	System.out.print("Kode            :");
	kode = input.nextLine();
	
	Barang b = new Barang();

	b.input ("hp", "10", "sply");

	
	System.out.println("Merek 		:"+merek);
    System.out.println("harga 		:"+harga);
    System.out.println("warna 		:"+warna);
    System.out.println("jenis 		:"+jenis);

	}
	public void tampil2(){

	String merek = "samsung";
	String harga = "10jt";
	String warna = "gold";
	String jenis = "smartphone";

	Barang b = new Barang();

	b.tampil ("hp", "10");

	
	System.out.println("Merek 		:"+merek);
    System.out.println("harga 		:"+harga);
    System.out.println("warna 		:"+warna);
    System.out.println("jenis 		:"+jenis);
	}
}