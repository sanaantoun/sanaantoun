
function saveItem(element){
	var name = document.getElementById("itemName").value;
	var brand = document.getElementById("itemBrand").value;
	var price = document.getElementById("itemPrice").value;
	var weight = document.getElementById("itemWeight").value;
	var qty = document.getElementById("item_qty").value;

	var myData = JSON.parse(localStorage.getItem('groceryItem'));
	localStorage.removeItem( 'groceryItem' );
	var dataObject = myData[0];
	var id = dataObject["id"];

	var itemObject2 = {
		'id': id,
		'button': 'save',
		'name': name,
		'brand': brand,
		'price': price,
		'weight': weight,
		'qty': qty,
	};

	var objArray = [itemObject2];
	localStorage.setItem('editedItem'+id, JSON.stringify(objArray));
	location.href='./assignment1_p7.html';
}