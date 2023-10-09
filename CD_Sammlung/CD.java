/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 08.09.2023
 * @author 
 */

public class CD {
  
  // Anfang Attribute
  private String titel;
  private String interpret;
  private int erscheinungsjahr;
  // Ende Attribute
  
  public CD(String titel, String interpret, int erscheinungsJahr) {
    this.titel = titel;
    this.interpret = interpret;
    this.erscheinungsjahr = erscheinungsJahr;
  }

  // Anfang Methoden
  public String getTitel() {
    return titel;
  }

  private void setTitel(String titelNeu) {
    titel = titelNeu;
  }

  public String getInterpret() {
    return interpret;
  }

  private void setInterpret(String interpretNeu) {
    interpret = interpretNeu;
  }

  public int getErscheinungsjahr() {
    return erscheinungsjahr;
  }

  private void setErscheinungsjahr(int erscheinungsjahrNeu) {
    erscheinungsjahr = erscheinungsjahrNeu;
  }

  // Ende Methoden
} // end of CD

