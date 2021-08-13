package lotto.model;

import java.util.function.Function;

public enum MatchType {
	TRUE((bonusMatch) -> bonusMatch.equals(true)),
	FALSE((bonusMatch) -> bonusMatch.equals(false)),
	NONE((bonusMatchOrNotMatch) -> true);

	private final Function<Boolean, Boolean> decision;

	MatchType(Function<Boolean, Boolean> decision) {
		this.decision = decision;
	}

	public boolean isBonusMatch(boolean matchBonus) {
		return decision.apply(matchBonus);
	}

}
