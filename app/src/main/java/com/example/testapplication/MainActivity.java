package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Random;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public class DeckOfCards {

        private String rank;
        private int suit;
        private Random randomRank = new Random();
        private Random randomSuit = new Random();

        private static final int HEARTS = 1;
        private static final int CLUB = 2;
        private static final int DIAMOND = 3;
        private static final int SPADE = 4;

        private static final int ACE = 1;
        private static final int DUECE = 2;
        private static final int THREE = 3;
        private static final int FOUR = 4;
        private static final int FIVE = 5;
        private static final int SIX = 6;
        private static final int SEVEN = 7;
        private static final int EIGHT = 8;
        private static final int NINE = 9;
        private static final int TEN = 10;
        private static final int JACK = 11;
        private static final int QUEEN = 12;
        private static final int KING = 13;


        public DeckOfCards() {
            this.suit = suit;
            this.rank = rankToString(getRank());
        }

        public int getRank() {
            int rank = randomRank.nextInt(13);
            rank += 1;
            return rank;
        }

        public int getSuit() {
            return suit;
        }

        public String rankToString(int rank) {
            switch(rank) {
                case ACE:
                    return "ace";
                case DUECE:
                    return "duece";
                case THREE:
                    return "three";
                case FOUR:
                    return "four";
                case FIVE:
                    return "five";
                case SIX:
                    return "six";
                case SEVEN:
                    return "seven";
                case EIGHT:
                    return "eight";
                case NINE:
                    return "nine";
                case TEN:
                    return "ten";
                case JACK:
                    return "jack";
                case QUEEN:
                    return "queen";
                case KING:
                    return "king";
            }
            return String.valueOf(rank);
        }
    }
}