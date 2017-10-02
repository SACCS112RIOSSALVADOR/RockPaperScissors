import java.util.Scanner;
import java.util.Random;
public class ROSHAMBO {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int userChoice, computerChoice;
		System.out.println("Enter move (0 = Rock; 1 = Paper; 2 = Sciccors):");
		userChoice = scanner.nextInt();
		if(userChoice < 0 || userChoice > 2)
		{
			System.out.println("Invalid choice. Ending program.");
			System.exit(0);
		}
		computerChoice = random.nextInt(3);
		if(userChoice == computerChoice)
		{
			if(userChoice == 0)
			{
				System.out.println("Both Players chose Rock!");
			}
			else if(userChoice == 1) // else ?
			{
				System.out.println("Both players chose Paper!");
			}
			else
			{
				System.out.println("Both players chose Scissors!");
			}
			System.exit(0);
		}
		if(userChoice == 0)
		{
			if(computerChoice == 1)
			{
				System.out.println("You chose Rock; Computer chose Paper");
				System.out.println("Computer Wins!");
			}
			else
			{
				System.out.println("You chose Rock; Computer chose scissors");
				System.out.println("You Win!");
			}
		}
		else if (userChoice == 1)
		{
			if(computerChoice == 0)
			{
				System.out.println("You chose Paper; Computer chose Rock");
				System.out.println("You Win!");
			}
			else
			{
				System.out.println("You chose Paper; Computer chose scissors");
				System.out.println("Computer Wins!");
			}
		}
		else
		{
			if(computerChoice == 0)
			{
				System.out.println("You chose Scissors; Computer chose Rock");
				System.out.println("Computer Wins!");
			}
			else
			{
				System.out.println("You chose Scissors; Computer chose Paper");
				System.out.println("You Win!");
			}
		}
		
		scanner.close();
	}
}
