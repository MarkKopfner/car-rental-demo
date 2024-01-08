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
    try {
        const fetchPromise = await fetch("", {
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
        createAlert(error.message, "error");
    } finally {
        loadingVisible(false);
    }
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
        createAlert(error.message, "error");
    } finally {
        loadingVisible(false);
    }
}

export function registerDriver() {

}

export function registerCustomer() {

}

export function createAlert(message, type) {
    if (existingAlert != null) {
        existingAlert.className = "alert " + type;
        existingAlert.textContent = message;
    } else {
        const alert = document.createElement("div");
        alert.id = "alert-div";
        alert.className = "alert " + type;
        alert.textContent = message;

        const closeBtn = document.createElement("ion-icon");
        closeBtn.setAttribute("name", "close-outline");
        closeBtn.classList.add("closebtn");
        closeBtn.addEventListener("click", () => {
            clearAlerts();
        });

        alert.appendChild(closeBtn);
        document.body.appendChild(alert);
    }
}

export function clearAlerts() {
    const alerts = document.querySelectorAll("#alert-div");
    alerts.forEach((item) => {
        document.body.removeChild(item);
    });
}

function handleResponseCode(response) {

}