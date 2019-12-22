import Constants.Operations;
import base.Base;
import common.CommonCode;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class TestClass extends Base {
    CommonCode cc=new CommonCode();
    HomePage hp = new HomePage();

//    @Parameters({"browser"})
    @Test(enabled = false)
    public void Test() throws InterruptedException {
        PageFactory.initElements(driver,HomePage.class);
        cc.operationsToBePerformed(hp.InputForms,Operations.CLICK,"");
        cc.operationsToBePerformed(hp.SelectDropdownList,Operations.CLICK,"");
        cc.operationsToBePerformed(hp.ddb1, Operations.SELECT,"");
        cc.operationsToBePerformed(hp.ddb1, Operations.SELECTBYINDEX,"Sunday");
        cc.operationsToBePerformed(hp.ddb1, Operations.SELECT,"");

    }

    @Test(enabled = false)
    public void Test1() throws InterruptedException {
        PageFactory.initElements(driver,HomePage.class);
        cc.operationsToBePerformed(hp.InputForms,Operations.CLICK,"");
        cc.operationsToBePerformed(hp.SelectDropdownList,Operations.CLICK,"");

        cc.operationsToBePerformed(hp.ddb2, Operations.SELECTBYINDEX,"Florida");
        cc.operationsToBePerformed(hp.ddb2, Operations.SELECTBYINDEX,"New Jersey");
        cc.operationsToBePerformed(hp.ddb2, Operations.MULTISELECT,"");
    }

    @Test(enabled = true)
    public void Test2() throws InterruptedException {
        PageFactory.initElements(driver,HomePage.class);
        cc.operationsToBePerformed(hp.Table,Operations.CLICK,"");
        cc.operationsToBePerformed(hp.TableFilter,Operations.CLICK,"");


        cc.clickOnColor(hp.ColorFilter);

Thread.sleep(2000);

    cc.printColor(hp.ColorValue);
    }
}
