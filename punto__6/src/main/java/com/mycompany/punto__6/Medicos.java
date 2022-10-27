/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.punto__6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Medicos {
    //atributos
    private String Nombre = "";
    private int Edad = 0;
    private int Horario = 0;
    private String Especialidad = "";
    //atributos de un arreglo
    
    //metodos
    public void doctorFelipe() {
        Nombre = "Felipe";
        Edad = 26;
        Horario = 1;
        Especialidad = "Cardiologia";
        System.out.println("El nombre del doctor es: " + Nombre);
        System.out.println("La edad del doctor es: " + Edad);
        if (Horario == 1) {
            System.out.println("El horario del doctor es diurna.");
            System.out.println("    Franja: 6:00 a 13:00 ");
        }
        System.out.println("La especialidad del doctor es: " + Especialidad);
    }

    public void doctoraPaula() {
        Nombre = "Paula";
        Edad = 24;
        Horario = 2;
        Especialidad = "Nutricionista";
        System.out.println("El nombre de la doctora es: " + Nombre);
        System.out.println("La edad del doctor es: " + Edad);
        if (Horario == 2) {
            System.out.println("El horario de la doctora es por la tarde.");
            System.out.println("    Franja: 13:00 a 21:00");
        }
        System.out.println("La especialidad de la doctora es: " + Especialidad);
    }

    public void doctorRaul() {
        Nombre = "Raul Gonzalez";
        Edad = 20;
        Horario = 3;
        Especialidad = "Dermatologia";
        System.out.println("El nombre del doctor es: " + Nombre);
        System.out.println("La edad del doctor es: " + Edad);
        if (Horario == 3) {
            System.out.println("El horario del doctor es nocturna.");
            System.out.println("    Franja: 21:00 a 6:00");
        }
        System.out.println("La especialidad del doctor es: " + Especialidad);
    }
    }
    

