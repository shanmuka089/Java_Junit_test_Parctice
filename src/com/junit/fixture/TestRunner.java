package com.junit.fixture;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class TestRunner {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(MyFirstTest.class);
		for(Failure fail:result.getFailures()) {
			System.out.println(fail);
		}
		System.out.println(result.wasSuccessful());
	}
}
