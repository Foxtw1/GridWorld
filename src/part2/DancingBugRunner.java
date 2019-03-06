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

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

/**
 * This class runs a world that contains box bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class DancingBugRunner {
	
	public static void main(String[] args) {
        ActorWorld world = new ActorWorld();
        int[] a = {2, 3, 2, 21, 4, 5, 43, 3, 423, 43, 7, 1, 8, 94, 23, 6, 5, 3};
		DancingBug alice = new DancingBug(5, a);
		alice.setColor(Color.ORANGE);
		world.add(new Location(9, 0), alice);
		world.show();
	}
}