package tema1;

import java.util.Scanner;

public class ProblemaVarstaCititaDeLaTastatura {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduceti varsta Anei:");
        int varstaAnei= scanner.nextInt();
        int varstaLuiDavid= varstaAnei -6;
        System.out.println("Varsta lui David este:" +varstaLuiDavid);
    }
}
