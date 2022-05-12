package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Deck deck = new Deck();
        deck.getRandomCard();
    }


    public static class Card {
        RANK rank;
        SUIT suit;

        public Card(RANK rank, SUIT suit) {
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
        ArrayList<Card> deck = new ArrayList<>();

        public Deck() {
            for (int i = 0; i < 52; i++) {
                Card card = new Card(getRandomRank(), getRandomSuit());
                deck.add(card);
            }
        }

        private Card.RANK getRandomRank() {
            Random randomRank = new Random();
            int rank = randomRank.nextInt(Card.RANK.values().length);
            return Card.RANK.values()[rank];
        }

        private Card.SUIT getRandomSuit() {
            Random randomSuit = new Random();
            int suit = randomSuit.nextInt(Card.SUIT.values().length);
            return Card.SUIT.values()[suit];
        }

        public Card getRandomCard() {
            Random randomCard = new Random();
            int index = randomCard.nextInt(deck.size());
            return deck.get(index);
        }


    }
}