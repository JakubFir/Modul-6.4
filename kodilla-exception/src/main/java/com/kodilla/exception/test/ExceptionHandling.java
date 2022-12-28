package com.kodilla.exception.test;

public class ExceptionHandling extends Exception{

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        String res = "";
        try{
          res = secondChallenge.probablyIWillThrowException(1,2);
        }catch (Exception e){
            System.out.println("handling exception");
        }
        finally {
            System.out.println(res);
        }
    }


}
