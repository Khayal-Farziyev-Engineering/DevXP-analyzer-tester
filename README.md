# DevXP-analyzer-tester

A multi-language developer experience analyzer and tester project that demonstrates code quality, security scanning, and testing patterns across Java, C++, Python, and JavaScript/TypeScript stacks.

## Project Structure

```
DevXP-analyzer-tester/
├── src/
│   ├── main/java/com/devxp/analyzer/   # Java source files
│   ├── cpp/                             # C++ source files
│   ├── frontend/                        # Frontend (HTML/CSS/JS)
│   └── security/                        # Security configuration & mocks
├── tests/                               # Python unit tests
└── src/test/java/com/devxp/analyzer/   # Java unit tests
```

## Tech Stack

| Layer      | Technology          |
|------------|---------------------|
| Backend    | Java 17, C++17      |
| Frontend   | HTML5, CSS3, Vanilla JS |
| Testing    | JUnit 5, pytest, Jest |
| Security   | Mock Auth / RBAC    |

## Getting Started

### Java
```bash
mvn clean test
```

### C++
```bash
g++ -std=c++17 -o analyzer src/cpp/main.cpp && ./analyzer
```

### Python Tests
```bash
pip install pytest
pytest tests/
```

### Frontend
```bash
npm install
npm test
```

## Configuration

- **Jest** – `jest.config.js`
- **pytest** – `pytest.ini`
- **CI/CD** – `.github/workflows/`

## Security

Mock security files are located in `src/security/mock/`. They provide a starting point for RBAC and authentication configuration but are **not** suitable for production use without further hardening.

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/my-feature`)
3. Commit your changes (`git commit -m 'Add my feature'`)
4. Push to the branch (`git push origin feature/my-feature`)
5. Open a Pull Request

## License

MIT
