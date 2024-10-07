package taller61;


public class LibreriaDVD {
    private DVD dvd;

    public LibreriaDVD(DVD dvd) {
        this.dvd = dvd;
    }

    public void realizarPrestamo() {
        dvd.prestar();
    }

    public void devolverPrestamo() {
        dvd.devolver();
    }
}
