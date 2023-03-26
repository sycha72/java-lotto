package lotto;

public class LottoGame {
    
    public  int match(
            final Lotto userLotto,
            final WinningLotto winningLotto
    ) {
        return winningLotto.match(userLotto);
    }
}
