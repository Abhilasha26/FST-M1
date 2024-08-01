package activity8;

class CustomeException extends Exception{
	
	private String message=null;
	
	public CustomeException(String message)
	{
		this.message=message;
	}
	
	@Override
	public String getMessage() {
		return message;
		
	}

	

}
