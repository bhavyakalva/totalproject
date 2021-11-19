package sep1_accessmodifiers2;

import sep1_accessmodifiers.School;//here we imported the school package and class so with out extending the school class we can access the methods
//which are public but we cant access the methods which are protected to access that we have to use inheritance 

public class Headmaster {

	public static void main(String[] args) {// here we created school obj to access public methods in school as we are not
											// using  inheritance here so we created have created the object for the   
	                                       	// school class and accessed the method and variable which are public.as we cannot access it 
	                                     	// by creating headmaster obj coz we are not using inheritance here
		School obj = new School();
		System.out.println("name of the school is " + obj.schoolName);// it is also accessed coz it is public variable
																		// and we imported the schoolclass and
																		// createdscchool obj
		obj.garden();// we accesed public method here coz we imported the schoolclass&createdscchool obj
						
}
}