package com.mkyong.core;

import junit.framework.Assert;
import org.junit.Test;

public class chaptertest {

	@Test
	public void testPrintHelloWorld2() {

		Assert.assertEquals(App.getHelloWorld2(), "Hello World 2");

	}
