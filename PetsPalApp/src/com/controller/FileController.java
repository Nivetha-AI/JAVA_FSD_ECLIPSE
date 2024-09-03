package com.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.model.Pet;

public class FileController {
public static void main(String[] args) {
	//handler for the file
	File file = new File("pets.txt");
	List<Pet>list = new ArrayList<>();
	// use buffer reader to read the file
	try {
		BufferedReader reader= new BufferedReader(new FileReader(file));
		String data="";
		
			while((data=reader.readLine()) != null) {
				String[ ] arry=data.split(",");
				Pet pet=new Pet(arry[0],Integer.parseInt(arry[1]),arry[2]);
				list.add(pet);
			}
			reader.close();
		
	} catch (FileNotFoundException e) {
		System.out.println(e.getMessage());
	}
	catch (NumberFormatException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	for(Pet p:list) {
		System.out.println(p);
	}
}
}
