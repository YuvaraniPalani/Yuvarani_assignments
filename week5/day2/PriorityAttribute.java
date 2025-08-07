package week5.day2;

import org.testng.annotations.Test;

public class PriorityAttribute {
	@Test
	public void login() {
		System.out.println("login successful");

	}

	@Test(priority=2)
	public void payment() {
		System.out.println("payment completed");

	}

	@Test(priority=1)
	public void cart() {
		System.out.println("item added to cart");

	}
}
