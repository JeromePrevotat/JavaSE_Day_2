package com.humanbooster.exercices;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class GuessNumber {
    public Scanner scan;
    public int toFind;
    public ArrayList<Integer> guesses;
    public int MAX_ATTEMPS;
    private static final int MIN = 1;
    private static final int MAX = 100;

    public GuessNumber(int maxAttempts){
           this.guesses = new ArrayList<Integer>();
           this.toFind = 0;
           this.scan = new Scanner(System.in);
           this.MAX_ATTEMPS = maxAttempts;
    }

    public int genNumber(){
        Random rng = new Random();
        return this.toFind = rng.nextInt(MAX - MIN + 1);
    }

    public String replay(){
        String s = "";
        while (!s.equals("yes") && !s.equals("no")){
            System.out.println("Replay ? Yes/No");
            s = scan.next().toLowerCase();
        }
        return s;
    }

    public int guess(){
        int n = 0;
        boolean valid = false;
        String s;
        System.out.println("Guess a Number:");
        while (!valid){
            s = scan.next().toLowerCase();
            if (s.equals("attemps")) System.out.println(this.guesses.toString());
            try{
                n = Integer.parseInt(s);
                guesses.add(n);
                valid = true;
            } catch (NumberFormatException e){
                System.err.println("Guess a Number:");
            }
        }
        return n;
    }

    public boolean checkGuess(int n){
        if (n == this.toFind) return true;
        else if (n < this.toFind) System.out.println("Too low");
        else System.out.println("Too high");
        return false;
    }

    public boolean tooManyAttempts(){
        return this.guesses.size() >= this.MAX_ATTEMPS;
    }

    public void closeScan(){
        this.scan.close();
    }

    public void init(){
        this.guesses.clear();
        this.toFind = this.genNumber();
        System.out.println("TOFIND : " + this.toFind);
    }
}
