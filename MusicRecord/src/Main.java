
public class Main {
    public static void main(String[] args) {
    RecordManagment managment = new RecordManagment();
    Record validRecord = new Record("My Song ", 1995);
        try {
            managment.addRecord(validRecord);
        } catch (Exception e) {
            e.getMessage();
        }
        System.out.println("Records");
        managment.printRecord();
    }
}


