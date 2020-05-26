/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;


public class JavaApplication1 {


    public static void main(String[] args) {
        // Mahmoud AlHabil 120180756

        Scanner input = new Scanner(System.in);
System.out.println("If you are the administrator, enter number 1\n"
                + "If you are a user, enter number 2\n"
                + "If you want to end the program, enter number 3");
int enter = input.nextInt();
        if (enter == 1) {
            Category();
        } else if (enter == 2) {
System.out.println("enter your name");
            String name = input.next();
System.out.println("Do you want to add escorts?");
add_escorts();
        }
    

    public static void Category() {
        Scanner input = new Scanner(System.in);
System.out.println("enter today");
        String day = input.nextLine();
        switch (day) {
            case "sunday":
                day = "Stays";
                registration(day);
                break;
            case "monday":
                day = "Foreign passports";
                registration(day);
                break;
            case "tuesday":
                day = "Patients";
                registration(day);
                break;
            case "wednesday":
                day = "Students";
                registration(day);
                break;
            case "thursday":
                day = "Other cases";
                registration(day);
                break;
            default:
System.out.println("There is no registration today");
        }
    }


    public static void registration(String day) {
        Scanner input = new Scanner(System.in);
        String end;
        do {
int i = 1;
System.out.println("Please enter traveler information number " + i);
            String data_traveler[] = new String[6];
data_traveler = traveler(day);
System.out.println("--------------------\n" + "data traveler number " + i + ":");
            for (String data_traveler1 : data_traveler) {
System.out.println(data_traveler1);
            }
System.out.println("--------------------\n" + "Do you want to modify traveler information?");
            String modify1 = input.nextLine();
            if ("yes".equals(modify1)) {
Modify_traveler(day);
            }
System.out.println("--------------------\n" + "Are there escorts?");
add_escorts();
System.out.println("--------------------\n" + "Do you want to add new traveler?");
            end = input.nextLine();
            if ("no".equals(end)) {
                break;
            }
            ++i;
        } while ("yes".equals(end));
System.out.println("The registration has been completed");
    }

    public static String[] traveler(String day) {
        Scanner input = new Scanner(System.in);
        String data[] = new String[6];
System.out.println("Serial number:"); //ID number or passport number
        data[0] = input.nextLine();
System.out.println("Name of traveler:");
        data[1] = input.nextLine();
System.out.println("Mobile number:");
        data[2] = input.nextLine();
System.out.println("Category:"); //Stays, foreign passports, patients, students, other cases
        data[3] = day;
System.out.println(data[3]);
System.out.println("date of registration:");
        data[4] = input.nextLine();
System.out.println("Case:"); //Urgent condition, notes, etc
        data[5] = input.nextLine();
        return data;
    }

    public static String[] escorts() {
        Scanner input = new Scanner(System.in);
        String data[] = new String[4];
System.out.println("Serial number:"); //ID number or passport number
        data[0] = input.nextLine();
System.out.println("Name of escort:");
        data[1] = input.nextLine();
System.out.println("Mobile number:");
        data[2] = input.nextLine();
System.out.println("date of registration:");
        data[3] = input.nextLine();
        return data;
    }

    public static void add_escorts() {
        Scanner input = new Scanner(System.in);
        String escorts = input.nextLine();
System.out.println("--------------------");
        while ("yes".equals(escorts)) {
            String data_escorts[] = new String[4];
int j = 1;
System.out.println("Please enter escort information number " + j);
data_escorts = escorts();
System.out.println("--------------------\n" + "data escort number " + j + ":");
            for (String data_escorts1 : data_escorts) {
System.out.println(data_escorts1);
            }
System.out.println("--------------------\n" + "Do you want to modify escorts information?");
            String modify2 = input.nextLine();
            if ("yes".equals(modify2)) {
Modify_escorts();
            }
            ++j;
System.out.println("--------------------\n" + "Do you want to add another escort?");
            escorts = input.nextLine();
        }
    }

    public static void Modify_traveler(String day) {
        Scanner input = new Scanner(System.in);
        String data_traveler[] = new String[6];
data_traveler = traveler(day);
System.out.println("--------------------\n" + "data passenger:");
        for (String data_traveler1 : data_traveler) {
System.out.println(data_traveler1);
        }
    }

    public static void Modify_escorts() {
        Scanner input = new Scanner(System.in);
        String data_escorts[] = new String[4];
data_escorts = escorts();
System.out.println("--------------------\n" + "data escorts:");
        for (String data_escorts1 : data_escorts) {
System.out.println(data_escorts1);
        }
    }

}
}