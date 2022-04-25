public class classroom {
    private int classId;
    private String className;
    public classroom(){

    }
    public classroom(int classId,String className){
        this.classId=classId;
        this.className=className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
    @Override
    public String toString() {
        return "classroom{" + "class id=" + classId + ", Class name=" + className +  "}";
    }


}

