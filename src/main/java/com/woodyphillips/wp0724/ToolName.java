package com.woodyphillips.wp0724;
import java.util.Map;
import java.util.HashMap;


public enum ToolName {

    JAK ("Jackhammer"),
    CHN ("Chainsaw"),
    LAD ("Ladder");

    private static final Map<String, ToolName> map = new HashMap<>();
    private final String fullName;

    ToolName(String fullName){
        this.fullName = fullName;
    };

    public static ToolName fromString(String s) {
        return map.getOrDefault(s, null);
    }
}
