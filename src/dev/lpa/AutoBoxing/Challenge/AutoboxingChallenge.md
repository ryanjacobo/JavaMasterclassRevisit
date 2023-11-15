## Challenge
Create a simple banking application, with a Customer and Bank type.

The ***Customer*** will have a name, and an ***ArrayList*** of transactions containing ***Double*** wrapper elements.
* A customer's transaction can be a credit, which means a positive amount, or it can be a debit, a negative amount.

The **Bank** will have a name, and an **ArrayList** of customers.
* The bank should **add a new customer**, if they're not yet already in the list.
* The bank class should allow a customer to **add a transaction**, to an existing Customer.
* This class should also **print a statement**, that includes the customer name, and the transaction amounts. This method should use unboxing.
