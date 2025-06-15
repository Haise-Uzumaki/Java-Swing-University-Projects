import java.util.ArrayList;
import java.util.Collections;

public class Arraylist{

    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();

        //add elements

        list.add(5);
        list.add(6);
        list.add(34);
        list.add(23);
        list.add(12);

        System.out.println("The Array:");
        System.out.println(list);

        //get elements
        System.out.println("Element of The array at the following Index:");
        int element = list.get(0);
        System.out.println(element);


        //add element in between
        System.out.println("Adding Elements at following index:");
        list.add(1, 10);
        System.out.println(list);

        //set element
        System.out.println("Setting Elements at following index:");
        list.set(0, 6);
        System.out.println(list);

        //delete element
        System.out.println("Removing Elemnts of the following index:");
        list.remove(0);
        System.out.println(list);

        //array size 
        System.out.print("The size of the Array:");
        int size = list.size();
        System.out.println(size);

        //loops 
        System.out.println("Displaying Elemnts using For Loops:");
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println();

        //sorting
        System.out.println("Sorted Out Array:");
        Collections.sort(list);
        System.out.println(list);
        

    }

}