
public class Printer {
    private int paper;
    private int toner;

    public Printer(int paper,int Toner){
        this.paper = paper;
        this.toner = Toner;
    }

    public void print(int sheets, int copies){
        if (sheets*copies<=paper && sheets*copies<=toner){

            paper-= sheets*copies;
            toner -= sheets*copies;
        }
    }


    public int getPaper() {
        return paper;
    }

    public int getToner(){
        return toner;
    }
}
