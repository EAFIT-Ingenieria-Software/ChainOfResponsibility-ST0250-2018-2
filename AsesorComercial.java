public abstract class AsesorComercial
{
    private AsesorComercial nextAsesor;//Asesor que se contactará en caso de que éste no esté disponible
    private boolean disponible = true;//Por defecto cada asesor está disponible una vez creado

    /**
     * Define el siguiente asesor a contactar
     */
    public void setNext(AsesorComercial nextAses){
        this.nextAsesor = nextAses;
    }
    
    /**
     * Obtiene el siguiente asesor a contactar
     */
    public AsesorComercial getNext(){
        return this.nextAsesor;
    }
    
    /**
     * Establece su disponibilidad en true/false
     */
    public void setDisponib(boolean disp){
        this.disponible = disp;
    }
    
    /**
     * Obtiene la disponibilidad
     */
    public boolean getDisponib(){
        return this.disponible;
    }
    
    /**
     * Método para intentar establecer conexión con éste asesor
     */
    abstract public void contactar();
}
