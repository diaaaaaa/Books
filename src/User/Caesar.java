package User;

public class Caesar {



    public static char caesarChar(char mychar,int caesarkey)
    {
        int charval ;
        if ( mychar>= 'A' &&  mychar<= 'Z')
            charval = (( (int) mychar + caesarkey - 65 ) % 26 ) + 65  ;
        else if ( mychar>= 'a' &&  mychar<= 'z')
            charval = (( (int) mychar + caesarkey -97) % 26 ) + 97  ;
        else
            charval = (int) mychar;

        char newchar = (char) charval;

        return newchar;
    }

    public static String caesartext(String text,int caesarkey)
    {
        String TextShifted="";
        for(int index = 0 ; index < text.length(); index++)
        {
            TextShifted += caesarChar(text.charAt(index),caesarkey);
        }
        return TextShifted;
    }


    public static  char reservcaesarChar(char mychar,int caesarkey)
    {
        int charval ;
        if (  mychar >= 'A' &&  mychar <= 'Z' ){
            charval = (int) mychar - caesarkey -65;
            if (charval < 0) charval = 26+charval;
            charval = charval+65;
        }
        else if (mychar  >= 'a' &&  mychar <= 'z') {
            charval = (int) mychar - caesarkey - 97;
            if (charval < 0) charval = 26 + charval;
            charval = charval + 97;
        }
        else
            charval = (int) mychar;

        char newchar = (char) charval;

        return newchar;
    }


    public static  String reservcaesartext(String text,int caesarkey)
    {
        String TextShifted="";
        for(int index = 0 ; index < text.length(); index++)
        {
            TextShifted += caesarChar(text.charAt(index),caesarkey);
        }

        return TextShifted;
    }






}
