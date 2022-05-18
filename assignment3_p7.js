window.onload = function() {

	var allItems = allStorage();
	var table = document.getElementById("productTable");
	for (var i = 0; i < allItems.length; i++) {
		
		var item = JSON.parse(allItems[i]);
		var dataObject=item[0];
		var sourceButton= dataObject['button'];

		if(sourceButton=='save'){
			var id = dataObject['id'];
			var tableRow = table.rows[id];
			var cells = tableRow.cells;
			cells[0].innerHTML = dataObject["name"];
			cells[1].innerHTML = dataObject["brand"];
			cells[2].innerHTML = dataObject["price"];
			cells[3].innerHTML = dataObject["weight"];
			cells[4].innerHTML = dataObject["qty"];

		}
	}
	
}

function allStorage() {

    var values = [],
        keys = Object.keys(localStorage),
        i = keys.length;

    while ( i-- ) {
        values.push( localStorage.getItem(keys[i]) );
    }

    return values;
}