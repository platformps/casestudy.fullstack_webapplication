function myFunction() {
    let i = document.getElementById("myTopnav");
    if (i.className === "topNavBar") {
        i.className += " responsive";
    } else {
        i.className = "topNavBar";
    }
}

function renderGrid() {
    let blocks = document.getElementById("wrapper").children;
    let cols = 4, newleft, newtop;
    for(let i = 1; i < blocks.length; i++){
        if (i % cols == 0) {
            newtop = (blocks[i-cols].offsetTop + blocks[i-cols].offsetHeight);
            blocks[i].style.top = newtop+"px";
        } else {
            if(blocks[i-cols]){
                newleft = (blocks[i-cols].offsetTop + blocks[i-cols].offsetHeight);
                blocks[i].style.top = newleft+"px";
            }
            newleft = (blocks[i-1].offsetLeft + blocks[i-1].offsetWidth);
            blocks[i].style.left = newleft+"px";
        }
    }
}
window.addEventListener("load", renderGrid, false);
window.addEventListener("resize", renderGrid, false);