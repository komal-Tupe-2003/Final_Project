package utility;

import org.openqa.selenium.support.ui.Select;

public class Access extends SeleniumOperations
{
	
	public static void main(String [] args) throws Exception
	{
		//Access1 obj = new Access1();
		
		Object[] input1 = new Object[2];
		         input1[0] = "webdriver.chrome.driver";
		         input1[1] = "D:\\AUTOMATION SUPPORT\\chromedriver.exe";
		         SeleniumOperations.browserLaunch(input1);
		
		Object[] input2 = new Object[1];
		         input2[0] = "http://primusbank.qedgetech.com/";
		        SeleniumOperations.openApllication(input2);
				
      Object[] input3 = new Object[2];
               input3[0] = "//*[@name='txtuId']";
               input3[1] = "Admin";
               SeleniumOperations.sentTextOnUi(input3);
               
     Object[] input4 = new Object[2] ;
              input4[0]= "//*[@type='password']" ;
              input4[1]="Admin";
              SeleniumOperations.sentTextOnUi(input4);
              
     Object[] input5 = new Object[1];
              input5[0] = "//*[@name='login']";
              SeleniumOperations.Click(input5);
              
     Object[] input6 = new Object[1];
              input6[0] = "(//*[@width='132'])[1] ";
              SeleniumOperations.Click(input6);
              
     Object[] input7 = new Object[2] ;
              input7[0] = "//*[@name='lst_countryS']";
              input7[1] = 1;
              SeleniumOperations.dropDown(input7);
              
    Object[] input8 = new Object[2] ;
              input8[0] = "//*[@name='lst_stateS']";
              input8[1] = 2;
              SeleniumOperations.dropDown(input8);
              
              
    Object[] input9 = new Object[2] ;
              input9[0] = "//*[@name='lst_cityS']";
              input9[1] = 2;
              SeleniumOperations.dropDown(input9);
              
              
   Object[] input10 = new Object[1];
                input10[0] = "//*[@name='btn_search']";
                SeleniumOperations.Click(input10);
                
    Object[] input11 = new Object[2];
              input11[0]="Admin";
              input11[1]="//*[text() ='Admin']";
              SeleniumOperations.validation(input11);
              
               
}
}
		
	


