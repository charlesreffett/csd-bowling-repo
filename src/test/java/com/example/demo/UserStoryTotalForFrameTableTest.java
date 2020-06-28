package com.example.demo;

import java.util.List;
import java.util.Map;

import com.example.demo.UserStoryTotalForOneFrame;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

public class UserStoryTotalForFrameTableTest {
	static UserStoryTotalForOneFrame tester;
	
	Boolean Bowling;	
	int pintotal;
	int expectedtotal;
	
	@Given("^I am bowling2$")
	public void setIAmBowling() {
	// ...
		Bowling = true;
		tester = new UserStoryTotalForOneFrame();
		tester.resetTotalPins();
	}
	@When("^bowl$")
	public void setPinsFrame1ball1(DataTable aDataTable) {
	//public void setPinsFrame1ball1(List<Map<String, String>> myParamaters) {
	// ...
	    List<Map<String, String>> myParamaters = aDataTable.asMaps(String.class, String.class);

		String myBall1String = myParamaters.get(0).get("ball1");
		String myBall2String = myParamaters.get(0).get("ball2");
		String myTotalString = myParamaters.get(0).get("total");
		pintotal = tester.getPins(Integer.parseInt(myBall1String));
		pintotal = tester.getPins(Integer.parseInt(myBall2String));
		expectedtotal = Integer.parseInt(myTotalString);

	}
		@Then("^total$")
	public void assertResult2() {
	// ...
		assertThat("Pin Total equals Expected Total: ",pintotal == expectedtotal);		
	}
	
}
