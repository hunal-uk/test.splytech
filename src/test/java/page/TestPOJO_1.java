package page;

import java.util.HashMap;
import java.util.Map;

public class TestPOJO_1 {

    private String departure_date;
    private Map<String,Object> pickup;
    private Map<String, Object> passenger;

    public TestPOJO_1(){

    }

    private String name ;
    private String surname;
    private String phoneNumber;
    private Double latitude;
    private Double longitude;

    public TestPOJO_1(String name, String surname, String phoneNumber, Double latitude, Double longitude) {
        this.name = name;
        this.surname = surname;
        this.latitude = latitude;
        this.longitude = longitude;
        this.phoneNumber = phoneNumber;
        setPassenger(name, phoneNumber);
        setPickup(latitude, longitude);
    }

    public TestPOJO_1(String departure_date, String phoneNumber, Double latitude, Double longitude) {
        this.departure_date = departure_date;
        this.latitude = latitude;
        this.longitude = longitude;
        this.phoneNumber = phoneNumber;
        setPassenger(phoneNumber);
        setPickup(latitude, longitude);
        setDeparture_date(departure_date);
    }

    public TestPOJO_1(String departure_date, String name, String phoneNumber, double latitude) {
        this.departure_date = departure_date;
        this.name = name;
        this.latitude = latitude;
        this.phoneNumber = phoneNumber;
        setPassenger(name, phoneNumber);
        setPickup(latitude);
        setDeparture_date(departure_date);
    }

    private void setPassenger(String phoneNumber) {
        passenger  =new HashMap<>();
        passenger.put("phone_number",phoneNumber);
    }

    private void setPickup(double latitude) {
        pickup = new HashMap<>();
        pickup.put("latitude", latitude);
    }

    public void setPassenger(String name, String phone_number) {
        passenger  =new HashMap<>();
        passenger.put("name",name);
        passenger.put("phone_number",phone_number);
    }

    public void setPickup(double latitude, double longitude) {
        pickup=new HashMap<>();
        pickup.put("latitude",latitude);
        pickup.put("longitude",longitude);
    }

    public String getDeparture_date() {
        return departure_date;
    }

    public void setDeparture_date(String departure_date) {
        this.departure_date = departure_date;
    }

    public Map<String, Object> getPickup() {
        return pickup;
    }

    public Map<String, Object> getPassenger() {
        return passenger;
    }
}
