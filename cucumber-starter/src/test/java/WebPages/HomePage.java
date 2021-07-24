package WebPages;

import net.thucydides.core.annotations.Step;

public class HomePage {
	
	
	HomePageStealLogin homePageSteal;
	
	@Step
	public void launchHomePage()
	{
		homePageSteal.open();
	}
	
	@Step
	public void enterUsername(String userName)
	{
		homePageSteal.enterUsername(userName);
		
		
	}
	
	@Step
	public void enterPassword(String password)
	{
		homePageSteal.enterPassword(password);
		homePageSteal.clickLoginButton();
		
	}
	
	

}
