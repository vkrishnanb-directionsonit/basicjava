package edu.lessons.day4.classes.activity;


public class WindSpeedTest  {

    public void testIsOrcan() {
        WindSpeed windSpeed = new WindSpeed(157.0);
        
//        assertTrue(windSpeed.IsOrcan());
    }

    public void testIsOrcan1() {
        WindSpeed windSpeed = new WindSpeed(17.0);
        
//        assertFalse(windSpeed.IsOrcan());
    }

    
    public void testIsCalm() {
        WindSpeed windSpeed = new WindSpeed(0.5);
        
//        assertTrue(windSpeed.isCalm());        
    }

    public void testIsCalm1() {
        WindSpeed windSpeed = new WindSpeed(1.97);
        
//        assertTrue(windSpeed.isCalm());        
    }


    public void testIsCalm2() {
        WindSpeed windSpeed = new WindSpeed(0.5);
        
//        assertTrue(windSpeed.isCalm());        
    }

    
    public void testGetKilometerProStunde() {
        WindSpeed windSpeed = new WindSpeed(120.53);
        
//        assertEquals(120.53, windSpeed.getKilometerPerHour(), 0.000001);        
    }

    public void testGetKnoten() {
        
    }

    public void testGetBeaufort() {
        WindSpeed windSpeed = new WindSpeed(125);
        
//        assertEquals(12, windSpeed.getBeaufort());        
    }

    public void testGetBeaufort1() {
        WindSpeed windSpeed = new WindSpeed(0.5);
        
//        assertEquals(0, windSpeed.getBeaufort());        
    }
    
    public void testGetBeaufort2() {
        WindSpeed windSpeed = new WindSpeed(34.5);
        
//        assertEquals(5, windSpeed.getBeaufort());        
    }
    
    public void testGetBeaufort3() {
        WindSpeed windSpeed = new WindSpeed(1125);
        
//        assertEquals(12, windSpeed.getBeaufort());        
    }

}
