package org.tasks;

public class OppositesAttract {
	public static boolean isLove(final int flower1, final int flower2) {
		return flower1 % 2 != flower2 % 2;

		// 1 realization
		// (flower1 + flower2) % 2 != 0;
		// 2 realization
		// flower1 % 2 ==0 ^ flower2 % 2 == 0;
	}
}
