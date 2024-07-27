package com.cowaine.sunset0.mission.bank.account;

public enum Currency {

    /**
     * YEN 통화는 아직 지원하지 않음
     */
    WON(true), DOLLAR(true), YEN(false);


    private final boolean supported;

    Currency(final boolean supported) {
        this.supported = supported;
    }

    // 지원하는 통화인지 확인하는 책임 이동
    boolean isSupported() {
        return supported;
    }

}
