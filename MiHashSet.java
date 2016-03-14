
/**
 * Write a description of class MiHashSet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiHashSet
{

    private ArrayListInt arrayInt; //Utilizo la clase ArrayListInt

    /**
     * Constructor for objects of class MiHashSet
     */
    public MiHashSet()
    {
        arrayInt = new ArrayListInt(); // creamos un objeto cogiendo la clase ArrayListInt
    }

    /**
     * Metodo que añade el elemento al conjunto si no estaba. 
     * Devuelve verdadero en caso de que el elemento no estuviera presente en el conjunto
     * y falso en caso contrario.
     */
    public boolean add(int valor)
    {
        boolean existe = true;

        if(!(arrayInt.contains(valor))) // compruebo que mi array contiene el elemento
        {
            arrayInt.add(valor); // si no existe lo añado
        }
        else
        {
            existe = false;
        }
        return existe;
    }

    /**
     * Metodo que vacia el conjunto
     */
    public void clear()
    {
        arrayInt.clear();
    }

    /**
     * Metodo que devuelve verdadero si el conjunto contiene el elemento, falso en caso contrario.
     */
    public boolean contains(int elemento)
    {
        boolean existe = true;
        if (!arrayInt.contains(elemento)){
            existe = false;        
        } 
        return existe;
    }

    /**
     * Metodo que devuelve verdadero si el conjunto no contiene elementos
     */
    public boolean isEmpty() {
        boolean existe = false;
        if (arrayInt.isEmpty() == true){
            existe = true;        
        } 
        return existe;          
    }

    /**
     * Metodo que elimina del conjunto el elemento dado. Si no existiera devuelve falso; si existía en el conjunto devuelve verdadero.
     */
    public boolean remove(int elemento) {
        boolean existe = false;
        if (contains(elemento) == true){
            arrayInt.remove(elemento);       
        } else {
            existe = true;        
        }
        return existe;
    }

    /**
     *  devuelve el número de elementos del conjunto.
     */

    public int size() {
        
        return arrayInt.size();
        
    }
}
