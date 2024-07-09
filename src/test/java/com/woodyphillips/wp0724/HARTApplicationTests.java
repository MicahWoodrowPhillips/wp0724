package com.woodyphillips.wp0724;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.fail;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class HARTApplicationTests {
    HARTApplication out; // Object Under Test

    @BeforeEach
    void setUp() {
        out = new HARTApplication();
    }

    @Nested
    class RequiredTests {
        @Test
        void Test1_Discount_is_out_of_bounds_With_JAKR() {

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
