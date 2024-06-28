package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Hotelreservation
{
    String name;
    long hotel_Regular_Price;

    Hotelreservation(String Name, long Hotel_Regular_Price)
    {
        this.name = Name;
        this.hotel_Regular_Price = Hotel_Regular_Price;
    }

    @Override
    public String toString()
    {
        return "Hotel reservation{" + "name='" + name + '\'' + ", hotel_Regular_Price=" + hotel_Regular_Price + '}';
    }
}

 public class Main
 {
    static List<Hotelreservation> hotelreservationList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static Boolean addHotel(String Name, long Hotel_Regular_Price)
    {
        Hotelreservation hot = new Hotelreservation(Name, Hotel_Regular_Price);
        hotelreservationList.add(hot);
        if(Name.equals(hot.name) && Hotel_Regular_Price == hot.hotel_Regular_Price)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}