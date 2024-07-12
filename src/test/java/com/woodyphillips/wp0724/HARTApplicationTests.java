package com.woodyphillips.wp0724;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

@SpringJUnitConfig
@SpringBootTest
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class HARTApplicationTests {

    HARTApplication out; // Object Under Test
    DateFormat dateFormatter;

    @BeforeEach
    void setUp() {
        out = new HARTApplication();
        dateFormatter = new SimpleDateFormat("d/mm/yyyy");
    }

    @Nested
    class RequiredTests {
        @Test
        void Test1_Discount_is_out_of_bounds_With_JAKR() {

            // Given
            Date test_1_date = null;
            Date test_1_checkin_date = null;
            try {
                test_1_date = dateFormatter.parse("09/03/2015");
                test_1_checkin_date = dateFormatter.parse("09/08/2015");
            } catch (ParseException e) {
                fail("Test failed with parse exception, correct the date format being called into Test1");
            }

            // When
            RentalAgreement actual = out.createRental("JAKR", test_1_date, 5, 101);

            // Then
            assertThat(actual).isNotNull();
            assertThat(actual.getToolCode()).isEqualTo("JAKR");
            assertThat(actual.getCheckoutDate()).isEqualTo(test_1_date);
            // test_1_date + 5 rental days == test_1_checkin_date
            assertThat(actual.getCheckInDate()).isEqualTo(test_1_date.compareTo(test_1_checkin_date));
        }

        @Test
        void Test2_Tenth_discount_includes_holiday_July_4_on_Saturday_two_regular_days_With_LADW() {

        }

        @Test
        void Test3_Quarter_discount_holiday_is_on_Sunday_5_days_With_CHNS() {

        }

        @Test
        void Test4_No_discount_6_Rental_days_over_Labor_Day_With_JAKD() {

        }

        @Test
        void Test5_No_discount_9_Days_With_JAKR() {

        }

        @Test
        void Test6_Half_discount_includes_holiday_July_4_on_Saturday_two_Regular_days_With_JAKR() {

        }
    }

    @Nested
    class AdditionalTests {
        @Test
        void Input_working() {
            if (!out.receivedInput("Something")) {
                fail(String.format("%s did not receive input.", out.getClass()));
            }

            if (out.receivedInput("")) {
                fail(String.format("%s did receive input when it should not have.", out.getClass()));
            }

            if (out.receivedInput(null)) {
                fail(String.format("%s did receive input when it should not have.", out.getClass()));
            }
        }
    }
}
