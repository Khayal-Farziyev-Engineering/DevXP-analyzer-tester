"""
Unit tests for the DevXP Analyzer Python utilities.
"""

import pytest


def add(a: int, b: int) -> int:
    return a + b


def greet(name: str) -> str:
    return f"Hello from DevXP Analyzer: {name}"


class TestAdd:
    def test_positive_numbers(self):
        assert add(2, 3) == 5

    def test_zero(self):
        assert add(0, 0) == 0

    def test_negative(self):
        assert add(-1, -2) == -3

    def test_mixed(self):
        assert add(10, -4) == 6


class TestGreet:
    def test_greet_name(self):
        assert greet("DevXP") == "Hello from DevXP Analyzer: DevXP"

    def test_greet_empty(self):
        assert greet("") == "Hello from DevXP Analyzer: "


if __name__ == "__main__":
    pytest.main([__file__, "-v"])
