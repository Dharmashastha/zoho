package test;

import java.io.IOException;

public class CustomException extends Exception 
{
public CustomException(String e)
{
	super(e);
}

public CustomException(Exception error) {
	super(error);
}

}
