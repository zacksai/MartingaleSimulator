/**
 * class to simulate the martingale strategy
 *
 * @author zacksai
 * @version 1.0
 */
public class Martingale {

    // Properties:
    int initialBet = 10;
    int currentBet = initialBet;
    int balance = 100;
    int target = balance * 2;
    int stepCount = 0;

    // Behaviors:

    /**
     * driver method accepts user input and runs so many trials
     * @param args standard main param
     */
    public static void main(String[] args) {
        // @todo prompt user for input and run trials
    }


    /**
     * run trial keeps track of information from step function
     */
    public void runTrial(){
        // @todo run the step method until # of steps has been met
        // return some information

    }


    /**
     * step method runs a single bet
     */
    public void step(){

        // Base case:
        if (balance <= 0 || balance >= target ) return;

        // Create win/loss variable between 0-1
        double winState = Math.random();

        // If loss, decrement balance and reset current bet to initial
        if (winState <= 0.5){
            balance-=initialBet;
            currentBet = initialBet;
        } else {
            // If win, martingale. Strategy: If current bet exceeds balance, update balance
            if (currentBet >= balance) balance += currentBet;
            currentBet*=2;
        }

        // Increment step count and recurse
        stepCount++;

        step();

    }

    /**
     * method to calculate the new bet
     * implements modified martingale strategy
     * this is the method where you can change your betting strategy
     */
    public void martingale(){

    }

}
