package com.greatlearning.drivers;
import com.greatlearning.model.*;
import com.greatlearning.services.*;
import java.util.*;



public class Driver {

	public static void main(String[] args) {
		
		int n;		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the total no of floors in the building");
		n = sc.nextInt();
		ArrayList<Integer> inputArrli = new ArrayList<Integer>();
		inputArrli = model.creatInputArray(n);
		services.orderConstruction(inputArrli);

	}

}
