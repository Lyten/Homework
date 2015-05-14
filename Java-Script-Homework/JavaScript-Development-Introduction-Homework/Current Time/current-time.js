'use strict';

var currentDateTime = new Date();

var minutes = currentDateTime.getMinutes();
var seconds = currentDateTime.getSeconds();
if (minutes <10) {
    minutes = '0' + minutes;
}
if (seconds <10) {
    seconds = '0' + seconds;
}

var weekday = new Array(7);
weekday[0] = "Sunday";
weekday[1] = "Monday";
weekday[2] = "Tuesday";
weekday[3] = "Wednesday";
weekday[4] = "Thursday";
weekday[5] = "Friday";
weekday[6] = "Saturday";


var monthWord = new Array(12);
monthWord[0] = "Jan";
monthWord[1] = "Feb";
monthWord[2] = "Mar";
monthWord[3] = "Apr";
monthWord[4] = "May";
monthWord[5] = "Jun";
monthWord[6] = "Jul";
monthWord[7] = "Aug";
monthWord[8] = "Sep";
monthWord[9] = "Oct";
monthWord[10] = "Nov";
monthWord[11] = "Dec";


var datetime = weekday[currentDateTime.getDay()] + "," + " " +
    currentDateTime.getDate() + " " +
    monthWord[currentDateTime.getMonth()] + " " +
    currentDateTime.getFullYear() + " " +
    currentDateTime.getHours() + ":" +
    minutes + ":" +
    seconds + " " + "GMT";


console.log(datetime);