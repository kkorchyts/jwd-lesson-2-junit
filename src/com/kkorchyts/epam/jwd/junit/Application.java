package com.kkorchyts.epam.jwd.junit;

import java.util.Scanner;

public class Application {
    static final String WRONG_VALUE_ENTERED_MESSAGE = "Please, enter the correct value!";
    static final String READ_X_MESSAGE = "Please, enter x: ";
    static final String READ_Y_MESSAGE = "Please, enter y: ";

    static final String POSITIVE_RESULT_MESSAGE = "Point is in the region";
    static final String NEGATIVE_RESULT_MESSAGE = "Point isn't in the region";

    static class Point {
        private final int x;
        private final int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    public static void printMessage(String message, boolean lineFeed) {
        if (lineFeed) {
            System.out.println(message);
        } else {
            System.out.print(message);
        }
    }

    public static int getInteger(String message) {
        Scanner scanner = new Scanner(System.in);
        do {
            printMessage(message, false);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                scanner.nextLine();
            }
            printMessage(WRONG_VALUE_ENTERED_MESSAGE, true);
        } while (true);
    }

    public static boolean pointIsInRegion(Point p) {
        if (p.getX() >= -2 && p.getX() <= 2 && p.getY() >= 0 && p.getY() <= 4) {
            return true;
        } else {
            return p.getX() >= -4 && p.getX() <= 4 && p.getY() <= 0 && p.getY() >= -3;
        }
    }

    public static Point readPoint() {
        return new Point(getInteger(READ_X_MESSAGE),
                getInteger(READ_Y_MESSAGE));
    }

    public static void printResult(boolean result) {
        if (result) {
            printMessage(POSITIVE_RESULT_MESSAGE,true);
        } else {
            printMessage(NEGATIVE_RESULT_MESSAGE, true);
        }
    }

    public static void main(String[] args) {
        printMessage(" --- Task 4: Check if point is in a region --- ", true);
        Point p = readPoint();
        boolean result = pointIsInRegion(p);
        printResult(result);
    }
}
