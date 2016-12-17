import javax.swing.JOptionPane;

public class NumbersGame
{
    public static void main(String args[])
    {
        String betType, input, BetType;
        int amount, playerNum, winningNum;
        betType = JOptionPane.showInputDialog("What is your bet type?");
        
        input = JOptionPane.showInputDialog("What is yout bet amount?");
        amount = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("What is your player number?");
        playerNum = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("What is the winning number?");
        winningNum = Integer.parseInt(input);
              
        NumbersClass newGame = new NumbersClass(betType, amount, playerNum, winningNum);
        newGame.winningNumbers();
        
        System.out.println(newGame.output());
        System.out.println("Your total winnings are:    $" + newGame.winnings());
        System.out.print(newGame.extraCredit());        //extra credit
        System.out.println();
    }
}