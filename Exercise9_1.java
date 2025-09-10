import java.awt.*;

class Exercise9_1 {
	public static void main(String[] args) {
		class Rectangle {
			double width;
			double height;
			Rectangle (){
			}
			Rectangle(double newHeight, double newWidth){
				height=newHeight;
				width=newWidth;
			}
			double getArea(){
				return width * height;
			}
			double getPerimeter(){
				return 2*width + 2*height;
			}
		}
	}
}