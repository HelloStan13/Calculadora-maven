package co.com.sofka.app.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    private static final Logger logger = LoggerFactory.getLogger( App.class );

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in ) );

        System.out.println( "Ingresa numero 1: " );
        String textNumber1 = bufferedReader.readLine();

        System.out.println( "Ingresa numero 2: " );
        String textNumber2 = bufferedReader.readLine();

        Long number1 = Long.valueOf( textNumber1 );
        Long number2 = Long.valueOf( textNumber2 );

        BasicCalculator calculator = new BasicCalculator();

        Long resultSum = calculator.sum( number1, number2 );
        System.out.println( number1 + " + " + number2 + " La suma es = " + resultSum );


        Long resultRest = calculator.resta( number1, number2 );
        System.out.println( number1 + " - " + number2 + " La resta es = " + resultRest );


        Long resultMul = calculator.mult( number1, number2 );
        System.out.println( number1 + " * " + number2 + " La multiplicación es = " + resultMul );


        Long resultDiv = calculator.div( number1, number2 );
        System.out.println( number1 + " / " + number2 + " La división es = " + resultDiv );
    }
}
