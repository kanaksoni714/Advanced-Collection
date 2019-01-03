package com.employee.information;

public class MMASavingAccounts {
	private EmployeeInformation employeeInformation;
	private MMASavingAccounts mmSavingAccount;
	
	
	
	/**
	 * @param employeeInformation
	 * @param mmSavingAccount
	 */
	public MMASavingAccounts(EmployeeInformation employeeInformation,MMASavingAccounts mmaSavingAccount) {
		super();
		this.employeeInformation = employeeInformation;
		this.mmSavingAccount = mmaSavingAccount;
	}
	
	 

	public MMASavingAccounts(int i, String string, int j, boolean b) {
		// TODO Auto-generated constructor stub
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MMASavingAccounts [employeeInformation=" + employeeInformation
				+ ", mmaSavingAccount=" + mmSavingAccount + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((employeeInformation == null) ? 0 : employeeInformation
						.hashCode());
		result = prime * result
				+ ((mmSavingAccount == null) ? 0 : mmSavingAccount.hashCode());
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
		MMASavingAccounts other = (MMASavingAccounts) obj;
		if (employeeInformation == null) {
			if (other.employeeInformation != null)
				return false;
		} else if (!employeeInformation.equals(other.employeeInformation))
			return false;
		if (mmSavingAccount == null) {
			if (other.mmSavingAccount != null)
				return false;
		} else if (!mmSavingAccount.equals(other.mmSavingAccount))
			return false;
		return true;
	}



	public EmployeeInformation getEmployeeInformation() {
		return employeeInformation;
	}

	public MMASavingAccounts getAccount() {
		return mmSavingAccount;
	}
	
	
	
	
}

