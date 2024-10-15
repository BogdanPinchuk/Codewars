package org.tasks;

import java.util.ArrayList;

public class Metro {
    public static int countPassengers(ArrayList<int[]> stops) {
        if (stops == null || stops.isEmpty()) {
            return 0;
        }

        int people = 0;

        for (int[] couple : stops) {
            people += couple[0] - couple[1];

            if (people < 0) {
                people = 0;
            }
        }

        return people;
    }
}
