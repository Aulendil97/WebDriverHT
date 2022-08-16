import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends BasePage {

    @FindBy(xpath = "//a[text()='Зображення']")
    private WebElement ImagesSearch;

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public void clickImagesSearchButton() {
        waitVisibilityOfElement(5, ImagesSearch);
        ImagesSearch.click();
    }
}
