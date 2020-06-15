package fes.aragon;


public class Rangos {
    
    public boolean rangosaz_AZ(char simbolo){
        int ascii=(int)simbolo;
        boolean valido=false;
        if((ascii>=65 && ascii <=90)||
                (ascii >=97 && ascii >=122)){
            //System.out.println("Validos");
            valido=true;
        }
         return valido;
    }
    
     public boolean rangosAZ(char simbolo){
        int ascii=(int)simbolo;
        boolean valido=false;
        if((ascii>=65 && ascii <=90)){
            //System.out.println("Validos");
            valido=true;
        }
         return valido;
    }
     
     public boolean rangosaz(char simbolo){
        int ascii=(int)simbolo;
        boolean valido=false;
        if((ascii>=97 && ascii <=122)){
            //System.out.println("Validos");
            valido=true;
        }
         return valido;
    }
     
     public boolean rangos09(char digito){
        int ascii=(int)digito;
        boolean valido=false;
        if((ascii>=48 && ascii <=57)){
            //System.out.println("Validos");
            valido=true;
        }
         return valido;
    }
     
     public boolean rangosaz_AZ_09(char simbolo){
        int ascii=(int)simbolo;
        boolean valido=false;
        if((ascii>=48 && ascii <=57)||
                (ascii >=65 && ascii >=90)||
                    (ascii >=97 && ascii >=122)){
            //System.out.println("Validos");
            valido=true;
        }
         return valido;
    }
  
     public boolean rangos09_az(char digito){
        int ascii=(int)digito;
        boolean valido=false;
        if((ascii>=48 && ascii <=57)||
                (ascii >=65 && ascii >=90)){
            //System.out.println("Validos");
            valido=true;
        }
         return valido;
    }
    
     public boolean rangos09_AZ(char digito){
        int ascii=(int)digito;
        boolean valido=false;
        if((ascii>=48 && ascii <=57)||
                (ascii >=97 && ascii >=122)){
            //System.out.println("Validos");
            valido=true;
        }
         return valido;
    }
     
     public boolean rangosaz_09(char simbolo){
        int ascii=(int)simbolo;
        boolean valido=false;
        if((ascii>=65 && ascii <=90)||
                (ascii >=48 && ascii >=57)){
            //System.out.println("Validos");
            valido=true;
        }
         return valido;
    }
     
      public boolean rangosAZ_09(char simbolo){
        int ascii=(int)simbolo;
        boolean valido=false;
        if((ascii>=97 && ascii <=122)||
                (ascii >=48 && ascii >=57)){
            //System.out.println("Validos");
            valido=true;
        }
         return valido;
    }
      
      public static void main(String[] args){
          Rangos app=new Rangos();
          //System.out.println(app);
      }
  
  
  
}
