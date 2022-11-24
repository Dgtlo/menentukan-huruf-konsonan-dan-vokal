/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huruf;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Huruf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String huruf;
        System.out.print("masukan huruf: ");
        huruf = scan.nextLine();
        if (("a".equalsIgnoreCase(huruf))||"i".equalsIgnoreCase(huruf)|| "u".equalsIgnoreCase(huruf)||"e".equalsIgnoreCase(huruf)||"o".equalsIgnoreCase(huruf))
        {
            System.out.println("vokal");
        }
        else
        {
            System.out.println("konsonan");
        }
    
}
}