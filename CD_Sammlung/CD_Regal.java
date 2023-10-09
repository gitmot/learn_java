/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 08.09.2023
 * @author 
 */

public class CD_Regal {
  
  // Anfang Attribute
  private CD[] cds;
  // Ende Attribute
  
  public boolean cdEinfuegen(String titel, String interpreten, int erscheinungsjahr) {
    this.cds = new CD[50];
    return false;
  }
  
  
  public CD_Regal(CD[] allMyCDs) {
    this.cds = allMyCDs;
  } 
  
  public boolean delete(String titel, String interpret, int erscheinungsjahr){
    
    for (int i = 0; i < this.cds.length ; i++ ) {
      
      if(cds[i] != null && cds[i].getTitel().equals(titel) 
      && cds[i].getInterpret().equals(interpret) 
      && cds[i].getErscheinungsjahr() == erscheinungsjahr){
        
        for (int j = i;j < this.cds.length-1 ; j++ ) {
          if(cds[j+1]!= null){
            cds[j] = cds[j+1];
            if((j+1)== this.cds.length-1){
              cds[j+1] = null;
            }
          } // end of for
          else{
            cds[j] = null;
            return true;
            
          }          
        }
      }
    }
    return false;
  }
  // Anfang Methoden
  public void sort(){
    int n = cds.length;  
    for (int j = 1; j < n; j++) {  
      CD tmp = cds[j];  
      int i = j-1;  
      while ( (i > -1) && ( cds[i].getErscheinungsjahr() > tmp.getErscheinungsjahr() ) ) {  
        cds[i+1] = cds[i];  
        i--;  
      }  
      cds[i+1] = tmp;  
    }  
  } //insertionsort 
    
    
    
  public CD cdSuchen(String interp){
    for (int i = 0;i < this.cds.length ; i++) {
      if(cds[i] != null){
        
        if(cds[i].getInterpret().equals(interp)){
          System.out.println("Eine CD vom " + interp + " wurde in Fach " 
          + (i+1) + " gefunden");
          return cds[i];      
        } // end of for
        
      }
    }
    
    System.out.println("Die CD wurde nicht gefunden!");
    return null;
  }
    
  public CD cdSuchen(String titel, String interpret, int erscheinungsjahr) {
    // TODO hier Quelltext einfügen
    for (int i = 0; i < this.cds.length ; i++ ) {
      
      if(cds[i] != null){
        
        if(cds[i].getTitel().equals(titel) 
        && cds[i].getInterpret().equals(interpret) 
        && cds[i].getErscheinungsjahr() == erscheinungsjahr){
          
          System.out.println("Die CD von " + interpret + ", mit dem Titel "
          + titel + " aus dem Jahr " + erscheinungsjahr 
          + " wurde in Fach " + (i+1) + " gefunden");
          return cds[i];
        }
        
      }
      
    } // end of for
    
    System.out.println("Die CD wurde nicht gefunden!");
    return null;
  }
    
  public boolean alleTitelAusgeben() {
    // TODO hier Quelltext einfügen
    
    for (int i = 0; i < cds.length ; i++ ) {
      if(cds[i] != null){
        
        System.out.println("Im Regal Nr" + (i+1) + " steht:");
        System.out.println("Interpret: " + cds[i].getInterpret());
        System.out.println("Titel: " + cds[i].getTitel());
        System.out.println("Erscheinungsjahr: " + cds[i].getErscheinungsjahr());
        System.out.println("##########################################");
      }
    } // end of for
    return true;
  }
    
    // Ende Methoden
} // end of CD_Regal
    
