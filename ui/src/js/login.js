import {loginCustomer, registerCustomer} from "./utils.js";

const switchers = [...document.querySelectorAll('.switcher')]

switchers.forEach(item => {
    item.addEventListener('click', function () {
        switchers.forEach(item => item.parentElement.classList.remove('is-active'))
        this.parentElement.classList.add('is-active')
    })
})

document.getElementById("btn-login").addEventListener("click", () => {
    console.log("TEST LOGIN")
    loginCustomer();
})


document.getElementById("btn-signup").addEventListener("click", () => {
    console.log("TEST REGISTER")
    registerCustomer();
})
