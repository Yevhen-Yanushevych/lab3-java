package ua.lviv.iot;

 import java.util.List;

public class Main {

	public static void main(String[] args) {
	
		
		
		
		Photographer photographer = new Photographer ("Jenya" , " Petenko" );

		photographer.addDevices(new Camera(Kindjob.PHOTO, 5, 6, " plastic", "leika",5));
		photographer.addDevices(new Tripod(Kindjob.PHOTO, 2, 7, " plastic", "canon",2));
		photographer.addDevices(new Powerbank(Kindjob.PHOTO, 6, 4, " plastic", "nicon",3));
		 
	
	
		
		System.out.println(photographer.sortDevicesByWeight());

		
	}
}
