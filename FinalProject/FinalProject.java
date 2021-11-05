//Sekou Hera

public abstract class FinalProject {
    public static void main(String[] args) {
        System.out.println("Welcome to Jamesons Pub");

        Menu[] menuitem = new Menu[10];
        Menu food1 = new Menu("Irish Nachos",11.49);
        Menu food2 = new Menu("Spinach and Artichoke Dip",9.99);
        Menu food3 = new Menu("Prime Rib Chili Skillet",8.59);
        Menu food4 = new Menu("Prime Rib Sliders",12.99);
        Menu food5 = new Menu("Prime Rib Sandwich",14.79);
        Menu food6 = new Menu("Prime Rib tacos",13.99);
        Menu food7 = new Menu("Marinara Meatballs",9.89);
        Menu food8 = new Menu("Jameson BBQ Chicken Sandwich",12.79);
        Menu food9 = new Menu("Fish & Chips Dinner",17.99);
        Menu food10 = new Menu("Prime Rib Entree",17.89);

            menuitem[0] = food1;
            menuitem[1] = food2;
            menuitem[2] = food3;
            menuitem[3] = food4;
            menuitem[4] = food5;
            menuitem[5] = food6;
            menuitem[6] = food7;
            menuitem[7] = food8;
            menuitem[8] = food9;
            menuitem[9] = food10;

            System.out.println(menuitem[0].name);
            System.out.println(menuitem[0].price);
            System.out.println(menuitem[1].name);
            System.out.println(menuitem[1].price);
            System.out.println(menuitem[2].name);
            System.out.println(menuitem[2].price);
            System.out.println(menuitem[3].name);
            System.out.println(menuitem[3].price);
            System.out.println(menuitem[4].name);
            System.out.println(menuitem[4].price);
            System.out.println(menuitem[5].name);
            System.out.println(menuitem[5].price);
            System.out.println(menuitem[6].name);
            System.out.println(menuitem[6].price);
            System.out.println(menuitem[7].name);
            System.out.println(menuitem[7].price);
            System.out.println(menuitem[8].name);
            System.out.println(menuitem[8].price);
            System.out.println(menuitem[9].name);
            System.out.println(menuitem[9].price);

    }

    public static class Menu {
        String name;
        double price;

        Menu(String name, double price){
    this.name = name;
    this.price = price;
        }
    }
}
