/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patron_command;

/**
 *
 * @author alzat
 */
public class EncenderCommand implements Command {
    private Object dispositivo;

    public EncenderCommand(Object dispositivo) {
        this.dispositivo = dispositivo;
    }

    @Override
    public void ejecutar() {
        if (dispositivo instanceof Computador) {
            ((Computador) dispositivo).encender();
        } else if (dispositivo instanceof Celular) {
            ((Celular) dispositivo).encender();
        }
    }
}
