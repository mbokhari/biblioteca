import java.util.*;

public class BibliotecaMenu {

    private ArrayList<String> menuOptions = new ArrayList();

    public BibliotecaMenu(ArrayList<String> menuOptions) {
        this.menuOptions = menuOptions;
    }


    public ArrayList<String> returnAllMenuItems() {
       System.out.println(menuOptions);
       return menuOptions;
    }
}

