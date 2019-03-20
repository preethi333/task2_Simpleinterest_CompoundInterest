package com.task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleinterestTest {

	@Test
	void SimpleInteresttest() {
		Simpleinterest s=new Simpleinterest(10000,5,5);
		assertEquals(2500,s.Simple_Interset());
		Simpleinterest s1=new Simpleinterest(1000,5.7f,3);
		assertEquals(171,s1.Simple_Interset());
	}
    
	@Test
	void CompoundInteresttest() {
		Simpleinterest c=new Simpleinterest(1200,2,5.4f);
		assertEquals(1333.099250660706,c.Compound_Interset());
	}
}
