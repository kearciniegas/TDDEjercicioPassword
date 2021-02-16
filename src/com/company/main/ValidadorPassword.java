package com.company.main;

public class ValidadorPassword {

    public static boolean validar(String password) {
        boolean mayuscula = password.chars().filter(caracter -> Character.isUpperCase(caracter)).count() >0;
        boolean minusculas = password.chars().filter(caracter -> Character.isLowerCase(caracter)).count() >0;;
        if (minusculas && mayuscula){
            return true;
        }
        return false;
    }
}
