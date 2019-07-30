import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class Generator {
    private int lineNums;
    private String [] moviesNames;
    private String realName;
    private char [] hiddenName;

    Generator()throws FileNotFoundException {
        lineNums=0;
        File file = new File("movies.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            lineNums++;
            scanner.nextLine();
        }
        moviesNames=new String[lineNums];
        hiddenName = new char[lineNums];
        Scanner scanner1 =new Scanner(file);
        for(int i=0 ;i<lineNums;i++) moviesNames[i]=scanner1.nextLine();
    }

    private void random(){
        double temp=Math.random();
        temp=(temp*25)+1;
        int index=(int) temp;
        realName = moviesNames[index-1];
        for(int i=0 ; i<realName.length();i++){
            if(realName.charAt(i)!=' ') hiddenName[i]='-';
            else hiddenName[i]=' ';
        }
    }

    public void process1(){
        random();
    }

    public String realNameChose(){
        return realName;
    }

    public char [] hiddenNameChose(){
        return  hiddenName;
    }
}
