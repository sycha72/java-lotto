package lotto;

import java.util.List;

public class LottoGame {

    public  int match(
            List<LottoNumber> userLotto,
            List<LottoNumber> winningLotto,
            LottoNumber bonusNumber) {
        int matchCount = match(userLotto, winningLotto);
        boolean matchBonus = userLotto.contains(bonusNumber);
        return rank(matchCount, matchBonus);
    }


    private  int match(List<LottoNumber> userLotto, List<LottoNumber> winningLotto) {
        return (int) userLotto.stream().filter(it -> winningLotto.contains(it)).count();
    }

    private  int rank(int matchCount, boolean matchBonus) {
        if (matchCount == 6) {
            return 1;
        }
        if (matchCount == 5 && matchBonus) {
            return 2;
        }
        if (matchCount > 2) {
            return 6 - matchCount + 2;
        }
        return 0;
    }
}
