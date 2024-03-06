package Day01;

public class FindCcurences {

    public static void main(String[] args) {




    //find out how many  b of character in a string

    String  str = "dkdkdkbbbhdjdbhhbbb";
    int len1=str.length();
    int len2 = str.replace("b", "").length();

    int totalCount = len1-len2;

        System.out.println("totalCount = " + totalCount);


        HowManyLetter(str,'h');


    }

    private static void HowManyLetter(String str,char letter) {

        int cont =0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==letter){
                cont++;

            }

        }
        System.out.println(cont);
    }
}
