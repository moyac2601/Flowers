// Flowers.java - This program reads names of flowers and whether they are grown in shade or sun from an input

// file and prints the information to the user's screen.

// Input: flowers.dat.

// Output: Names of flowers and the words sun or shade.

import java.io.*; // Import class for file input.

public class Flowers {

public static void main(String args[]) throws Exception {

// Declare variables here

String flowerName, sunOrShade;

// Open input file.

FileReader f = new FileReader("flowers.dat");

// Create BufferedReader object.

BufferedReader br = new BufferedReader(f);

// Write while loop that reads records from file.

while ((flowerName = br.readLine()) != null) {

sunOrShade = br.readLine();

System.out.println(flowerName + " is grown in the " + sunOrShade);

// Print flower name and the words sun or shade.

}

br.close();

System.exit(0);

} // End of main() method.

} // End of Flowers class.
