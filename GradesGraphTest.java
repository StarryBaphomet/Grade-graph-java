/* Course: CS 12300 
*  Assignment: 10
*  ID: 1024  
*/

import java.util.*;

class GradesDistribution
{
/*
   instance variables
   */

    int Acount,Bcount,Ccount,Dcount,Fcount;
  
    GradesDistribution(){
        Acount=0;
        Bcount=0;
        Ccount=0;
        Dcount=0;
        Fcount=0;
    }

    void setAcount(int value){
        Acount=value;
    }

    void setBcount(int value){
        Bcount=value;
    }

    void setCcount(int value){
        Ccount=value;
    }

    void setDcount(int value){
        Dcount=value;
    }

    void setFcount(int value){
        Fcount=value;
    }
  
    /*
     
    get Methods to return values 
    */

    int getAcount(){
        return Acount;
    }

    int getBcount(){
        return Bcount;
    }

    int getCcount(){
        return Ccount;
    }

    int getDcount(){
        return Dcount;
    }

    int getFcount(){
        return Fcount;
    }

    /*
     
    Method to return total grades
     
    */

    int getTotalNumberOfGrades(){
        return Acount+Bcount+Ccount+Dcount+Fcount;
    }

    /*
     
    Methods to return percentages 
    */
    int getPercentA (){
        if(getTotalNumberOfGrades()!=0)
            return (Acount*100)/getTotalNumberOfGrades();
        else return 0;
    }

    int getPercentB (){
        if(getTotalNumberOfGrades()!=0)
            return (Bcount*100)/getTotalNumberOfGrades();
        else return 0;
    }

    int getPercentC (){
        if(getTotalNumberOfGrades()!=0)
            return (Ccount*100)/getTotalNumberOfGrades();
        else return 0;
    }


    int getPercentD (){
        if(getTotalNumberOfGrades()!=0)
            return (Dcount*100)/getTotalNumberOfGrades();
        else return 0;
    }

    int getPercentF (){
        if(getTotalNumberOfGrades()!=0)
            return (Fcount*100)/getTotalNumberOfGrades();
        else return 0;
    }

    public void draw()
    {
        
        for(int i=0;i<=100;i=i+5)
            if(i%10==0)
            System.out.print(i);
        else System.out.print("   ");
        System.out.print("%");

        System.out.println();
        for(int i=0;i<=100;i=i+5)
            if(i%10==0)
            System.out.print("|");
        else System.out.print("    ");

        System.out.println();
        for(int i=0;i<=100;i+=2)
            System.out.print("*");
        System.out.println();

        float symbolA=Math.round(getPercentA()* 50.0/100);
        float symbolB=Math.round(getPercentB()* 50.0/100);
        float symbolC=Math.round(getPercentC()* 50.0/100);
        float symbolD=Math.round(getPercentD()* 50.0/100);
        float symbolF=Math.round(getPercentF()* 50.0/100);

        for(int i=0;i<symbolA;i++)
            System.out.print("*");
        System.out.println(" "+(int)symbolA);

        for(int i=0;i<symbolB;i++)
            System.out.print("*");
        System.out.println(" "+(int)symbolB);

        for(int i=0;i<symbolC;i++)
            System.out.print("*");
        System.out.println(" "+(int)symbolC);

        for(int i=0;i<symbolD;i++)
            System.out.print("*");
        System.out.println(" "+(int)symbolD);

        for(int i=0;i<symbolF;i++)
            System.out.print("*");
        System.out.println(" "+(int)symbolF);
    }

    public void writeOutput()
    {
        System.out.println("Number of A's = " + Acount);
        System.out.println("Number of B's = " + Bcount);
        System.out.println("Number of C's = " + Ccount);
        System.out.println("Number of D's = " + Dcount);
        System.out.println("Number of F's = " + Fcount);
    }


}


public class GradesGraphTest
{
   public static void main(String[] args)
   {

   
      GradesDistribution grades = new GradesDistribution();
    
      System.out.println("======Default constructor set all counts to be 0 ========================");
      grades.writeOutput();
      System.out.println();      
      grades.draw();
    
      System.out.println();
      System.out.println("=======change number of A, B, F to be 4, 6, 2 respectively ==============");

      grades.setAcount(4);
      grades.setBcount(6);
      grades.setFcount(2);
      grades.writeOutput();
      System.out.println();
      System.out.println("Total number of grades = "+ grades.getTotalNumberOfGrades());
      System.out.println();        
      grades.draw();
    
      System.out.println();   
      System.out.println("=======change number of B, C, D to be 4, 6, 2 respectively ==============");

      grades.setBcount(4);
      grades.setCcount(6);
      grades.setDcount(2);    
      grades.writeOutput();
      System.out.println();
      System.out.println("Total number of grades = "+ grades.getTotalNumberOfGrades());   
      System.out.println();
      System.out.println("check the percentage");
      System.out.println("Percent of A = " + grades.getPercentA());
      System.out.println("Percent of B = " + grades.getPercentB());
      System.out.println("Percent of C = " + grades.getPercentC());
      System.out.println("Percent of D = " + grades.getPercentD());
      System.out.println("Percent of F = " + grades.getPercentF());
      System.out.println();
      System.out.println("===============================");
      grades.draw();

          System.out.println("\n");
    System.out.println("Question Example test case result is:");

      grades.setAcount(1);
      grades.setBcount(4);
      grades.setCcount(6);
      grades.setDcount(2);
      grades.setFcount(1);    
      grades.writeOutput();
      System.out.println();
      System.out.println("Total number of grades = "+ grades.getTotalNumberOfGrades());   
      System.out.println();
      System.out.println("check the percentage");
      System.out.println("Percent of A = " + grades.getPercentA());
      System.out.println("Percent of B = " + grades.getPercentB());
      System.out.println("Percent of C = " + grades.getPercentC());
      System.out.println("Percent of D = " + grades.getPercentD());
      System.out.println("Percent of F = " + grades.getPercentF());
      System.out.println();
      System.out.println("===============================");
      grades.draw();        

   }
}