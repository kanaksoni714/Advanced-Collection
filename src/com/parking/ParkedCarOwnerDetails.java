package com.parking;

/**
 * 3) There is parking slot available in R-Mall with 3 floors; each floor has 4
 * sections and each section can maximum park 20 cars. You need to design one
 * application which will maintain all car details in such way when ever car
 * owner arrives to collect his car your application should provide details
 * including where it is located.
 * 
 * a. Create class Parked_CarOwner_Details which will have field’s owerName,
 * carModel, carNO, owerMobileNo, owerAddress with setter and getter methods.
 * 
 * b. Create class Parked_CarOwenerList which will have method’s int
 * add_new_car(Parked_CarOwner_Details obj), remove_car(),
 * get_parked_car_location(token)
 * 
 *
 */

public class ParkedCarOwnerDetails implements Comparable<ParkedCarOwnerDetails>{

	private String ownerName;
	private final String carModel;
	private final String carNumber;
	private String owerMobileNumber;
	private String owerAddress;

	private final int floor;
	private final int section;
	private final int locationInSection;
	private final int token;

	
	public static int highestToken=1101; 
	
	{
		if(highestToken%100==21){
			highestToken+=80;
			token=highestToken++;
		}else if(highestToken%1000==420){
			highestToken+=681;
			token=highestToken++;
			
		}else{
			token=highestToken++;	
		}
		
		floor=token/1000;
		
		section=(token/100)%10;
		locationInSection=token%100;	
		
	}

	
	/**
	 * 
	 * @param ownerName
	 * @param carModel
	 * @param carNumber
	 * @param owerMobileNumber
	 * @param owerAddress
	 */
	public ParkedCarOwnerDetails(String ownerName, String carModel,
			String carNumber, String owerMobileNumber, String owerAddress) {
		super();
		this.ownerName = ownerName;
		this.carModel = carModel;
		this.carNumber = carNumber;
		this.owerMobileNumber = owerMobileNumber;
		this.owerAddress = owerAddress;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}



	public String getOwerMobileNumber() {
		return owerMobileNumber;
	}

	public void setOwerMobileNumber(String owerMobileNumber) {
		this.owerMobileNumber = owerMobileNumber;
	}

	public static int getHighestToken() {
		return highestToken;
	}

	public static void setHighestToken(int highestToken) {
		ParkedCarOwnerDetails.highestToken = highestToken;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public int getFloor() {
		return floor;
	}

	public int getSection() {
		return section;
	}

	public int getLocationInSection() {
		return locationInSection;
	}

	public int getToken() {
		return token;
	}

	public String getOwerAddress() {
		return owerAddress;
	}

	public void setOwerAddress(String owerAddress) {
		this.owerAddress = owerAddress;
	}

	public String getCarModel() {
		return carModel;
	}


	@Override
	public int compareTo(ParkedCarOwnerDetails o) {		
		return 0;
	}

}
