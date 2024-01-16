package disha;

import org.testng.annotations.Test;



public class Demo1 
{
	public class LoginTest 
      {
		@Test(priority =2,description="this is login")
		public void Blogintest()
		{
	        
	        System.out.println("login succesfull");
		} 
		@Test(priority =1,description="this is logout")
		public void Alogouttest()
		{
			System.out.println("logout succesfull");
		}
    
      
   }
      
       
      
      }

