package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends NavigationHelper {
//    private boolean creation;
//    private FirefoxDriver wd;

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void fillContactForm(ContactData contactData, boolean creation) {
        type(By.name("firstname"), contactData.getFirstname());
        type(By.name("lastname"), contactData.getLastname());
        type(By.name("company"), contactData.getCompany());
        type(By.name("email"), contactData.getEmail());
        type(By.name("mobile"), contactData.getMobile());

        if (creation) {
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }
    }

    public void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void initContactCreation() {
        click(By.linkText("add new"));
    }

    public void acceptAlertDeletion() {

        wd.switchTo().alert().accept();
    }

    public void deleteSelectedContacts() {
        click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
    }

    public void selectContact(int index) {
        wd.findElements(By.name("selected[]")).get(index).click();
//        click(By.name("selected[]"));
    }

    public void initContactModification(int index) {
        wd.findElements(By.cssSelector("img[alt='Edit']")).get(index).click();
//        click(By.cssSelector("img[alt='Edit']"));
    }

    public void submitContactModification() {
        click(By.name("update"));
    }

    public void createContact(ContactData contact, boolean b) {
        initContactCreation();
        fillContactForm(contact,b);
        returnToHomePage();
    }

    public boolean isThereAContact() {
        return isElementPresent(By.name("selected[]"));

    }

    public int getContactCount() {
        return wd.findElements(By.name("selected[]")).size();
    }
}
