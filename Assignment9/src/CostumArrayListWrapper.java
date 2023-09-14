import java.util.ArrayList;

public class CostumArrayListWrapper <E>{
    private ArrayList<E>arrayList;

    public CostumArrayListWrapper(){
        int i;
       ArrayList arrayList = new ArrayList<>();
    }
    public void add(E elements)throws  CustomException{
        if (elements == null){
            throw new CustomException("null elementsare not Allowed");
        }
            arrayList.add(elements);
        }
        public E get(int index){
        return arrayList.get(index);
    }
    public int size(){
        return arrayList.size();
    }
}
