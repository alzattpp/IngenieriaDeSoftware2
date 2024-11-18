/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patronAdapter;

/**
 *
 * @author alzat
 */
public class Main {
    public static void main(String[] args) {
        ImpresoraLaser impresoraLaser = new ImpresoraLaser();
        ImpresoraInkJet impresoraInkJet = new ImpresoraInkJet();

        Impresora adapterLaser = new ImpresoraLaserAdapter(impresoraLaser);
        Impresora adapterInkJet = new ImpresoraInkJetAdapter(impresoraInkJet);

        adapterLaser.imprimir();
        adapterInkJet.imprimir();
    }
}