package ua.lviv.iot;


import java.util.*;

public class Photographer {
private String name = " no name";
private String lastname;
private List <Devices> devicesList;


public Photographer(String name,String lastname){
	this.name = name;
	this.lastname = lastname ;
	this.devicesList = new LinkedList<>();
}

public void addDevices ( Devices addDevices){	
devicesList.add(addDevices)	;	
}
public List<Devices> sortDevicesByWeight() {
	devicesList.sort((Devices o1, Devices o2) -> o1.getWeight() - o2.getWeight());
	return devicesList;
	 
 }
 
 
public List<Devices> getDevicesList() {
	return devicesList;
}

public void setDevicesList(List<Devices> devicesList) {
	this.devicesList = devicesList;
}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}

}
