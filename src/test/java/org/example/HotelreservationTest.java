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
                Assert.assertTrue(m.addHotel("LakeWood",20000,"20-may-2002","21-july-2002","26-may-2002","27-may-2002",5000,3,80,80));
                Assert.assertTrue(m.addHotel("BridgeWood",4000,"11-september-2020","12-september-2020","26-may-2002","27-may-2002",2000,4,110,50));
                Assert.assertTrue(  m.addHotel("RidgeWood",5000,"20-jan-2002","11-feb-2002","25-jan-2002","26-jan-2002",6500,5,150,250));
        }

        @Test
        public void testcheapesthotel()
        {
                Assert.assertTrue(m.addHotel("LakeWood",20000,"20-may-2002","21-july-2002","26-may-2002","27-may-2002",5000,3,80,80));
                Assert.assertTrue(m.addHotel("RidgeWood",4000,"11-september-2020","12-september-2020","26-may-2002","27-may-2002",2000,4,110,50));
                Assert.assertTrue(m.addHotel("BridgeWood",5000,"20-jan-2002","11-feb-2002","25-jan-2002","26-jan-2002",6500,5,100,40));

                String str = m.cheapesthotel(1,"11-september-2020","12-september-2020");
                String str1 = m.cheapesthotel(4,"11-september-2020","12-september-2020");
                Assert.assertEquals("RidgeWood 110", str );
                //System.out.println(str);
        }
}