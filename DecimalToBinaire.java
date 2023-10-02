import java.util.*;
public class DecimalToBinaire {
    public static void main(String[] args) {
        calculbinaire calcul = new calculbinaire();
        calcul.binaireToDecimal(154);
    }
}
 class calculbinaire {
    int n;
    public   void binaireToDecimal(int n) {
        List<Integer> listChiffre = new ArrayList<Integer>();

        while (n>0){
            if (n >= 128){
                n -=128;
                listChiffre.add(1);   
            }
                else {
                    listChiffre.add(0);
                }
            
            if (n >= 64){
                n-= 64;
                listChiffre.add(1);

            }
                else {
                    listChiffre.add(0);
                }
            
            if (n >= 32){
                n-= 32;
                listChiffre.add(1);
        }
                else {
                    listChiffre.add(0);
                }
        
        if (n >= 16){
            n-= 16;
            listChiffre.add(1);
        }
            else {
                listChiffre.add(0);
            }
        
        if (n >= 8){
            n-= 8;
            listChiffre.add(1);
        }
            else {
                listChiffre.add(0);
            }
        
        if (n >= 4){
            n-= 4;
            listChiffre.add(1);
        }
            else {
                
                listChiffre.add(0);
            }
        
        if (n >= 2){
            n-= 2;
            listChiffre.add(1);
        }
            else {
                listChiffre.add(0);
                break;
                
            }
        break;

     
        }
           for (int element : listChiffre) {
            System.out.print(element);
    
    }
    }


}
   
