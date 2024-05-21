/*Rock Paper Scissors

Let's play! You have to return which player won! In case of a draw return Draw!. */

#include <stdio.h>

enum tool {ROCK, PAPER, SCISSORS};
enum outcome {P1_WON, P2_WON, DRAW};

enum outcome rps(enum tool p1, enum tool p2){

  int combination = p1 * 3 + p2;

  switch(combination){
    //Conditions for p1 victory
    case 0 * 3 + 2:
    case 1 * 3 + 0:
    case 2 * 3 + 1:
      return P1_WON;

    //Conditions for p2 victory
    case 0 * 3 + 1:
    case 1 * 3 + 2:
    case 2 * 3 + 0:
      return P2_WON;
    
    //Everything else is draw
    default:
      return DRAW;
  }
}

