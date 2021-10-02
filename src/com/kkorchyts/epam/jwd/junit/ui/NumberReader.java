package com.kkorchyts.epam.jwd.junit.ui;

import java.util.Scanner;
import java.util.function.Predicate;

public interface NumberReader {
    int getInteger(String message, Predicate<Integer> predicate);
}
