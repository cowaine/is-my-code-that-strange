package com.cowaine.corock.mission.game;

/**
 * A Config class is an enum that contains the configurations necessary for game use.
 */
public enum Config implements Displayable {
    USER_ID("0"), SERVER_HOST("127.0.0.1"), PORT("8889");

    private final String value;

    Config(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
