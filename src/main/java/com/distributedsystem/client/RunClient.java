package com.distributedsystem.client;

import java.util.Scanner;

/**
 * Main method for running multiple clients
 *
 */
public class RunClient {
    public static void main(String args[]) {
        System.out.println("Please give number of clients?");
        Scanner scanner = new Scanner(System.in);
        int j = scanner.nextInt();
        for (int i = 1; i <= j; i++) {
            SampleClient s = new SampleClient();
            s.run();
        }
    }
}