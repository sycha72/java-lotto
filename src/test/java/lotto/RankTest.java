package lotto;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class RankTest {
    @Test
    void 일등() {
        final int actual = Rank.of(6, false);
        assertThat(actual).isEqualTo(1);
    }
    @Test
    void 이등() {
        final int actual = Rank.of(5, true);
        assertThat(actual).isEqualTo(2);
    }

    @Test
    void 삼등() {
        final int actual = Rank.of(5, true);
        assertThat(actual).isEqualTo(3);
    }

    @Test
    void 사등() {
        final int actual = Rank.of(4, true);
        assertThat(actual).isEqualTo(4);
    }

    @Test
    void 오등() {
        final int actual = Rank.of(3, true);
        assertThat(actual).isEqualTo(5);
    }
}