/**
	This is a readme file for E commerce backend application.

**/

Methods:
-->For inserting item in db:http://localhost:8085/api/items/create (POST)
Body:
{
    "id": 1,
    "name": "Monday123",
    "price": 0,
    "pictureUrl": null
		
}

-->For getting item with id : http://localhost:8085/api/items/{id} (GET)

-->For getting all items:http : http://localhost:8085/api/items (GET)

-->For deleting item by id:http : http://localhost:8085/api/items/{id}(DELETE)


-->For creating order : http://localhost:8085/api/orders/create (POST)
Body:
{
	"productOrders":[
	{
		"product":
		{
        	"id": 1,
        	"name": "Monday12",
        	"price": 0,
        	"pictureUrl": null
		},
		"quantity": 1
		
	},
		{
		"product":
		{
        	"id": 2,
        	"name": "Monday123",
        	"price": 0,
        	"pictureUrl": null
		},
		"quantity": 2
		
	}
	]
	
}


-->For retrieving all orders : http://localhost:8085/api/orders/all (GET)