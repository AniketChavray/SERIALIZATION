package com.velocity;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	
	public static void main(String args []) throws IOException, ClassNotFoundException {
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Desktop\\trial.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Object obj = null;
			while((obj = ois.readObject())!= null) {
				System.out.println(obj);
				
			}
			
			
//		 Student obj1 = (Student) ois.readObject();
//		 Student obj2 = (Student) ois.readObject();
//		 Student obj3 = (Student) ois.readObject();
		 
//		 System.out.println(obj1);
//		 System.out.println(obj2);
//		 System.out.println(obj3);
//			
//			
//			while(true) {
//				
//				try {
//				System.out.println(ois.readObject());
//			} catch (EOFException ref) {
//				
//				break;
//			}
//			
//			}
		}
			catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
