package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Deck deck = new Deck();
        deck.shuffleDeckBackwards();
    }


    public static class Card {
        RANK rank;
        SUIT suit;

        public Card(SUIT suit, RANK rank) {
            this.rank = rank;
            this.suit = suit;
        }

        enum RANK {
            ACE,
            DUECE,
            THREE,
            FOUR,
            FIVE,
            SIX,
            SEVEN,
            EIGHT,
            NINE,
            TEN,
            JACK,
            QUEEN,
            KING;
        }

        enum SUIT {
            HEARTS,
            SPADES,
            CLUBS,
            DIAMONDS;
        }
    }

    public class Deck {
        ArrayList<Card> cards;

        public Deck() {
            initDeck();
        }

        public void initDeck() {
            cards = new ArrayList<>();
            for (int i = 0; i < Card.SUIT.values().length; i++) {
                for(int j = 0; j < Card.RANK.values().length; j++) {
                    Card card = new Card(Card.SUIT.values()[i], Card.RANK.values()[j]);
                    cards.add(card);
                }
            }
        }

        public void shuffleDeck() {
            ArrayList<Card> shuffledDeck = new ArrayList<>();
            Random random= new Random();
            for(int i = 0; i < cards.size(); i++) {
                int card = random.nextInt(cards.size());
                Card randomCard = cards.get(card);
                shuffledDeck.add(randomCard);
            }
            cards = shuffledDeck;
        }

        public void shuffleDeckBackwards() {
            Collections.reverse(cards);
        }
    }
}