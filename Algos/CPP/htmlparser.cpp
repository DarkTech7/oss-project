#include <iostream>
#include <string>

// Function to convert HTML tags to plain text
std::string convertToPlainText(const std::string& html) {
    std::string result;
    bool insideTag = false;

    for (char c : html) {
        if (c == '<') {
            insideTag = true;
        } else if (c == '>') {
            insideTag = false;
        } else if (!insideTag) {
            result += c;
        }
    }

    return result;
}

int main() {
    std::string html = "<html><body><h1>Hello, World!</h1></body></html>";
    std::string plainText = convertToPlainText(html);

    std::cout << "HTML Code: " << html << "\n";
    std::cout << "Plain Text: " << plainText << "\n";

    return 0;
}
