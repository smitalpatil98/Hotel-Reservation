package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Hotelreservation
{
    String name;
    long hotel_Regular_Price;
    String start_date;
    String end_date;

    Hotelreservation(String Name, long Hotel_Regular_Price, String Start_Date , String End_Date)
    {
        this.name = Name;
        this.hotel_Regular_Price = Hotel_Regular_Price;
        this.start_date = Start_Date;
        this.end_date  = End_Date;
    }
    @Override
    public String toString()
    {
        return "Hotelreservation{" +
                "end_date='" + end_date + '\'' +
                ", name='" + name + '\'' +
                ", hotel_Regular_Price=" + hotel_Regular_Price +
                ", start_date='" + start_date + '\'' +
                '}';
    }
}
 public class Main
 {
    static List<Hotelreservation> hotelreservationList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

     static String cheapesthotel(String Start_Date,String End_Date)
     {
         long min = Integer.MAX_VALUE;
         String name = null;

         for (Hotelreservation hotels : hotelreservationList)
         {
             if (Start_Date.equals(hotels.start_date) && End_Date.equals(hotels.end_date))
             {
                 if (hotels.hotel_Regular_Price < min)
                 {
                     min = hotels.hotel_Regular_Price;
                     name = hotels.name;
                 }
             }
         }
         return name;
     }
     static Boolean addHotel(String name, long hotel_Regular_Price,String start_date,String end_date)
     {
         Hotelreservation hot = new Hotelreservation(name, hotel_Regular_Price, start_date, end_date );
         hotelreservationList.add(hot);
         if(name.equals(hot.name) && hotel_Regular_Price == hot.hotel_Regular_Price) {
             return true;
         }
         else
         {
             return false;
         }
     }
     public static void main(String [] args)
     {
         Main m = new Main();
         m.addHotel("Radisson Blu",30000,"20-may-2002","21-july-2002");
         m.addHotel("InterContinental Hotels & Resorts",6500,"20-may-2002","21-july-2002");
         m.addHotel("Hyatt Regency",6000,"20-jan-2002","11-feb-2002");
         m.addHotel("JW Marriott International",4000,"22-nov-2002","22-dec-2002");
     }
 }