package com.jenkins.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.jenkins.Concatenate;

public class ConcatenateTest {
	@Test
	public void testConcatenate() {
		Concatenate concatenate = new Concatenate();
		String result = concatenate.concatenate("one", "two");
		System.out.println("Result "+result);
		assertEquals("onetwo", result);
	}
}
