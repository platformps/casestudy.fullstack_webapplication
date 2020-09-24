function myFunction() {
    let i = document.getElementById("myTopnav");
    if (i.className === "topNavBar") {
        i.className += " responsive";
    } else {
        i.className = "topNavBar";
    }
}