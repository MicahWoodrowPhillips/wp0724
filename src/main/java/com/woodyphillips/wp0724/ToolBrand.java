package com.woodyphillips.wp0724;

import java.util.HashMap;
import java.util.Map;

public enum ToolBrand {

    Ridgid ("R"),
    Milwaukee ("M"),
    Makita ("A"),
    Werner ("W"),
    DeWalt ("D"),
    Stihl ("S");

    private static final Map<String, ToolBrand> map = new HashMap<>();
    private final String shortName;

    ToolBrand(String shortName) {
        this.shortName = shortName;
    }

    public String getShortName() { return this.shortName;}

    public static ToolBrand fromString(String s) {
        return map.getOrDefault(s, null);
    }
}
