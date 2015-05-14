'use strict';

function quadEq(a, b, c) {

var valA = a;
var valB = b;
var valC = c;

var d=((valB * valB)-(4 * valA * valC));

var x1=(-valB + Math.sqrt(d)) / (2 * valA);
var x2=(-valB - Math.sqrt(d)) / (2 * valA);

if (d < 0) {
    console.log("No real roots");
    } else if (d === 0) {
        console.log("X = " + x1);
    } else {
        console.log("X1 = " + x2 + " X2 = " + x1);
    }
}
quadEq(2, 5, -3);
quadEq(2, -4, 2);
quadEq(4, 2, 1);

