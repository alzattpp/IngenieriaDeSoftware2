package taller4;

public class Main {

    public static void main(String[] args) {

        Calculo calculoIva = new CalculoImpuestoIva("Papitas", 2, 10000);
        Factura factura = new Factura();
        double impuesto = factura.procesarCalculoImpuesto(calculoIva);
        System.out.println(impuesto);

        Calculo calculoRetIva = new CalculoImpuestoReteIva("Bolsas", 3, 20000);
        Calculo calculoSaludable = new CalculoImpuestoSaludable("Zanahoria", 1, 5000);

        System.out.println("Impuesto IVA: " + factura.procesarCalculoImpuesto(calculoIva));
        System.out.println("Impuesto Retencion IVA: " + factura.procesarCalculoImpuesto(calculoRetIva));
        System.out.println("Impuesto IVA Saludable: " + factura.procesarCalculoImpuesto(calculoSaludable));
    }
}
