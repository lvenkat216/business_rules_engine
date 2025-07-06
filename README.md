# business_rules_engine
This is a modular and extensible Java application that automates order processing for a company's products and services. It processes different types of orders (physical products, books, videos, memberships, etc.) based on predefined business rules.

---

## 📦 Features & Business Rules

The application supports the following business rules:

1. If the payment is for a physical product, generates a packing slip for shipping.
2. If the payment is for a book:
   - Generates a duplicate packing slip for the royalty department.
3. If the payment is for a membership, activates that membership.
4. If the payment is for a membership upgrade, apply the upgrade.
5. For both membership and upgrade:
   - Send an email to the owner about the activation/upgrade.
6. If the payment is for the video "Learning to Ski", adds a free "First Aid" video to the packing slip.
7. If the payment is for a *physical product or book, generates a commission payment to the agent.


