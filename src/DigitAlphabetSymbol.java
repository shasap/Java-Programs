public class DigitAlphabetSymbol {

    public static void main(String[] args) {
        char ch= 'd';

        if (ch>='0' && ch<='9')
        {
            System.out.println(ch+" is number." );
        }
        else if (ch>='a'&& ch<='z'|| ch>='A'&& ch<='Z')
        {
            System.out.println(ch+" is alphabet.");
        }
        else
        {
            System.out.println(ch+" is symbol.");
        }

    }
}

