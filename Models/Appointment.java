package Models;

import java.util.*;
import java.time.*;

public class Appointment {
    protected String doctor; // or should i put it as a Person? 
    protected Date date;
    protected LocalTime time;
    protected boolean availability;

    public Appointment(String doctor, Date date, LocalTime time){
        this.doctor = doctor;
        this.date = date;
        this.time = time;
        this.availability = true;
    }

    public boolean isAvailable(){
        return availability;
    }

    public void scheduleAppointment(){
        if (this.isAvailable()) {
            this.availability = false;
            return;
        } else {

        }
    }


    
}
