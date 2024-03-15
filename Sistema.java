public class Sistema {
    private String cadena;
    
    public Sistema(String c)
    {
        this.cadena=c;
    }

    public void setCadena(String c)
    {
        this.cadena=c;
    }

    public String getCadena()
    {
        return this.cadena;
    }

    public int Funcionalidad1()
    {
        int totalVocales=0;
        int letra=0;
        for(letra=0; letra< cadena.length(); letra++)
        {
            char l = cadena.charAt(letra);
            if (l=='a' || l=='e' || l=='i' || l=='o' || l=='u') {
                totalVocales ++;
            }
        }
        return totalVocales;

    }

    public boolean Funcionalidad2()
    {
        int total2;
        total2= cadena.length()%2;
        if (total2==0) {
            return true;
        }
        else 
        {
          return false;
        }
    }
    public boolean Funcionalidad3(String letra)
    {
        int totalx=0; 
        int letras;
        for(letras=0; letras< cadena.length(); letras++)
        {
            char l = cadena.charAt(letras);
            if (String.valueOf(l).equals(String.valueOf(letra))) 
            {
                totalx ++;
            }
        }
        if (totalx > 0) {
            return true;
        }
        else 
        {
          return false;
        }
    }
    


}
