package com.obsqura.assignmentwithpom;

import org.testng.annotations.Test;

import pages.CommonHeadderPage;

public class CommonHeadderPageTest extends Base {
	CommonHeadderPage commonHeadderPageObj;
	@Test
	public void verifyMainMenuClick() {
		commonHeadderPageObj=new CommonHeadderPage(driver);
		commonHeadderPageObj.mainMenuClick("TABLE");	
	}
	//@Test
	public void verifyLeftSideMenuClick() {
		commonHeadderPageObj=new CommonHeadderPage(driver);
		commonHeadderPageObj.leftSideMenuClick("Radio Buttons Demo");	
	}

}
