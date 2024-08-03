package com.cowaine.corock.mission.game.domain.character;

/**
 * A PlayerCharacter a class that derives from GameCharacter.
 */
public abstract class PlayerCharacter extends GameCharacter {
    private final String userId;
    private Stage stage;

    protected PlayerCharacter(String userId, int level, int hp, int power, String name) {
        super(level, hp, power, name);
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    /**
     * The levelUp method increases level of PlayerCharacter.
     */
    public void levelUp() {
        super.setLevel(super.getLevel() + 1);
        super.setHp(Stats.SOLDIER_INIT_HP.getValue() + 50);
        super.setPower(super.getPower() + 10);
    }

    @Override
    public abstract String getMessage();
}
