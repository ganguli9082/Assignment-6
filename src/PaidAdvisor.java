import java.text.NumberFormat;

public class PaidAdvisor extends Person {
	
	protected double RegPRate = 25;
	protected double OTPRate = (RegPRate * 1.5);
	protected double SpecialPRate = 50;
	
	protected double RegHours;
	protected double SpecialHours;
	protected double TotalHours;
	protected double OTHours;
	
	protected double RegPay;
	protected double OTPay;
	protected double SpecialPay;
	protected double TotalPay;
	
	public PaidAdvisor(String firstName, String lastName, double TotalHours,double SpecialHours)
	{
		super(firstName, lastName);
		this.TotalHours = TotalHours;
		this.SpecialHours = SpecialHours;
	}
	
	public double getRegPRate() 
	{
		return RegPRate;
	}
	
	public double getOTPRate() 
	{
		return OTPRate;
	}

	public double getSpecialPRate() 
	{
		return SpecialPRate;
	}
	
	public void setTotalHours(double numTotalHours) 
	{
		TotalHours = numTotalHours;
	}
	
	public double getTotalHours() 
	{
		return TotalHours;
	}
	
public void setSpecialHours(double numSpecialHours) 
	
	{
		SpecialHours = numSpecialHours;
	}
	
	public double getSpecialHours() 
	{
		return SpecialHours;
	}
	
	
	
	public double computeRegHours()
	{
		RegHours = TotalHours - SpecialHours;
		return RegHours;
	}
	public double getRegHours() 
	{
		return RegHours;
	}

	public double computeOTHours()
	{
		if (RegHours>30)
			OTHours = RegHours-30;
		else
			OTHours = 0;
		return OTHours;
	}
	
	
	
	public double calculateRegPay()
	{
		if (RegHours>30)
			{
			RegPay = 30*RegPRate;
			}
		else
			RegPay = RegHours *RegPRate;
	
		return RegPay;
	}
	
	public double calculateSpecialPay()
	{
		SpecialPay = SpecialPRate*SpecialHours;
		return SpecialPay;
	}
  
	public double calculateOTPay()
	{
		if (RegHours > 30)
			OTPay = OTHours * OTPRate;
		else
			OTPay = 0;
		return OTPay;
	}
	public double calculatePay()
	{
		
		RegHours = TotalHours - SpecialHours;
		
		if (RegHours>30)
			OTHours = RegHours-30;
		else
			OTHours = 0;
		
		
		if (RegHours>30)
			{
			RegPay = 30*RegPRate;
			}
		else
			RegPay = RegHours *RegPRate;
		
		SpecialPay = SpecialPRate*SpecialHours;
		
		if (RegHours > 30)
			OTPay = OTHours * OTPRate;
		else
			OTPay = 0;
		
		
		TotalPay = OTPay + SpecialPay + RegPay;
		return TotalPay;
	}
	public String ToString()
	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		
		String PayReport;
		
		PayReport = firstName + " " + lastName + " " + "Total Wages: " + fmt.format(TotalPay) + "\n";
		PayReport += "Regular Pay: " + fmt.format(RegPay) + " OT Pay: " + fmt.format(OTPay) + " Special Pay: " + fmt.format(SpecialPay);
		return PayReport;
	}
}
	
