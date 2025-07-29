package Practice;

public class ObjectClass {
    private int id;
    private String name;

    ObjectClass(int id , String name){
        this.name=name;
        this.id = id;
    }

    @Override
    public int hashCode() {
        return 32*id+name.hashCode();
    }

    @Override
    public String toString() {
        return "student id is : "+id+" and name is : "+name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj)
            return true;
        if (!(obj instanceof ObjectClass))
            return false;
        ObjectClass other = (ObjectClass) obj;
        return this.id==other.id&&this.name.equals(other.name);
    }

    public static void main(String[] args) {
        ObjectClass objectClass1 = new ObjectClass(1,"abjeet");
        ObjectClass objectClass2 = new ObjectClass(1,"abjeet");
        ObjectClass objectClass3 = new ObjectClass(2,"abjeet");

        System.out.println(objectClass1.equals(objectClass2));
        System.out.println(objectClass1.equals(objectClass3));
        System.out.println(objectClass1);
    }
}
