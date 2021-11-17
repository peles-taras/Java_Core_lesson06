package ua.lviv.lgs.task1;

public class Employee2 implements Salary {
	private double salaryFixed;

	Employee2(double salaryFixed) {
		this.salaryFixed = 15000;
	}

	@Override
	public void SalaryCount() {
		System.out.println("ƒругий прац≥вник заробл€Ї: "+ salaryFixed+"грн. в м≥с€ць");
	}
	
}
