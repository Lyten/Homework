'use strict';
var displayArea = document.getElementById("clock");
function format(num) {
    var numStr = num.toString();
    if (numStr.length === 1) {
        return "0" + numStr;
    }
    else {
        return numStr;
    }
}
function updateClock () {
var currentTime = new Date();
var hours = currentTime.getHours();
var minutes = currentTime.getMinutes();
var seconds = currentTime.getSeconds();

displayArea.textContent = format(hours) + ":" + format(minutes) + ":" + format(seconds);
}

setInterval(updateClock, 1000);