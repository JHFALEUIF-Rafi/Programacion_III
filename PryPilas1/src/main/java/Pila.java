import java.util.Stack;

public class Pila {
    private Stack<Url> coleccion;

    public Pila() {
        coleccion = new Stack<>();
    }

    public boolean agregar(Url dato) {
        if (dato != null) {
            coleccion.push(dato);
            return true;
        }
        return false;
    }

    public String peek() throws Exception {
        if (coleccion.isEmpty()) {
            throw new Exception("No existen elementos");
        }
        return coleccion.peek().toString();
    }

    public int size() {
        return coleccion.size();
    }

    public String pop() throws Exception {
        if (coleccion.isEmpty()) {
            throw new Exception("No existen elementos");
        }
        return coleccion.pop().toString();
    }

    public String Listar(){
        StringBuilder sb = new StringBuilder();
        for (Url url : coleccion) {
            sb.append(url.toString()).append("\n");
        }
        return sb.toString().isEmpty()? "No existen elementos" : sb.toString();
    }
}
