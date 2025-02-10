console.log("Script loaded successfully!");
document.addEventListener("DOMContentLoaded", function() {
    const dateElement = document.getElementById("currentDate");
    const today = new Date().getFullYear();
    dateElement.textContent = "GustavoRock "+ "\u2122 " +today;
});







document.addEventListener("DOMContentLoaded", function () {
    const apiUrl = "http://localhost:8080/attractions/tivoli";

    fetch(apiUrl)
        .then(response => {
            console.log("Response Status:", response.status); // Debug
            if (!response.ok) {
                throw new Error(`HTTP error! Status: ${response.status}`);
            }
            return response.json();
        })
        .then(data => {
            console.log("Fetched Data:", data); // Debug JSON
            const tivoliDescription = document.getElementById("tivoliDisc");
            if (tivoliDescription && data.description) {
                tivoliDescription.textContent = data.description;
            } else {
                console.warn("No 'description' in data or missing element.");
            }
        })
        .catch(error => {
            console.error("Fetch operation failed:", error);
        });
});
document.addEventListener("DOMContentLoaded", function () {
    const apiUrl = "http://localhost:8080/attractions/silverback%20sportsgym";

    fetch(apiUrl)
        .then(response => {
            console.log("Response Status:", response.status); // Debug
            if (!response.ok) {
                throw new Error(`HTTP error! Status: ${response.status}`);
            }
            return response.json();
        })
        .then(data => {
            console.log("Fetched Data:", data); // Debug JSON
            const tivoliDescription = document.getElementById("silverDisc");
            if (tivoliDescription && data.description) {
                tivoliDescription.textContent = data.description;
            } else {
                console.warn("No 'description' in data or missing element.");
            }
        })
        .catch(error => {
            console.error("Fetch operation failed:", error);
        });
});



