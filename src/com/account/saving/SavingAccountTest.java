package com.account.saving;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.junit.After;
import org.junit.Test;



public class SavingAccountTest {

	/**
	 * Create 5 different object of SavingAccount and add them into ArrayList,
	 * now interate the arraylist and display all SavingAccount’s object one by
	 * one.
	 * 
	 */

	@Test
	public void testArrayListIterateOneByOne() {
		SavingAccount shubhamSavingAccount = new SavingAccount(10000, 100,
				"Kanak", true);
		SavingAccount rohanSavingAccount = new SavingAccount(12000, 101,
				"Shubham", true);
		SavingAccount tusharSavingAccount = new SavingAccount(15000, 102,
				"Poonam", true);
		SavingAccount tejasSavingAccount = new SavingAccount(15000, 103,
				"Avi", true);
		SavingAccount deepikaSavingAccount = new SavingAccount(13000, 104,
				"Niranjan", true);

		ArrayList<SavingAccount> savingAccountsArrayList = new ArrayList<SavingAccount>();
		savingAccountsArrayList.add(shubhamSavingAccount);
		savingAccountsArrayList.add(rohanSavingAccount);
		savingAccountsArrayList.add(tusharSavingAccount);
		savingAccountsArrayList.add(tejasSavingAccount);
		savingAccountsArrayList.add(deepikaSavingAccount);
		StringBuffer sb = new StringBuffer();

		Iterator<SavingAccount> itr = savingAccountsArrayList.iterator();
		while (itr.hasNext()) {
			sb.append(itr.next());
		}

		String expected = "SavingAccount [accountBalance=10000.0, accountId=100, accountHoldername=Kanak, isSalaryAccount=true]SavingAccount [accountBalance=12000.0, accountId=101, accountHoldername=Shubham, isSalaryAccount=true]SavingAccount [accountBalance=15000.0, accountId=102, accountHoldername=Poonam, isSalaryAccount=true]SavingAccount [accountBalance=15000.0, accountId=103, accountHoldername=Avi, isSalaryAccount=true]SavingAccount [accountBalance=13000.0, accountId=104, accountHoldername=Niranjan, isSalaryAccount=true]";

		assertEquals(expected, sb.toString());
	}

	/**
	 * Now save the ArrayList which contains SavingAccount’s object into a file
	 * and read the file and display all savingAccount Object one by one.
	 * 
	 */

	@Test
	public void testWriteArrayListObjectIntoFile() {
		SavingAccount shubhamSavingAccount = new SavingAccount(10000, 100,
				"Kanak", true);
		SavingAccount rohanSavingAccount = new SavingAccount(12000, 101,
				"Shubham", true);
		SavingAccount tusharSavingAccount = new SavingAccount(15000, 102,
				"Poonam", true);
		SavingAccount tejasSavingAccount = new SavingAccount(15000, 103,
				"Avi", true);
		SavingAccount deepikaSavingAccount = new SavingAccount(13000, 104,
				"Niranjan", true);

		ArrayList<SavingAccount> savingAccountsArrayList = new ArrayList<SavingAccount>();
		savingAccountsArrayList.add(shubhamSavingAccount);
		savingAccountsArrayList.add(rohanSavingAccount);
		savingAccountsArrayList.add(tusharSavingAccount);
		savingAccountsArrayList.add(tejasSavingAccount);
		savingAccountsArrayList.add(deepikaSavingAccount);

		String path = "C:\\Users\\kansoni\\Desktop\\Advance.txt";
		File file = new File(path);
		if (!file.exists()) {
			try {
				file.createNewFile();
				FileOutputStream fos = new FileOutputStream(path);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(savingAccountsArrayList);
				oos.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			FileOutputStream fos;
			try {
				fos = new FileOutputStream(path);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(savingAccountsArrayList);
				oos.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

	@Test
	public void testReadArrayListObjectFromFile() {
		String path = "src\\com\\collection\\advance\\test\\SavingAccount.txt";
		File file = new File(path);
		if (file.exists()) {
			try {
				FileReader fr = new FileReader(file);
				FileInputStream is = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(is);
				ArrayList<SavingAccount> emp = (ArrayList<SavingAccount>)ois.readObject();
				ois.close();
				is.close();
				System.out.println(emp.toString());

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("File Not Exists");
		}

	}

	/**
	 * c. Create class BankAccountList which will maintain SavingAccount
	 * objects. Ensure that this class should not allow duplicates as well as
	 * data should be displayed in sorted order. (as per acc_ID)
	 */

	@Test
	public void testBankAccountList(){
		BankAccountList bankAccountList=new BankAccountList();
		
		String expected="[SavingAccount [accountBalance=10000.0, accountId=100, accountHoldername=Kanak, isSalaryAccount=true], SavingAccount [accountBalance=12000.0, accountId=101, accountHoldername=Shubham, isSalaryAccount=true], SavingAccount [accountBalance=15000.0, accountId=102, accountHoldername=Poonam, isSalaryAccount=true], SavingAccount [accountBalance=15000.0, accountId=103, accountHoldername=Avi, isSalaryAccount=true], SavingAccount [accountBalance=13000.0, accountId=104, accountHoldername=Niranjan, isSalaryAccount=true]]";
		assertEquals(expected, bankAccountList.bankAccounts().toString());
		
	}
	
}