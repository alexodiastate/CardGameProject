
/**
 * Write a description of class War here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class War
{

    int rounds = 1;
    Hand hand = new Hand();
    Hand hand2 = new Hand();
    Hand hand3 = new Hand();
    Hand hand4 = new Hand();
    Boolean running = true;
    Deck deck = new Deck();

    //makes deck and runs rounds
    public War()
    {
        //initialize the deck and the player's hands
        deck.fill();

        for(int i = 0;i < 5;i++){
            deck.shuffle();
        }

        //fill the player's hands
        while(deck.size() != 0){
            hand.add(deck.Pop());
            hand2.add(deck.Pop());
            hand3.add(deck.Pop());
            hand4.add(deck.Pop());
        }

        while(running){
            round();
        }
    }

    //function for each individual round
    public void round(){
        print();

        //place one card from each hand and display cards
        Card h = new Card(hand.peek().getSuit(),hand.peek().getNumber(),hand.peek().getValue());
        Card h2 = new Card(hand2.peek().getSuit(),hand2.peek().getNumber(),hand2.peek().getValue());
        Card h3 = new Card(hand3.peek().getSuit(),hand3.peek().getNumber(),hand3.peek().getValue());
        Card h4 = new Card(hand4.peek().getSuit(),hand4.peek().getNumber(),hand4.peek().getValue());

        hand.pop();
        hand2.pop();
        hand3.pop();
        hand4.pop();

        System.out.println("P1: " + h.getNumber() + " of "+ h.getSuit());
        System.out.println("P2: " + h2.getNumber() + " of "+ h2.getSuit());        
        System.out.println("P3: " + h3.getNumber() + " of "+ h3.getSuit());
        System.out.println("P4: " + h4.getNumber() + " of "+ h4.getSuit() + "\n");

        //evaluate for highest value
        int chaha = Math.max(h.getValue(),h2.getValue());
        int chaha2 = Math.max(h3.getValue(),h4.getValue());
        int chaha3 = Math.max(chaha,chaha2);
        System.out.println("Winner is " + chaha3);

        if(h.getValue() == chaha3){
            hand.add(h);
            hand.add(h2);
            hand.add(h3);
            hand.add(h4);
        }
        
        else if(h2.getValue() == chaha3){
            hand2.add(h);
            hand2.add(h2);
            hand2.add(h3);
            hand2.add(h4);
        }
        
        else if(h3.getValue() == chaha3){
            hand3.add(h);
            hand3.add(h2);
            hand3.add(h3);
            hand3.add(h4);
        }
        else{
            hand4.add(h);
            hand4.add(h2);
            hand4.add(h3);
            hand4.add(h4);
        }

        //checks to see if the game is still going
        if(hand.size() == 52 || hand2.size() == 52 || hand3.size() == 52 || hand4.size() == 52){
            running = false;
        }
        
        if(hand.size() == 0){
            hand = null;
        }
        
        if(hand2.size() == 0){
            hand = null;
        }
        
        if(hand3.size() == 0){
            hand = null;
        }
        
        if(hand4.size() == 0){
            hand = null;
        }
    }
    
    //show user the round and current score
    public void print(){
        System.out.println("Round: " + rounds + "\n");
        rounds++;

        System.out.println("P1: " + hand.size());
        System.out.println("P2: " + hand2.size());        
        System.out.println("P3: " + hand3.size());
        System.out.println("P4: " + hand4.size());
        System.out.println("");

    }
}

