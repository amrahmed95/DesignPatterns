- Objective
----------------
In **Strategy pattern**, a class behavior or its algorithm can be changed at run time.
We create objects which represent various strategies and a context object whose behavior varies as per its strategy object. The strategy object changes the executing algorithm of the context object.

- Motivation
---------------
Let's consider a simple payment system where users can pay using different methods like credit card, debit card, net banking, Patpal, etc. Without the strategy pattern, you might use ' if-else '
conditions to handle the different payment methods, leading to less maintainable and flexible code.
Besides, it will violate the Open-closed Principle (OCP)

**The strategy pattern helps to decouple the payment logic from the payment method, making the code more maintain**

**With Strategy Pattern, the logic for each payment type is encapsulated in separate strategy classes, and the paymentService (context class) delegates the task of payment processing to one of these strategies at runtime.**