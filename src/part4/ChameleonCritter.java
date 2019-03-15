
/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 * @author Cay Horstmann
 */

// package part4;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
// import javafx.scene.paint.Color;
import java.awt.Color;

import java.util.ArrayList;

/**
 * A <code>ChameleonCritter</code> takes on the color of neighboring actors as
 * it moves through the grid. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class ChameleonCritter extends Critter {
	// private int dark;
	/**
	 * Randomly selects a neighbor and changes this critter's color to be the
	 * same as that neighbor's. If there are no neighbors, no action is taken.
	 */
	public void processActors(ArrayList<Actor> actors) {
		int n = actors.size();
		if (n == 0){
			super.setColor(darken(5));

			return;
		}
		int r = (int) (Math.random() * n);

		Actor other = actors.get(r);
		setColor(other.getColor());
	}

	/**
	 * Turns towards the new location as it moves.
	 */
	public void makeMove(Location loc) {
		setDirection(getLocation().getDirectionToward(loc));
		super.makeMove(loc);
	}

	public Color darken(int dark){
		Color color = getColor();
		int red = (int) (color.getRed() - (1 * dark));
		int blue = (int) (color.getBlue() - (1 * dark));
		int green = (int) (color.getGreen() - (1 * dark));
		if(red == 25){
			red = 250;
			blue = 250;
			green = 250;
		}
		Color col = new Color(red, green, blue, 100);
		return col;
	}
}
