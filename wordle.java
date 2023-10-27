import java.util.Scanner;
public class wordle {
        public static void main(String[] args){
             //Sets background of letter to green
    final String BG_GREEN = "\u001b[42m";
    //Sets background of letter to Yellow
    final String BG_YELLOW = "\u001b[43m";
    //Sets background of letter to black and white (incorrect guess)...
    final String RESET = "\u001b[0m";
        Scanner scan = new Scanner(System.in);
    System.out.println("We are going to play Wordle!");
    String Correct = "SHAKE";
    String Guess;
    System.out.println("Make a guess:");
    Guess = scan.nextLine();
    
                    for(int i = 0; i<=5; i++){
                    if(Guess.substring(i,i+1).equals(Correct.substring(i,i+1))){
                        //Letter Matches
                        System.out.print(BG_GREEN + Guess.substring(i,i+1) + RESET);
                    }
                    else if(Guess.indexOf(Correct.substring(i,i+1))>-1){
                        //letter in word just diff location
                        System.out.print(BG_YELLOW + Guess.substring(i,i+1) + RESET);
                    }
                    else
                    {
                        System.out.print(Guess.substring(i,i+1));

                    }         
                    }
   
}
}

    
