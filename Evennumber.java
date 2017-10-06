package Array;
//package : Package is name that organizes a set of related classes and interfaces similar to  
//different folders on my computer
//package is array
public class Evennumber {
     //public : members which can access as public,public members are visible to all other classes.
	//class : is a context of java that are used to create objects and to define object data types and methods.
	//declares a class called evennumbers.
	public static void main(String[] args) {
	//Public is a keyword that is used as an access modifier for methods and variables.
	//static used to prepare a field,method or inner classes as a class field.
	//void: it is void if the method does not return a value.
	//main:it is a function name When a program starts running, it has to start execution from somewhere.
	//String[] args: it is  defining a String array to pass arguments at command line. args is the variable name of the String array.
		// TODO Auto-generated method stub
		int a=10;//here we are intilizing the value a is 10
		int k[] = new int[a];//declaring an array of int type and set its size
		for (int i=1;i<=k.length;i++){
			//i equals to 1,i less than k,i increment
			if(i%2==0){
				//When we divide the value with 2 and the answer will be equal to 0 then the logical will be for even number
				System.out.println(i);
				//system : system is a class in java language.lang package
			  	//out : out is the static member of system class.It's type PrintStream
			  	//println: which is used to print the output.

			}
			
		}

	}

}
