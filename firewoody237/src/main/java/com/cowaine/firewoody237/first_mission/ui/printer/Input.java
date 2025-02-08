package com.cowaine.firewoody237.first_mission.ui.printer;

import com.cowaine.firewoody237.first_mission.ui.data.InputParsedResult;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Input {
    public static InputParsedResult parseInput(String input) {
        // 정규 표현식으로 이름, 통화, 금액을 그룹화하여 추출
        Pattern pattern = Pattern.compile("^(\\S+)\\s+(\\S+)\\s+([\\d,]+)$");
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            String name = matcher.group(1);
            String currency = matcher.group(2);
            // 쉼표를 제거하고 정수로 변환
            int amount = Integer.parseInt(matcher.group(3).replace(",", ""));
            return new InputParsedResult(name, currency, amount);
        } else {
            throw new IllegalArgumentException("Input format is incorrect.");
        }
    }
}
