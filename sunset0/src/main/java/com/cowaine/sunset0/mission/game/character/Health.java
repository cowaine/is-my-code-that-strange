package com.cowaine.sunset0.mission.game.character;


import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Health {

    private int amount;
    private static final int MIN = 0;

    public Health(int amount) {
        validateAmount(amount);
        this.amount = amount;
    }

    private void validateAmount(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("체력은 0보다 작을 수 없습니다.");
        }
    }


    public Health decline(Health reduction) {
        return new Health(this.amount - reduction.amount);
    }

    public boolean isLeft() {
        return this.amount > 0;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Health;
    }

}
