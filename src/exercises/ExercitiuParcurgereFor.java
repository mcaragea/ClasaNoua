package exercises;

import java.util.HashSet;
import java.util.Set;

public class ExercitiuParcurgereFor {
    public static void main(String[] args) {
        Set<String> set =new HashSet<>();
        set.add("Mere");
        set.add("Pere");
        set.add("Piersici");
        set.add("Piersici");
        for(String element: set){
            System.out.println(element);
        }
    }
}
