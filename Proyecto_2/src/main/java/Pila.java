import java.util.Stack;

public class Pila {
    private Stack<String> pila;

    public Pila() {
        pila=new Stack();
    }

    public void agregar(String dato) {
        pila.push(dato);
    }

    public String eliminar(){
        return pila.pop();
    }

    public int tamanio(){
        return pila.size();
    }


}
