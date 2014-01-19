package com.techinterviews.arrays;


import org.junit.Test;

import org.junit.Assert;

public class Strings {
	
	@Test
	public void testFailingCase(){
		String a="ab";
		String b="zy";
		
		Assert.assertEquals(StringProblems.isStringPermuation(a, b), false);
	}
	
	@Test
	public void testPassingCase(){
		String a="abc";
		String b="bca";
		
		Assert.assertEquals(StringProblems.isStringPermuation(a, b), true);
	}
	@Test
	public void testSingleCharPassingCase(){
		String a="a";
		String b="a";
		
		Assert.assertEquals(StringProblems.isStringPermuation(a, b), true);
	}
	@Test
	public void testSingleCharFailingCase(){
		String a="a";
		String b="z";
		
		Assert.assertEquals(StringProblems.isStringPermuation(a, b), false);
	}
	
	@Test
	public void testDulicateCharPassingCase(){
		String a="aaa";
		String b="aaa";
		
		Assert.assertEquals(StringProblems.isStringPermuation(a, b), false);
	}
}
