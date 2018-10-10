package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests  extends TestBase{

    @Test
    public void testContactCreation() {

        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(
                new ContactData("testname", "testlastname", "testcompany",
                        "testemail",
                        "9179043411"));
        app.getContactHelper().returnToHomePage();
    }

}
