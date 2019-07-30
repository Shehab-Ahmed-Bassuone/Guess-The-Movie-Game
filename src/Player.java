import java.util.Scanner;
import java.io.File;
public class Player {
  private String realName;
  public char [] hiddenName;  // switch to private
  private char input;
  private char [] wrongLetters;

  Player(Generator generator){
      realName=generator.realNameChose();
      hiddenName=generator.hiddenNameChose();
      wrongLetters=new char[10];
  }

  private char input(){
      Scanner scanner =new Scanner(System.in);
      char temp=scanner.next().charAt(0);
      input=temp;
      return temp;
  }

  public boolean process2(){
      char temp=input();
      boolean flag=false;
      for(int i=0 ;i<realName.length();i++){
          if(temp==realName.charAt(i) && hiddenName[i] == '-') {
              flag=true;
              hiddenName[i]=temp;
          }

      }
      return flag;
  }

  public boolean hiddenProcess(){
      boolean flag=true;
      for(int i=0 ; i<realName.length();i++)
          if (hiddenName[i]== '-') flag=false;
      return flag;

  }

  public void showHidden(){
      System.out.print(hiddenName);
  }
  public char inp(){
      return input;
  }
}