package com.btc.app.ui;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.btc.app.exception.InvalidEmpNameException;
import com.btc.app.exception.InvalideRestaurantId;
import com.btc.app.exception.NotFoundException;
import com.btc.app.model.Restaurant;
import com.btc.app.model.User;
import com.btc.app.service.RestoService;
import com.btc.app.service.RestoServiceImpl;

public class RestoAppUI {
	private static RestoService service=new RestoServiceImpl();
	
	private Scanner scanner=new Scanner(System.in);
	
	public void addResto() {
		Restaurant restaurant= new Restaurant();
		System.out.println("Enter Restaurant Details :  ");
		System.out.print("Restaurant Id : ");
		int restoId=scanner.nextInt();;
		try {
			
			if(restoId<1000)
			{
				throw new InvalideRestaurantId("Enter four digit Restaurant Id : "+restoId);
			}
			restaurant.setRestaurantID(restoId);
		} 
		catch (InputMismatchException e) {
			e.getMessage();
			System.out.println("Enter the Integer Value ");
		}
		
			System.out.print("Restaruant Name : ");
			String restoName=scanner.next()+scanner.nextLine();
			try {
				if(restoName.length()<2)
				{
					throw new InvalidEmpNameException("Enter correct Restaruant Name :"+restoName);
				}
				restaurant.setRestaurantName(restoName);
			}
			catch (InputMismatchException e) {
				e.getMessage();
				System.out.println("Enter the correct name : "+restoName);
			}
			
			System.out.print("Restaurant Locaton : ");
			String restoLocation = scanner.next()+scanner.nextLine();
			try {
				if(restoLocation.length()<2)
				{
					throw new InvalidEmpNameException("Enter correct Restaruant Locaton :"+restoLocation);
				}
				restaurant.setRestaurantLocation(restoLocation);
			}
			catch (InputMismatchException e) {
				e.getMessage();
				System.out.println("Enter the correct Location : "+restoLocation);
			}
			
			System.out.print("Restaurant Type -> Veg / Non-Veg : ");
			String restoType = scanner.next()+scanner.nextLine();
			try {
				if(restoType.length()<3)
				{
					throw new InvalidEmpNameException("Enter correct Restaruant Type :"+restoType);
				}
				restaurant.setRestaurantType(restoType);
			}
			catch (InputMismatchException e) {
				e.getMessage();
				System.out.println("Enter the correct Type : "+restoType);
			}
			
			System.out.print("Restaurant Category -> Eg.-( Punjabi , South Indian , North Indian , etc ) : ");
			String restoCategory = scanner.next()+scanner.nextLine();
			try {
				if(restoCategory.length()<2)
				{
					throw new InvalidEmpNameException("Enter correct Restaruant Category :"+restoCategory);
				}
				restaurant.setRestaurantCategory(restoCategory);
			}
			catch (InputMismatchException e) {
				e.getMessage();
				System.out.println("Enter the correct Category : "+restoCategory);
			}
			
			Restaurant savedRestaruant;
			try {
				savedRestaruant = service.addResto(restaurant);
				System.out.println("Restaruant  Added Successfully..");
				System.out.println(savedRestaruant);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
    }
	
	
	public void searchRestoByLoc() {
		System.out.println("Enter Restaurant Location :  ");
		String location;
		location = scanner.next();
		try {
			if(location.length()<2)
			{
				throw new InvalidEmpNameException("Enter correct Restaruant Locaton :"+location);
			}
		}
		catch (InputMismatchException e) {
			e.getMessage();
			System.out.println("Enter the correct Location : "+location);
		}		
		
		List<Restaurant> rList;
		try {
			rList=service.searchRestoByLoc(location);
			for (Restaurant resto :rList) {
				System.out.println(resto.toString());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void deleteResto(){
		
		System.out.print("Restaurant ID : ");
		int restoId=0;
		try {
			restoId=scanner.nextInt();
			if(restoId<1000)
			{
				throw new InvalideRestaurantId("Enter four digit EmployeeId : "+restoId);
			}
		} catch (InputMismatchException e) {
			e.getMessage();
			System.out.println("Enter the Integer Value ");
		}
		boolean value;
		try {
			value = service.deleteResto(restoId);
			if(value)
			{
				System.out.println("Deleted Successfully");
			}
			else {
				throw new NotFoundException("Employee ID Not Found : "+restoId);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	public void displayAllResto() {
		// TODO Auto-generated method stub
		List<Restaurant> rList;
		try {
			rList=service.displayAllResto();
			for (Restaurant resto :rList) {
				System.out.println(resto.toString());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
