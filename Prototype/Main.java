public class Main {

    public static void main(String[] args){

            Student tangut= new Student(74,"Tangut","Mongolia");

            tangut.showdetails();

            Student rega = (Student) tangut.clone();

            rega.showdetails();

    }

}