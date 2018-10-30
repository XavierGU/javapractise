public class Student extends Person {
    private String uid;
    public Student(String name, int age, String uid){
        super(name,age);
        this.uid = uid;
    }
    public String getUid(){
        return uid;
    }
    @Override
    public String toString(){
        return super.toString()+uid;
    }
}
