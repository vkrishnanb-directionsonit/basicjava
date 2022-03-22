package edu.lessons.day4.innerClass;

public class MotherBoard {
    String model;
    public MotherBoard(String model) {   this.model = model;    }
    public void show()
    {
    	USB u1=new USB();
    	System.out.println(u1.size);
    }
    static class USB{
        int usb2 = 2;
        int usb3 = 1;
        private int size=32;
        int getTotalPorts(){
//            if(MotherBoard.this.model.equals("MSI")) {
//                return 4;
//            }
        	return usb2 + usb3;
        }
        public static void print()
        {
        	System.out.println("USB. PRINT");
        }
    }
}