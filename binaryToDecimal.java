import java.util.*;

/* Ce code a pour obectif de convertir un octet en decimal */
class binaryToDecimal {
    public static void main(String[] args) {
        conversion conversion = new conversion();
        int resultat = conversion.octetToDecimal(11100001);
        System.out.println(resultat);

       
    }

        
}

class conversion {
    int octet;
    public int octetToDecimal(int octet) {
        this.octet = octet ;
        String sep_octet = String.valueOf(octet);

        if (sep_octet.length() == 8) {
            int resultat_temp = 0 ;
            int puissance = 7 ;


            for (int i = 0; i < 8; i++){
                int  chiffre_temp = Character.getNumericValue(sep_octet.charAt(i));

                
                if (chiffre_temp > 0){
                 resultat_temp = resultat_temp + (int) Math.pow(2, puissance); 
                 puissance -=1;      
                }

                else {
                    puissance -=1;
                }                     
            }
            return resultat_temp;
        }

        else {
            return  1;
        }

        

    }

}