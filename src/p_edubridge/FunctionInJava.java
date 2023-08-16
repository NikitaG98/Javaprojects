package p_edubridge;

import java.util.Scanner;

public class FunctionInJava
{
    //int score;
   // if(score<0 || score>100)

    public class MarksheetSwitch {
        public static String printGrade(int score) {
            if(score<0 && score>100) {
                return "invalid";
            }

            switch (score/10) {
                case 10:
                    return "a+";

                case 9:
                    return "a";
                default: return "f";
            }
        }


        public static void main(String[] args)
        {

            Scanner scanner=new Scanner(System.in);
            System.out.println("enter your score");

            int score=scanner.nextInt();
          //MarksheetSwitch m=new MarksheetSwitch();

            String result= printGrade(score);
            System.out.println("my grade:"+ result);

        }

    }
}
