import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ImgSearchTest extends BaseTest {
    private String SearchText = "cartoon";

    @Test
    public void checkThatImgSearchDisplayResult() {
        getMainPage().clickSearchBar();
        getMainPage().sendKeysToSearchBar(SearchText);
        getSearchResultPage().clickImagesSearchButton();
        assertTrue(getImageSearchResultPage().ImagesArePresentAfterSearch());
    }
}
