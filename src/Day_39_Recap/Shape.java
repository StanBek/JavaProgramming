package Day_39_Recap;

public class Shape {

    private String name;

    public Shape(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null){
            System.err.println("Name cant be null");
            System.exit(1);//something get wrong
        }
        if(name.isEmpty()||name.isBlank()){
            System.err.println("Invalid name");
            System.exit(1);//something get wrong
        }
        this.name= name;
    }

    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }
}
