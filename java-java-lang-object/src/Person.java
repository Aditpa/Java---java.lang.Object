import java.util.Objects;

public class Person {

    private static int nextId=1;



    private int id = nextId++;
    private final Person parent;

    public int getId() {
        return id;
    }

    public Person getParent() {
        return parent;
    }

    public Person(){
      this.parent =this;
  }

    public Person(Person parent){
        this.parent =parent;
    }

    @Override
    public boolean equals(Object obj){
        if(obj==null){
            return false;
        }
        if(this==obj){
            return true;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        Person person = (Person) obj;


        return Objects.equals(parent.id,person.id);
    };
}
