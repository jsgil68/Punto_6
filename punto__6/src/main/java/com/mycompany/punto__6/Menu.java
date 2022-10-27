/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.punto__6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Menu {

    ArrayList<CitaMedica> citas = new ArrayList();
    Scanner sc = new Scanner(System.in);
    Usuario mat = new Usuario();
    Medicos med = new Medicos();
    int opcion = 0, usuario = 0, a = 0, b = 0;

    public void menuInicio() {
        do {
            System.out.println("MENU");
            System.out.println("haces parte de:");
            System.out.println("1. Medicos");
            System.out.println("2. Servicio");
            System.out.println("3. Usuario");
            System.out.println("4. Deseo salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    mat.verCitas(citas);
                    mat.getHora();
                    break;
                case 2:
                    System.out.println("1. disponibilidad de horarios de todos los doctores");
                    System.out.println("2. datos de los doctores");
                    a = sc.nextInt();
                    switch (a) {
                        case 1:
                            System.out.println("El doctor no estara disponible a estas horas y dias");
                            mat.verCitas(citas);
                            mat.getHora();
                            break;
                        case 2:
                            System.out.println("1. Felipe");
                            System.out.println("2. Paula");
                            System.out.println("3. Raul");
                            b = sc.nextInt();
                            switch (b) {
                                case 1:
                                    med.doctorFelipe();
                                    break;
                                case 2:
                                    med.doctoraPaula();
                                    break;
                                case 3:
                                    med.doctorRaul();
                                    break;
                            }
                    }
                    break;
                case 3:
                    do {
                        System.out.println("MENU USUARIO");
                        System.out.println("1. Agendar cita");
                        System.out.println("2. Ver citas");
                        System.out.println("3. Cancelar cita");
                        System.out.println("4. Salir");
                        usuario = sc.nextInt();
                        switch (usuario) {
                            case 1:
                                mat.agendarCita(citas);
                                break;
                            case 2:
                                mat.verCitas(citas);
                                mat.getHora();
                                break;
                            case 3:
                                mat.cancelarCita(citas);
                                break;
                        }
                    } while (usuario != 4);
                    break;
            }
        } while (opcion != 4);
    }

}
