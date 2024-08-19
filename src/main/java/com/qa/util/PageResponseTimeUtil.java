package com.qa.util;

public class PageResponseTimeUtil {

   public static double measureResponseTimeInSeconds(Runnable action) {
       long startTime = System.nanoTime();
       action.run();
       long endTime = System.nanoTime();
       long elapsedTimeInNanoseconds = endTime - startTime;
       return elapsedTimeInNanoseconds / 1e9; // Convert nanoseconds to seconds
   }
}