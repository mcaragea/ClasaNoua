package tema1;

public class StringPrinting {

    public static void main(String[] args) {

        String txt ="Ana are mere!";
        int lungimeaTextului = txt.length();

        System.out.println("Lungimea textului este: "+ lungimeaTextului);
        for(int i=0; i<lungimeaTextului; i++){

            char caracterulCurent= txt.charAt(i);
            System.out.println( "caracterulCurent: " + caracterulCurent);
        }

    }

}
