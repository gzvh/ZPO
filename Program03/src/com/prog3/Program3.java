package com.prog3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program3 {

    public static void main(String[] args) {

        int number;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to translate: ");
        number = input.nextInt();

        try {
            if (number == 0) {
                throw new NumberIsZeroException();
            } else if (number < 0) {
                throw new NumberIsNegativeException();
            } else if (number < 100) {
                throw new NotEnoughDigitsException();
            } else if(number > 999){
                throw new TooMuchDigitsException();
            } else{
                Translate trans = new Translate(number);
                trans.translateNumber();
            }
        } catch (InputMismatchException e){
            System.out.println(e);
        } catch (NumberIsZeroException e) {
            e.printStackTrace();
        } catch (NotEnoughDigitsException e) {
            e.printStackTrace();
        } catch (NumberIsNegativeException e) {
            e.printStackTrace();
        } catch (TooMuchDigitsException e) {
            e.printStackTrace();
        }
        input.close();
    }
}
