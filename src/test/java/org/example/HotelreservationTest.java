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
                Assert.assertTrue(m.addHotel("LakeWood",20000,"20-may-2002","21-july-2002","26-may-2002","27-may-2002",5000,3));
                Assert.assertTrue(  m.addHotel("BridgeWood",4000,"20-may-2002","21-july-2002","26-may-2002","27-may-2002",3500,4));
                Assert.assertTrue(  m.addHotel("RidgeWood",5000,"20-jan-2002","11-feb-2002","25-jan-2002","26-jan-2002",6500,5));

        }

        @Test
        public void testcheapesthotel()
        {
                Assert.assertTrue(m.addHotel("LakeWood",20000,"20-may-2002","21-july-2002","26-may-2002","27-may-2002",5000,3));
                Assert.assertTrue(  m.addHotel("BridgeWood",4000,"20-may-2002","21-july-2002","26-may-2002","27-may-2002",3500,4));
                Assert.assertTrue(  m.addHotel("RidgeWood",5000,"20-jan-2002","11-feb-2002","25-jan-2002","26-jan-2002",6500,5));

                String str = m.cheapesthotel("20-may-2002","21-july-2002","26-may-2002","27-may-2002",3500);
                Assert.assertEquals("BridgeWood", str );
              //  System.out.println(str);
        }
}