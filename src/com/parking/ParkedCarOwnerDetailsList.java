package com.parking;

import java.util.HashMap;

public class ParkedCarOwnerDetailsList {

		
		int floor=3;
		int section=4;
		int noOfCarInEachSection=20;
		
//		ArrayList<ParkedCarOwnerDetails> parkedCarOwnerDetailsArrayList;
		HashMap<Integer, ParkedCarOwnerDetails> hashMap;
		
		public void ParkedCarOwnerList() {
			hashMap=new HashMap<Integer, ParkedCarOwnerDetails>();
		}
		
		public int addNewCar(ParkedCarOwnerDetails obj){
			hashMap.put(obj.getToken(), obj);
			return obj.getToken();
		}
		
		public void removeCar(int token){
			hashMap.remove(token);	
			
		}
		
		public String getParkedCarLocation(int token){
			String location="Your car is parked on Floor "+hashMap.get(token).getFloor()+" Section "
					+ hashMap.get(token).getSection()+" Slot "
							+ hashMap.get(token).getLocationInSection();
		
			return location;		
		}
	}

