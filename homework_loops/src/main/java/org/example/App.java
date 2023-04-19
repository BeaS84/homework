package org.example;

//Ćwiczenia:
//        Wypisanie liczb od 1 do 10 za pomocą pętli while
//        Wypisanie liczb od 1 do 10 za pomocą pętli for
//        Wypisanie liczb parzystych od 0 do 20 za pomocą pętli for
//        Wypisanie liczb nieparzystych od 100 do 0 za pomocą pętli for

public class App 
{
    public static void main( String[] args )
    {
        //Zadanie 1.Wypisanie liczb od 1 do 10 za pomocą pętli while

        Integer number = 1;// Why 1? if number == 0 than starts print from 0, not from 1

        while (number<11){
            System.out.println("wartość zmiennej number to: "+ number);
            number++;
        }
        
       // Zadanie 2 Wypisanie liczb od 1 do 10 za pomocą pętli while
        
        for ( Integer i = 1; i < 11; i++){
            System.out.println("Wypisuję liczbę: "+ i);
    }
}
