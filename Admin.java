import java.util.Scanner;
class Admin {
	public String nama ;
		public String pass;
	


	public void input_Admin(){
	Scanner input = new Scanner (System.in);
	System.out.println("LOGIN");
	System.out.println("------------");
	System.out.print("Nama     :");
	nama = input.nextLine();
	System.out.print("Password :");
	pass = input.nextLine();
	System.out.println("-------------");
	
	}
	public void update_Admin(){
	String nama = "Oki";
	String id = "123";

	System.out.println("Nama :"+nama);
	System.out.println("Id   :"+id);

	}
}