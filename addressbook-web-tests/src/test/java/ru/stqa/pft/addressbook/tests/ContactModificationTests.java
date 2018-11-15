package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification(){
        if (!app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("testname", "testlastname",
                    "testcompany", "testemail",
                    "9179043411", null));
        }
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("testname",
                "testlastname",
                "testcompany", "testemail",
                "9179043411", null));
        app.getContactHelper().submitContactModification();
        app.getContactHelper().gotoHomePage();

    }
}
