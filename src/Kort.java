public class Kort{
    private char farve; // S,H,R,K
    private int værdi; // 0 til 12

    public Kort (char farve, int værdi)	{
        this.farve = farve;
        this.værdi = værdi;

    }

    public String toString() {
        String out = "";
        switch (farve) {
            case 'S':
                out += "Spar ";
                break;
            case 'H':
                out += "Hjerte ";
                break;
            case 'R':
                out += "Ruder ";
                break;
            case 'K':
                out += "Klør ";
                break;
        }
        if (værdi == 0) {
            out += "Es";
        } else if (værdi >= 10) {
            switch (værdi) {
                case 10:
                    out += "Knægt";
                    break;
                case 11:
                    out += "Dame";
                    break;
                case 12:
                    out += "Konge";
                    break;
            }
        } else if ((værdi > 0)) {
            out += værdi + 1;
        }
        return out;
    }
}


