package TestAutomation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class inbuildmethods {

	
	public static void Dropdownselectbyid(WebElement Valuehavetoselect,int id) {
	
	Select dropdown = new Select(Valuehavetoselect);
	dropdown.selectByIndex(id);
	
	}
	
	public static void Dropdownselectbyvisiblevalue(WebElement Valuehavetoselect,String value) {
		
		Select dropdown = new Select(Valuehavetoselect);
		dropdown.selectByValue(value);
		
		}
}
