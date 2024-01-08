const existingAlert = document.getElementById("alert-div");
const baseUrl = "http://localhost:4031";

const timeoutPromise = new Promise((_, reject) => {
    setTimeout(() => reject(new Error("Request Timed Out")), 10000);
});

export function loadingVisible(flag) {
    const loading = document.getElementById("loading-wheel");
    if (flag === true) {
        loading.style.display = "flex";
    } else {
        loading.style.display = "none";
    }
}

export async function loginDriver() {

}

export async function loginCustomer() {
    loadingVisible(true);
    try {
        const fetchPromise = await fetch(baseUrl + "/api/v1.0/customer/login", {
            method: "POST",
            headers: {
                "Content-Type": "application/json",
            },
            body: JSON.stringify({
                username: "test-username",
                password: "test-password",
            })
        })

        const response = await Promise.race([fetchPromise, timeoutPromise]);
        handleResponseCode(response);
    } catch (error) {
        console.log(error.message);
    } finally {
        loadingVisible(false);
    }
}

export function registerDriver() {

}

export function registerCustomer() {

}

function handleResponseCode(response) {

}