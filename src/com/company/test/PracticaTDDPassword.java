package com.company.test;

import com.company.main.ValidadorPassword;
import org.junit.Assert;
import org.junit.Test;

public class PracticaTDDPassword {

    /**
     * 1 Mayuscula
     * 1 Minuscula
     */
    /**
     * Aa
     * aa
     * AA
     */
    @Test
    public void practicaTDDPasswordValidarMayusculas() {
        boolean respuesta = ValidadorPassword.validar("AA");
        Assert.assertFalse(respuesta);
    }

    @Test
    public void practicaTDDPasswordValidarMayusculaUnCaracter() {
        boolean respuesta = ValidadorPassword.validar("A");
        Assert.assertFalse(respuesta);
    }

    @Test
    public void practicaTDDPasswordValidarMinusculas() {
        boolean respuesta = ValidadorPassword.validar("aa");
        Assert.assertFalse(respuesta);
    }

    @Test
    public void practicaTDDPasswordValidarTodasLasReglas() {
        boolean respuesta = ValidadorPassword.validar("AaAa");
        Assert.assertTrue(respuesta);
    }

}
