package p_edubridge;

public class Strings
{
    public static void main(String[] args)
    {
      String a="Black";
      String b="black";
      String c="green";
      System.out.println();

        String str4 = "How are you?";
        String arrStr[] = str4.split(" ", 3);
        System.out.println("Splited Elements:");
        for(int i=0;i<arrStr.length;i++) {
            System.out.print(arrStr[i] + " ");
        }
        System.out.println();
        System.out.println("Splited Elements using for each loop:");
        for (String str5 : arrStr) {
            System.out.print(str5 + " ");
        }

    }
}

//    String str = "Welcome to edubridge    ";
//
//    //convert string into character array
//    char[] arr = str.toCharArray();
//    String tempStr = "";
//        for(char c:arr){
//
//                if(c != ' '){
//                tempStr += c;
//                }
//                // System.out.println(c);
//                System.out.println("Temp"+tempStr);
//                }
//                str = tempStr;
//                System.out.println(str);