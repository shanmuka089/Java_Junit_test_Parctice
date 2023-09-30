package com.junit.testSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import com.junit.fixture.MyFirstTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	JUnitTest1.class,
	JUnitTest2.class,
	MyFirstTest.class
})
public class JUnitTest {

}
