package uk.co.viabledata.page;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.viabledata.utility.Utility;

import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@id='inner-header']/div[3]")
    WebElement mainTab;
    @CacheLookup
    @FindBy(xpath = "//div[@class='burger-menu-open clearfix']/nav/ul/li")
    List<WebElement> subTab;
    @CacheLookup
    @FindBy(xpath = "//div[@id='main']/article/section[2]/div/h4")//h4
    WebElement careerText;

    public void clickOnTab(){
        clickOnElement(mainTab);

    }
    public void clickOnSubTab(String list){
        for(WebElement c : subTab){
            if(c.getText().equalsIgnoreCase(list)){
                c.click();
                break;
            }
        }

    }
    public String verifyCareersText(String text){
        return getTextFromElement(careerText);
    }



}
