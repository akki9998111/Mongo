package com.amigos.mongo.junitIn28minuts;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BusinessTestOne {

	@Test
	void test() {
		Business business = new Business();
		int actualResult = business.sum(new int[]{1,2,3});
		int expectedResult =7;
		assertEquals(expectedResult,actualResult);
		
	}

}
