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
		
		
		
		staff1.calculatePay();
		System.out.println(staff1.ToString());
	}

}
