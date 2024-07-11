# WP0724


A demo app using console I/O to simulate a sales tool used by a company renting out large tools.
Named app the HART- Hardware Asset Rental Tool - because if you name things, you care about them more.

## Tools
Tools have
- Tool Code (CHNM - Chainsaw, Milwaukee)
- Tool Type (Ladder, Chainsaw, Jackhammer)
- Brand (Ridgid, Milwaukee, etc.)
- Daily Rental Cost
- A "Weekday" cost, different from daily charges?
- A "Holiday" cost, different from daily charges.
- A "Weekend" cost, different from daily charges

## Holidays
There are only two holidays in this scenario:
- Independence Day, July 4th - If falls on weekend, it is observed on the closest weekday (if Sat,
then Friday before, if Sunday, then Monday after)
- Labor Day - First Monday in September


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


|               | Test 1 | Test 2 | Test 3 | Test 4 | Test 5 | Test 6 |
| ------------- | ------ | ------ | ------ | ------ | ------ | ------ |
| Tool Code     | JAKR   | LADW   | CHNS   | JAKD   | JAKR   | JAKR   |
| Checkout Date | 9/3/15 | 7/2/20 | 7/2/15 | 9/3/15 | 7/2/15 | 7/2/20 |
| Rental Days   | 5      | 3      | 5      | 6      | 9      | 4      |
| Discount      | 101%   | 10%    | 25%    | 0%     | 0%     | 50%    |

