import java.util.Scanner;

public class PaythePaidAdvisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double THours = 0;
		double SHours = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the total hours: ");
		THours = scan.nextInt();
		System.out.println("Enter the special hours worked: ");
		SHours = scan.nextInt();
		
		
		PaidAdvisor staff1 = new PaidAdvisor("Albert", "Eisntein", THours, SHours);
		
		
		staff1.computeRegHours();
		staff1.computeOTHours();
		staff1.calculateRegPay();
		staff1.calculateSpecialPay();
		staff1.calculateOTPay();
		staff1.calculateTotalPay();
		System.out.println(staff1.ToString());
	}

}
