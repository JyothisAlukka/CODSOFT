import java.util.Scanner;
public class numbergame {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int chance =8;
            int finals =0;
            boolean playAgain=true;
            System.out.println("Welcome buddy!");
            System.out.println("Hey buddy you have about "+chance+" chances to win the game");
            while(playAgain){
                int rand=getrandN(1,100);
                boolean guess= false;
                for(int i=0;i<chance;i++){
                    System.out.println("Chance "+(i+1)+" Enter your guess:");
                    int user= sc.nextInt();
                    if(user==rand){
                        guess=true;
                        finals+=1;
                        System.out.println("You Won it.");
                        break;
                    }
                    else if(user>rand){
                        System.out.println("Too high");
                    }
                    else{
                        System.out.println("Too low");
                    }
                }
                if(guess==false){
                    System.out.println("Sorry Buddy. You lost the chances. The number is "+rand);
                }
                System.out.println("Do you want to play Again(y/n)");
                String pa=sc.next();
                playAgain=pa.equalsIgnoreCase("y");
            }
            System.out.println("Thats it Buddy,Hope you enjoyed it");
            System.out.println("Here is your score"+finals);
        }

    }
        public static int getrandN(int min,int max){
            return(int)(Math.random()*(max-min+1)+min);
    }
}
