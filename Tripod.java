package ua.lviv.iot;

public class Tripod extends Devices {
private double lenght;

public Tripod(){
	
}
public Tripod (Kindjob kindjob, int price , int weight, String material , String brand,double lenght ){
	super(kindjob,price,weight , material,brand);
this.lenght = lenght;
}





public double getLenght() {
	return lenght;
}

public void setLenght(double lenght) {
	this.lenght = lenght;
}
}
