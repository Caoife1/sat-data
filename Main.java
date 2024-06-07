import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    System.out.println("SAT DATA!!!!");

    // create data structure to store all total scores
    ArrayList<Integer> totalScore = new ArrayList<Integer>();
    ArrayList<Integer> totalScore1 = new ArrayList<Integer>();
    ArrayList<Integer> totalScore2 = new ArrayList<Integer>();

    try {
      Scanner s = new Scanner(new File("total.txt"));

      while (s.hasNext()) {
        int score = Integer.parseInt(s.nextLine());
        totalScore.add(score);
      }
      s.close();
    }

    catch (Exception e) {
      System.out.println("file not found");
    }
    try {
      Scanner s1 = new Scanner(new File("reading.txt"));

      while (s1.hasNext()) {
        int score1 = Integer.parseInt(s1.nextLine());
        totalScore1.add(score1);
      }
      s1.close();
    }
    catch (Exception e1) {
      System.out.println("file not found");
    }
    try {
      Scanner s2 = new Scanner(new File("math.txt"));

      while (s2.hasNext()) {
        int score2 = Integer.parseInt(s2.nextLine());
        totalScore2.add(score2);
      }
      s2.close();
    }
    catch (Exception e2) {
      System.out.println("file not found");
    }

    // make sure all data entered the ArrayList
    //System.out.println(totalScore);
    System.out.println(totalScore.size()+ " students took the test.");
    int total =0;
    for (int score: totalScore){
      total+=score;
    }
    double average=(double)total/totalScore.size();
    System.out.println(average);
    double total1=0;
    for (int score1 : totalScore1){
      total1+=score1;
    }
    System.out.println("The average score for reading is "+ total1/totalScore1.size());
    double total2=0;
    for (int score2 : totalScore2){
      total2+=score2;
    }
    System.out.println("The average score for math is "+ total2/totalScore2.size());
    if (total2/totalScore2.size()>total1/totalScore2.size()){
      System.out.println("The students did better in math compared to reading.");
    }
    else {
      System.out.println("The students did better in reading compared to math.");
    }
  }

}
