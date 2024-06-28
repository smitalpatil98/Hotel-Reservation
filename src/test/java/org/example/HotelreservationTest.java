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
                Assert.assertTrue(m.addHotel("Radisson Blu",30000,"20-may-2002","21-july-2002"));
                Assert.assertTrue(m.addHotel("InterContinental Hotels & Resorts",6500,"20-may-2002","21-july-2002"));
                Assert.assertTrue(m.addHotel("Hyatt Regency",6000,"20-jan-2002","11-feb-2002"));
                Assert.assertTrue(m.addHotel("JW Marriott International",4000,"22-nov-2002","22-dec-2002"));
        }

        @Test
        public void testcheapesthotel()
        {
                m.addHotel("Radisson Blu",30000,"20-may-2002","21-july-2002");
                m.addHotel("InterContinental Hotels & Resorts",6500,"20-may-2002","21-july-2002");
                m.addHotel("Hyatt Regency",6000,"20-jan-2002","11-feb-2002");
                m.addHotel("JW Marriott International",4000,"22-nov-2002","22-dec-2002");
                String str = m.cheapesthotel("22-nov-2002", "22-dec-2002");
                Assert.assertEquals("JW Marriott International", str );
                //System.out.println(str);
        }
}