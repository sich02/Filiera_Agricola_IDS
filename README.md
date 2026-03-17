# 🌾 Agricultural Supply Chain Management (Filiera Agricola)

A comprehensive backend system built with **Java** and **Spring Boot** to manage a local, short agricultural supply chain. This platform connects producers, transformers, distributors, event animators, and buyers in a unified, traceable ecosystem.

## 🚀 Overview

The goal of this project is to promote local agriculture, ensure product traceability, and facilitate direct sales and local events. The system implements a robust role-based architecture where each user plays a specific part in the supply chain lifecycle, from raw material harvesting to the final consumer purchase.

## 👥 User Roles & Features

The platform supports a variety of distinct roles, each with specific authorizations and capabilities:

* **🌱 Producer (Produttore):**
    * Registers and publishes raw agricultural products (e.g., wheat, fruits).
    * Manages inventory and fulfills incoming orders.
* **🏭 Transformer (Trasformatore):**
    * Creates transformation methods (recipes).
    * Consumes raw materials from the system to create new finished products (e.g., turning fruit into jam).
* **📦 Distributor (Distributore):**
    * Creates curated packages/bundles grouping different approved products.
* **🎪 Animator (Animatore):**
    * Organizes local events, fairs, and tastings.
    * Invites sellers to participate and manages buyer bookings.
* **🛒 Buyer (Acquirente):**
    * Browses the public catalog and traces the history of products.
    * Manages the shopping cart and places orders.
    * Books tickets for local events.
* **🛡️ Curator (Curatore):**
    * Acts as the platform moderator.
    * Approves or rejects new products, transformation methods, and events before they become publicly visible.

## 🛠️ Tech Stack

* **Language:** Java
* **Framework:** Spring Boot (Web, Data JPA)
* **Database:** Relational Database (via Hibernate/JPA)
* **Build Tool:** Maven
* **Architecture:** RESTful API, MVC Pattern, Service Layer Pattern

## ⚙️ Getting Started

### Prerequisites
* Java Development Kit (JDK) 17 or higher
* Maven installed

### Installation & Running
1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/yourusername/filiera_agricola_ids.git](https://github.com/yourusername/filiera_agricola_ids.git)
    cd filiera_agricola_ids
    ```

2.  **Build the project:**
    ```bash
    mvn clean install
    ```

3.  **Run the application:**
    ```bash
    mvn spring-boot:run
    ```
    The server will start on `http://localhost:8080`.

## 🌐 API Endpoints Overview

The application exposes several REST endpoints grouped by role. Here are some of the main modules:

* `/api/auth/**`: Registration and login for all user types.
* `/api/public/**`: Publicly accessible endpoints to browse the catalog, view events, and check product traceability.
* `/api/produttore/**`: Endpoints for raw product management.
* `/api/trasformatore/**`: Endpoints to handle transformations and product consumption.
* `/api/acquirente/**`: Cart, orders, and event booking management.
* `/api/curatore/**`: Content moderation (approve/reject).

*(For detailed API testing, a Postman collection can be created using the DTOs and JSON payloads provided in the source code).*

## 🗺️ Traceability & OSM Integration
The system includes features to track the entire lifecycle of a transformed product back to its raw materials. It also provides endpoints to expose farm coordinates to be visualized on an OpenStreetMap (OSM) integration.

---
*Developed as an academic project for the Software Engineering (Ingegneria del Software) course.*
