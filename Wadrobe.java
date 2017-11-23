public class Wadrobe extends Barang{
	
	public void tampil(){
	String merek = "nike";
	String harga = "100 rb";
	String warna = "merah";
	String jenis = "Baju";

	Barang b = new Barang();
	b.input ("baju", "2", "sply");

	System.out.println("Merek 		:"+merek);
    System.out.println("harga 		:"+harga);
    System.out.println("warna 		:"+warna);
    System.out.println("jenis 		:"+jenis);
	}
}