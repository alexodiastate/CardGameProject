import java.util.Scanner;

/**
 * Write a description of class Blackjack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Blackjack
{
    int rounds = 1;
    int pScore = 0;
    int dScore = 0;
    Scanner scan = new Scanner(System.in); 

    
    public Blackjack()
    {
            round();        
    }
    
    public void round(){
        System.out.println("Player Score: " + pScore + " - Dealer Score: " + dScore);
        
        //initialize deck
        Deck deck = new Deck();
        deck.fill();
        Hand hand = new Hand();

        for(int i = 0;i < 5;i++){
            deck.shuffle();
        }
        
        //make player hand
        hand.add(deck.Pop());
        hand.add(deck.Pop());
        int sum = hand.get(0).getValue() + hand.get(1).getValue();
        
        //print out summary
        System.out.println("Round " + rounds + ":\n");
        System.out.println("Cards:");
        hand.print();
        System.out.println("Sum: " + sum);
        
        //find user action
        Boolean action = true;
        
        while(action){
            System.out.println("Type hit or stand");
            String yongle = scan.nextLine();
            
            if(yongle.compareTo("hit") == 0){
                //add a card and refresh sum
                hand.add(deck.Pop());
                sum = sum + hand.peek().getValue();
                
                System.out.println("Cards:");
                hand.print();
                System.out.println("Sum: " + sum);
                
                if(sum > 21){
                    action = false;
                }
            }
            else{
                action = false;
            }
        }
        
        //dealer turn
        Hand dealer = new Hand();
        dealer.add(deck.Pop());
        dealer.add(deck.Pop());
        int dSum = dealer.get(0).getValue() + dealer.get(1).getValue();
        
        //not making logic rofl
        while(dSum < 15){
            dealer.add(deck.Pop());
            dSum = dSum + dealer.peek().getValue();
        }
        
        //final results
        System.out.println("Player Cards:");
        hand.print();
        System.out.println("Sum: " + sum);
        
        System.out.println("\nDealer Cards:");
        dealer.print();
        System.out.println("Sum: " + dSum + "\n");
        
        //check to see whose sum is higher 
        if(sum > dSum && sum <= 21){
            System.out.println("You Win!");
            pScore++;
            System.out.println("Player Score: " + pScore + " - Dealer Score: " + dScore);
        }
        else if(sum == dSum){
            System.out.println("You Tie!");
            System.out.println("Player Score: " + pScore + " - Dealer Score: " + dScore);
        }
        else{
            System.out.println("You Lose!");
            dScore++;
            System.out.println("Player Score: " + pScore + " - Dealer Score: " + dScore);
        }
        
        //check to see if the game repeats
        System.out.println("Play again? (y or n)");
        String ag = scan.nextLine();
        
        if(ag.compareTo("y") == 0){
            round();
        }
        else{
            System.exit(0);
        }
    }
}
