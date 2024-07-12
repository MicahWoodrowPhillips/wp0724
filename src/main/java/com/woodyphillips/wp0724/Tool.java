package com.woodyphillips.wp0724;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
public class Tool {
    private ToolName name;
    private ToolBrand brand;
    private float dailyCost;
    private float weekendModifier;
    private float holidayModifier;

    public String getToolCode() {
        return name.name() + brand.getShortName();
    }

    // Would use the Lombok Builder, but I wasn't sure how to set it up with the way I wanted to pass in the ToolCode
    // determining the type and brand, so I am instead just doing my own.

    private Tool(ToolBuilder builder) {
        this.name = builder.name;
        this.brand = builder.brand;
        this.dailyCost = builder.dailyRentalCost;
        this.weekendModifier = builder.weekendModifier;
        this.holidayModifier = builder.holidayModifier;
    }

    public static class ToolBuilder {
        private ToolName name;
        private ToolBrand brand;
        private float dailyRentalCost;
        private float weekendModifier;
        private float holidayModifier;


        public Tool fromDBLookup(String toolCode) {
            this.setToolName(ToolName.fromString(toolCode.substring(0,2)));
            this.setBrand(ToolBrand.fromString(toolCode.substring(3,4)));
            return this.build();
        }

        public ToolBuilder setToolName(ToolName toolName) {
            this.name = toolName;
            return this;
        }

        public ToolBuilder setBrand(ToolBrand brand) {
            this.brand = brand;
            return this;
        }

        public ToolBuilder setDailyRentalCost(float dailyRentalCost) {
            this.dailyRentalCost = dailyRentalCost;
            return this;
        }

        public ToolBuilder setHolidayCost(float holidayCost) {
            this.holidayModifier = holidayCost;
            return this;
        }

        public ToolBuilder setWeekendCost(float weekendCost) {
            this.weekendModifier = weekendCost;
            return this;
        }

        public Tool build() {
            return new Tool(this);
        }
    }



}
