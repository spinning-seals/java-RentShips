Project Design Philosophy: Why Map and Two Singletons?

This project uses a modular, scalable, and object-oriented design. Not only did I try to follow Java principles, but I was also inspired by the logical structure of a well-run starship fleet.


WHY USE Map<String, Ship> INSTEAD OF List<Ship??
Each ship in the fleet is uniquely identified by an ID (e.g., XW-002, MF-001). Using a Map offers:

O(1) direct access by ID

Natural prevention of duplicates

Behaviour closer to how real-world databases use primary keys

Easier future implementation of removal, filtering, or updates

A List is great for ordered collections, but a Map is the right choice when ID-based retrieval and uniqueness matter.


WHY USE SINGLETONS?
1. Both classes manage shared global state:
2. The ShipFleetManager keeps the fleet in memory
3. The ShipIdGenerator tracks counters across the application
4. Centralized control
5. No accidental duplication
6. Easy access without passing objects everywhere



WHY USE TWO SINGLETONS?
1. ShipFleetManager –> Fleet Commander
Responsible for adding, storing, and listing ships. There's only one fleet, and it needs one central manager.
2. ShipIdGenerator – Identifier Master   
3. Generates unique IDs per ship type (XW, YW, etc.) using internal counters. By separating this logic:
4. You avoid cluttering the fleet manager with formatting logic
5. You gain reusability and testability
6. You enable flexible ID logic in the future (e.g., date-based IDs, pilot-coded IDs)
