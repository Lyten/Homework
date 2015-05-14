"use strict"

document.getElementById('checkbox').onclick = function () {
	toggleSub(this, 'divShow');
	}
	
	function toggleSub(box, id) {
		var element = document.getElementById(id);
		if(box.checked) {
			element.style.display = 'block';
		} else {
			element.style.display = 'none';
		}
	}
	