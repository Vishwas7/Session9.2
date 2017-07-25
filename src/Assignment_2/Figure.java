package Assignment_2;

public abstract class Figure { /* Created a class named Figure as you have mention in question*/ 
	
	public abstract   void Area();
	public abstract void perimeter();
}
 class Circle extends Figure{/* here we are creating a class named 
                               circle(as demand in question) and extends from Figure class*/
	 double Radius_dim1 =10; 
	double pi_dim2=3.14;
	@Override
	public void Area(){/* In here i'm putting formula of, area circle =  pi*Radius*Radius*/
		double area;
		 area=pi_dim2*Radius_dim1*Radius_dim1;
		 System.out.println("       Area of circle is : "+ area);	 
	}
	@Override 
	public void perimeter(){/* In here i'm putting formula of, perimeter of circle = 2*(pi_dim2*Radius_dim1)*/
		double perimeter;
		 perimeter=2*(pi_dim2*Radius_dim1);
		 System.out.println("  perimeter of circle is : "+ perimeter);
	}
 }
 
  class Rectangle extends Figure{/* here we are creating a class named 
                                    Rectangle(as demand in question) and extends from Figure class*/
	 
	 double height_dim1=12;
	 double width_dim2=13;
	 @Override
	 public void Area(){/* In here i'm putting formula of, area of Rectangle = height*width*/
		 double area;
		 area=height_dim1*width_dim2;
		 System.out.println("\n     Area of Rectangle is : "+ area);
		 }
		@Override 
		public void perimeter(){ 
			/* In here i'm putting formula of, perimeter of Rectangle = 2(height*width*)/
			 * 
			 */
			double perimeter;
			 perimeter=2*(height_dim1*width_dim2);
			 System.out.println("perimeter of Rectangle is : "+ perimeter);
			 
		}
	 
 }
  class Triangle extends Figure{/* here we are creating a class named 
                                   Triangle(as demand in question) and extends from Figure class*/
	 double h_dim1=30;
	 double l_dim2=90;
	 double b_dim3=60;
	 
	 @Override
	 public void Area(){
		 
		 double area;
		 /* In here i'm putting formula of, area of Triangle = 0.5(height*breadth*/
		 
		 
		 area=0.5*b_dim3*h_dim1;
		 System.out.println("\n      Area of Triangle is : "+ area);
		 
	 }

	 @Override 
		public void perimeter(){/* In here i'm putting formula of, perimetr of Rectangle = height*width*/ 
			double perimeter;
			 perimeter=(h_dim1+l_dim2+b_dim3);
			 System.out.println(" perimeter of Triangle is : "+ perimeter);
			 
	 }
	 
 }