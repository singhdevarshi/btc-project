package com.btc.app.ui;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.btc.app.exception.InvalidEmpNameException;
import com.btc.app.exception.InvalidEmployeeId;
import com.btc.app.exception.InvalideRestaurantId;
import com.btc.app.model.Favourite;
import com.btc.app.model.Restaurant;
import com.btc.app.model.User;
import com.btc.app.service.FavouriteService;
import com.btc.app.service.FavouriteServiceImpl;
public class FavouriteAppUI {
    
	private static FavouriteService service=new FavouriteServiceImpl();
	
	private Scanner scanner=new Scanner(System.in);
		
		public void addFavResto()
		{
			Favourite favourite= new Favourite();
			System.out.println("Enter Favourite Details :  ");
			System.out.print("Favourite Id : ");
			int fevId=scanner.nextInt();;
			try {
				
				if(fevId<1000)
				{
					throw new InvalideRestaurantId("Enter four digit Favourite Id : "+fevId);
				}
				favourite.setFavId(fevId);
			} 
			catch (InputMismatchException e) {
				e.getMessage();
				System.out.println("Enter the Integer Value ");
			}
			System.out.print("Enter Your User Id : ");
			int uId=scanner.nextInt();;
			try {
				
				if(uId<1000)
				{
					throw new InvalideRestaurantId("Enter four digit User Id : "+uId);
				}
				favourite.setUserId(uId);
			} 
			catch (InputMismatchException e) {
				e.getMessage();
				System.out.println("Enter the Integer Value ");
			}
			System.out.print("Restaurant Name : ");
			String restoName=scanner.next()+scanner.nextLine();
			try {
				
				if(restoName.length()<2)
				{
					throw new InvalidEmpNameException("Enter Correct Restaurant Name : "+restoName);
				}
				favourite.setRestoName(restoName);
			} 
			catch (InputMismatchException e) {
				e.getMessage();
				System.out.println("Enter the correct name : "+restoName);
			}
			
			Favourite savedFav;
			try {
				savedFav = service.addFavResto(favourite);
				System.out.println("Favourite Restaurant Added Successfully..");
				System.out.println(savedFav);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void displayFavResto() {
			System.out.print("User ID : ");
			int userId=0;
			try {
				userId=scanner.nextInt();
				if(userId<1000)
				{
					throw new InvalidEmployeeId("Enter four digit UserId : "+userId);
				}
			} catch (InputMismatchException e) {
				// TODO: handle exception
				e.getMessage();
				System.out.println("Enter the Integer Value ");
			}
			
			List<Favourite> fList;
			try {
				fList=service.displayFavResto(userId);
				for (Favourite fevo :fList) {
					System.out.println(fevo.toString());
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
