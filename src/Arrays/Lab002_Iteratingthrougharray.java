package Arrays;
//### Problem with the Arrays
//- Fixed in the size.
//- It` can only store the same data type values.`
//- Add or Delete an Element -> **Shift operation.  Heavy Operation)**
//- Use a loop to traverse.
//- Array size is mandatory while constructing an array object.
//    - a. int a[] =new int[3]; //VALID
//    - b. int a[] =new int[]; //INVALID
//- When you are specifying -ve value as array size then java.lang.**NegativeArraySizeException** will be thrown at runtime
public class Lab002_Iteratingthrougharray {
    public static void main(String[] args) {
//enhanced for loop
        //```
        //for (dataType item : array) {
        //    // Code to be executed for each item
        //}
        //```

        String[] names = {"pramod", "amit", "lucky", "anil"};
        for (String name : names) {
            System.out.println(name);
        }


    }
}
