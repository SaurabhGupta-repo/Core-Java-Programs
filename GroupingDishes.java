/*
You are given a list dishes, where each element consists of a list of strings beginning with the name of the dish, followed by all the ingredients used in preparing it. You want to group the dishes by ingredients, so that for each ingredient you'll be able to find all the dishes that contain it (if there are at least 2 such dishes).

Return an array where each element is a list beginning with the ingredient name, followed by the names of all the dishes that contain this ingredient. The dishes inside each list should be sorted lexicographically, and the result array should be sorted lexicographically by the names of the ingredients.

Example

    For

      dishes = [["Salad", "Tomato", "Cucumber", "Salad", "Sauce"],
                ["Pizza", "Tomato", "Sausage", "Sauce", "Dough"],
                ["Quesadilla", "Chicken", "Cheese", "Sauce"],
                ["Sandwich", "Salad", "Bread", "Tomato", "Cheese"]]

    the output should be

      solution(dishes) = [["Cheese", "Quesadilla", "Sandwich"],
                                ["Salad", "Salad", "Sandwich"],
                                ["Sauce", "Pizza", "Quesadilla", "Salad"],
                                ["Tomato", "Pizza", "Salad", "Sandwich"]]

    For

      dishes = [["Pasta", "Tomato Sauce", "Onions", "Garlic"],
                ["Chicken Curry", "Chicken", "Curry Sauce"],
                ["Fried Rice", "Rice", "Onions", "Nuts"],
                ["Salad", "Spinach", "Nuts"],
                ["Sandwich", "Cheese", "Bread"],
                ["Quesadilla", "Chicken", "Cheese"]]

    the output should be

      solution(dishes) = [["Cheese", "Quesadilla", "Sandwich"],
                                ["Chicken", "Chicken Curry", "Quesadilla"],
                                ["Nuts", "Fried Rice", "Salad"],
                                ["Onions", "Fried Rice", "Pasta"]]

Input/Output

    [execution time limit] 3 seconds (java)

    [input] array.array.string dishes

    An array of dishes, where dishes[i] for each valid i contains information about the ith dish: dishes[i][0] is the name of the dish, and all the elements after it are the ingredients of that dish. Both the dish name and the ingredient names consist of English letters and spaces. It is guaranteed that all dish names are different. It is also guaranteed that the ingredient names for any one dish are also pairwise distinct.

    Guaranteed constraints:
    1 ≤ dishes.length ≤ 500,
    2 ≤ dishes[i].length ≤ 10,
    1 ≤ dishes[i][j].length ≤ 50.

    [output] array.array.string

    The array containing the grouped dishes.



*/

public class GroupingDishes{
  
  String[][] solution(String[][] dishes) {


HashMap<String, List<String>>  ingredentMap = new HashMap ();

for(int row= 0; row < dishes.length; row++)
{
    String dish= dishes[row][0];
///// Step 1 : get the Map with Key= Dish and Values: Ingredients.
    for (int col=1; col <dishes[row].length; col++)
    {
        // StringBuilder ingredient = new StringBuilder();
        String ingredient = dishes[row][col];
        if(ingredentMap.containsKey(ingredient) && 
            !ingredentMap.get(ingredient).contains(dish))
        {
            ingredentMap.get(ingredient).add(dish);
           // ingredentMap.put(ingredient, );
        }
        else
        {
            List<String> dishList = new ArrayList();
            dishList.add(dish);
            ingredentMap.put(ingredient, dishList);

        }   
        
    }    
       
}

//// Step 2: sort the map and remove keys where values are less than 2.
 TreeMap<String, List<String>> treemap = new TreeMap<>(ingredentMap);
List<List<String>> reList= new ArrayList<>();

	     for(String key: treemap.keySet()){
	        if(treemap.get(key).size()>=2){
	           List<String> subList= treemap.get(key);
	           Collections.sort(subList); 
	           subList.add(0,key);  
	           reList.add(subList);
	        }
	    }
        
   //// Step -3 building the final response array.     
 String [][] ingredentArray = new String [reList.size()][];
    
   for (int i = 0; i < reList.size(); i++) {
	        List<String> row = reList.get(i);
	        ingredentArray[i] = row.toArray(new String[row.size()]);
	    }
        
        return ingredentArray;

}

  
  
  
}
