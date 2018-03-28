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
        Boolean isStillShopping = true;
        int iterator = 0;
        while (isStillShopping) { 
            System.out.println();
            System.out.println("Enter item name:");
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
            System.out.println("|   " + shoppingItems[i] + stringMultiply(" ", (25-shoppingItems[i].length())) + "|" );        
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