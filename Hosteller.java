
public class Hosteller extends Student {
	
	private int roomNumber;

	private char blockName;

	private String roomType;
	
	public Hosteller(int studentId,String studentName,String department,String gender,String category,double collegeFee,int roomNumber,char blockName,String roomType )
	{
		super(studentId,studentName,department,gender,category,collegeFee);
		this.roomNumber=roomNumber;
		this.blockName=blockName;
		this.roomType=roomType;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public char getBlockName() {
		return blockName;
	}

	public void setBlockName(char blockName) {
		this.blockName = blockName;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	
	public double calculateTotalFee()
	{
		char c =this.blockName;
		double hostelfee = 0;
		double fee =0;
		if(Character.toLowerCase(c) == 'a')
		{
			 hostelfee = 60000;
			if(this.roomType.toLowerCase().equals("ac"))
			{
				fee = 8000;
			}
		}
		else if(Character.toLowerCase(c) == 'b')
		{
			 hostelfee = 50000;
			if(this.roomType.toLowerCase().equals("ac"))
			{
				fee = 5000;
			}
		}
		else if(Character.toLowerCase(c) == 'c')
		{
			 hostelfee = 40000;
			if(this.roomType.toLowerCase().equals("ac"))
			{
				fee = 2500;
			}
		}
		double amount =collegeFee+hostelfee+fee;
		
		return amount;
	}
	
	

}
