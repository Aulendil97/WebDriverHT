import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    @FindBy(xpath = "//input[@class='gLFyf gsfi']")
    private WebElement SearchBar;
    @FindBy(xpath = "//input[@class='gNO89b']")
    private WebElement SearchButton;


    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void clickSearchBar() {
        waitVisibilityOfElement(5, SearchBar);
        SearchBar.click();
    }

    public void sendKeysToSearchBar(String keyword) {
        SearchBar.sendKeys(keyword);
        waitVisibilityOfElement(5, SearchButton);
        SearchButton.click();
    }

}
