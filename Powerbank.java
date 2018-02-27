package ua.lviv.iot;

public class Powerbank extends Devices {
private double batteryCapacity;

public Powerbank(){
}

public Powerbank (Kindjob kindjob, int price , int weight, String material , String brand,double batteryCapacity ){
	super(kindjob,price, weight,material,brand);
this.batteryCapacity = batteryCapacity;
}





public double getBatteryCapacity() {
	return batteryCapacity;
}

public void setBatteryCapacity(double batteryCapacity) {
	this.batteryCapacity = batteryCapacity;
}
}
