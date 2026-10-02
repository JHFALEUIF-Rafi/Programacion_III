import java.util.Stack;

public class Pila {
    private Stack<Integer> coleccion;

    public Pila() {
        coleccion = new Stack<>();
    }

    public void push(Integer dato) {
        coleccion.push(dato);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Integer dato : coleccion) {
            sb.append(dato).append(" ");
        }
        return sb.toString().trim();
    }
}
