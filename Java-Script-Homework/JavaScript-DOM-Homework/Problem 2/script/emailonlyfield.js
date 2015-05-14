"use strict"

function validateInput() {
	var inputElement = document.getElementById('input').value;
	trimString(inputElement);
	
	var divElementForValidate = document.getElementById('valid').innerHTML;
	divElementForValidate = inputElement;
	document.getElementById('valid').innerHTML = divElementForValidate;
	
	var isValidEmail = validateEmail(inputElement);
	console.log(isValidEmail);
	
	if(isValidEmail) {
		changeBackground('limegreen');
	} else {
		changeBackground('red');
	}
}

function validateEmail(email) {
	var result = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i;
	//var result = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6}$/;
	return result.test(email);
}

function changeBackground(color) {
	var element = document.getElementById('valid');
	element.style.background = color;
}

function trimString(string) {
	return string.trim();
}
