package pl.gornik;

import pl.gornik.product.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        Product product1 = new Product("mleko","Nabiał",5.32, 1,"l");
        Product product2 = new Product("szynka","mięso",19.99, 200,"g");
        Product product3 = new Product("sok","napoje",4.30, 0.7,"l");
        Product product4 = new Product("czekolada","słodycze",7.15, 300,"g");
        Product product5 = new Product("olej","oleje",8.00, 1.5,"l");
        Product product6 = new Product("jogurt","nabiał",3.45, 150,"ml");
        Product product7 = new Product("Chleb","pieczywo",3.45, 1,"szt");
        Product product8 = new Product("mleko","nabiał",3.20, 0.5,"l");
        Product product9 = new Product("mleko","nabiał",2.10, 100,"ml");


        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);
        products.add(product8);
        products.add(product9);


        for(int i = 0; i < products.size(); i++){
            System.out.println(products.get(i));
        }

        System.out.println("-------------------------------");
        for(Product product: products){
            System.out.println(product);
        }

        System.out.println("---------Produkty z wybranej kategorii---------------------");
        for(Product productSprawdzanie : products){
            if(productSprawdzanie.getCategory().equalsIgnoreCase("nabiał")){
                System.out.println(productSprawdzanie);
            }
        }

        System.out.println("----------Produkty o nazwie rozpoczynającej sie od A do K------------------------------");
            for(Product productASCII : products){
                if(productASCII.getName().toUpperCase().charAt(0) > 64 && productASCII.getName().toUpperCase().charAt(0) < 76){
                    System.out.println(productASCII);
                }
            }

        System.out.println("----------Produkty o nazwie rozpoczynającej sie od B do F------------------------------");
        for(Product productASCII : products){
            if(productASCII.getName().toUpperCase().charAt(0) > 65 && productASCII.getName().toUpperCase().charAt(0) < 71){
                System.out.println(productASCII);
            }
        }

        System.out.println("\n----------------Drukowanie cen jednostkowych----------------------------");
        for(Product product : products){
            System.out.println(product.getName() + " " + product.getSizePack() + " " + product.getUnit() +  ": " +
                    product.calculateUnitPrice());
        }
        System.out.println("---------");
        for(Product product : products){
            product.displayProduct();
        }

        System.out.println("-----------Produkty o nazwie rozpoczynającej sie od liter wpisanych od użytkownika--------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą literę:");
        String userChoice1 = scanner.nextLine();
        int ascii1 = userChoice1.toUpperCase().charAt(0);

        System.out.println("Podaj drugą literę:");
        String userChoice2 = scanner.nextLine();
        int ascii2 = userChoice2.toUpperCase().charAt(0);

        for(Product product : products){
            if(product.getName().toUpperCase().charAt(0) > ascii1 && product.getName().toUpperCase().charAt(0) < ascii2){
                System.out.println(product);
            }
        }


    }
}