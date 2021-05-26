package page;

import java.util.HashMap;
import java.util.Map;

public class TestPOJO {

    private String departure_date;
    private Map<String,Object> pickup;
    private Map<String, Object> passenger;

    public TestPOJO(){

    }

    private String name ;
    private String surname;
    private String phoneNumber;
    private Double latitude;
    private Double longitude;


    public TestPOJO(String departure_date, String name, String surname,String phoneNumber, Double latitude, Double longitude) {
        this.departure_date = departure_date;
        this.name = name;
        this.surname = surname;
        this.latitude = latitude;
        this.longitude = longitude;
        this.phoneNumber = phoneNumber;

        setPassenger(name, surname, phoneNumber);
        setPickup(latitude, longitude);
        setDeparture_date(departure_date);
    }

    public TestPOJO(String departure_date, Map<String,Object> pickup, Map<String,Object> passenger){
        this.departure_date=departure_date;
        this.pickup=pickup;
        this.passenger=passenger;

    }

    public TestPOJO(String departure_date, String name, String phoneNumber, double latitude, double longitude) {
        this.departure_date = departure_date;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.phoneNumber = phoneNumber;

        setPassenger(name, phoneNumber);
        setPickup(latitude, longitude);
        setDeparture_date(departure_date);
    }

    public TestPOJO(String departure_date, String name, double latitude, double longitude) {
        this.departure_date = departure_date;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;

        setPassenger(name);
        setPickup(latitude, longitude);
        setDeparture_date(departure_date);
    }

    public TestPOJO(String departure_date, String name, String phoneNumber, double longitude) {
        this.departure_date = departure_date;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.longitude = longitude;

        setPassenger(name, phoneNumber);
        setPickup(longitude);
        setDeparture_date(departure_date);
    }

    public TestPOJO(String departure_date, String name, String phoneNumber) {
        this.departure_date = departure_date;
        this.name = name;
        this.phoneNumber = phoneNumber;
        setPassenger(name, phoneNumber);
        setDeparture_date(departure_date);
    }


    private void setPickup(double longitude) {
        pickup = new HashMap<>();
        pickup.put("longitude", longitude);
    }

    private void setPassenger(String name) {
        passenger  =new HashMap<>();
        passenger.put("name",name);
    }

    private void setPassenger(String name, String phoneNumber) {
        passenger  =new HashMap<>();

        passenger.put("name",name);
        passenger.put("phone_number",phoneNumber);
    }

    public void setPassenger(String name, String surname, String phone_number) {
        passenger  =new HashMap<>();

        passenger.put("name",name);
        passenger.put("phone_number",phone_number);
        passenger.put("surname",surname);
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

    @Override
    public String toString() {
        return "PassengerBody{" +
                "departure_date='" + departure_date + '\'' +
                ", pickup=" + pickup +
                ", passenger=" + passenger +
                '}';
    }
}
