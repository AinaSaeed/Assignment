import jdk.jfr.consumer.RecordedObject;

import java.util.ArrayList;

public class RecordManagment {
    ArrayList<Record>RecObj = new ArrayList<>();
    public void addRecord(Record r) throws  Exception{
        int year = r.getYear();
        if (year < 1996 || year > 2023)throw
                new RecordException("Invalid year for record . Yeaar must be between 1996 - 2023");
          RecObj.add(r);
    }
    public void printRecord(){
        for(Record record: RecObj){
            System.out.println("Name:" + record.getName()+"year"+record.getYear());
        }
    }
}
