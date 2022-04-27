package com.amigos.mongo.junitIn28minuts;

public class BusinessServiceImpl {
	
	private Dataservice dataservice;

	public void setDataservice(Dataservice dataservice) {
		this.dataservice = dataservice;
	}

	public int sum(int array[]) {
		int arraySum = 0;
		for (int data : array) {
			arraySum += data;
		}
		return arraySum;
	}
	//junt for method that is calling other method
	public int sumUsingDataService() {
		int arraySum = 0;
		int array[] =dataservice.retriveAll();
		for (int data : array) {
			arraySum += data;
		}
		return arraySum;
	}
	
}
