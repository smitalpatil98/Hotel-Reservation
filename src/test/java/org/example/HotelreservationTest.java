package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelreservationTest
{
        @Test
        public void testAdd(){
        Main m = new Main();
        Assert.assertTrue(m.addHotel("Oberoi",20000));
        Assert.assertTrue( m.addHotel("TajLand Ends Delhi",4000));

    }
}