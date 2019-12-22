import org.testng.annotations.*;

public class TestNGClass1 {

    @BeforeSuite
    public void beforeSuite_test(){
        System.out.println("beforeSuite Method");
    }

    @AfterSuite
    public void afterSuite_test(){
        System.out.println("AfterSuite Method");
    }


    @BeforeTest
    public void beforeTest_test(){
        System.out.println("beforeTest Method");
    }

    @AfterTest
    public void afterTest_test(){
        System.out.println("AfterTest Method");
    }

    @BeforeClass
    public void beforeClass_test(){
        System.out.println("beforeClass Method");
    }

    @AfterClass
    public void afterClass_test(){
        System.out.println("AfterClass Method");
    }

    @BeforeMethod
    public void beforeMethod_test(){
        System.out.println("beforeMethod Method");
    }

    @AfterMethod
    public void afterMethod_test(){
        System.out.println("AfterMethod Method");
    }

    @BeforeGroups
    public void beforeGroups_test(){
        System.out.println("beforeGroups Method");
    }

    @AfterGroups
    public void afterGroups_test(){
        System.out.println("AfterGroups Method");
    }

}
