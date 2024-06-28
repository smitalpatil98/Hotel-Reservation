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

    String start_week;
    String end_week;
    long week_price;


    Hotelreservation(String Name, long Hotel_Regular_Price, String Start_Date , String End_Date, String start_week, String end_week, long week_price)
    {
        this.name = Name;
        this.hotel_Regular_Price = Hotel_Regular_Price;
        this.start_date = Start_Date;
        this.end_date  = End_Date;
        this.start_week = start_week;
        this.end_week = end_week;
        this.week_price = week_price;
    }

    @Override
    public String toString()
    {
        System.out.println("The Name of the Hotel is : " + name);
        System.out.println("The Regular Price of an Hotel is : " + hotel_Regular_Price);
        System.out.println("The Start Date of the Hotel is : " +start_date);
        System.out.println("The end Date of the Hotel is : " +end_date);
        System.out.println("The Week Date start of the Hotel is : " +start_week);
        System.out.println("The Week end Date of the Hotel is : " +end_week);
        System.out.println("The Weekend Price of an Hotel is : " + week_price);

        return "";
    }
}
 public class Main
 {
    static List<Hotelreservation> hotelreservationList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);


     static String cheapesthotel(String Start_Date,String End_Date, String start_week , String end_week , long week_price)
     {
         long min = Integer.MAX_VALUE;
         long min1 = Integer.MAX_VALUE;
         String name = null;

         for (Hotelreservation hotels : hotelreservationList)
         {
             if (Start_Date.equals(hotels.start_date) && End_Date.equals(hotels.end_date)&& start_week.equals(hotels.start_week) && end_week.equals(hotels.end_week))
             {
                 if (hotels.hotel_Regular_Price < min && hotels.week_price < min1)
                 {
                     min = hotels.hotel_Regular_Price;
                     min1 = hotels.week_price;
                     name = hotels.name;
                 }
             }
         }
         return name;
     }
     static Boolean addHotel(String name, long hotel_Regular_Price,String start_date,String end_date, String start_week , String end_week , long week_price)
     {

         Hotelreservation hot = new Hotelreservation(name, hotel_Regular_Price, start_date, end_date,start_week , end_week , week_price );
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
         m.addHotel("Radisson Blu",30000,"20-may-2002","21-july-2002" ,"26-may-2002","27-may-2002",30000);
         m.addHotel("InterContinental Hotels & Resorts",6500,"20-may-2002","21-july-2002","26-may-2002","27-may-2002",6000);
         m.addHotel("Hyatt Regency",6000,"20-jan-2002","11-feb-2002","25-jan-2002","26-jan-2002",7000);
         m.addHotel("JW Marriott International",4000,"22-nov-2002","22-dec-2002","10-dec-2002","11-dec-2002",5000);
     }


 }