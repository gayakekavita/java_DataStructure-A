--array is of fixed size .
  -- when we do not know the required size for array then we use ArrayList .
  --Syntax : 
    ArrayList<data_type> name_of_arralist=new ArrayList<>();
  -- arraylist is a part of java collection.
  -- java collection framework provides implementation  for "ArrayList".
  -- ArrayList is a class .
  -- initial capacity of arraylist is "10".

  -- methods of ArrayList 
     1. add(element)
         ArrayList<Integer> list=new ArrayList<>();
         list.add(20);
         list.add(45);
         list.add(80);
     2. remove(int index)
         list.remove(1);

     3.  set(int index, element)
         list.set(1, 66)
     4. contains(element)
         list.contains(20);
     5.  get(int index)
         this method is used to get the elemet present at the index specified .
         list.get(2)

-- initially capacity of ArrayList is  "10" .
       - suppose we added 10 elements in the list 
       - when we try to add new element in the list then it creates a new ArrayList of size doubled than previous ArrayList size . 
       - Then in new ArrayList it copies all the elements from previous list into it and then add new element into it.
       - this means Arraylist is growing dynamically .
       - thats why Arraylist is not of fixed size like arrays.
-- ArrayList inside another ArrayList
        ArrayList<ArrayList<Integer>> list2=new ArrayList<>();
          - when we want to add element inside above list2 then we add elements or another list inside list2 as follows :
              list2.add(new ArrayList<>());
