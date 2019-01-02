package com.account.saving;
import java.util.TreeSet;
/**
*c. Create class BankAccountList
* which will maintain SavingAccount objects. Ensure that this class should not
* allow duplicates as well as data should be displayed in sorted order. (as per
* acc_ID)
* 
*
*/
public class BankAccountList {


		public TreeSet<SavingAccount> bankAccounts(){
			SavingAccount SavingAccount = new SavingAccount(10000,100,"Kanak", true);
			SavingAccount SavingAccount1 = new SavingAccount(12000,101, "Shubham",true);
			SavingAccount SavingAccount2 = new SavingAccount(15000,102, "Poonam",true);
			SavingAccount SavingAccount3 = new SavingAccount(15000,103, "Avi",true);
			SavingAccount SavingAccount4 = new SavingAccount(13000,104,"Niranjan", true);

			TreeSet<SavingAccount> savingAccountsTreeSet=new TreeSet<SavingAccount>();
			savingAccountsTreeSet.add(SavingAccount);
			savingAccountsTreeSet.add(SavingAccount1);
			savingAccountsTreeSet.add(SavingAccount2);
			savingAccountsTreeSet.add(SavingAccount3);
			savingAccountsTreeSet.add(SavingAccount4);
			
			
			return savingAccountsTreeSet;
		}
		
		
	}

