package com.account.saving;
import java.io.Serializable;

/**
 * Create a Class SavingAccount with field’s acc_balance, acc_ID,
 * accountHoldername, isSalaryAccount. Also add setter and getter methods with
 * business method like withdraw and deposit. 
 * 
 * a. Create 5 different object of SavingAccount and add them into ArrayList, 
 * now iterate the arraylist and display all SavingAccount’s object one by one. 
 * 
 * b. Now save the ArrayList
 * which contains SavingAccount’s object into a file and read the file and
 * display all savingAccount Object one by one. 
 * 
 * c. Create class BankAccountList
 * which will maintain SavingAccount objects. Ensure that this class should not
 * allow duplicates as well as data should be displayed in sorted order. (as per
 * acc_ID)
 * 
 * 
 *
 */
public class SavingAccount implements Serializable,Comparable<SavingAccount> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double accountBalance;
	private final int accountId;
	private String accountHoldername;
	private boolean isSalaryAccount;
	

	/**
	 * @param accountBalance
	 * @param accountId
	 * @param accountHoldername
	 * @param isSalaryAccount
	 */
	public SavingAccount(double accountBalance,int accountId,String accountHoldername, boolean isSalaryAccount) {
		super();
		this.accountBalance = accountBalance;		
		this.accountId=accountId;
		this.accountHoldername = accountHoldername;
		this.isSalaryAccount = isSalaryAccount;
	}
	

	public String getAccountHoldername() {
		return accountHoldername;
	}

	public void setAccountHoldername(String accountHoldername) {
		this.accountHoldername = accountHoldername;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public int getAccountId() {
		return accountId;
	}

	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}
	
	public void withdraw(double amount) throws Exception{
		if(amount>0 && amount<this.getAccountBalance()){
			this.accountBalance-=amount;	
		}else{
			throw new Exception("Invalid amount !!! ");
		}
	}

	public void deposit(double amount) throws Exception{
		if(amount>0 ){
			this.accountBalance+=amount;	
		}else{
			throw new Exception("Invalid amount !!! ");
		}
	}


	@Override
	public String toString() {
		return "SavingAccount [accountBalance=" + accountBalance
				+ ", accountId=" + accountId + ", accountHoldername="
				+ accountHoldername + ", isSalaryAccount=" + isSalaryAccount
				+ "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(accountBalance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime
				* result
				+ ((accountHoldername == null) ? 0 : accountHoldername
						.hashCode());
		result = prime * result + accountId;
		result = prime * result + (isSalaryAccount ? 1231 : 1237);
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
		SavingAccount other = (SavingAccount) obj;
		if (Double.doubleToLongBits(accountBalance) != Double
				.doubleToLongBits(other.accountBalance))
			return false;
		if (accountHoldername == null) {
			if (other.accountHoldername != null)
				return false;
		} else if (!accountHoldername.equals(other.accountHoldername))
			return false;
		if (accountId != other.accountId)
			return false;
		if (isSalaryAccount != other.isSalaryAccount)
			return false;
		return true;
	}


	@Override
	public int compareTo(SavingAccount savingAccount) {
		return accountId-savingAccount.accountId;
	}
	
	


}