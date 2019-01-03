package com.employee.information;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

/**
 * 
 * c. Employee_information object and MMASaving_Account object belongs to a same
 * entity assuming there are more than 5 entities how will you store the objects
 * preserving the relation between them.
 * 
 */
public class EmployeeAndBankTest {

	@Test
	public void test() {
		EmployeeInformation empKanak = new EmployeeInformation(100, "Kanak",
				"Analyst", 15000, 10);
		MMASavingAccounts savingKanak = new MMASavingAccounts(1001, "Kanak",
				200000, true);

		EmployeeInformation empUnnati = new EmployeeInformation(101, "Unnati",
				"Analyst", 150000, 10);
		MMASavingAccounts savingUnnati = new MMASavingAccounts(1002, "Unnati",
				200000, true);

		EmployeeInformation empPoonam = new EmployeeInformation(102, "Poonam",
				"Analyst", 150000, 10);
		MMASavingAccounts savingPoonam = new MMASavingAccounts(1003, "Poonam",
				20000, true);

		EmployeeInformation empPunam = new EmployeeInformation(103, "Punam",
				"Analyst", 156000, 10);
		MMASavingAccounts savingPunam = new MMASavingAccounts(1004, "Punam",
				200080, true);

		EmployeeInformation empShailja = new EmployeeInformation(104,
				"Shailja", "Analyst", 150900, 10);
		MMASavingAccounts savingShailja = new MMASavingAccounts(1005,
				"Shailja", 209000, true);

		HashMap<String, MMASavingAccounts> hashMap = new HashMap<String, MMASavingAccounts>();
		hashMap.put("Kanak", new MMASavingAccounts(empKanak, savingKanak));
		hashMap.put("Unnati", new MMASavingAccounts(empUnnati, savingUnnati));
		hashMap.put("Poonam", new MMASavingAccounts(empPoonam, savingPoonam));
		hashMap.put("Punam", new MMASavingAccounts(empPunam, savingPunam));
		hashMap.put("Shailja", new MMASavingAccounts(empShailja, savingShailja));

		Iterator<Entry<String, MMASavingAccounts>> itr = hashMap.entrySet()
				.iterator();
		while (itr.hasNext()) {
			Map.Entry<String, MMASavingAccounts> mEntry = (Map.Entry<String, MMASavingAccounts>) itr
					.next();

			System.out.println(mEntry.getKey() + "\t" + mEntry.getValue());
		}
		
	}

}