Main Structure

Data Structures (10% Daniel, 90% Jason)
Shopping Cart: Uses ArrayLists for storing items, quantities, categories, item numbers, and prices.
Purchase History: Similar ArrayLists for tracking past purchases, quantities, prices, and total prices.
Product Categories: Separate ArrayLists for each category (sports, clothing, books) to manage product names, availability, and prices.

Main Menu: (Daniel)
Admin: Requires a password to access. If correct, it allows viewing and updating the shipment status of orders. (Daniel)
Shop: Enters shopping mode where users can browse and add items to their cart. (Jason)
Exit: Terminates the program. (Jason)

Admin Mode: (Daniel [mistakes fixing: Jason] )
Checks for the correct admin password ("Hello World").
Displays purchase history if any exists, allowing the admin to mark orders for shipping and specify shipping costs.


Shopping Mode: (Jason)
Category Selection: Users can choose from Sports, Clothing, Books, or go to the cart.
Sports: Lists sports products with their availability and prices.
Clothing: Similar to sports but for clothing items.
Books: Lists books in the same format.

Adding to Cart (Jason)
Users select an item and specify quantity. If available, the item is added to the cart, reducing stock.

Cart Management (Jason)
Displays items in the cart with their total price.
Options:
Checkout: Adds items to purchase history, clears the cart, and resets inventory for those items.
Update Cart: Allows removing items or reducing quantities, updating the product's availability accordingly.
Exit: Returns to category selection.

Key Functionalities: (Jason)
Inventory Management: Stock levels are tracked and updated in real-time as items are added or removed from the cart.
Transaction History: Records all purchases with details like items, quantities, and total price.
Admin Controls: Admin can view purchase history and manage shipping status.
