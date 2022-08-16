import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ImageSearchResultPage extends BasePage {
    @FindBy(xpath = "//div[@class='bRMDJf islir']")
    private WebElement Images;

    public ImageSearchResultPage(WebDriver driver) {
        super(driver);
    }

    public boolean ImagesArePresentAfterSearch() {
        waitVisibilityOfElement(5, Images);
        return Images.isDisplayed();
    }
}
