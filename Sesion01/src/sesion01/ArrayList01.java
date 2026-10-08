
package sesion01;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayList01 {


    public static void main(String[] args) {
        
        ArrayList01 a = new ArrayList01();
         a.ListArray();
        //a.DeleteDataArray();
        //a.ViewOnlyOne();
        //a.EditElemetsArray();
       // a.SizeArray();
       // a.RunArray();
        
    }
     //Example of ArrayList
    public static void ListArray() {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("red");
        colors.add("green");
        System.out.println("ArrayList: " + colors);
    }

    public static void DeleteDataArray() {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("red");
        colors.add("green");
        System.out.println("ArrayList: " + colors);
        String color = colors.remove(1);
        System.out.println("ArrayList: " + colors);
        System.out.println("Removed Element: " + color);
    }

    public static void ViewOnlyOne() {
        ArrayList<String> clothes = new ArrayList<>();
        clothes.add("jacket");
        clothes.add("shirt");
        clothes.add("pullover");
        System.out.println("ArrayList: " + clothes);
        String str = clothes.get(0);
        System.out.print("Element at index 2: " + str + "\n");
    }

    public static void EditElemetsArray() {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("red");
        colors.add("green");
        System.out.println("ArrayList: " + colors);
        colors.set(2, "yellow");
        System.out.println("Modified ArrayList: " + colors);
    }

    public static void SizeArray() {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("red");
        colors.add("green");
        colors.add("pink");
        System.out.println(colors.size());
    }
    
    public static void RunArray(){
        ArrayList<Integer> ages = new ArrayList<Integer>();
        ages.add(20);
        ages.add(54);
        ages.add(17);
        ages.add(9);
        ages.add(15);
        Collections.sort(ages);
        for (int i : ages) {
            System.out.println(i);
        }
    }
    
}
