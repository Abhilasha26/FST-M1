package activity8;

public class Activity8 {

	public static void main(String[] args) {
		try 
		{
			Activity8.exceptionTest("Will print to console"); // for correct input
			Activity8.exceptionTest(null); // Exception is thrown here
            Activity8.exceptionTest("Won't execute");
		}
		catch (CustomeException e)
		{
			System.out.println("inside catch block:"+e.getMessage());
		}
	}
	static void exceptionTest(String str) throws CustomeException
	{
		if(str==null)
		{
			throw new CustomeException("string value is null");
	    }
		else
		{
			System.out.println(str);}
	}

}
