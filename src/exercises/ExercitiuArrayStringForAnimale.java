package exercises;


public class ExercitiuArrayStringForAnimale {
    public static void main(String[] args) {
        Animal[] array={new Animal("ghepard"),new Animal("caine"),new Animal("leu"),new Animal("pisica")};
        for(Animal element: array){
            System.out.println(element.getName("xxx"));
        }
    }
}
