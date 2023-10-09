/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 11.09.2023
 * @author 
 */
 import java.util.Scanner;
 

public class Hauptklasse {
  
  public static void main(String[] args) {
    CD[] allMyCDs = new CD[50];
    
    for (int j = 0; j<50 ;j++ ) {
      String theInterpret ="";
      for (int i = 0; i<6 ; i++ ) {
        char c = (char) (Math.random()*25+65);
        theInterpret = theInterpret + c;
      } // end of for
      
      
      String theTitel ="";
      for (int i = 0; i<6 ; i++ ) {
        char c = (char) (Math.random()*25+65);
        theTitel = theTitel + c;
      } // end of for
      
      
      int theYear =(int) (Math.random() * 100 + 1923);
      
      
      
      
      CD theCD = new CD(theTitel, theInterpret, theYear);
      allMyCDs[j] = theCD;
    } // end of for
    
    CD_Regal theShelf = new CD_Regal(allMyCDs);
    theShelf.sort();
    theShelf.alleTitelAusgeben();
    
    for(int i = 0; i < 3; i++){  
      /* // Funktioniert nur im JAVA-EDITOR!
      String searchInterpret = InOut.readString("Welcher Interpret soll gel�scht werden:");
      String searchTitel = InOut.readString("Welcher Titel soll gel�scht werden: ");
      int searchJahr = InOut.readInt("Aus welchem Jahr ist die CD?:");
      // #### END InOut  */
      
      // Funktioniert in JAVA
      System.out.print("Interpret : ");
      Scanner scanner = new Scanner(System.in);
      String searchInterpret = scanner.nextLine();
      System.out.print("Title : ");
      String searchTitel = scanner.nextLine();
      System.out.print("Year : ");
      int searchJahr = scanner.nextInt();
      // END Scanner 
      
      //CD wantedCD = theShelf.cdSuchen(searchTitel, searchInterpret, searchJahr);
      
      theShelf.delete(searchTitel, searchInterpret, searchJahr);
      theShelf.alleTitelAusgeben();
    }
    //theShelf.cdSuchen(searchTitel);  
  } // end of main
  
} // end of class Hauptklasse

