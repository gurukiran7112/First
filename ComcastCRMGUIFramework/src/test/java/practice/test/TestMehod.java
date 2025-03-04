package practice.test;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.comcast.crm.basetest.Demobaseclass;

public class TestMehod extends Demobaseclass{
	@Test
	public void TestMethod1(Method mth) {
    Assert.assertEquals(false, true);
		
		
		System.out.println("TestMethod1");
	}
}
