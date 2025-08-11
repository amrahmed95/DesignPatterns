High-level modules should not depend on low-level modules.
Instead, high-level modules should depend on abstractions provided by low-level modules.

i.e. High-level modules should not depend on the implementation details of low-level modules.
Both high-level and low-level modules should depend on abstractions.


Example:
-----------
High-level: Notification Servicce
Low-level: Email, SMS

Notification service should not depend on email or SMS implementation details.
If whatsappMsg is added, then Notification Service needs to be modified.