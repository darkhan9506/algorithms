package com.zhursind.leetcode.arrays101;

public class Main {

  static int[] test = new int[] {12,345,2,6,7896,1234, 33, 1000};
  public static void main(String[] args) {
    // The actual code for creating an Array to hold DVD's.
    DVD[] dvdCollection = new DVD[15];

    // Firstly, we need to actually create a DVD object for The Avengers.
    DVD avengersDVD = new DVD("The Avengers", 2012, "Joss Whedon");

    // Next, we'll put it into the 8th place of the Array. Remember, because we
    // started numbering from 0, the index we want is 7.
    dvdCollection[7] = avengersDVD;

    System.out.println(dvdCollection[7]);

    DVD incrediblesDVD = new DVD("The Incredibles", 2004, "Brad Bird");
    DVD findingDoryDVD = new DVD("Finding Dory", 2016, "Andrew Stanton");
    DVD lionKingDVD = new DVD("The Lion King", 2019, "Jon Favreau");

    // Put "The Incredibles" into the 4th place: index 3.
    dvdCollection[3] = incrediblesDVD;

    // Put "Finding Dory" into the 10th place: index 9.
    dvdCollection[9] = findingDoryDVD;

    // Put "The Lion King" into the 3rd place: index 2.
    dvdCollection[2] = lionKingDVD;

    EvenNumberOfDigits testObject = new EvenNumberOfDigits();
    int result = testObject.findNumbers(  test);
    System.out.println(result);
  }
}
