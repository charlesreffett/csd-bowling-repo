package com.example.demo;


import com.example.demo.UserStoryTotalForOneFrame;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

public class UserStoryTotalForFrameTest {
	static UserStoryTotalForOneFrame tester;
	
	Boolean Bowling;
	int ball1 = 2, ball2 = 4;
	int ball3 = 6;
	int pintotal;
	
	
	@Given("^I am bowling$")
	public void setIAmBowling() {
	// ...
		Bowling = true;
		tester = new UserStoryTotalForOneFrame();
		tester.resetTotalPins();
	}
	@When("^I knock down 2 pins on the first ball$")
	public void setPinsFrame1ball1() {
	// ...
		pintotal = tester.getPins(ball1);
	}
	@And("^4 pins on the second ball$")
	public void setPinsFrame1ball2() {
	// ...
		pintotal = tester.getPins(ball2);
	}
	@Then("^the total will show 6$")
	public void assertResult1() {
	// ...
		assertThat("Scenario 1: " + String.valueOf(ball1) + " and " +  String.valueOf(ball2),pintotal == ball1 + ball2);		
	}
	@When("^I knock down 6 pins on the first ball$")
	public void setPinsFrame2ball1() {
	// ...
		pintotal = tester.getPins(ball3);
	}
		@Then("^the total will show 10$")
	public void assertResult2() {
	// ...
		assertThat("Scenario 2: " + String.valueOf(ball3) + " and " +  String.valueOf(ball2),pintotal == ball3 + ball2);		
	}
	
}
