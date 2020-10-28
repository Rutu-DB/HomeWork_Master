package homeworkWeek3RB;
// this program calculates area using constructors
public class Wall {
    private double width; // instance variable
    private double height; // instance variable


    public static void main(String[] args) {
        Wall wall = new Wall(5,4); // object created
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5); // called method using object
        System.out.println("width= "+ wall.getWidth());
        System.out.println("Height= " + wall.getHeight());
        System.out.println("Area= "+ wall.getArea());

    }
    // Constructors initialised
    public Wall (){

    }
    //second Constructor
    public Wall (double width, double height){
        this.width = width;
        this.height = height;
        if(width<0){
            this.width = 0;
        } if(height < 0){
            this.height = 0;
        }

    }


    public double getWidth() {
        return width;
    }
    public double setWidth(double newWidth) {
        if (newWidth < 0) {
            this.width = 0;
        } return newWidth;
    }
    public double getHeight (){
        return height;
    }
    public double setHeight (double newHeight){
        if (newHeight < 0){
            this.height = 0;
        }return newHeight;

    }
    public double getArea (){
    return(this.height*this.width);
    }
}