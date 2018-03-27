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
        
        String[] shoppingItems = new String[50];
        int iterator = 0;
        shoppingItems[iterator++] = "Eggs";
        shoppingItems[iterator++] = "Milk";
        shoppingItems[iterator++] = "Soda Water";
        System.out.println("___________________________________");
        for (int i = 0; i < iterator; i++){
            System.out.println("|   " + shoppingItems[i] + stringMultiply(" ", (30-shoppingItems[i].length())) + "|" );        
        }
        System.out.println("-----------------------------------");
    }
    
    public static String stringMultiply(String s, int n){
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < n; i++){
        sb.append(s);
    }
    return sb.toString();
    }
}