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
public class Usuario {

    Medicos mat = new Medicos();
    private String hour;
    private String name;
    private String date;
    private String doc;

    public void agendarCita(ArrayList<CitaMedica> citas) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del paciente:");
        String nombre = sc.nextLine();
        name = nombre;
        System.out.println("Ingrese el nombre del médico:");
        System.out.println("Felipe");
        System.out.println("Paula");
        System.out.println("Raul");
        String medico = sc.nextLine();
        doc = medico;
        System.out.println("Ingrese la fecha de la cita (DD/MM/AAAA):");
        String fecha = sc.nextLine();
        date = fecha;
        System.out.println("Ingrese la hora de la cita (HH:MM):");
        String hora = sc.nextLine();
        hour = hora;
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDate localDate = LocalDate.parse(fecha + " " + hora, formato);
        CitaMedica cita = new CitaMedica(nombre, medico, localDate);
        citas.add(cita);
        Collections.sort(citas);
        System.out.println("Cita agendada");
    }

    public void getHora() {
        System.out.println("a las: " + hour);
    }

    public static void verCitas(ArrayList<CitaMedica> citas) {
        if (citas.size() == 0) {
            System.out.println("No hay citas para mostrar");
        } else {
            for (CitaMedica cita : citas) {
                System.out.println(cita);
            }
        }
    }

    public static void cancelarCita(ArrayList<CitaMedica> citas) {
        if (citas.size() == 0) {
            System.out.println("No hay citas para cancelar");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese el nombre del paciente:");
            String nombre = sc.nextLine();
            System.out.println("Ingrese la fecha de la cita (DD/MM/AAAA):");
            String fecha = sc.nextLine();
            System.out.println("Ingrese la hora de la cita (HH:MM):");
            String hora = sc.nextLine();
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
            LocalDate localDate = LocalDate.parse(fecha + " " + hora, formato);
            for (CitaMedica cita : citas) {
                if (cita.getPaciente().equals(nombre) && cita.getFecha().equals(localDate)) {
                    citas.remove(cita);
                    System.out.println("Cita cancelada");
                    break;
                }
            }
        }
    }
}

class CitaMedica implements Comparable {

    private String paciente;
    private String medico;
    private LocalDate fecha;
    private LocalDate hora;

    public CitaMedica(String paciente, String medico, LocalDate fecha) {
        this.paciente = paciente;
        this.medico = medico;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDate getHora() {
        return hora;
    }

    public void setHora(LocalDate hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        System.out.print("tiene una cita medica " + "nombre del paciente: " + paciente + ", El doctor sera: " + medico + ", el dia de la cita sera: " + fecha);
        return " ";
    }

    @Override
    public int compareTo(Object o) {
        CitaMedica cita = (CitaMedica) o;
        return this.fecha.compareTo(cita.fecha);
    }
}
