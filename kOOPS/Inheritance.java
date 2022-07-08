// single level inheritance 
// class College {
//     public void canteen() {
//         System.out.println("have a good lunch!");
//     }
// }

// class Student extends College {
//     public void consume() {
//         System.out.println("samosa");
//     }
// }

// public class Inheritance {
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.canteen();
//         s1.consume();

//     }

// }

// multi level Inheritance 
// class Shape {
//     public void area() {
//         System.out.println("displays area");
//     }
// }

// class Triangle extends Shape {
//     public void areaOfTriangle(float l, float h) {
//         System.out.println((float) 1 / 2 * l * h);
//     }
// }

// class EquilateralTriangle extends Triangle {
//     public void areaOfELT(float a) {
//         System.out.println(String.format("%.2f", Math.sqrt(3) / 4 * (a * a)));

//     }
// }

// public class Inheritance {
//     public static void main(String[] args) {
//         EquilateralTriangle E = new EquilateralTriangle();

//         E.area();
//         E.areaOfTriangle(3, 5);
//         E.areaOfELT(5);

//     }

// }
// hierarchical inheritance 
class Shape {
    public void area() {
        System.out.println("displays area");
    }
}

class Triangle extends Shape {
    public void areaOfTriangle(float l, float h) {
        System.out.println((float) 1 / 2 * l * h);
    }
}

class Circle extends Shape {
    public void areaOfCircle(float r) {
        System.out.println((3.14) * r * r);

    }
}

public class Inheritance {
    public static void main(String[] args) {
        Triangle T = new Triangle();
        Circle C = new Circle();

        C.area();
        T.areaOfTriangle(3, 5);
        C.areaOfCircle(5);

    }

}
