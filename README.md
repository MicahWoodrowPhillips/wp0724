# WP0724


A demo app using console I/O to simulate a sales tool used by a company renting out large tools.

## Tools
Tools have
- Tool Code (CHNM - Chainsaw, Milwaukee)
- Tool Type (Ladder, Chainsaw, Jackhammer)
- Brand (Ridgid, Milwaukee, etc.)
- Daily Rental Cost
- A "Weekday" cost, different from daily charges?
- A "Holiday" cost, different from daily charges.
- A "Weekend" cost, different from daily charges

## Checkout
The sale transaction (Checkout) requires
- Tool Code
- Rental Day Count
- Discount Percent (int)
- Checkout Date

## Errors
Error messages are sent if
	- trying to rent < 1 day
	- Discount percent is not in the range of 0-100

A Rental Agreement is generated with the following values:
- Tool Code
- Tool Type
- Tool Brand
- Rental Days
- Checkout Date
- Due Date
- Daily Rental Charge
- Charge Days
- Pre-discount charge
- Discount percent
- Discount amount
- Final Charges

### Sample Rental Agreement output:

Tool code: LADW
Tool type: Ladder
Tool brand: Ridgid
Final charge: $9.99
... etc.
with formatting as follows:
● Date mm/dd/yy
● Currency $9,999.99
● Percent 99%

## Tests
Your code must include JUnits to prove your solution is correct.
The proof should include the following scenarios:

Test 1 Test 2 Test 3 Test 4 Test 5 Test 6
Tool code JAKR LADW CHNS JAKD JAKR JAKR
Checkout date 9/3/15 7/2/20 7/2/15 9/3/15 7/2/15 7/2/20
Rental days 5 3 5 6 9 4
Discount 101% 10% 25% 0% 0% 50%
