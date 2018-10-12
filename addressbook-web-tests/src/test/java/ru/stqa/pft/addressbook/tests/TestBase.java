package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;
import sun.plugin2.util.BrowserType;

public class TestBase  {
    protected final ApplicationManager app = new ApplicationManager(BrowserType.DEFAULT);

    @BeforeMethod
    public void setUp() throws Exception {
        app.init();
    }

//old
//    @BeforeMethod
//    public void setUp() throws Exception {
//        wd = new FirefoxDriver();
//        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//        wd.get("http://localhost/addressbook/");
//        login("admin", "secret");
//    }

    @AfterMethod
    public void tearDown() {

        app.stop();
    }
// old
//    @AfterMethod
//    public void tearDown() {
//        wd.quit();
//    }
}
