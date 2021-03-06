package internet_store.UI.product;

import internet_store.UI.InputCheckUtility;
import internet_store.UI.UIAction;
import internet_store.database.product.ProductDatabase;
import internet_store.domain.Product;
import internet_store.services.product.FindAllByTitleService;

import java.util.List;

public class FindAllByTitleUIAction implements UIAction {

    private FindAllByTitleService findAllByTitle;
    InputCheckUtility inputCheckUtility = new InputCheckUtility();

    public FindAllByTitleUIAction(FindAllByTitleService findAllByTitle) {
        this.findAllByTitle = findAllByTitle;
    }

    public void execute(){
        String title = inputCheckUtility.inputValidString("Please enter product's title for search: ");

        List<Product> result = findAllByTitle.execute(title);
        if (result.size() == 0){
            System.out.println("Product with title " + title +" isn't present in database");
        }else{
            result.forEach(System.out::println);
        }
    }

}

