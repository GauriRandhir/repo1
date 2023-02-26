package CoreJava;

public class Circle {
       private float radius;
       static final float PI=3.14f;
       public float getRadius() {
    	   return radius;
       }
       public void setRadius(float radius) {
    	   this.radius=radius;
       }
       public float area()
       {
    	   float area=radius*radius*PI;
    	   return area;
       }
      // @Override
     //  public String toString() {
    	   //return "Circle[radius="+ radius + "]";
      // }
       public Circle (float radius) {
    	   this.radius=radius;
       }
       public Circle() {
    	   super();
       }
       
	public static void main(String[] args) {
		Circle c1= new Circle(9.8f);
		System.out.println("Radius of the circle is: "+ c1.radius);
    System.out.println("Area of the circle is: "+c1.area());
	}

}
