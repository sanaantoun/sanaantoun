function addItem(){
	
}

function editItem(element, id){
	var tableRowElements = element.parentNode.parentNode.children;
	var name = tableRowElements[0].innerHTML;
	var brand = tableRowElements[1].innerHTML;
	var price = tableRowElements[2].innerHTML;
	var weight = tableRowElements[3].innerHTML;
	var qty = tableRowElements[4].innerHTML;

	var itemObject = {
		'id': id,
		'button': 'edit',
		'name':name,
		'brand':brand,
		'price':price,
		'weight':weight,
		'qty': qty,
	};

	var objArray = [itemObject];
	localStorage.setItem('groceryItem', JSON.stringify(objArray));
	location.href='./assignment1_p8.html';
}

function deleteItem(){
	
}