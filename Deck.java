import java.util.Random;

/**
 * Write a description of class Deck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Deck
{
    int size = 0;
    Card[] arr = new Card[52]; 
    Random random = new Random();

    public Deck(){
        Card[] arr = new Card[52]; 
    }

    public void add(Card car){
        arr[size] = car;
        size++;
    }

    //fills the deck with cards
    public void fill(){
        Card a = new Card("Spades", "Ace",1);
        Card b = new Card("Spades", "Two",2);
        Card c = new Card("Spades", "Three",3);
        Card d = new Card("Spades", "Four",4);
        Card e = new Card("Spades", "Five",5);
        Card f = new Card("Spades", "Six",6);
        Card g = new Card("Spades", "Seven",7);
        Card h = new Card("Spades", "Eight",8);
        Card i = new Card("Spades", "Nine",9);
        Card j = new Card("Spades", "Ten",10);
        Card m = new Card("Spades", "Jack",11);
        Card n = new Card("Spades", "Queen",12);
        Card o = new Card("Spades", "King",13);

        Card ab = new Card("Clubs", "Ace",1);
        Card bb = new Card("Clubs", "Two",2);
        Card cb = new Card("Clubs", "Three",3);
        Card db = new Card("Clubs", "Four",4);
        Card eb = new Card("Clubs", "Five",5);
        Card fb = new Card("Clubs", "Six",6);
        Card gb = new Card("Clubs", "Seven",7);
        Card hb = new Card("Clubs", "Eight",8);
        Card ib = new Card("Clubs", "Nine",9);
        Card jb = new Card("Clubs", "Ten",10);
        Card mb = new Card("Clubs", "Jack",11);
        Card nb = new Card("Clubs", "Queen",12);
        Card ob = new Card("Clubs", "King",13);

        Card ac = new Card("Hearts", "Ace",1);
        Card bc = new Card("Hearts", "Two",2);
        Card cc = new Card("Hearts", "Three",3);
        Card dc = new Card("Hearts", "Four",4);
        Card ec = new Card("Hearts", "Five",5);
        Card fc = new Card("Hearts", "Six",6);
        Card gc = new Card("Hearts", "Seven",7);
        Card hc = new Card("Hearts", "Eight",8);
        Card ic = new Card("Hearts", "Nine",9);
        Card jc = new Card("Hearts", "Ten",10);
        Card mc = new Card("Hearts", "Jack",11);
        Card nc = new Card("Hearts", "Queen",12);
        Card oc = new Card("Hearts", "King",13);

        Card ad = new Card("Diamonds", "Ace",1);
        Card bd = new Card("Diamonds", "Two",2);
        Card cd = new Card("Diamonds", "Three",3);
        Card dd = new Card("Diamonds", "Four",4);
        Card ed = new Card("Diamonds", "Five",5);
        Card fd = new Card("Diamonds", "Six",6);
        Card gd = new Card("Diamonds", "Seven",7);
        Card hd = new Card("Diamonds", "Eight",8);
        Card id = new Card("Diamonds", "Nine",9);
        Card jd = new Card("Diamonds", "Ten",10);
        Card md = new Card("Diamonds", "Jack",11);
        Card nd = new Card("Diamonds", "Queen",12);
        Card od = new Card("Diamonds", "King",13);
        add(a);
        add(b);
        add(c);
        add(d);
        add(e);
        add(f);
        add(g);
        add(h);
        add(i);
        add(j);
        add(m);
        add(n);
        add(o);

        add(ab);
        add(bb);
        add(cb);
        add(db);
        add(eb);
        add(fb);
        add(gb);
        add(hb);
        add(ib);
        add(jb);
        add(mb);
        add(nb);
        add(ob);

        add(ac);
        add(bc);
        add(cc);
        add(dc);
        add(ec);
        add(fc);
        add(gc);
        add(hc);
        add(ic);
        add(jc);
        add(mc);
        add(nc);
        add(oc);

        add(ad);
        add(bd);
        add(cd);
        add(dd);
        add(ed);
        add(fd);
        add(gd);
        add(hd);
        add(id);
        add(jd);
        add(md);
        add(nd);
        add(od);
    }
    
    public void shuffle(){
        for(int i = 0;i < 200;i++){
            int first = random.nextInt(52);
            int second = random.nextInt(52);
            Card hold = arr[first];
            arr[first] = arr[second];
            arr[second] = hold;
        }
    }

    public int size(){
        return size;
    }

    public Card Peek(){
        return arr[size - 1];   
    }

    public Card Pop(){
        Card card = arr[size - 1];
        arr[size - 1] = null;
        size--;
        return card;
    }
}

