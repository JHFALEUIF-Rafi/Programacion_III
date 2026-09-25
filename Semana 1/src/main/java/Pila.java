import java.util.Stack;

public class Pila {
    Stack<String> coleccion;

    public Pila(){
        coleccion = new Stack<>();
    }

    public void push(String coleccion) throws Exception {
        if(dato != null){
            coleccion.push(dato);
        }
        throw new Exception("No se puede enviar o guardar datos nulos");
    }

    public String pop() throws Exception {
        if(coleccion.isEmpty()){
            throw new Exception("No hay elementos en la pila");
            return coleccion.pop();
        }
    }
}
