package ua.lviv.lgs.task1;

public class Employee implements Salary {
	private double salaryPerHour;

	Employee(double salaryPerHour) {
		this.salaryPerHour = 50;
	}

	@Override
	public void SalaryCount() {
		System.out.println("������ ��������� ��������: " + salaryPerHour + "���. � ������");
	}

}
