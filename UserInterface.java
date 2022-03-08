import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
    	System.out.println("Enter Student Id");
    	int id = sc.nextInt();
    	System.out.println("Enter Student name");
    	String name = sc.next();
    	System.out.println("Enter Department name");
    	String dname = sc.next();
    	System.out.println("Enter gender");
    	String gender = sc.next();
    	System.out.println("Enter category");
    	String category = sc.next();
    	System.out.println("Enter College fee");
    	double cfees = sc.nextDouble();
    	double amount =0;
    	if(category.toLowerCase().equals("dayscholar"))
    	{
    		System.out.println("Enter Bus number");
    		int bno = sc.nextInt();
    		System.out.println("Enter the distance");
    		float dis = sc.nextFloat();
    		DayScholar s = new DayScholar(id,name,dname,gender,category,cfees,bno,dis);
    		amount = s.calculateTotalFee();
    	}
    	else if(category.toLowerCase().equals("hosteller"))
    	{
    		System.out.println("Enter the room number");
    		int rno = sc.nextInt();
    		System.out.println("Enter the Block name");
    		char bname = sc.next().charAt(0);
    		System.out.println("Enter the room type");
        	String rtype = sc.next();
    		Hosteller r = new Hosteller(id,name,dname,gender,category,cfees,rno,bname,rtype);
    		amount = r.calculateTotalFee();
    	}
    	
    	System.out.printf("Total College fee is %.1f",amount);
	}

}










