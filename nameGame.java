import java.util.*;



public class nameGame{
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);

		ArrayList<String> iceCreams = new ArrayList<String>();
		ArrayList<String> lastNames = new ArrayList<String>();
		ArrayList<String> firstNames = new ArrayList<String>();

		for(int i = 0; i < 10; i ++)
		{
			System.out.println("whats ur first name man? ");
			firstNames.add(scan.nextLine());

			System.out.println("whats ur last name man? ");
			lastNames.add(scan.nextLine());

			System.out.println("whats ur favorite ICE cream flavor man? ");
			iceCreams.add(scan.nextLine());


		}
		for(int i = 0; i < iceCreams.size(); i ++)
		{
			System.out.println(ANSI_WHITE + "name: " + ANSI_RESET + ANSI_RED + lastNames.get(i) + "," + firstNames.get(i) + ANSI_RESET + ANSI_WHITE + " ice cream flavor: " + ANSI_RESET + ANSI_PURPLE + iceCreams.get(i) + ANSI_RESET);
		}


	}
}
