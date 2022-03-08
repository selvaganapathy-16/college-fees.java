
public class DayScholar extends Student {
	private int busNumber;

	private float distance;
	
	public DayScholar(int studentId,String studentName,String department,String gender,String category,double collegeFee, int busNumber,float distance )
	{
		super(studentId,studentName,department,gender,category,collegeFee);
		this.busNumber=busNumber;
		this.distance=distance;
	}

	public int getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}

	public float getDistance() {
		return distance;
	}

	public void setDistance(float distance) {
		this.distance = distance;
	}
	
	public double calculateTotalFee()
	{
		float f = this.distance;
		double busfee =0;
		if(f>30 && f<=40)
		{
			busfee = 28000;
		}
		else if(f>20 && f<=30)
		{
			busfee = 20000;
		}
		else if(f>10 && f<=20)
		{
			busfee = 12000;
		}
		else if( f<=10)
		{
			busfee = 6000;
		}
		
		double amount = collegeFee+ busfee;
		return amount;
	}
	

}
