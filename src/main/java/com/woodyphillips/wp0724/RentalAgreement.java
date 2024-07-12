package com.woodyphillips.wp0724;

import lombok.AllArgsConstructor;
import lombok.Builder;

import java.util.Date;

@Builder
@AllArgsConstructor
public class RentalAgreement {
    private Tool tool;
    private int daysRenting;
    private int discountPercent;
    private Date checkoutDate;

    public RentalAgreement(Tool tool, Date date, int rentalDays, int discountPercent) {
    }


    public String getToolCode() {
        return tool.getToolCode();
    }

    public boolean getCheckoutDate() {

        return false;
    }

    public boolean getCheckInDate() {
        return false;
    }
}
