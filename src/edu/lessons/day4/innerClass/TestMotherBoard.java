package edu.lessons.day4.innerClass;

public class TestMotherBoard {
    public static void main(String[] args) {
        MotherBoard.USB usb = new MotherBoard.USB();
        System.out.println("Total Ports = " + usb.getTotalPorts());
        MotherBoard.USB.print();
    }
}