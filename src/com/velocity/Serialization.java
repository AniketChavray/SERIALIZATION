package com.velocity;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
	
	
	public static void main (String args []) throws IOException {
		
		Student s1 = new Student(123, "Shivam", "Shalinpur" );
		Student s2 = new Student(345, "Adarsh", "Aravali");
		Student s3 = new Student (906, "Kalia", "Dholakpur");
		
		try {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\HP\\Desktop\\trial.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(s1);
			oos.writeObject(s2);
			oos.writeObject(s3);
			
			oos.flush();
			oos.close();
			
			System.out.println("Success");
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
