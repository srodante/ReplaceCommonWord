import java.util.Scanner;

public class ReplaceCommonWord {
    public static void main (String[] args){
        String quote;
        Scanner keybd = new Scanner(System.in);

        do {
            System.out.println("Enter your text or 'q' to quit");
            quote = keybd.nextLine();
            String[] splitQuote = quote.split(" ");
            for (String temp: splitQuote){
                if (temp.equalsIgnoreCase("the")){
                    temp = "BE";
                }
                System.out.print(temp + " ");
            }
            System.out.println();
        } while ((quote.equalsIgnoreCase("q")) == false);
    }
}
