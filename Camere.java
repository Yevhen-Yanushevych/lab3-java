package ua.lviv.iot;

public class Camera extends Devices {
	private int lens;
	
	public Camera(){
		
	}
	public Camera (Kindjob kindjob, int price , int weight, String material , String brand,int lens ){
		super(kindjob,price,weight , material,brand);
	this.lens = lens;
	}
	
	
	
	
	
	

	public int getLens() {
		return lens;
	}

	public void setLens(int lens) {
		this.lens = lens;
	}
	
}
