public class Ahne
{
    private String vorname;
    private String nachname;
    private char geschlecht;
    
    public Ahne(String pVorname, String pNachname, char pGeschlecht)
    {
      vorname = pVorname;
      nachname = pNachname;
      geschlecht = pGeschlecht;
    }
    
    public String getVorname(){
     return vorname;
    }
    
    public String getNachname(){
     return nachname;
    }
    
    public char getGeschlecht(){
     return geschlecht;
    }
    
    public void setVorname(String pVorname){
     vorname = pVorname;
    }
    
     public void setNachname(String pNachname){
     nachname = pNachname;
    }
    
     public void setVorname(char pGeschlecht){
     geschlecht = pGeschlecht;
    }
}
