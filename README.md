ENDPOINTS


1.Get All Recipes
 Method: GET

 URL: http://localhost:8080/recipes

2.Get Recipe by ID
 Method: GET

 URL http://localhost:8080/recipes/1

3.Add a Recipe
 Method: POST

 URL: http://localhost:8080/recipes

 Body (JSON):

 {
  "name": "Avocado Toast",
  "ingredients": ["Bread", "Avocado", "Salt"],
  "instructions": "Mash avocado, spread on toasted bread, sprinkle salt."
}


4. Updating a Recipe
 Method: PUT

 URL: http://localhost:8080/recipes/1

 Body (JSON):

 {
  "name": "Avocado Toast with Lemon",
  "ingredients": ["Bread", "Avocado", "Salt", "Lemon Juice"],
  "instructions": "Mash avocado, mix with lemon juice, spread on toasted bread."
}



5. Delete a Recipe
  Method: DELETE

  URL: http://localhost:8080/recipes/1



6. Get All Pantry Items
  Method: GET

 URL: http://localhost:8080/pantry


7. Get Pantry Item by ID
 Method: GET

 URL: http://localhost:8080/pantry/1


8.Add a Pantry Item
 Method: POST

 URL: http://localhost:8080/pantry

 Body (JSON):

 {
  "name": "Flour",
  "quantity": 5
}


9. Updating a Pantry Item
 Method: PUT


 URL: http://localhost:8080/pantry/1

 Body (JSON):

 {
  "name": "Whole Wheat Flour",
  "quantity": 8
}



10. Delete a Pantry Item
 Method: DELETE

 URL: http://localhost:8080/pantry/1

