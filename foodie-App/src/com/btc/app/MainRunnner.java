package com.btc.app;

import java.sql.SQLException;
import java.util.Scanner;

import com.btc.app.ui.FavouriteAppUI;
import com.btc.app.ui.RestoAppUI;
import com.btc.app.ui.UserAppUI;

public class MainRunnner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		UserAppUI appUI = new UserAppUI();
		RestoAppUI restoUI = new RestoAppUI();
		FavouriteAppUI favUI = new FavouriteAppUI();
		while (true) {
			System.out.println("Enter a option :\n [1 - New User] \n [2 - LogIn] \n [0 - Exit]");
			int choice = scanner.nextInt();
			switch (choice)
			{
			case 1:
				appUI.addUser();
				break;
			case 2:
				System.out.println("Enter a option :\n [1 - User] \n [2 - Admin] \n [0 - Exit]");
				int type = scanner.nextInt();
				switch (type)
				{
				case 1:
					if(appUI.uesrLogIn()==true) {
						while(true) {
						System.out.println("Enter a option :\n [1 - Display All Restaurants] \n [2 - Add Favourite Resto] \n [3 - Display Favourite Resto] \n [4 - Search Resto By Location] \n [0 - Exit]");
						int uoption=scanner.nextInt();
						switch (uoption)
						{
						case 1:
							restoUI.displayAllResto();
							break;
						case 2:
							favUI.addFavResto();
							break;
						case 3:
							favUI.displayFavResto();
							break;
						case 4:
							restoUI.searchRestoByLoc();
							break;
						case 0:
							System.exit(1);
							break;

						default:
							throw new IllegalArgumentException("Invalid Option: " + uoption);
						}
						}	
					}
					break;
				case 2:
				if(appUI.uesrLogIn()) {
					while(true) {
				System.out.println("Enter a option :\n [1 - Add User] \n [2 - Search User] \n [3 - Delete User] \n [4 - Update User] \n"
						+ " [5 - Display All Users] \n [6 - Add Restaurant] \n [7 - Search Resto By Loaction] \n [8 - Delete Restaurant] \n [9 - Display All Restaurant] \n [0 - Exit]");
				int option = scanner.nextInt();
				
				switch (option) {
				case 1:
					appUI.addUser();
					break;
				case 2:
					appUI.showUserById();
					break;
				case 3:
					appUI.deleteUserById();
					break;
				case 4:
					appUI.updateUser();;
					break;
				case 5:
					appUI.showAllUserDetails();;
					break;
				case 6:
					restoUI.addResto();;
					break;
				case 7:
					restoUI.searchRestoByLoc();;
					break;
				case 8:
					restoUI.deleteResto();;
					break;
				case 9:
					restoUI.displayAllResto();;
					break;
				case 0:
					System.exit(1);
					break;

				default:
					throw new IllegalArgumentException("Invalid Option: " + option);
				}
				}
				}
				else {
					System.out.println("Invalid User ID and Password");
				}
				case 0:
					System.exit(1);
					break;

				default:
					throw new IllegalArgumentException("Invalid Option: " + type);
				}
			case 0:
				System.exit(1);
				break;
			default:
				throw new IllegalArgumentException("Invalid Option: " + choice);
			}
			
			System.out.println("\n");

		}

	}

}
