/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Sivagama 
 * @modifier Robert Shelton 991627189
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(randomValueGen(13));
            c.setSuit(Card.SUITS[randomValueGen(3)-1]);
            magicHand[i] = c;
            //System.out.println(c.getValue() +" of " + c.getSuit());
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        System.out.println("Pick a card! Enter a value from 1-13:");
        Card userCard = new Card();
        userCard.setValue(input.nextInt());
        System.out.println("Now select your card's suit (1 for Hearts, 2 for Diamonds, 3 for Spades, 4 for Clubs)");
        userCard.setSuit(Card.SUITS[input.nextInt()-1]);
        //Then report the result here
        System.out.println("Your card is the " + userCard.getValue() +" of " + userCard.getSuit());
        boolean check = false;
        
        String suit = userCard.getSuit();
        int value = userCard.getValue();
        
        String tempSuit;
        int tempValue;
        //System.out.println(magicHand.length);
        
        for(int t = 0; t < magicHand.length; t++){
            //System.out.println("card id: " + t);
            tempSuit = magicHand[t].getSuit();
            tempValue = magicHand[t].getValue();
            //System.out.println(tempValue + " of " + tempSuit);
            if(suit.equals(tempSuit) && value == tempValue){
                check = true;
            }
        }
        
        if(check){
            System.out.println("Good guess! Your card is in the magic hand!");
        }else{
            System.out.println("Nice try, but your card is not in the magic hand.");
        }
           
    }
    public static int randomValueGen(int limit){
        int value;
        Random randomValue = new Random();
        value = randomValue.nextInt(limit) + 1;
        return value;

    }
    
    
    
}


