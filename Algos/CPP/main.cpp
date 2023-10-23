#include <iostream>

// Function to swap two integers
void swap(int& a, int& b) {
    int temp = a;
    a = b;
    b = temp;
}

// Function to swap two floating-point numbers
void swap(float& a, float& b) {
    float temp = a;
    a = b;
    b = temp;
}

// Function to swap two characters
void swap(char& a, char& b) {
    char temp = a;
    a = b;
    b = temp;
}

int main() {
    int num1 = 10, num2 = 20;
    float float1 = 3.14, float2 = 2.71;
    char char1 = 'A', char2 = 'B';

    std::cout << "Before swapping:" << std::endl;
    std::cout << "num1 = " << num1 << ", num2 = " << num2 << std::endl;
    std::cout << "float1 = " << float1 << ", float2 = " << float2 << std::endl;
    std::cout << "char1 = " << char1 << ", char2 = " << char2 << std::endl;

    // Call swap functions for different data types
    swap(num1, num2);
    swap(float1, float2);
    swap(char1, char2);

    std::cout << "After swapping:" << std::endl;
    std::cout << "num1 = " << num1 << ", num2 = " << num2 << std::endl;
    std::cout << "float1 = " << float1 << ", float2 = " << float2 << std::endl;
    std::cout << "char1 = " << char1 << ", char2 = " << char2 << std::endl;

    return 0;
}

