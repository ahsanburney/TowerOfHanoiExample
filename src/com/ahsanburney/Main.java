package com.ahsanburney;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TowerOfHanoi toh = new TowerOfHanoi();
        toh.move(3,'A','B','C');
    }

    public static class TowerOfHanoi {
        public void move(int numberOfDisc, char from, char to, char inter) {
            if (numberOfDisc == 1) {
                System.out.println("Moving Disc 1 from " + from + " to " + to);
            } else {
                move(numberOfDisc - 1, from, inter, to);
                System.out.println("Moving disc " + numberOfDisc + " from " + from + " to " + to);
                move(numberOfDisc - 1, inter, to, from);

            }
        }
    }


}
