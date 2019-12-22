import org.testng.annotations.*;

public class TestNGClass extends TestNGClass1{

//    @BeforeSuite(groups = {"brokenTests","checkinTests"})
//    public void beforeSuite_test(){
//        System.out.println("beforeSuite Method");
//    }
//
//    @AfterSuite(groups = {"brokenTests"})
//    public void afterSuite_test(){
//        System.out.println("AfterSuite Method");
//    }
//

    @DataProvider(name = "data")
    public Object[][] createData() {
        return new Object[][] {
                { "test1", new Integer(10000) },
                { "test2", new Integer(20000)},
        };
    }


    @Parameters({"browser"})
    @Test(priority=1, description = "Test A")
//    @Ignore
    public void a(String browser){
        System.out.println("Actual test A "+browser);
    }

    @Test(enabled = true, priority=0, timeOut = 300, dataProvider = "data")
    public void b(String n1, Integer n2) throws InterruptedException {

        Thread.sleep(100);
        System.out.println("Actual test B : "+n1+" : "+n2);
    }
//
//    @BeforeTest(groups = {"brokenTests"})
//    public void beforeTest_test(){
//        System.out.println("beforeTest Method");
//    }
//
//    @AfterTest(groups = {"brokenTests"})
//    public void afterTest_test(){
//        System.out.println("AfterTest Method");
//    }
//
//    @BeforeClass(groups = {"brokenTests"})
//    public void beforeClass_test(){
//        System.out.println("beforeClass Method");
//    }
//
//    @AfterClass(groups = {"brokenTests"})
//    public void afterClass_test(){
//        System.out.println("AfterClass Method");
//    }
//
//    @BeforeMethod(groups = {"brokenTests"})
//    public void beforeMethod_test(){
//        System.out.println("beforeMethod Method");
//    }
//
//    @AfterMethod(groups = {"brokenTests"})
//    public void afterMethod_test(){
//        System.out.println("AfterMethod Method");
//    }
//
//    @BeforeGroups(groups = {"brokenTests"})
//    public void beforeGroups_test(){
//        System.out.println("beforeGroups Method");
//    }
//
//    @AfterGroups(groups = {"brokenTests","checkinTests"})
//    public void afterGroups_test(){
//        System.out.println("AfterGroups Method");
//    }

}
