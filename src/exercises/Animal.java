package exercises;

public class Animal {
  private  String name;

    public Animal(String name) {
        this.name = name;
    }
    public String getName(String rasa) {
        return name+ " " + rasa;
    }
    public String getName() {
        return name;
    }
}
