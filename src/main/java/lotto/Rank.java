package lotto;

public class Rank {
    private static final int FIRST_MATCH_COUNT = 6;
    private static final int SECOND_MATCH_COUNT = 5;
    private static final int CHECK_MATCH_COUNT = 2;
    private static final int LOTTO_LEVEL_1 = 1;
    private static final int LOTTO_LEVEL_2 = 2;
    private static final int LOTTO_LEVEL_CHECK = 6;
    private static final int LOTTO_LEVEL_OUT = 0;
    public static int of(int matchCount, boolean matchBonus) {
        if (matchCount == FIRST_MATCH_COUNT) {
            return LOTTO_LEVEL_1;
        }
        if (matchCount == SECOND_MATCH_COUNT && matchBonus) {
            return LOTTO_LEVEL_2;
        }
        if (matchCount > CHECK_MATCH_COUNT) {
            return LOTTO_LEVEL_CHECK - matchCount + CHECK_MATCH_COUNT;
        }
        return LOTTO_LEVEL_OUT;
    }
}
