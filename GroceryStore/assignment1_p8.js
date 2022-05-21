window.onload = function() {
	var myData = JSON.parse(localStorage.getItem('groceryItem'));
	// localStorage.removeItem( 'groceryItem' );
	var dataObject = myData[0];
	sourceButton = dataObject['button'];

	if(sourceButton == "edit"){
		var nameInput = document.getElementById("itemName");
		nameInput.value = dataObject['name'];
		var nameInput = document.getElementById("itemBrand");
		nameInput.value = dataObject['brand'];
		var nameInput = document.getElementById("itemPrice");
		nameInput.value = dataObject['price'];
		var nameInput = document.getElementById("itemWeight");
		nameInput.value = dataObject['weight'];
		var nameInput = document.getElementById("item_qty");
		nameInput.value = dataObject['qty'];
	}
}