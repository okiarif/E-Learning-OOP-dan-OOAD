public class Furniture extends Barang{
	
	public void tampil(){
	String merek = "olimpik";
	String harga = "20jt";
	String warna = "biru";
	String jenis = "lemari";

	Barang b = new Barang();
	b.input ("meja", "1", "sply");

	System.out.println("Merek 		:"+merek);
    System.out.println("harga 		:"+harga);
    System.out.println("warna 		:"+warna);
    System.out.println("jenis 		:"+jenis);
	}
}