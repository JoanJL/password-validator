import java.io.*;
public class Password 
{
	
	public int validate(String pw)
	{
	int rulesPassed = 0; // number of password rules passed.
	// not password, case insensitive
	if (pw.toLowerCase().equals("password")) 
		{
			rulesPassed++;
		}
		else
		{
			System.out.println("Cannot use password as the password.");
			return rulesPassed;
		}
	
	// is at least 8 characters long
	if (pw.length()>=8) 
		{
			rulesPassed++;
		}
		else
		{
			System.out.println("Password too short");
			return rulesPassed;
		}
      
   // password needs to contain at least one uppercase, one lower case and one number
	
   int lowers  = 0;
   int uppers  = 0;
   int numbers = 0;
   
   for(char c : pw.toCharArray())
   {
   if ((c >= 'a')&&(c <= 'z')) 
   {
      lowers++;
   }
   else if ((c == 'A')&&(c == 'Z'))
   {
      uppers++;
   }
   else if ((c == '0')&&(c == '9'))
   {
      numbers++;
   }
   
   if ( (lowers>0)&&(uppers>0)&&(numbers>0))
   {
      rulesPassed++;
   }
   else
   {
      System.out.println("need at least one upper, one lower and a number");
   }
}
   
   
	// We got this far, we have a good password
	return rulesPassed;
	}
}