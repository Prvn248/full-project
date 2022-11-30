package Oops1;

public class UseBuilding {

	public static void main(String[] args) {
	Room room=new Room();
	room.roomNo=105;
	room.size=300;
	
	Building building=new Building();
	building.name="Krishna Apartments";
	building.area="velachery";
	building.squareFeet=9000;
	building.room=room;
	
	System.out.println(building.name+(",")+building.area+(",")+building.room.roomNo);
	

	}

}
class Building {
	String name;
	String area;
	int squareFeet;
	Room room;
}
class Room {
	int roomNo;
	int size;
}