package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.LoginPage;
import com.cybertek.library.utilities.BrowserUtils;
import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Login_StepDefinitions {

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        String url = ConfigurationReader.getProperty("libraryUrl");
        Driver.getDriver().get(url);

    }

    LoginPage loginPage = new LoginPage();

    @When("User enters student username")
    public void user_enters_student_username() {
        loginPage.username.sendKeys("student11@library");

    }
    @When("User enters student password")
    public void user_enters_student_password() {
        loginPage.password.sendKeys("tScBPCUr");
        loginPage.submitButton.click();
    }
    @Then("User should see the dashboard")
    public void user_should_see_the_dashboard() {

    }

    @When("User enters student {string}")
    public void userEntersStudent(String str) {
        loginPage.username.sendKeys(str);
        BrowserUtils.sleep(1);

    }

    @When("User enters {string}")
    public void userEnters(String str) {
        loginPage.password.sendKeys(str);
        BrowserUtils.sleep(1);
        loginPage.submitButton.click();
    }

    @When("User enters librarian {string}")
    public void userEntersLibrarian(String str) {
        loginPage.username.sendKeys(str);
        BrowserUtils.sleep(1);
    }

    @When("User enters librarian username")
    public void userEntersLibrarianUsername() {
       loginPage.username.sendKeys("librarian16@library");
    }

    @And("User enters librarian password")
    public void userEntersLibrarianPassword() {
        loginPage.password.sendKeys("8BzUhhaU");
        loginPage.submitButton.click();
    }

    @Then("User clicks on Users link")
    public void userClicksOnUsersLink() {

    loginPage.userLink.click();

    }

    @And("User can see records dropdown")
    public void userCanSeeRecordsDropdown() {

        Select select = new Select(loginPage.dropdown);
        List<WebElement> dropdownOptions = select.getOptions();

        for(WebElement each : dropdownOptions) {
            System.out.println(each.getText());
        }
    }

    @Then("User should be able to see columns")
    public void userShouldBeAbleToSeeColumns() {

        System.out.println("table columns = " + loginPage.tableRow.getText());

    }
}
