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
    double ratings;
    long reward_weekday;
    long reward_weekend;

    Hotelreservation(String Name, long Hotel_Regular_Price, String Start_Date , String End_Date, String start_week, String end_week, long week_price , double Ratings,long Reward_weekday,long Reward_weekend)
    {
        this.name = Name;
        this.hotel_Regular_Price = Hotel_Regular_Price;
        this.start_date = Start_Date;
        this.end_date  = End_Date;
        this.start_week = start_week;
        this.end_week = end_week;
        this.week_price = week_price;
        this.ratings = Ratings;
        this.reward_weekday = Reward_weekday;
        this.reward_weekend = Reward_weekend;
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
        System.out.println("The Ratings are" + ratings);

        return "";
    }
}
 public class Main
 {
    static List<Hotelreservation> hotelreservationList = new ArrayList<>();
    static ArrayList<Integer> arr = new ArrayList<Integer>();
    static Scanner sc = new Scanner(System.in);


     public static String cheapesthotel(int id, String Start , String end)
     {
         long min = Integer.MAX_VALUE;
         long min1 = Integer.MAX_VALUE;
         double flag = 0;
         String name = null;

         for (Hotelreservation hotels : hotelreservationList)
         {
             if(!arr.contains(id)){
             if (Start.equals(hotels.start_date) && end.equals(hotels.end_date))
             {
                 if (hotels.hotel_Regular_Price < min && hotels.week_price < min1&& flag < hotels.ratings)
                 {
                     min = hotels.hotel_Regular_Price;
                     min1 = hotels.week_price;
                     name = hotels.name;
                     flag = hotels.ratings;
                 }
             }
             arr.add(id);
         } else{
                 if (Start.equals(hotels.start_date) && end.equals(hotels.end_date)) {
//                && start_week.equals(hotels.start_week) && weekend.equals(hotels.end_week)
                     if (hotels.reward_weekday < min && hotels.reward_weekend < min1 && flag < hotels.ratings) {
                         min = hotels.reward_weekday;
                         min1 = hotels.reward_weekend;
                         name = hotels.name;
                         flag = hotels.ratings;
             }}}}
         return name +" "+min;
     }
     static Boolean addHotel(String name, long hotel_Regular_Price,String start_date,String end_date, String start_week , String end_week , long week_price , double ratings ,long reward_weekday,long reward_weekend)
     {

         Hotelreservation hot = new Hotelreservation(name, hotel_Regular_Price, start_date, end_date,start_week , end_week , week_price ,ratings,reward_weekday,reward_weekend);
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

         m.addHotel("LakeWood",20000,"20-may-2002","21-july-2002","26-may-2002","27-may-2002",5000,3,80,80);
         m.addHotel("RidgeWood",4000,"11-september-2020","12-september-2020","26-may-2002","27-may-2002",2000,4,110,50);
         m.addHotel("BridgeWood",5000,"20-jan-2002","11-feb-2002","25-jan-2002","26-jan-2002",6500,5,100,40);
         arr.add(1);
         arr.add(2);
         arr.add(3);
     }
 }