# Academic Military Management System

## Overview

The **Academic Military Management System** facilitates the management of academic and military-related activities within military educational institutions. This system is built for students, professors, administrators, and maintenance staff, providing a comprehensive platform to manage schedules, internships, personal information, and equipment.

## Features

- **Student Access:**
  - View academic schedules.
  - Browse a list of available internships for military training.
    ![AM3](https://github.com/user-attachments/assets/9ca7127a-6665-4077-bdea-20f672d85f2d)

  
- **Professor Information Management:**
  - Retrieve professor details, including name, rank, experience, gender, and salary.
    ![AM2](https://github.com/user-attachments/assets/fcbdad83-f24e-4a1f-a43c-10c240010e8d)


- **Maintenance Operations:**
  - Perform CRUD (Create, Read, Update, Delete) operations on equipment managed by maintenance staff.
    ![AM4](https://github.com/user-attachments/assets/751b2403-41ab-4550-b1ad-fb95fb75ae7f)


- **Supervisor Access:**
  - View a list of internships supervised by them, including relevant student details.

- **Student Classification:**
  - Classify students based on their high school averages.
  - Allocate students to classes and generate corresponding schedules.

- **User-Friendly Interface:**
  - Simple and intuitive UI, featuring media content like videos to showcase life at the military school.
  
- **Secure Login System:**
  - Supports multiple user roles: Students, Professors, Supervisors, and Maintenance Staff.
    ![AM1](https://github.com/user-attachments/assets/001832f2-1ea7-42f7-a236-bca3e430a154)


- **Database Management:**
  - Powered by **MySQL** for efficient data storage and retrieval.
  - SQL scripts are provided for quick database setup.

## Technologies Used

- **Java**
- **JavaFX** for creating a rich user interface.
- **MySQL** for database management and queries.

## Installation Guide

### Prerequisites

- Java Development Kit (JDK) 17 or higher
- MySQL (v5.7 or higher)
- IDE (e.g., IntelliJ, Eclipse, or NetBeans)

### Installation Steps

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/yourusername/academic-military-management-system.git
   ```

2. **Navigate to the Project Directory:**
   ```bash
   cd academic-military-management-system
   ```

3. **Database Setup:**
   - Ensure MySQL is installed and running.
   

4. **Run the Application:**
   - Open the project in your preferred Java IDE.
   - Build and run the application.

## User Roles

Different roles include:
- **Students:** Can view personal schedules and available internships.
- **Professors:** Can access personal information and salary details.
- **Supervisors:** Can manage assigned internships and view associated students.
- **Maintenance Staff:** Can manage equipment through CRUD operations.

## CRUD Operations

The system allows for CRUD operations across various modules:
- **Students:** Add, update, delete, and view student information.
- **Professors:** Manage professor details including salary and rank.
- **Internships:** Assign and manage student internships.
- **Equipment:** Maintenance staff can manage equipment records.

## Interface Design

The system uses JavaFX for an intuitive and easy-to-navigate interface, featuring:
- Dynamic scheduling views for students.
  ![AM5](https://github.com/user-attachments/assets/d65fe8e0-fc0e-4ab2-99cf-425a0c2d93bc)

- Real-time CRUD interfaces for professors and maintenance staff.
  
- Admin dashboard to manage student classifications and schedules.
  ![AM6](https://github.com/user-attachments/assets/edbd4333-e0a2-40f0-a144-72713cdc186c)


## Media & Visuals

Videos and other media content are integrated to provide users with an immersive experience of life at the military academy. The design focuses on a military aesthetic with clean, functional layouts.
