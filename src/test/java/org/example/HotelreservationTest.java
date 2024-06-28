package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelreservationTest
{
        Main m = new Main();
        @Test
        public void testAdd()
        {
                Assert.assertTrue(m.addHotel("Radisson Blu",30000,"20-may-2002","21-july-2002","26-may-2002","27-may-2002",30000));
                Assert.assertTrue(m.addHotel("InterContinental Hotels & Resorts",6500,"20-may-2002","21-july-2002","26-may-2002","27-may-2002",6000));
                Assert.assertTrue(m.addHotel("Hyatt Regency",6000,"20-jan-2002","11-feb-2002","25-jan-2002","26-jan-2002",7000));
                Assert.assertTrue(m.addHotel("JW Marriott International",4000,"22-nov-2002","22-dec-2002","10-dec-2002","11-dec-2002",5000));
        }

        @Test
        public void testcheapesthotel()
        {
                m.addHotel("Radisson Blu",30000,"20-may-2002","21-july-2002","26-may-2002","27-may-2002",30000);
                m.addHotel("InterContinental Hotels & Resorts",6500,"20-may-2002","21-july-2002","26-may-2002","27-may-2002",6000);
                m.addHotel("Hyatt Regency",6000,"20-jan-2002","11-feb-2002","25-jan-2002","26-jan-2002",7000);
                m.addHotel("JW Marriott International",4000,"22-nov-2002","22-dec-2002","10-dec-2002","11-dec-2002",5000);
                String str = m.cheapesthotel("22-nov-2002","22-dec-2002","10-dec-2002","11-dec-2002",5000);
                Assert.assertEquals("JW Marriott International", str );
                //System.out.println(str);
        }
}