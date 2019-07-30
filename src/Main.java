import java.io.FileNotFoundException;

public class Main {
    public static void main(String [] args)throws FileNotFoundException {
        int guessesNum=0;
        char [] wrongLetters={' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};
      Generator generator=new Generator();

      generator.process1();
        Player player =new Player(generator);

        System.out.println("Welcome to Guess the movie Game !");
        System.out.println("You have only 10 chances in Guessing wrong letters");
        System.out.println("Note that ' consider a letter too ");
        System.out.println("Take Care !");
        System.out.println("........STARTING");
        System.out.print("You are Guessing : ");
        player.showHidden();
        System.out.println("");
        System.out.println("You have guessed (0) wrong letters");

        while (guessesNum != 10 && player.hiddenProcess()!=true){

            System.out.print("Guess a letter : ");
            if(player.process2() == false){
                wrongLetters[guessesNum]=player.inp();
                guessesNum++;
            }
            System.out.print("You are Guessing : ");
            player.showHidden();
            System.out.println("");
            System.out.print("You have guessed ("+guessesNum+")wrong letters : ");
            for (int i=0;i<guessesNum;i++) System.out.print(wrongLetters[i]+"  ");
            System.out.println("");
        }

         if(player.hiddenProcess()==false)
             System.out.println("You lost ! ... try again after watching some shit");
         else
             System.out.println("You win ! ... STOP wasting you fucking life on movies");

    }
}
