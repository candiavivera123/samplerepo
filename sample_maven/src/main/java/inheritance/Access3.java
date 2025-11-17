package inheritance;

import accessmodifiers.Access1;

public class Access3 extends Access1 {

	public static void main(String[] args) {
		// check which all methods get access from  access1. class
		// without using extends keyword. only display 1 method can be access. 
		//after extending to Access1, to get parent class method, we create child class object to access the methods in parent class which is access1.
		Access1 obj = new Access1();
		obj.display1();
		Access3 obj1 = new Access3(); // child class object
		obj1.display1();
		obj1.display3();
	}

}
