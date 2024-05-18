package com.kayuniverse;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class NumerologyCalculators {

    public static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean homescreen = true;
        // While statement to initialise the home screen loop
        while (homescreen) {
            System.out.println("\n\n\n\nWelcome to the Numerology Calculator");
            System.out.println("To begin, please select a Calculator: \n");
            System.out.println("1. Egyptian Numerology\n2. Chaldean Numerology");
            System.out.println("Enter X to Exit");

            String CalcType = myScanner.nextLine();

            switch (CalcType) {
                case "1":

                    boolean calc1Screen = true;

                    while (calc1Screen) {

                        System.out.println("Egyptian Numerology Calculator");
                        System.out.println("Calculate a Word or Phrase: ");
                        System.out.println("Enter !X to return Home");
                        String eInput = myScanner.nextLine();


                        // Breaking the input down by character using split method
                        String[] input = eInput.split("(?<=.)");

                        // Use this statement to test the input:
                        // System.out.println(Arrays.toString(input));

                        if (eInput.equalsIgnoreCase("!x")) {

                            calc1Screen = false;
                        } else {


                            try {
                                // Allowing for system to write to a file and append is saving the info instead of overwriting
                                FileWriter einputWrite = new FileWriter("src/main/resources/NumerologyLogs/egNum.txt", false);
                                BufferedWriter eiWriter = new BufferedWriter(einputWrite);


                                eiWriter.write("Egyptian Numerology Calculator Results");
                                eiWriter.newLine();

                                // prints name into csv file
                                for (int ii = 0; ii < input.length; ii++) {
                                    eiWriter.write(input[ii] + " | ");
                                }
                                //adds int values to an array called addMe
                                ArrayList<Integer> addMe1 = new ArrayList<Integer>();
                                ArrayList<Integer> addMe11 = new ArrayList<Integer>();
                                ArrayList<Integer> addMe111 = new ArrayList<Integer>();

                                eiWriter.newLine();

                                for (int ii = 0; ii < input.length; ii++) {


                                    if ((input[ii].equalsIgnoreCase("a") || input[ii].equalsIgnoreCase("j") || input[ii].equalsIgnoreCase("s"))) {

                                        addMe1.add(1);

                                    } else if ((input[ii].equalsIgnoreCase("b") || input[ii].equalsIgnoreCase("k") || input[ii].equalsIgnoreCase("t"))) {

                                        addMe1.add(2);

                                    } else if ((input[ii].equalsIgnoreCase("c") || input[ii].equalsIgnoreCase("l") || input[ii].equalsIgnoreCase("u"))) {

                                        addMe1.add(3);

                                    } else if ((input[ii].equalsIgnoreCase("d") || input[ii].equalsIgnoreCase("m") || input[ii].equalsIgnoreCase("v"))) {


                                        addMe1.add(4);

                                    } else if ((input[ii].equalsIgnoreCase("e") || input[ii].equalsIgnoreCase("n") || input[ii].equalsIgnoreCase("w"))) {


                                        addMe1.add(5);

                                    } else if ((input[ii].equalsIgnoreCase("f") || input[ii].equalsIgnoreCase("o") || input[ii].equalsIgnoreCase("x"))) {

                                        addMe1.add(6);

                                    } else if ((input[ii].equalsIgnoreCase("g") || input[ii].equalsIgnoreCase("p") || input[ii].equalsIgnoreCase("y"))) {

                                        addMe1.add(7);

                                    } else if ((input[ii].equalsIgnoreCase("h") || input[ii].equalsIgnoreCase("q") || input[ii].equalsIgnoreCase("z"))) {

                                        addMe1.add(8);

                                    } else if ((input[ii].equalsIgnoreCase("i") || input[ii].equalsIgnoreCase("r"))) {

                                        addMe1.add(9);

                                    }
                                }
                                int addMe2 = 0;

                                for (int i = 0; i < addMe1.size(); i++) {

                                    addMe2 += addMe1.get(i);

                                }
                                if (addMe2 <= 10) {

                                    System.out.println("Final Value: " + addMe2);

                                } else {


                                    String addMe2Str = Integer.toString(addMe2); // convert the number to a string


                                    // Loop through the string and convert each character to an integer
                                    for (int i = 0; i < addMe2Str.length(); i++) {
                                        // Convert the character to an integer by subtracting '0'
                                        addMe11.add(addMe2Str.charAt(i) - '0');
                                    }

                                    int addMe3 = 0;

                                    for (int i = 0; i < addMe11.size(); i++) {
                                        addMe3 += addMe11.get(i);
                                    }

                                    if (addMe3 <= 10) {

                                        System.out.println("Final Value: " + addMe3);


                                    }  else {


                                        String addMe3Str = Integer.toString(addMe3); // convert the number to a string


                                        // Loop through the string and convert each character to an integer
                                        for (int i = 0; i < addMe3Str.length(); i++) {
                                            // Convert the character to an integer by subtracting '0'
                                            addMe111.add(addMe3Str.charAt(i) - '0');
                                        }

                                        int addMe4 = 0;

                                        for (int i = 0; i < addMe111.size(); i++) {
                                            addMe4 += addMe111.get(i);
                                        }
                                        if (addMe4 <= 10) {

                                            System.out.println("Final Value: " + addMe4);


                                        }

                                    }
                                }
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                                        break;
                    case "2":

                        boolean calc2Screen = true;

                        while (calc2Screen) {
                            System.out.println("Chaldean Numerology Calculator");
                            System.out.println("Calculate a Word or Phrase: ");
                            System.out.println("Enter !X to return Home");
                            String cInput = myScanner.nextLine();


                            // Breaking the input down by character using split method
                            String[] input = cInput.split("(?<=.)");

                            // Use this statement to test the input:
                            // System.out.println(Arrays.toString(input));

                            if (cInput.equalsIgnoreCase("!x")) {

                                calc2Screen = false;
                            } else {

                                try {
                                    // Allowing for system to write to a file and append is saving the info instead of overwriting
                                    FileWriter cinputWrite = new FileWriter("src/main/resources/NumerologyLogs/cdNum.txt", false);
                                    BufferedWriter cdWriter = new BufferedWriter(cinputWrite);


                                    cdWriter.write("Chaldean Numerology Calculator Results");
                                    cdWriter.newLine();

                                    // prints name into csv file
                                    for (int ii = 0; ii < input.length; ii++) {
                                        cdWriter.write(input[ii] + " | ");
                                    }
                                    //adds int values to an array called addMe
                                    ArrayList<Integer> addMe7 = new ArrayList<Integer>();
                                    ArrayList<Integer> addMe77 = new ArrayList<Integer>();
                                    ArrayList<Integer> addMe777 = new ArrayList<Integer>();

                                    cdWriter.newLine();

                                    for (int ii = 0; ii < input.length; ii++) {


                                        if ((input[ii].equalsIgnoreCase("a") || input[ii].equalsIgnoreCase("i") || input[ii].equalsIgnoreCase("j") || input[ii].equalsIgnoreCase("q") || input[ii].equalsIgnoreCase("y"))) {

                                            addMe7.add(1);

                                        } else if ((input[ii].equalsIgnoreCase("b") || input[ii].equalsIgnoreCase("k") || input[ii].equalsIgnoreCase("r"))) {

                                            addMe7.add(2);

                                        } else if ((input[ii].equalsIgnoreCase("c") || input[ii].equalsIgnoreCase("g") || input[ii].equalsIgnoreCase("l") || input[ii].equalsIgnoreCase("s"))) {

                                            addMe7.add(3);

                                        } else if ((input[ii].equalsIgnoreCase("d") || input[ii].equalsIgnoreCase("m") || input[ii].equalsIgnoreCase("t"))) {

                                            addMe7.add(4);

                                        } else if ((input[ii].equalsIgnoreCase("e") || input[ii].equalsIgnoreCase("h") || input[ii].equalsIgnoreCase("n") || input[ii].equalsIgnoreCase("x"))) {

                                            addMe7.add(5);

                                        } else if ((input[ii].equalsIgnoreCase("u") || input[ii].equalsIgnoreCase("v") || input[ii].equalsIgnoreCase("w"))) {

                                            addMe7.add(6);

                                        } else if ((input[ii].equalsIgnoreCase("o") || input[ii].equalsIgnoreCase("z"))) {

                                            addMe7.add(7);

                                        } else if ((input[ii].equalsIgnoreCase("f") || input[ii].equalsIgnoreCase("p"))) {

                                            addMe7.add(8);

                                        }
                                    }
                                    int addMe2 = 0;

                                    for (int i = 0; i < addMe7.size(); i++) {

                                        addMe2 += addMe7.get(i);

                                    }
                                    if (addMe2 <= 10) {

                                        System.out.println("Final Value: " + addMe2);

                                    } else {

                                        String addMe2Str = Integer.toString(addMe2); // convert the number to a string


                                        // Loop through the string and convert each character to an integer
                                        for (int i = 0; i < addMe2Str.length(); i++) {
                                            // Convert the character to an integer by subtracting '0'
                                            addMe77.add(addMe2Str.charAt(i) - '0');
                                        }

                                        int addMe3 = 0;

                                        for (int i = 0; i < addMe77.size(); i++) {
                                            addMe3 += addMe77.get(i);
                                        }

                                        if (addMe3 <= 10) {

                                            System.out.println("Final Value: " + addMe3);


                                        }  else {

                                            String addMe3Str = Integer.toString(addMe3); // convert the number to a string


                                            // Loop through the string and convert each character to an integer
                                            for (int i = 0; i < addMe3Str.length(); i++) {
                                                // Convert the character to an integer by subtracting '0'
                                                addMe777.add(addMe3Str.charAt(i) - '0');
                                            }

                                            int addMe4 = 0;

                                            for (int i = 0; i < addMe777.size(); i++) {
                                                addMe4 += addMe777.get(i);
                                            }
                                            if (addMe4 <= 10) {

                                                System.out.println("Final Value: " + addMe4);


                                            }

                                        }
                                    }
                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }

                        break;
                        case "X", "x":
                            homescreen = false;
                            break;
                            default:
                                System.out.println("Enter a Valid Option");


                                    }
                                }
                            }

                        }
