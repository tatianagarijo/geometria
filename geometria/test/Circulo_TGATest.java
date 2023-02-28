package geometria;

import static org.junit.Assert.*;

import org.junit.Test;

public class Circulo_TGATest {

    @Test
    public void area() {
        Circulo_TGA cir0 =new Circulo_TGA (0, "circulo");
        assertEquals(0, cir0.area(), 0);

        Circulo_TGA cir7 =new Circulo_TGA (7, "circulo");
        assertEquals(153.9384, cir7.area(), 0);

        Circulo_TGA cir3 =new Circulo_TGA (-3, "circulo");
        assertEquals(-18.8496, cir3.area(), 0);
    }

    @Test
    public void perimetro() {
        Circulo_TGA cir0 =new Circulo_TGA (0, "circulo");
        assertEquals(0, cir0.perimetro(), 0);

        Circulo_TGA cir7 =new Circulo_TGA (7, "circulo");
        assertEquals(43.9824, cir7.perimetro(), 0);

        Circulo_TGA cir3 =new Circulo_TGA (-3, "circulo");
        assertEquals(-18.8496, cir3.perimetro(), 0);
    }
}