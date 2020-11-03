package dental_clinic.UI;

import dental_clinic.CardDatabase;

class PrintCardBaseUIAction implements UIAction {

    private CardDatabase cardDatabase;

    public PrintCardBaseUIAction(CardDatabase cardDatabase){
        this.cardDatabase = cardDatabase;
    }

    public void execute(){

        cardDatabase.printDatabase();

    }

}
