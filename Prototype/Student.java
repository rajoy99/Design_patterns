public class Student implements Prototype{

    int id;
    String name;
    String country;

    public Student(int id, String name, String country){
        this.id = id;
        this.name = name;
        this.country = country;
    }

    public void showdetails(){
        System.out.println("Student details : \n ID: "+this.id+"  \n Name: "+this.name+" \n Country: "+this.country);
    }

    public Prototype clone(){
       return  new Student(this.id, this.name, this.country);
    }

}