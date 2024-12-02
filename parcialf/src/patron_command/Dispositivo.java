/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patron_command;

/**
 *
 * @author alzat
 */
public class Dispositivo {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void ejecutarComando() {
        command.ejecutar();
    }
}
