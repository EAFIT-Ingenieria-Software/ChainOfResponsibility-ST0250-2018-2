public class Asesor03 extends AsesorComercial
{
    public void contactar(){
        if(getDisponib()){
            System.out.println("Buenos días centro de servicio"+
            " al cliente de Burritos LATAM soy Damiam, ¿Con quién tengo el gusto?");
        }else{
            getNext().contactar();
        }
    } 
}