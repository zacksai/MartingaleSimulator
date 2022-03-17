 // This is a martingale simulator

the martingale strategy is used in gambling as follows
if you win, double your bet
if you lose, start at your original bet


Let's say you start with $100. You want each bet to exceed no more than 10% of your starting value.

First bet: $10
Let's say you win
Second bet: $20
Let's say you win again
Third bet: $40
and so on until you hit ≥ $100 in profit (your bet goes from 10 to 20 to 40 to 80 to 160), then you start the strategy over

Alternatively, if you lose, it looks like this:
First bet: $10
Let's say you win
Second bet: $20
Let's say you lose
-$20. But only $10 was yours to begin with. So now your total balance is $90, not $100.


What we're trying to discover:
How long does it take to go broke lol

SO
You can implement your own version of the Martingale strategy
You can stop after 2 wins in a row and take home your 10% profit from your 10% risk
You can stop after 5 wins
You can never stop (but you should seek therapy)
so what we /actually/ want to discover is
is there a golden number you can stop at?
Is one number more profitable than any others?
if so, why?

to do so, we wanna simulate as follows:



 *****     SIMULATION     *****



Each bet can be called a 'step'
During each step, you want to do the following:

Update the bet using the result of the previous step
    if W, double bet
    if L, reset bet to initial value

run the bet again recursively

stop recursion when
    1) remaining balance is ≤ 0
    2) balance reaches target
    3) # of steps is too damn high (this is very unlikely statistically but handle it anyways)

increment the number of total steps so far


Now, run the step recursively until the stop condition is met.
All of these together are called a "trial"
A trial tracks the following (TO ANSWER OUR EXPERIMENTAL QUESTION):

    what was the # of steps till we stopped
    why did we stop? did we win or did we go broke


Finally, run a huge # of trials and find out how the strategy performs


Development process:


make it work as above, then implement different strategies and see how they compare