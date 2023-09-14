public class Employee {
    private  int id;
    private String name;
   private  Address postalAddress;
    public Employee(int id, String name) {
        setId(id);
        setName(name);

    }

    public Employee(int id, String name, Address postalAddress) {
        this(id , name);
        setPostalAddress(postalAddress);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

        public String getName() {
            return name;
        }

    public void setName(String name) {
        this.name = name;
    }

    public Address getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(Address postalAddress) {
        this.postalAddress = postalAddress;
    }

    public  void display(){
        System.out.println( id);
        System.out.println(name);


    }

}
