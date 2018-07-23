package com.maniba.robot;

import com.sun.glass.events.KeyEvent;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

/*
Readme
*Robot para capturar LOS PROYECTOS INMOBILIARIOS tipo CASA de www.toctoc.com 
 Solo funciona en Windows y Chrome
 Debe pregarse la siguiente URL https://www.toctoc.com/propiedades/compranuevo/?page=00 
*/

public class RobotTocToc {

    public static void main(String[] args) throws AWTException, InterruptedException, ClassNotFoundException, UnsupportedFlavorException, IOException {
        Robot robot = new Robot();
        Thread.sleep(10000);
        for (int j = 1; j <= 16; j++) {
            escribirURL(j);
            Thread.sleep(200);
            buscarTexto();
            robot.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(400);
            robot.keyRelease(KeyEvent.VK_ESCAPE);
            Thread.sleep(400);
            robot.keyPress(KeyEvent.VK_TAB);
            Thread.sleep(800);
            robot.keyRelease(KeyEvent.VK_TAB);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(200);
            robot.keyRelease(KeyEvent.VK_ENTER);
            Thread.sleep(20000);
            seleccionarTodo();
            copiarTodo();
            borrarURL();
            Clipboard c = Toolkit.getDefaultToolkit().getSystemClipboard();
            System.out.println(c.getData(DataFlavor.stringFlavor));

            for (int i = 1; i <= 29; i++) {

                robot.keyPress(KeyEvent.VK_TAB);
                Thread.sleep(800);
                robot.keyRelease(KeyEvent.VK_TAB);
                Thread.sleep(800);
                robot.keyPress(KeyEvent.VK_TAB);
                Thread.sleep(800);
                robot.keyRelease(KeyEvent.VK_TAB);
                Thread.sleep(800);
                robot.keyPress(KeyEvent.VK_TAB);
                Thread.sleep(800);
                robot.keyRelease(KeyEvent.VK_TAB);
                Thread.sleep(800);
                robot.keyPress(KeyEvent.VK_ENTER);
                Thread.sleep(200);
                robot.keyRelease(KeyEvent.VK_ENTER);
                Thread.sleep(20000);
                seleccionarTodo();
                copiarTodo();
                borrarURL();
                c = Toolkit.getDefaultToolkit().getSystemClipboard();
                System.out.println(c.getData(DataFlavor.stringFlavor));
            }
        }

    }

    public static void escribirURL(Integer n) throws AWTException, InterruptedException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        Thread.sleep(200);
        robot.keyPress(KeyEvent.VK_L);
        Thread.sleep(200);
        robot.keyRelease(KeyEvent.VK_L);
        Thread.sleep(200);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(200);
        String url = "";
        if (n > 9) {
            url = n.toString();
        } else {
            url = "0" + n.toString();
        }

        robot.keyPress(KeyEvent.VK_RIGHT);
        Thread.sleep(200);
        robot.keyRelease(KeyEvent.VK_RIGHT);
        Thread.sleep(200);
        robot.keyPress(KeyEvent.VK_LEFT);
        Thread.sleep(200);
        robot.keyRelease(KeyEvent.VK_LEFT);
        Thread.sleep(200);
        robot.keyPress(KeyEvent.VK_LEFT);
        Thread.sleep(200);
        robot.keyRelease(KeyEvent.VK_LEFT);
        Thread.sleep(200);
        robot.keyPress(KeyEvent.VK_DELETE);
        Thread.sleep(200);
        robot.keyRelease(KeyEvent.VK_DELETE);
        Thread.sleep(200);
        robot.keyPress(KeyEvent.VK_DELETE);
        Thread.sleep(200);
        robot.keyRelease(KeyEvent.VK_DELETE);
        Thread.sleep(200);

