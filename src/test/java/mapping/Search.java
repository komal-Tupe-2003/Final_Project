package mapping;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.SeleniumOperations;

public class Search {
	
	@When("user click on branches")
	public void user_click_on_branches()
	{
		Object[] input6 = new Object[1];
        input6[0] = "(//*[@width='132'])[1] ";
        SeleniumOperations.Click(input6);

	}
	@When("user select {int} as country")
	public void user_select_as_country(Integer country) 
	{
		 Object[] input7 = new Object[2] ;
         input7[0] = "//*[@name='lst_countryS']";
         input7[1] = country;
         SeleniumOperations.dropDown(input7);
         
	}

	@When("user select {int} as state")
	public void user_select_as_state(Integer state)
	{
		Object[] input8 = new Object[2] ;
        input8[0] = "//*[@name='lst_stateS']";
        input8[1] = state;
        SeleniumOperations.dropDown(input8);
	}

	@When("user select {int} as city")
	public void user_select_as_city(Integer city) 
	{
		Object[] input9 = new Object[2] ;
        input9[0] = "//*[@name='lst_cityS']";
        input9[1] = city;
        SeleniumOperations.dropDown(input9);
	}

	@When("user click on search button")
	public void user_click_on_search_button()
	{
		Object[] input10 = new Object[1];
        input10[0] = "//*[@name='btn_search']";
        SeleniumOperations.Click(input10);
	}

	@Then("application shows results for given city")
	public void application_shows_results_for_given_city() 
	{
		Object[] input11 = new Object[2];
        input11[0]="Branch Details";
        input11[1]="//*[text()='Branch Details']";
        SeleniumOperations.validation(input11);
	}




}