
public class Main {
    public static void main(String[] args) {

        Address postalAddress = new Address("Jhuddo ");
        Employee emp1 =new Employee(1, "Ahsan", postalAddress);
        emp1.display();
        System.out.println(emp1.getPostalAddress().city);
        test(emp1);

        Address postalAddress1 = new Address("Jhuddo ");
        Employee emp2 =new Employee(2, "Aina", postalAddress1);
        emp2.display();
        System.out.println(emp2.getPostalAddress().city);
        test2(emp2);

    }
    public static void test(Employee emp){

        emp.getPostalAddress().streetAddress="near exchange tower ";
        System.out.println(emp.getPostalAddress().streetAddress);
    }
    public static void test2(Employee emp){

        emp.getPostalAddress().streetAddress="near bhittai clinic ";
        System.out.println(emp.getPostalAddress().streetAddress);
    }
}
