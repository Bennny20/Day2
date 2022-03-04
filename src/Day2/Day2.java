/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day2;

import java.util.Scanner;

/**
 *
 * @author phien
 */
public class Day2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Cau 1
        byte valueByte = 100;
        int valueInt = 5;
        long valueLong = 223372036854L; 
        float valueFloat = 10.5f;
        double valueDouble = 10.2;
        boolean isStudent = true;
        char myName = 'P';
        String myClass = "JDEV - D014";
        System.out.println("Value int " + valueInt);
        System.out.println("Value byte " + valueByte);
        System.out.println("Value long " + valueLong);
        System.out.println("Value float " + valueFloat);
        System.out.println("Value double : " + valueDouble);
        System.out.println("I am a student " + isStudent);
        System.out.println("My name : " + myName);
        System.out.println("My class : " + myClass);
        //Cau 2
        printMyName();
        //Cau 3 
        int firstNum = 20;
        int secondNum = 10;
        int tinhtoan;
        tinhtoan = tinhTong(firstNum, secondNum);
        System.out.println("Tong: " + tinhtoan);
        tinhtoan = tinhHieu(firstNum, secondNum);
        System.out.println("Hieu: " + tinhtoan);
        tinhtoan = tinhTich(firstNum, secondNum);
        System.out.println("Tich: " + tinhtoan);
        tinhtoan = tinhThuong(firstNum, secondNum);
        System.out.println("Thuong: " + tinhtoan);
        //Cau 4
        int length = 20;
        int width = 20; 
        tinhtoan = chuVi(length, width);
        System.out.println("Chu vi: " + tinhtoan);
        tinhtoan = dienTich(length, width);
        System.out.println("Dien tich: " + tinhtoan);
    }
    
    //Cau 3
    public static int tinhTong(int a, int b){
        return a + b;
    }
    public static int tinhHieu(int a, int b){
        return a - b;
    }
    public static int tinhTich(int a, int b){
        return a * b;
    }
    public static int tinhThuong(int a, int b){
        return a / b;
    }
    
    //Cau 2
    public static void printMyName()
    {
        System.out.println("Truong Quang Phien");
    }
    // Cau 4 
    public static int chuVi(int length, int width){
        return (length + width) * 2; 
    }
    public static int dienTich(int length, int width){
        return length * width; 
    }
}
