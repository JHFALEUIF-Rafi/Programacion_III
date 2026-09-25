import static org.junit.jupiter.api.Assertions.*;

class PilaTest {
    Pila pila1;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        pila1=new Pila();
    }

    @org.junit.jupiter.api.Test
    void agregar() {
        assertEquals(0,pila1.tamanio());
        pila1.agregar("Ana");
        assertEquals(1,pila1.tamanio());
        assertEquals("Ana", pila1.eliminar());
    }

    @org.junit.jupiter.api.Test
    void eliminar() {
        pila1.agregar("A");
        pila1.agregar("B");
        pila1.agregar("C");
        assertEquals("C",pila1.eliminar());
        assertEquals(2,pila1.tamanio());
    }

    @org.junit.jupiter.api.Test
    void tamanio() {
        assertEquals(0,pila1.tamanio());
    }
}