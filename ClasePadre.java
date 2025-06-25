public class ClasePadre {
    //las variable spirvadas sirven para guaradr la integridad de los datos
    // miembros de la clase (propiedades, atributos, campos)
    //No marca ninguna advertencia mientras que private si ya que necesita la creacion de sus geters y setters
    public int campo1;   //solo acepta valores positivos
    private int campo2;   //solo acepta valores negativos

    public int getCampo2() {
        return campo2;
    }

    public void setCampo2(int campo2) {
        if ( campo2 < 0)
            this.campo2 = campo2;
        else
            this.campo2 = 0;
    }
    

        @Override
    public String toString() {
        return "ClasePadre [campo1=" + this.campo1 + ", campo2=" + this.campo2 + "]";
    }


}