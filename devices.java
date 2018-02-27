package ua.lviv.iot;

public class Devices {
private int price ;
private Kindjob kindjob;
private int weight;
private String material;
private String brand;

public Devices (){
	
}

public Devices(Kindjob kindjob, int price , int weight, String material , String brand ){
	
	this.kindjob = kindjob;
	this.price = price;
	this.weight = weight;
	this.material = material ;
	this.brand = brand ;
	
	
	
	
	
}


public Devices( int weight) {
	this.weight = weight;
}

public Kindjob getKindjob() {
	return kindjob;
}
public void setKindjob(Kindjob kindjob) {
	this.kindjob = kindjob;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getWeight() {
	return weight;
}
public void setWeight(int weight) {
	this.weight = weight;
}
public String getMaterial() {
	return material;
}
public void setMaterial(String material) {
	this.material = material;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}

@Override
public String toString() {
	return "Devices [price=" + price + ", kindjob=" + kindjob + ", weight=" + weight + ", material=" + material
			+ ", brand=" + brand + "]";
}
}
