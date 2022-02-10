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

public class StepMagnifyingGlass {

    private Object obj = new Object();
    public WebDriverWait wait;

    public Select select;

    @Then("I validate that the type field and the search button are displayed on the screen")
    public void i_validate_that_the_type_field_and_the_search_button_are_displayed_on_the_screen() {
        Manager.getDriver().findElement(By.id("search-open")).isDisplayed();
        Manager.getDriver().findElement(By.cssSelector("#masthead > div.site-header-content > div.desktop-search > form > input")).isDisplayed();
    }

    @io.cucumber.java.After(order = 0)
    public void fecharBrowser() {
        Manager.killDriver();
    }

}

