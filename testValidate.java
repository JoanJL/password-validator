
import junit.framework.TestCase;


public class testValidate extends TestCase 
{
	public static void testvalidate()
	{
		Password password = new Password();
		int result = password.validate("password1");
		assertEquals(0,result,0);

		result = password.validate("short");
		assertEquals(1,result,0);

		result = password.validate("goodenough");
		assertEquals(2,result,0);
      
      result = password.validate("abcABC123");
      assertEquals(3,result,0);
	}
}

