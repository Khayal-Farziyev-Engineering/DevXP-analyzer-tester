#include <iostream>
#include <string>
#include <vector>
#include <numeric>

/**
 * DevXP Analyzer — simple C++17 demonstration file.
 */

// Returns the sum of all elements in a vector.
int sumVector(const std::vector<int>& values) {
    return std::accumulate(values.begin(), values.end(), 0);
}

// Returns a greeting string.
std::string greet(const std::string& name) {
    return "Hello from DevXP Analyzer (C++): " + name;
}

int main() {
    std::cout << greet("DevXP") << std::endl;

    std::vector<int> numbers = {1, 2, 3, 4, 5};
    std::cout << "Sum of {1,2,3,4,5} = " << sumVector(numbers) << std::endl;

    return 0;
}
