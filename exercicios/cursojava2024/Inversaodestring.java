package cursojava2024;



public class Inversaodestring {

	public static void main(String[] args) {
		
		String n1="ola mundo";
		StringBuilder n2=new StringBuilder(n1);
		n2.reverse();
		String res= n2.toString();
		System.out.println(res);
	}

}
