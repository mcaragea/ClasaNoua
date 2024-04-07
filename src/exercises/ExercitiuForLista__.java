package exercises;

import java.util.ArrayList;
import java.util.List;

public class ExercitiuForLista__ {
    public static void main(String[] args) {
        List<Double> lista=new ArrayList<>();
        lista.add(4.78);
        lista.add(5.3);
        lista.add(9.87);
        lista.add(6.6);
        lista.add(4.2);
        for(int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }
}
