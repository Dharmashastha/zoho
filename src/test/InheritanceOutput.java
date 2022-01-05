package test;

import java.util.Scanner;

import inheritance.*;


public class InheritanceOutput {
	Scanner scan=new Scanner(System.in);
	
	
public void swiftCase() throws CustomException
{
	try {
	Swift swiftCall=new Swift();
	System.out.println("Enter the Seats:");
	swiftCall.setSeats(scan.nextInt());
	System.out.println("Enter the Airbags:");
	swiftCall.setAirbags(scan.nextInt());
	scan.nextLine();
	System.out.println("Enter the Model:");
	swiftCall.setModel(scan.nextLine());
	System.out.println("Enter the Color:");
	swiftCall.setColor(scan.nextLine());
	System.out.println("Seats: "+swiftCall.getSeats());
	System.out.println("Airbags: "+swiftCall.getAirbags());
	System.out.println("Model: "+swiftCall.getModel());
	System.out.println("Color: "+swiftCall.getColor());
	}
	catch(Exception e)
	{
		throw new CustomException(e);
	}
}
public void SCrossCase() throws CustomException
{
	try {
	SCross scrossCall=new SCross();
	System.out.println("Enter the Seats:");
	scrossCall.setSeats(scan.nextInt());
	System.out.println("Enter the Airbags:");
	scrossCall.setAirbags(scan.nextInt());
	scan.nextLine();
	System.out.println("Enter the Model:");
	scrossCall.setModel(scan.nextLine());
	System.out.println("Enter the Color:");
	scrossCall.setColor(scan.nextLine());
	System.out.println("Enter the YearOfMake:");
	scrossCall.setYearOfMake(scan.nextInt());
	scan.nextLine();
	System.out.println("Enter the EngineNumber:");
	scrossCall.setEngineNumber(scan.nextLine());
	System.out.println("Enter the Type:");
	scrossCall.setType(scan.nextLine());
	System.out.println("Seats: "+scrossCall.getSeats());
	System.out.println("Airbags: "+scrossCall.getAirbags());
	System.out.println("Model: "+scrossCall.getModel());
	System.out.println("Color: "+scrossCall.getColor());
	System.out.println("YearOfMake: "+scrossCall.getYearOfMake());
	System.out.println("EngineNumber: "+scrossCall.getEngineNumber());
	System.out.println("Type: "+scrossCall.getType());
	}
	catch(Exception e)
	{
		throw new CustomException(e);
	}
}
public void invoke(Car carCall)
{
	System.out.println("Hi");
}
public void identify(Car carCall)
{
	if (carCall instanceof Swift) {
		System.out.println("Hatch");
	}
	if (carCall instanceof XUV) {
		System.out.println("SUV");
	}
	if (carCall instanceof SCross) {
		System.out.println("Sedan");
	}
}
public void invokeSwift(Swift swiftCall)
{
	System.out.println("Welcome");
}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the case ");
		int number=0;
		try 
		{
			number=Integer.parseInt(scan.nextLine());
		}
		catch(Exception e)
		{
			System.out.println("Enter the number only");
			e.printStackTrace();
		}
		InheritanceOutput outputCall=new InheritanceOutput();
switch(number)
{
case 1:
		try {
		outputCall.swiftCase();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		break;
case 2:
		try 
		{
		outputCall.SCrossCase();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		break;
case 3:
{
		Swift objCall=new Swift();
		Car carCall=new Car();
		outputCall.invoke(objCall);
		break;
}
case 4:
{
		Swift objCall=new Swift();
		Car carCall=new Car();
		XUV xuvCall=new XUV();
		SCross scrossCall=new SCross();
		outputCall.identify(scrossCall);
		break;
}
case 5:
{
		Car carCall=new Swift();
		Car carCall1=new Car();
		XUV xuvCall=new XUV();
		SCross scrossCall=new SCross();
		Swift swiftCall=new Swift();
		outputCall.invokeSwift(swiftCall);
		break;
}
case 6:
{
		SCross scrossCall=new SCross();
		scrossCall.maintainance();
		Car carCall=new SCross();
		carCall.maintainance();
		Car carCall1=new Car();
		carCall1.maintainance();
		Swift swiftCall=new Swift();
		swiftCall.maintainance();
		break;
}
case 7:
{
		XUV xuvCall=new XUV();
		//XUV xuvCall1=new XUV("I am DS");
		break;
}
case 8:
{
	//BirdAbstract birdCall=new BirdAbstract();
	ParrotMod parrotCall=new ParrotMod();
	parrotCall.fly();
	parrotCall.speak();
	break;
}
case 9:
{
	Duck duckCall=new Duck();
	duckCall.fly();
	duckCall.speak();
	break;
}
}
scan.close();
}
}

