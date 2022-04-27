package com.amigos.mongo.junitIn28minuts;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
class Stube implements Dataservice{
	public int[] retriveAll() {
		return new int [] {1,2,3};
	}
	
}

class BusinessTestOneStub {

	@Test
	void sumUsingDataService() {
		BusinessServiceImpl dataServiceStuded = new BusinessServiceImpl();
		dataServiceStuded.setDataservice(new Stube());
		
		int actualResult = dataServiceStuded.sumUsingDataService();
		int expectedResult =6;
		assertNotNull(actualResult);
		assertEquals(expectedResult,actualResult);
		
	}

}
