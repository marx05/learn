package main.webapp.exercises;

/**
 * Finished in 13mins (Score : 100%, correctness + performance)
 */
public class FrogJump {

    public static int doFrogJump(int start, int destination, int jumpDist) {

        int jumpCount = 0;
        int distance = destination - start;

        jumpCount = (distance/jumpDist);
        if (distance%jumpDist > 0) {
            jumpCount++;
        }

        return jumpCount;
    }

}
