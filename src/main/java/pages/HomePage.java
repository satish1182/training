package pages;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends Base {


@FindBy(xpath = "//a[@class=\"dropdown-toggle\" and contains(text(),'Input Forms')]")
public static WebElement InputForms;

@FindBy(xpath = "//div[@id=\"navbar-brand-centered\"]//a[contains(text(),'Select Dropdown List')]")
public static WebElement SelectDropdownList;

    @FindBy(xpath = "//select[@id=\"select-demo\"]")
    public static WebElement ddb1;

    @FindBy(xpath = "//select[@name=\"States\"]")
    public static WebElement ddb2;

    @FindBy(xpath = "//button[@id=\"printMe\"]")
    public static WebElement FirstValue;

    @FindBy(xpath = "//a[@class=\"dropdown-toggle\" and contains(text(),'Table')]")
    public static WebElement Table;

    @FindBy(xpath = "//div[@id=\"navbar-brand-centered\"]//a[contains(text(),'Table Filter')]")
    public static WebElement TableFilter;

    @FindBys( {
        @FindBy(xpath = "//div[@class=\"btn-group\"]//*[@type=\"button\"]")
    } )
    public static List<WebElement> ColorFilter;

    @FindBys({
            @FindBy(xpath = "//div[@class=\"media\"]/a[@class=\"pull-left\"]/i")
    })
    public static List<WebElement> ColorValue;
}
