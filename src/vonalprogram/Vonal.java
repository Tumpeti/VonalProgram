package vonalprogram;

public class Vonal {
    
    public enum VonalStilus{Szimpla,Dupla,Pont,Szaggatott};
    private VonalStilus tipus;
    
    public static final String piros= "\u001B[31m";
    public static final String sárga= "\u001B[33m";
    public static final String zöld= "\u001B[32m";
    public static final String kék= "\u001B[34m";
    public static final String reset= "\u001B[0m";
    
    private int hossz;
    private String szin;
    //private String tipus;
    private int eltolas;

    public Vonal(int hossz, String szin, VonalStilus tipus, int eltolas) {
//        this.hossz = hossz;
//        this.szin = szin;
//        this.tipus = tipus;
//        this.eltolas = eltolas;
        setHossz(hossz);
        setSzin(szin);
        setEltolas(eltolas);
        setTipus(tipus);
    }

    public VonalStilus getTipus() {
        return tipus;
    }

    public void setTipus(VonalStilus tipus) {
        if(tipus==null){
            tipus = VonalStilus.Szimpla;
        }
        this.tipus = tipus;
    }

    public int getHossz() {
        return hossz;
    }

    public void setHossz(int hossz) {
        if(hossz<=0){
            hossz =1;
        }
        this.hossz = hossz;
    }

    public String getSzin() {
        return szin;
    }

    public void setSzin(String szin) {
        if(szin==null || szin.length()<3){
            szin = "fekete";
        }
        this.szin = szin;
    }

    public int getEltolas() {
        return eltolas;
    }

    public void setEltolas(int eltolas) {
        this.eltolas = eltolas;
    }
    
    

    public Vonal(int hossz, String szin, VonalStilus tipus) {
        this(hossz,szin,tipus,0);
    }
    
    public Vonal(int hossz, String szin) {
        this(hossz,szin,VonalStilus.Szimpla,0);
    }
    
    public Vonal(int hossz) {
        this(hossz,"fekete",VonalStilus.Szimpla,0);
    }
    
    public Vonal() {
        this(1,"fekete",VonalStilus.Szimpla,0);
    }

    @Override
    public String toString() {
        return "Vonal{" + "hossz=" + hossz + ", szin=" + szin + ", tipus=" + tipus + ", eltolas=" + eltolas + '}';
    }

    void rajzol() {
        //eltolás
        for (int i = 0; i < this.eltolas; i++) {
            System.out.print(" "); //ciklusba rakáshoz: alt+enter -> for
        }
        
        //típus
        char jel;
        switch (this.tipus){
            default:jel='_';break;
            
            case Szimpla: jel ='_';break;
            case Dupla: jel ='=';break;
            case Pont: jel ='.';break;
            case Szaggatott: jel ='-';break;
                      
        }        
        
        
        
        //színezés
        
        String sz;
        switch (this.szin){
            default: //sz=""; break;
            case "piros" : sz=Vonal.piros;break;
            case "sárga" : sz=Vonal.sárga;break;
            case "kék" : sz=Vonal.kék;break;
            case "zöld" : sz=Vonal.zöld;break;
        }
        
        //hossz
        for (int i = 0; i < this.hossz; i++) {
            System.out.print(sz+jel+Vonal.reset); //ciklusba rakáshoz: alt+enter -> for
        }
        
        }
   
}
