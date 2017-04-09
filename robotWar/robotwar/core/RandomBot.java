package robotwar.core;

import robotwar.Main;

/**
 * The RandomBot just moves around randomly within the arena and fires at
 * whatever it can see.
 * 
 * @author David J. Pearce
 * 
 */
public class RandomBot extends Robot {
	public RandomBot(String name, int xPosition, int yPosition, int strength) {
		super(name,xPosition,yPosition,strength);
	}
	
	/**
	 * Move the robot in a random direction. If another robot is sighted then it
	 * is attacked immediately.
	 */
	@Override
	public void takeTurn(Battle battle) {		

		common(battle,0);
		// Now, make a random move
		int dx = Main.randomInteger(3) - 1;
		int dy = Main.randomInteger(3) - 1;
		int newXPos = getxPosition() + dx;
		int newYPos = getyPosition() + dy;

		// Try to move, whilst watching out for the arena wall!
		if(newXPos >= 0 && newXPos < battle.arenaWidth) {
			if(newYPos >= 0 && newYPos < battle.arenaHeight) {
				battle.log("Robot " + name + " moves to " + getxPosition() + ", " + getyPosition());
			} else {
				battle.log("Robot " + name + " bumps into arena wall!");
			}
		} else {
			battle.log("Robot " + name + " bumps into arena wall!");
		}

		if(newXPos< 1 || newXPos>battle.arenaWidth-1 || newYPos<1 || newYPos > battle.arenaHeight-1){
			return;
		}else{
			battle.actions.add(new Move(newXPos,newYPos,this));
		}



	}
}
