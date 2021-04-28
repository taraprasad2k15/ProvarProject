package pageobjects.session0008;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="MyPageObject"                                
     , summary=""
     , relativeUrl=""
     , connection="Regmain"
     )             
public class MyPageObject {

	@TextType()
	@FindBy(xpath = "//input[@id='input-408']")
	public WebElement end;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='AutomationContactPress Delete to Remove']")
	public WebElement automationContact;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Related To']/following-sibling::div//input")
	public WebElement relatedTo;
			
}
