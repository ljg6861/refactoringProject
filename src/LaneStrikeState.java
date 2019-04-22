import java.util.HashMap;

public class LaneStrikeState extends LaneState {
    private int[] curScores;
    private int[][] cumulScores;
    private int bowlIndex;
    private HashMap scores;
    private int ball;

    public LaneStrikeState(Lane lane) {
        super(lane);
    }
}