package com.amigos.mongo.junitIn28minuts;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;


class BusinessTestOneMock {

	@Test
	void sumUsingDataService() {
		BusinessServiceImpl dataServiceStuded = new BusinessServiceImpl();
		//mocking the service
		Dataservice dataservice = mock(Dataservice.class);
		//using when and then return data back
		when(dataservice.retriveAll()).thenReturn(new int[] {1,2,3});
		int actualResult = dataServiceStuded.sumUsingDataService();
		int expectedResult =6;
		assertNotNull(actualResult);
		assertEquals(expectedResult,actualResult);
		
	}

}
