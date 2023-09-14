// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        CostumArrayListWrapper<String>costumList = new CostumArrayListWrapper<>();
        try {
            costumList.add("item 1 ");
            costumList.add("item 2 ");
            costumList.add(null);
            costumList.add("item 3");
        } catch (CustomException e) {
            System.out.println("Costum Exception "+e.getMessage());
        }
        System.out.println("list size:"+costumList.size());
    }

}