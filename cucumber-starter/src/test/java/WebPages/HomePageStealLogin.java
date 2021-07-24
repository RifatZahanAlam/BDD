package WebPages;


import net.serenitybdd.core.annotations.findby.By;

import net.serenitybdd.core.pages.PageObject;

public class HomePageStealLogin extends PageObject {
	
	public void enterUsername(String userName)
	{
		$(By.name("username")).type(userName);
	}
	
	
	public void enterPassword(String password)
	{
		$(By.name("password")).type(password);
	}

	
	public void clickLoginButton()
	{
		$(By.cssSelector("input[type='submit']")).click();
	}

	

}