        for (int i = 0; i < url.length(); i++) {
            robot.delay(150);

            if (Character.isLetterOrDigit(url.charAt(i))) {
                robot.keyPress((int) Character.toUpperCase(url.charAt(i)));
                robot.keyRelease((int) Character.toUpperCase(url.charAt(i)));
            } else {
                robot.keyPress((int) url.charAt(i));
                robot.keyRelease((int) url.charAt(i));
            }
        }

        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(200);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(10000);
    }

    public static void tabuladorSalto() throws AWTException, InterruptedException {
        Robot robot = new Robot();
        for (int i = 0; i < 3; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            Thread.sleep(200);
        }
    }

    public static void buscarTexto() throws AWTException, InterruptedException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        Thread.sleep(200);
        robot.keyPress(KeyEvent.VK_F);
        Thread.sleep(200);
        robot.keyRelease(KeyEvent.VK_F);
        Thread.sleep(200);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(200);
        robot.keyPress(KeyEvent.VK_C);
        Thread.sleep(200);
        robot.keyRelease(KeyEvent.VK_C);
        Thread.sleep(200);
        robot.keyPress(KeyEvent.VK_A);
        Thread.sleep(200);
        robot.keyRelease(KeyEvent.VK_A);
        Thread.sleep(200);
        robot.keyPress(KeyEvent.VK_S);
        Thread.sleep(200);
        robot.keyRelease(KeyEvent.VK_S);
        Thread.sleep(200);
        robot.keyPress(KeyEvent.VK_A);
        Thread.sleep(200);
        robot.keyRelease(KeyEvent.VK_A);
        Thread.sleep(200);
        robot.keyPress(KeyEvent.VK_SPACE);
        Thread.sleep(200);
        robot.keyRelease(KeyEvent.VK_SPACE);
        Thread.sleep(200);
        robot.keyPress(KeyEvent.VK_E);
        Thread.sleep(200);
        robot.keyRelease(KeyEvent.VK_E);
        Thread.sleep(200);
        robot.keyPress(KeyEvent.VK_N);
        Thread.sleep(200);
        robot.keyRelease(KeyEvent.VK_N);
        Thread.sleep(200);
        robot.keyPress(KeyEvent.VK_SPACE);
        Thread.sleep(200);
        robot.keyRelease(KeyEvent.VK_SPACE);
        Thread.sleep(200);
        robot.keyPress(KeyEvent.VK_V);
        Thread.sleep(200);
        robot.keyRelease(KeyEvent.VK_V);
        Thread.sleep(200);
        robot.keyPress(KeyEvent.VK_E);
        Thread.sleep(200);
        robot.keyRelease(KeyEvent.VK_E);
        Thread.sleep(200);
    }

    public static void seleccionarTodo() throws AWTException, InterruptedException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        Thread.sleep(200);
        robot.keyPress(KeyEvent.VK_A);
        Thread.sleep(200);
        robot.keyRelease(KeyEvent.VK_A);
        Thread.sleep(200);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(200);
    }

    public static void copiarTodo() throws AWTException, InterruptedException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        Thread.sleep(200);
        robot.keyPress(KeyEvent.VK_C);
        Thread.sleep(200);
        robot.keyRelease(KeyEvent.VK_C);
        Thread.sleep(200);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(200);
    }

    public static void borrarURL() throws AWTException, InterruptedException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        Thread.sleep(200);
        robot.keyPress(KeyEvent.VK_W);
        Thread.sleep(200);
        robot.keyRelease(KeyEvent.VK_W);
        Thread.sleep(200);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(200);
    }

    public static void tareasVarias() throws AWTException, InterruptedException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ALT);
        Thread.sleep(200);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(200);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(200);
        robot.keyRelease(KeyEvent.VK_ALT);
        Thread.sleep(200);
        robot.keyPress(KeyEvent.VK_CONTROL);
        Thread.sleep(200);
        robot.keyPress(KeyEvent.VK_V);
        Thread.sleep(200);
        robot.keyRelease(KeyEvent.VK_V);
        Thread.sleep(200);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ALT);
        Thread.sleep(200);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(200);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(200);
        robot.keyRelease(KeyEvent.VK_ALT);
        Thread.sleep(200);
        }   
    }
