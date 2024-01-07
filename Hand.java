
/**
 * Write a description of class Hand here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hand
{
    Card[] hand = new Card[10];
    int size = 0;
    
    public Hand(){
        hand = new Card[100];
    }
    
    public void add(Card car){
        hand[size] = car;
        size++;
    }
    
    public void print(){
        for(int i = 0;i < size;i++){
            System.out.println(hand[i].getNumber() + " of " + hand[i].getSuit());
        }
        System.out.println("");
    }
    
    public Card pop(){
        Card card = hand[size];
        hand[size] = null;
        size--;
        
        return card;
    }
    
    public Card peek(){
       return hand[size - 1]; 
    }
    
    public int size(){
        return size;
    }
    
    public Card get(int yuh){
        return hand[yuh];
    }
    }

    

