package classExtensions;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		
		House myhouse = new House();
		Garage mygarage = new Garage();
		
		myhouse.lightup();
		mygarage.switchoff();
		
		
		System.out.println("My garage has " +mygarage.noOfWindows+ " windows");
		System.out.println("My house has " +myhouse.noOfLights+ " lights");
		System.out.println("My garage has " +mygarage.noOfDoors+ " doors");
		
		
		
		
	}

}
