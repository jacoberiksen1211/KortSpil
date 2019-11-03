import java.util.ArrayList;

public class Spil {
    private Kort[] kort;

    public Spil() {
        kort = new Kort[52];
        inispil();
    }

    private void inispil(){
        // hjælpemetode der initialiserer kort, dvs fylder listen med kort
        for(int i = 0; i < kort.length; i++){
            if(i < 13){
                kort[i] = new Kort('S',i);
            }
            else if(i < 26){
                kort[i] = new Kort('H',i-13);
            }
            else if(i < 39){
                kort[i] = new Kort('R',i-26);
            }
            else if(i < 52){
                kort[i] = new Kort('K',i-39);
            }
        }
    }

    public Kort trækkort(){
        // metode der trækker og returnerer øverste kort i bunken og herefter lægger det til sidst i bunken
        Kort out = kort[0];

        for(int i = 0; i < kort.length-1; i++){
            kort[i] = kort[i+1];
        }
        kort[51] = out;
        return out;
    }


    public void blandkort(){
        // metode der blander kortbunken
        java.util.Random random = new java.util.Random();
        boolean[] kortTaget = new boolean[52];//skal vise om kortet er "taget"
        int nummer = random.nextInt(kort.length);
        Kort[] liste = new Kort[kort.length];
        for(int i = 0; i< kort.length; i++){
            liste[i] = kort[i];
        }

        for(int i = 0; i < kort.length; i++){
            while(kortTaget[nummer]==true) {
                  nummer = random.nextInt(52);
            }
            kort[i] = liste[nummer];
            kortTaget[nummer] = true;
        }

    }


    public String toString(){
        // Printer alle kortene i dækket ved at bruge kortenes toString metode
        String out = "";
        for(int i = 0; i < kort.length; i++){
            out += kort[i].toString()+"\n";
        }
        return out;
    }

}
