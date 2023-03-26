package lotto;

import java.util.Objects;

public class LottoNumber {
    private final int value;
    private final int MIN_LOTTO_NUMBER = 1;
    private final int MAX_LOTTO_NUMBER = 45;

    public LottoNumber(final int value) {
        if (value < MIN_LOTTO_NUMBER || value > MAX_LOTTO_NUMBER)
            throw new IllegalArgumentException("로또번호는 1부터 45까지 입니다.");
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LottoNumber that = (LottoNumber) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
