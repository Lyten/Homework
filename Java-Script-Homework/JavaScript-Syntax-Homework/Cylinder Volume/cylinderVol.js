'use strict';
function calcCylinVol(arr) {
	var radius = arr[0];
	var height = arr[1];
	return Math.PI * radius * radius * height;
}

console.log(calcCylinVol([2, 4]).toFixed(3));
console.log(calcCylinVol([5, 8]).toFixed(3));
console.log(calcCylinVol([12, 3]).toFixed(3));