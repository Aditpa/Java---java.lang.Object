public class Main {

    public static void main(String[] args) {

        Person per1 = new Person();
        Person per2=new Person();
        Person per3=new Person(per1);


        System.out.println("per1, id: " + per1.getId() + ", parent: " + per1.getParent().getId());
        System.out.println("per2, id: " + per2.getId() + ", parent: " + per2.getParent().getId());
        System.out.println("per3, id: " + per3.getId() + ", parent: " + per3.getParent().getId());


        if(per3.equals(per1)) {System.out.println("per1 and per3 are the same Person");
        }else {
            System.out.println("per6 and per7 are Not the same Person");
        }
    }
}
