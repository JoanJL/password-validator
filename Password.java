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
	
	// We got this far, we have a good password
	return rulesPassed;
	}
}