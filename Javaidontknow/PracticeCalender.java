/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.util.Calendar;

/**
 *
 * @author hp
 */
public class PracticeCalender {
    public static void main(String[] args) {
        Calendar v=Calendar.getInstance();
        int a=v.get(Calendar.HOUR);
        int b=v.get(Calendar.MINUTE);
        int c=v.get(Calendar.SECOND);
        System.out.println(a+":"+b+":"+c);
    }
}
