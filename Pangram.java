package com.cloudvandana.assignment1;

import java.util.Scanner;

public class Pangram {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("EnterPangramSentense");
            String input = sc.nextLine();
            boolean isPangram = isPangram(input);

            if (isPangram) {
                System.out.println("The input is a pangram.");
            } else {
                System.out.println("The input is not a pangram.");
            }
        }

        public static boolean isPangram(String input) {
            input = input.toLowerCase();
            boolean[] alphabet = new boolean[26];

            for (char c : input.toCharArray()) {
                if (c >= 'a' && c <= 'z') {
                    int index = c - 'a';
                    alphabet[index] = true;
                }
            }
            for (boolean letterPresent : alphabet) {
                if (!letterPresent) {
                    return false;
                }
            }
            return true;
        }
    }
