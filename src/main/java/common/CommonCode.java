package common;

import Constants.Operations;
import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class CommonCode extends Base {


    public void operationsToBePerformed(WebElement element, String operation,String value) throws InterruptedException {
        Thread.sleep(300);
        switch (operation){
            case Operations.CLICK:
                element.click();
                Thread.sleep(300);
                break;
            case Operations.SELECT:
                Select select=new Select(element);
                System.out.println(select.getFirstSelectedOption().getText()) ;
                Thread.sleep(300);
                break;
            case Operations.SELECTBYINDEX:
                Select select1=new Select(element);
                select1.selectByVisibleText(value);
                Thread.sleep(300);
                break;
            case Operations.MULTISELECT:
                Select multiselect=new Select(element);
                System.out.println(multiselect.getAllSelectedOptions()) ;
                List<WebElement> list=multiselect.getAllSelectedOptions();
                for (WebElement ele:list
                     ) {
                    System.out.println(ele.getText());
                }
                Thread.sleep(300);
                break;

        }
    }

    public void clickOnColor(List<WebElement> element) {
        Random random=new Random();
        int rand_int1 = random.nextInt(element.size()-1);
        element.get(rand_int1).click();
    }

    public void printColor(List<WebElement> element) {
        for (WebElement ele:element
             ) {
            if(ele.isDisplayed()){
                System.out.println(ele.getAttribute("style"));
                if(ele.getAttribute("style").contains("green")){
                    System.out.println("GREEN");
                }else if(ele.getAttribute("style").contains("red")){
                    System.out.println("RED");
                }else {
                    System.out.println("ORANGE");
                }
            }
        }
    }
}
