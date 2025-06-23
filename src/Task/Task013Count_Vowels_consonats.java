package Task;

import java.util.Scanner;

//here we are not using any inbuilt function
public class Task013Count_Vowels_consonats {
    public static void main(String[] args) {
        int stringlength;
        Scanner userinput = new Scanner(System.in);
        System.out.println("Enter a string");
        if (userinput.hasNext()) {
            String stringword = userinput.next();
            stringlength = length_of_string(stringword);
            length_of_string(stringword);
            countVowelsAndConsonants(stringword,stringlength);
        } else {
            System.out.println("You are entering an wrong input.Please enter only string with alphabets");
        }

    }
    static int length_of_string(String word) {
        int  length = 0;
        try {
            while(true) {
                char charofstringln = word.charAt(length);
                //System.out.println(charofstringln);
                length++;

            }
        } catch (StringIndexOutOfBoundsException e) {

        }
        return length;

    }

    static void countVowelsAndConsonants(String word,int wordln){
        int vowels=0,consonats=0;
            for(int i=0; i<wordln; i++){
                char ch = word.charAt(i);
                if(ch>='A' && ch<='Z'){
                    ch = (char)(ch+32);//converted to lower
                }
                if(ch>='a' && ch<='z')
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch =='u'){
                    vowels++;
                }else{
                    consonats++;
                }

            }
        System.out.println("The number of vowels is " + vowels);
        System.out.println("The number of consonants is " + consonats);
    }

}





