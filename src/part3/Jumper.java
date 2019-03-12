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
 * @author Cay Horstmann
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 */

// package part2;

import info.gridworld.actor.Bug;
import javafx.scene.shape.MoveTo;
import java.util.*;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;


/**
 * A <code>BoxBug</code> traces out a square "box" of a given size. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class Jumper extends Bug {
	
	private int steps;
    private int sideLength;
    private int turnValue;
    



	/**
	 * Constructs a box bug that traces a square of a given side length
	 * 
	 * @param length
	 *            the side length
	 */
	public Jumper(int length) {
		steps = 0;
        sideLength = length;
	}

	/**
	 * Moves to the next location of the square.
	 */
	public void act() {
        ArrayList<Location> occupiedLoc = new ArrayList<Location>();
        occupiedLoc = getNeighbors();

        Location loc1 = new Location(1, 1);
        System.out.println(loc1);


		if (steps < sideLength && canMove()) {
            move();
            steps++;
        }
        else if(!canMove()){
            moveTo(loc1);
        }
        else {
            turn();
            steps = 0;
            turnValue = turnValue + 45;
        }

	}
}
