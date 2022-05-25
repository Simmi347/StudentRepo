/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package card;

/**
 *
 * @author simmi
 */
public class Card {

    /**
     * @param args the command line arguments
     */
   
        
       private String suit; //clubs, spades, diamonds, hearts
    private int value;//1-13

    public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suited is  set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }
// added to string function
    @Override
    public String toString() {
        return "Card{"+"suit='" + suit + '\'' +", value=" + value +'}';
    }
}