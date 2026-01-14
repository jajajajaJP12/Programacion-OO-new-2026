package edu.jorge.pardo.actividad1.ui;

import edu.jorge.pardo.actividad1.process.Switch;

import java.util.Scanner;

public class CLI {
    public static void start(){
        Switch switch_wifi = new Switch();
        Scanner scanner = new Scanner(System.in);
        System.out.println("bienvenido al programa");
        System.out.println("el switch esta "+switch_wifi.isOn());
        String respuesta;
        if(switch_wifi.isOn()){
            System.out.println("desea apagar el switch");
            respuesta = scanner.nextLine();
            if(respuesta.equals("s")) switch_wifi.apagarSwitch();
        }else {
            System.out.println("desea prender el switch");
            respuesta = scanner.nextLine();
            if(respuesta.equals("s")) switch_wifi.prenderSwitch();
        }
        System.out.println("el switch esta "+switch_wifi.isOn());
    }
}
