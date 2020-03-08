package main.webapp.exercises.timecomplexity;

/**
 * Finished in 13mins (Score : 100%, correctness + performance)
 */
public class FrogJump {

    public static int solution(int start, int destination, int jumpDist) {

        int jumpCount;
        int distance = destination - start;

        jumpCount = (distance/jumpDist);
        if (distance%jumpDist > 0) {
            jumpCount++;
        }

        return jumpCount;
    }

}
