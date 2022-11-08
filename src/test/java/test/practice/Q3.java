package test.practice;

import Utilities.TestBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class Q3 extends TestBaseClass {

    /*
- go to url : https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/
- Task 1 - Find Dropdown on Multi Selection
- Task 2 - Find all Dropdown Elements
- Task 3 - Printout Dropdown Elements' number
- Task 4 - Choose all Dropdown elements and printout Dropdown elements' name on Multi Selection
- Task 5 - Check until choice 6
 */


    @Test
    public void test01(){
        driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

        driver.findElement(By.xpath("(//input[@type='text'])[1]")).click();

        List<WebElement> dropList = driver.findElements(By.className("ComboTreeItemChlid"));

        System.out.println("Dropdownlardaki element sayisi : " + dropList.size());

        for (int i = 0; i < dropList.size(); i++) {

            String text = dropList.get(i).getText();
            System.out.println("text = " + text);

            if (!text.isEmpty()){
                dropList.get(i).click();
            }

            if (text.equals("choise 5")){
                dropList.get(i).click();
                break;
            }

        }


    }

}
