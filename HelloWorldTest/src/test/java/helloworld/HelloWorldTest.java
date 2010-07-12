package helloworld;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {
	private HelloWorld helloWorld;

	@Before
	public void createHelloWorld() {
		helloWorld = new HelloWorld();
	}

	@Test
	public void sayIsShadowedByPatch() {
		assertEquals("Hello world from patch", helloWorld.say());
	}
}
