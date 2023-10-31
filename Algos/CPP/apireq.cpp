#include <iostream>
#include <string>
#include <curl/curl.h>

// Callback function to write the response to a string
size_t WriteCallback(void* contents, size_t size, size_t nmemb, std::string* output) {
    size_t total_size = size * nmemb;
    output->append(static_cast<char*>(contents), total_size);
    return total_size;
}

int main() {
    // Initialize cURL
    CURL* curl = curl_easy_init();
    if (!curl) {
        std::cerr << "cURL initialization failed" << std::endl;
        return 1;
    }

    // The URL you want to make a request to
    const char* url = "https://api.example.com/data";

    // Initialize a string to store the response
    std::string response;

    // Set the cURL options
    curl_easy_setopt(curl, CURLOPT_URL, url);
    curl_easy_setopt(curl, CURLOPT_WRITEFUNCTION, WriteCallback);
    curl_easy_setopt(curl, CURLOPT_WRITEDATA, &response);

    // Perform the HTTP GET request
    CURLcode res = curl_easy_perform(curl);

    // Check for errors
    if (res != CURLE_OK) {
        std::cerr << "cURL failed with error: " << curl_easy_strerror(res) << std::endl;
    } else {
        // Print the API response
        std::cout << "Response: " << response << std::endl;
    }

    // Cleanup and release resources
    curl_easy_cleanup(curl);

    return 0;
}
