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

    @Then("I validate that the type field and the search button are displayed on the screen")
    public void i_validate_that_the_type_field_and_the_search_button_are_displayed_on_the_screen() {
        obj.contem_na_tela("search-open");
        obj.contem_na_tela("#masthead > div.site-header-content > div.desktop-search > form > input");
    }

    @io.cucumber.java.After(order = 0)
    public void fecharBrowser() {
        Manager.killDriver();
    }

}

