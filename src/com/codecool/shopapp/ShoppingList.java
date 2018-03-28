package com.codecool.shopapp;

import java.util.Scanner;
import java.util.Arrays;
import com.codecool.termlib.Terminal;
import com.codecool.termlib.Color;
import com.codecool.termlib.Attribute;
import com.codecool.termlib.Direction;

 /**
 * Shopping app
 */
public class ShoppingList {

    
    public static void main(String[] args) {
        Terminal obj = new Terminal();
        obj.clearScreen();
        obj.moveTo(1,1);
        String[] shoppingItems = new String[50];
        Scanner menuOption = new Scanner(System.in);
        int userOpt = 0;

        while (userOpt != 2) {
            System.out.println("");
            System.out.println("----- Fish & Ps Shopping List------");
            System.out.println("");
            System.out.println("(1) Create new list. ");
            System.out.println("(2) Exit. ");
            userOpt = menuOption.nextInt();  
            if (userOpt == 1) {
                //obj.moveTo(5,10);
                obj.clearScreen();
                createList(obj, shoppingItems);
            }
            if (userOpt == 2) {
                obj.clearScreen();
                System.out.println("------Thanks for using our application!------");
                break;
            }
        }
    }        

    public static void createList(Terminal obj, String shoppingItems[]) {
        Boolean isStillShopping = true;
        int iterator = 0;
        while (isStillShopping) { 
            System.out.println();
            System.out.println("Enter item name:");
            System.out.println("(to finish your list, enter x)");
            Scanner userInput = new Scanner(System.in);
            String itemName = userInput.nextLine();   
            if (itemName.equals("x")) {
                
                isStillShopping = false;
                obj.clearScreen();
                obj.moveTo(1,1);
                displayList(shoppingItems, iterator, isStillShopping);
                break;
            } 
            shoppingItems[iterator++] = itemName;
            obj.clearScreen();
            obj.moveTo(1,1);
            displayList(shoppingItems, iterator, isStillShopping);
        }
    }
    public static void displayList(String shoppingItems[], int iterator, Boolean isStillShopping) {
        System.out.println(".____________________________.");
        System.out.println("|                            |");
        if (isStillShopping == false){
            System.out.println("| Honey! Please buy...       |");
            System.out.println("|                            |");
            }

        for (int i = 0; i < iterator; i++){
            System.out.println("| - " + shoppingItems[i] + stringMultiply(" ", (25-shoppingItems[i].length())) + "|" );        
        }
        if (isStillShopping == false){
            System.out.println("|           Thank you! Mom   |");
            System.out.println("|                     xoxo   |");
        }
        
        System.out.println("*----------------------------*");
    }    


    public static String stringMultiply(String s, int n){
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < n; i++){
        sb.append(s);
    }
    return sb.toString();
    }
}