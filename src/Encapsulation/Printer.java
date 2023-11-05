package Encapsulation;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int getPagesPrinted(){
        return pagesPrinted;
    }
    public int addToner(int tonerAmount){
//        tonerLevel += tonerAmount;
//        if(tonerLevel<0){
//            return -1;
//        }
//        else if(tonerLevel>100){
//            tonerLevel = 100;
//        }
//        System.out.println("Toner replenished. Toner level: " + tonerLevel);

//        int tempAmount = tonerAmount + tonerLevel;
//        if(tempAmount > 100 || tempAmount < 0){
//            return -1;
//        }
//        tonerLevel+=tonerAmount;

        tonerLevel = tonerAmount >= 0 && tonerAmount <= 100 ? ((tonerLevel + tonerAmount) > 100? -1 : tonerLevel + tonerAmount) : -1;
        return tonerLevel;
    }

    public int printPages(int pages){
        int sheets = 0;
        tonerLevel-= pages;
        if(duplex){
            sheets = (int) Math.ceil((double)pages / 2);
            System.out.println("Printer is duplex-printer. Sheets used: " + sheets);
        } else {
            sheets = pages;
            System.out.println("Printer is single-page. Sheets used: " + sheets);
        }
        pagesPrinted+=sheets;
        System.out.println("Toner level: " + tonerLevel);
        return sheets;
    }

    @Override
    public String toString() {
        return "Printer{" +
                "tonerLevel=" + tonerLevel +
                ", pagesPrinted=" + pagesPrinted +
                ", duplex=" + duplex +
                '}';
    }
}
