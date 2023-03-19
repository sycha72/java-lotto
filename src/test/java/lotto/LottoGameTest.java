package lotto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class LottoGameTest {
    private LottoGame lottoGame;

    @BeforeEach
    void setup() {
        lottoGame = new LottoGame();
    }
    @Test
    void 일등() {
        final var actual = lottoGame.match(
                createLotto(1, 2, 3, 4, 5, 6),
                createLotto(1, 2, 3, 4, 5, 6),
                new LottoNumber(7)
        );
        assertThat(actual).isEqualTo(1);
    }

    private List<LottoNumber> createLotto (final int ... numbers) {
        return Arrays.stream(numbers).mapToObj(LottoNumber::new).collect(Collectors.toList());
    }
    @Test
    void 이등() {
        final var actual = lottoGame.match(
                createLotto(1, 2, 3, 4, 5, 6),
                createLotto(1, 2, 3, 4, 5, 7),
                new LottoNumber(6)
        );
        assertThat(actual).isEqualTo(2);
    }
    @Test
    void 삼등() {
        final var actual = lottoGame.match(
                createLotto(1, 2, 3, 4, 5, 6),
                createLotto(1, 2, 3, 4, 5, 7),
                new LottoNumber(8)
        );
        assertThat(actual).isEqualTo(3);
    }

    @Test
    void 사등() {
        final var actual = lottoGame.match(
                createLotto(1, 2, 3, 4, 5, 6),
                createLotto(1, 2, 3, 4, 9, 7),
                new LottoNumber(8)
        );
        assertThat(actual).isEqualTo(4);
    }

    @Test
    void 오등() {
        final var actual = lottoGame.match(
                createLotto(1, 2, 3, 4, 5, 6),
                createLotto(1, 2, 3, 7, 9, 10),
                new LottoNumber(8)
        );
        assertThat(actual).isEqualTo(5);
    }
}