package test.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.Manager;
import page.Object;

public class StepsSearch {
	
	private Object obj = new Object();
	
	@Given("that I am a user and I want to do a search")
	public void that_i_am_a_user_and_i_want_to_do_a_search() {
		Manager.getDriver().get("https://blogdoagi.com.br/");
	}

	@When("I look for the magnifying glass and click on it")
	public void i_look_for_the_magnifying_glass_and_click_on_it() {
		Manager.getDriver().findElement(By.id("search-open")).click();
	}

	@When("I type in the agi search field and click search")
	public void i_type_in_the_agi_search_field_and_click_search() {
		Manager.getDriver().findElement(By.id("search-open")).click();
		Manager.getDriver().findElement(By.cssSelector("#masthead > div.site-header-content > div.desktop-search > form > label > input")).sendKeys("agi");
		Manager.getDriver().findElement(By.cssSelector("#masthead > div.site-header-content > div.desktop-search > form > input")).click();
	}

	@Then("I validate the message that the system presents on the screen {string}")
	public void i_validate_the_message_that_the_system_presents_on_the_screen_Resultados_da_busca_por_agi(String msg) {
		obj.validar_mensagem("Resultados da busca por: agi", msg);

	}

	@io.cucumber.java.After(order = 0)
	public void fecharBrowser() {
		Manager.killDriver();
	}

}
