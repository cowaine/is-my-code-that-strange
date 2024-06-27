package com.cowaine.corock.chapter06.game;

@Deprecated(forRemoval = true)
public class MagicManager {

    @Deprecated(forRemoval = true)
    public String getName(MagicType magicType) {
        String name = "";

        switch (magicType) {
            case FIRE:
                name = "파이어";
                break;
            case LIGHTNING:
                name = "라이트닝";
                break;
            case HELL_FIRE:
                name = "헬파이어";
                break;
        }

        return name;
    }

    /**
     * @author 개발 1팀
     */
    @Deprecated(forRemoval = true)
    public int costMagicPoint(MagicType magicType, Member member) {
        int magicPoint = 0;

        switch (magicType) {
            case FIRE:
                magicPoint = 2;
                break;
            case LIGHTNING:
                magicPoint = 5 + (int) (member.getLevel() * 0.2);
                break;
            case HELL_FIRE:
                magicPoint = 16;
                break;
        }

        return magicPoint;
    }

    /**
     * @author 개발 2팀
     */
    @Deprecated(forRemoval = true)
    public int costTechnicalPoint(MagicType magicType, Member member) {
        int technicalPoint = 0;

        switch (magicType) {
            case FIRE:
                technicalPoint = 0;
                break;
            case LIGHTNING:
                technicalPoint = 5;
                break;
        }

        return technicalPoint;
    }

}
