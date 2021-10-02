package com.kkorchyts.epam.jwd.junit.ui.impl;

import com.kkorchyts.epam.jwd.junit.ui.NumberReader;

import java.util.Scanner;
import java.util.function.Predicate;

public class ConsoleReader implements NumberReader {

    static final String WRONG_VALUE_ENTERED_MESSAGE = "Please, enter the correct value!";

    @Override
    public int getInteger(String message, Predicate<Integer> predicate) {
        Scanner scanner = new Scanner(System.in);
        int result;

        do {
            System.out.print(message);
            if (scanner.hasNextInt()) {
                result = scanner.nextInt();
                if (predicate == null || predicate.test(result)) {
                    return result;
                }
            } else {
                scanner.nextLine();
            }

            System.out.println(WRONG_VALUE_ENTERED_MESSAGE);
        } while (true);
    }}
