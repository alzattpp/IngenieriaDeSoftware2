/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patron_builder;

/**
 *
 * @author alzat
 */
public interface HamburguesaBuilder {
    HamburguesaBuilder setTipoTomate(String tipoTomate);
    HamburguesaBuilder setTipoCarne(String tipoCarne);
    HamburguesaBuilder setTipoQueso(String tipoQueso);
    HamburguesaBuilder setTipoPan(String tipoPan);
    Hamburguesa build();

    public String getTipoTomate();

    public String getTipoQueso();

    public String getTipoCarne();

    public String getTipoPan();
}
