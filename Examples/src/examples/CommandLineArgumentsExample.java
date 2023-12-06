package examples;

public class CommandLineArgumentsExample 
{
	public static void main(String[] args) 
	{
		if (args.length > 0) {
			System.out.println("Command-line arguments provided:");
			for (String arg : args) 
			{ //enhanced for loop
				System.out.println(arg);
			}
		} 
		else 
		{
			System.out.println("No command-line arguments provided.");
		}
	}
}
