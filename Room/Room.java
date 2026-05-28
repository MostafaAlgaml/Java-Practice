import java.util.*;
public class Room {
	int roomNumber;
	String guestName;
	double rate;
	int days;
	int beds;

    public Room(String name,int roomNo,int numberofBeds,double roomasrate,int numberofDays ) {
    	guestName=name;
    	roomNumber=roomNo;
    	beds=numberofBeds;
    	rate=roomasrate;
    	days=numberofDays;

    }
    public double calculateTotal(){
    	return rate*days;
    }
    public void addBed(){
    	if(beds==1){
    		beds++;
    	}
    	else{
    		System.out.println("Max beds are 2");
    	}
    }
    @Override
public String toString() {
    return "Guest name: " + guestName + "\n" +
           "Room number: " + roomNumber + "\n" +
           "Room beds: " + beds + "\n" +
           "Rate: " + rate + "\n" +
           "Rented for: " + days + " day";
}


    public static void main(String[] args) {
        Room r1=new Room("Mostafa",207,1,50,5);
        r1.addBed();
        System.out.println(r1);
        System.out.println(r1.calculateTotal());
    }
}

