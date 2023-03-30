import javax.swing.*;
public class NumberGuessing {
    public static void main(String[] args) {
        int computeNum=(int)(Math.random()*100+1);
        int userAns=0;
        int count=1;
        try {
            while(userAns!=computeNum) 
            {
                String response =JOptionPane.showInputDialog(null,"Enter a guess between 1 and 100");
                userAns =Integer.parseInt(response);
                JOptionPane.showMessageDialog(null, " " + determineGuess(userAns, computeNum, count));
                count++;
            }
        } catch(Exception e){}
    }

    public static String determineGuess(int userAns , int computeNum , int count)
    {
        if (userAns<=0||userAns>100) 
        {
            return "Your guess is invalid";
        } 
        else if (userAns==computeNum) 
        {
            return "Correct! \n Total Guesses : "+count+" "+"\nGuessed Number is:"+computeNum;
        } 
        else if (userAns>computeNum)
        {
            return "Your guess is too high, try again, \n Try Number : "+ count+" ";
        } 
        else if (userAns<computeNum) 
        {
            return "Your guess is too low, try again, \n Try Number :  "+count+" ";
        } 
        else 
        {
            return "Your guess is incorrect \n Try Number : "+count+" ";
        }
    }
}
