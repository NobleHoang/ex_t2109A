public class student {
    private int rollNo;
    private  String name;
    private classroom myClass;
    public student(){

    }
    public student(int rollNo,String name){
        this.rollNo=rollNo;
        this.name=name;
    }
    public student(int rollNo,String name,classroom myClass){
        this.rollNo=rollNo;
        this.name=name;
        this.myClass=myClass;
    }
    public classroom getmyClass(){
        return myClass;
    }
    public void setMyClass(classroom myClass){
        this.myClass=myClass;
    }
    @Override
    public String toString() {
        return "student{" + "rollno=" + rollNo + ", Student name=" + name + ", Student=" + myClass + '}';
    }

    public static void main(String[] args) {

        student student=new student();
        System.out.println(student);
    }
}
