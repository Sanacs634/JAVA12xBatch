package Enumeration;
//🔹 What is Enumeration (enum) in Java?
//An enumeration, or enum, is a special data type in Java used to define a set of named constant values.
//
//Think of it as a list of fixed options (like days of the week, directions, etc.)
//
//✅ Why Use enum?
//Replaces magic strings or fixed integer values.
//
//Makes code more readable, type-safe, and less error-prone.
//
//Prevents invalid values.
public class EnumDefinition {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public class Main {
        public static void main(String[] args) {
            Day today = Day.SUNDAY;

            switch (today) {
                case MONDAY:
                    System.out.println("Start of the week.");
                    break;
                case SUNDAY:
                    System.out.println("It's a holiday!");
                    break;
                default:
                    System.out.println("Just another weekday.");
            }
        }
    }

}
