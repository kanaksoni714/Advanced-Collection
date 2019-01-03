package com.employee.information;

/**
 * 4) Create two classes Employee_information and MMASaving_Account
 * 
 * a. Employee_information class will have fields empID, Employee_name,
 * employee_designation , Employee_salary, employee_comm with that they will
 * have setter getter methods
 * 
 * b. MMASaving Account class will have fields accountID, accountholder_name,
 * account_balance, isSalaryAccount with that they will have setter and getter
 * methods
 * 
 * c. Employee_information object and MMASaving_Account object belongs to a same
 * entity assuming there are more than 5 entities how will you store the objects
 * preserving the relation between them.
 * 
 *
 */

public class EmployeeInformation {

	private int employeeId;
	private String employeeName;
	private String employeeDesignation;
	private double employeeSalary;
	private double employeeComm;

	/**
	 * @param employeeId
	 * @param employeeName
	 * @param employeeDesignation
	 * @param employeeSalary
	 * @param employeeComm
	 */
	public EmployeeInformation(int employeeId, String employeeName,
			String employeeDesignation, double employeeSalary,
			double employeeComm) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDesignation = employeeDesignation;
		this.employeeSalary = employeeSalary;
		this.employeeComm = employeeComm;
	}

	@Override
	public String toString() {
		return "EmployeeInformation [employeeId=" + employeeId
				+ ", employeeName=" + employeeName + ", employeeDesignation="
				+ employeeDesignation + ", employeeSalary=" + employeeSalary
				+ ", employeeComm=" + employeeComm + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(employeeComm);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime
				* result
				+ ((employeeDesignation == null) ? 0 : employeeDesignation
						.hashCode());
		result = prime * result + employeeId;
		result = prime * result
				+ ((employeeName == null) ? 0 : employeeName.hashCode());
		temp = Double.doubleToLongBits(employeeSalary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeInformation other = (EmployeeInformation) obj;
		if (Double.doubleToLongBits(employeeComm) != Double
				.doubleToLongBits(other.employeeComm))
			return false;
		if (employeeDesignation == null) {
			if (other.employeeDesignation != null)
				return false;
		} else if (!employeeDesignation.equals(other.employeeDesignation))
			return false;
		if (employeeId != other.employeeId)
			return false;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		if (Double.doubleToLongBits(employeeSalary) != Double
				.doubleToLongBits(other.employeeSalary))
			return false;
		return true;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public double getEmployeeComm() {
		return employeeComm;
	}

	public void setEmployeeComm(double employeeComm) {
		this.employeeComm = employeeComm;
	}

}
