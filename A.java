import java.util.*;
import java.lang.*; //you may need it one day you know what i mean

public class A{
    public static void countTypeInString(String string){
        String[] value = string.split(" ");
        double ifFloat;
        int ifInt;
        String ifString;
        int counter = 0;
        for (String i: value){
            try{
                ifFloat = Double.parseDouble(i);
                counter++;
                continue;
            } catch (NumberFormatException e){
            }
        }
        System.out.println("Double " + counter);

        counter = 0;
        for (String i: value){
            try{
                ifInt = Integer.parseInt(i);
                counter++;
                continue;
            } catch (NumberFormatException e){
            }

        }
        System.out.println("Int " + counter);

        String stringOfStrings = string.replaceAll("[0-9.]","");
        stringOfStrings = stringOfStrings.replaceAll("  "," ");
        String[] value2 = stringOfStrings.split(" ");
        System.out.println("String " + value2.length);


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String string=sc.nextLine();
        System.out.println(string);
        countTypeInString(string);
    }
}