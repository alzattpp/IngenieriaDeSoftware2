/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patron_builder;

/**
 *
 * @author alzat
 */
public class Hamburguesa {
    private String tipoTomate;
    private String tipoCarne;
    private String tipoQueso;
    private String tipoPan;

    private Hamburguesa(HamburguesaBuilder builder) {
        this.tipoTomate = builder.getTipoTomate();
        this.tipoCarne = builder.getTipoCarne();
        this.tipoQueso = builder.getTipoQueso();
        this.tipoPan = builder.getTipoPan();
    }

    @Override
    public String toString() {
        return "Hamburguesa (Tomate=" + tipoTomate + ", Carne=" + tipoCarne + 
               ", Queso=" + tipoQueso + ", Pan=" + tipoPan + ")";
    }

    public static class Builder implements HamburguesaBuilder {
        private String tipoTomate;
        private String tipoCarne;
        private String tipoQueso;
        private String tipoPan;

        @Override
        public Builder setTipoTomate(String tipoTomate) {
            this.tipoTomate = tipoTomate;
            return this;
        }

        @Override
        public Builder setTipoCarne(String tipoCarne) {
            this.tipoCarne = tipoCarne;
            return this;
        }

        @Override
        public Builder setTipoQueso(String tipoQueso) {
            this.tipoQueso = tipoQueso;
            return this;
        }

        @Override
        public Builder setTipoPan(String tipoPan) {
            this.tipoPan = tipoPan;
            return this;
        }

        @Override
        public Hamburguesa build() {
            return new Hamburguesa(this);
        }

        public String getTipoTomate() {
            return tipoTomate;
        }

        public String getTipoCarne() {
            return tipoCarne;
        }

        public String getTipoQueso() {
            return tipoQueso;
        }

        public String getTipoPan() {
            return tipoPan;
        }
    }
}
