
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
}
