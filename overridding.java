/*  Car:
	   getColor()
	   getSpeed()
	   getWheel()
	   getSeat()
	
	SportsCar:
	   getColor()
	   getSpeed()
	   getWheel()
	   getSeat()     


*/

class Car{
	   String getColor(){
	   	return("blue");

	   }
	   int getSpeed(){
	   	return(50);
	   }
	   int getWheel(){
	   	return(4);
	   }
	   int getSeat(){
	   	return(6);
	   }
	}

class SportsCar extends Car{
	   String getColor(){
	   	return("white");

	   }
	   int getSpeed(){
	   	return(120);
	   }
	   int getWheel(){
	   	return(5);
	   }
	   int getSeat(){
	   	return(2);
	   }
	}

class Main{
	public static void main(String[] args) {
		SportsCar c = new SportsCar();
		System.out.println(c.getColor());
		System.out.println(c.getSpeed());
		System.out.println(c.getWheel());
		System.out.println(c.getSeat());

	}
}





















