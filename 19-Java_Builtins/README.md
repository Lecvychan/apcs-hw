
1.What is the difference between the HashMap and HashSet (or the TreeMap and TreeSet) from a use point of view.

     Hashset
      -implements the Set interface.
      -stores only objects.
      -slower than Hashmap.
      -Add method is used to add element in set.

      Hashmap
       -implements the Map interface.
       -stores data in the form of key value pair.
       -faster than Hashset because unique key is used to access objects.
       -Put method is used to add element in map.

2a.Internally, how is a HashMap implemented?

      Hashmap is implemented as an array whose elements point to a linked list.

2b.Internally, how is the TreeMap implemented?
	    	    
      TreeMap is internally implemented as a black-red tree.

3.HashMap seems to be faster than TreeMap.

4.PriorityQueue.