package vonalprogram;

public class VonalProgram {

   
    public static void main(String[] args) {
        
        //new VonalProgram().hasznalatiEsetek();  //ugyanaz mint:
        //new VonalProgram().tesztEsetek();      //VonalProgram prg = new VonalProgram();
                                                //csak nem kap referenciát mert 
                                               //többször nem fogjuk hívni csak itt egyszer
                                            
        new VonalProgram().feladat();  
        
    }
    
    private void feladat(){
        hasznalatiEsetek();
        tesztEsetek();
    }
    
    public void hasznalatiEsetek(){
        Vonal v0 = new Vonal(0);
        Vonal v1 = new Vonal(7);
        Vonal v2 = new Vonal(10,"sárga");
        //Vonal v3 = new Vonal(6,"kék","pont");
        Vonal v3 = new Vonal(6,"kék",Vonal.VonalStilus.Pont);
        //Vonal v4 = new Vonal(3,"piros","dupla",5);
        Vonal v4 = new Vonal(3,"piros",Vonal.VonalStilus.Dupla,5);
        
        v0.rajzol();
        v1.rajzol();
        v2.rajzol();
        v3.rajzol();
        v4.rajzol();
        
        System.out.println(v0.toString());
        System.out.println(v1.toString());
        System.out.println(v2.toString());
        System.out.println(v3.toString());
        System.out.println(v4.toString());
    }
    
    public void tesztEsetek(){
        /*a színek a string típus miatt lehetnek 
        még hibásak, azt is Enummal kell
        megírni mint a típust
        */
        Vonal h0 = new Vonal();
        Vonal h1 = new Vonal(-5);
        Vonal h2 = new Vonal(5,"");
        Vonal h3 = new Vonal(5,"red");
        //Vonal h4 = new Vonal(5,"piros","dotted");
        Vonal h4 = new Vonal(5,"piros",Vonal.VonalStilus.Pont);
        //Vonal h5 = new Vonal(5,"red","");
        Vonal h5 = new Vonal(5,"red",Vonal.VonalStilus.Szaggatott);
        //Vonal h6 = new Vonal(5,"pont","kék");
        
        Vonal h7 = new Vonal(5,null,null,2);
        //Vonal h8 = new Vonal(5,"sárga","szaggatott",-3);
        Vonal h8 = new Vonal(5,"sárga",Vonal.VonalStilus.Szaggatott,-3);
        
        System.out.println(h0);
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
        System.out.println(h4);
        System.out.println(h5);
        //System.out.println(h6);
        System.out.println(h7);
        System.out.println(h8);
    }
    
    
    
}
