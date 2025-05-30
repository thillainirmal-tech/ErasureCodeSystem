# ErasureCodeSystem

A project implementing erasure coding techniques for data reliability and fault tolerance. This system demonstrates how data can be split, encoded, and reconstructed using erasure codes, possibly including techniques like Reed-Solomon codes.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Technology Stack](#technology-stack)
- [Project Structure](#project-structure)
- [Installation](#installation)
- [Usage](#usage)
- [Screenshots](#screenshots)
- [Database Setup](#database-setup)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## Introduction

Erasure coding is a method of data protection in which data is broken into fragments, expanded and encoded with redundant data pieces and stored across a set of different locations or storage media. This project provides a basic system to demonstrate how erasure coding can be implemented and used in real-world applications.

## Features

- Encode and decode data blocks using erasure coding.
- Basic web interface to interact with the system.
- Database integration to store metadata.
- Support for file upload and recovery.
- Simple user interface built with HTML/CSS/JavaScript.

## Technology Stack

- **Frontend**: HTML, CSS, JavaScript
- **Backend**: Java, PHP
- **Database**: MySQL
- **IDE**: NetBeans
- **Build Tools**: Apache Ant (NetBeans default), custom `.jar` packages

## Project Structure

```
ErasureCodeSystem/
├── src/                # Source code (Java)
├── lib/                # External libraries
├── web/                # Web files (HTML, PHP, JS)
├── build/web/          # Compiled web output
├── dist/               # Distribution files
├── nbproject/          # NetBeans project config
├── cos.jar             # Java archive with core logic
├── db.sql              # SQL script for DB setup
└── README.md
```

## Installation

1. **Clone the repository**  
```bash
git clone https://github.com/thillainirmal-tech/ErasureCodeSystem.git
```

2. **Import into NetBeans**  
   Open NetBeans > File > Open Project > Select the cloned folder.

3. **Set up the database**  
   - Create a MySQL database.
   - Import the `db.sql` file to create the necessary tables.

4. **Build and Run**  
   Use NetBeans to build and run the project. Make sure your local web server (e.g., XAMPP, WAMP) is running if PHP is used.

## Usage

- Open the web UI in your browser.
- Upload files or input data for encoding.
- Simulate data loss and attempt to recover using decoding functions.
- View logs and results.

## Screenshots

_Add screenshots of the application interface here._

## Database Setup

Run the following in your MySQL interface:

```sql
SOURCE path/to/db.sql;
```

Make sure the PHP backend connects using the correct DB credentials. Update them in the appropriate PHP config files.

## Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository.
2. Create a new branch.
3. Commit your changes.
4. Push to your fork.
5. Submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).

## Contact

K. Thillai Nirmal  
Email: shanmugakannan7549@gmail.com  
GitHub: [thillainirmal-tech](https://github.com/thillainirmal-tech)

