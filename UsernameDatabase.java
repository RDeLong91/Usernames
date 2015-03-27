import javax.swing.JOptionPane;
import javax.swing.JButton;

/* Just a simple program to get familiar with arrays again */
/*
 * Authored by:
 * Ronald DeLong
 */

public class UsernameDatabase {

	public static void main(String[] args) {
		
		String userName = JOptionPane.showInputDialog("Create user name");
		String password = JOptionPane.showInputDialog("Create password");
		
		String[] userNames = new String[5];
		String[] passwords = new String[5];
		
		userNames[0] = userName;
		passwords[0] = password;
		
		String userNameCompare = JOptionPane.showInputDialog("What is your username?");
		
		for (int i = 0; i < userNames.length ; i++)
		{
			//By setting things to upper case we allow the user to spell their username without case sensitivity
			if (userNameCompare.toUpperCase().equals(userNames[i].toUpperCase()))
			{
				String passCompare = JOptionPane.showInputDialog("What is your password? " + userNames[i]);
				//Notice here we do NOT change to upper case as passwords should ALWAYS be case sensitive
				if (passCompare.equals(passwords[i]))
				{
					System.out.println("You're in the database now");
				}
				else
				{
					System.out.println("ACCESS DENIED");
					break;
				}
			}
			else
			{
				System.out.println("USER NOT FOUND");
			}
		}
		
		
	}

}
