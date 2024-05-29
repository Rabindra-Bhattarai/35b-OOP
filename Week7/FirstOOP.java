package Week7;

public class FirstOOP {
    
    public static void main(String[] args) {
        Person p1= new Person();
        p1.name="John";
        p1.age=20;
        p1.gender='M';
        System.out.println(p1.name);
        p1.introduction();
//make an attributr: name, brand, year,color
    //make a function modify() that takes new color and set to odd color
    //make a function expity() that return 100 added to year
    //make a function start() to print(name is starting)
    //make a function stop() that print(name, brand is stopping)
    //make a function detail() that print(name, brand, color and year)
    //make 3 objects of car
    //start all 3 objects
    //stop only 1 object
    //modicy 2nd car to green color
    //print the expiry os 3rd object
    //print detail of all 3 objects
        Person p2= new Person();
        p2.name="Ravi";
        p2.age=21;
        p2.gender='M';
        System.out.println(p2.name);

        Square s1= new Square();
        s1.sides= 10;
        int s1Area =s1.area();
        System.out.println(s1Area);
        s1.addSides(2);
        System.out.println(s1.area());

        rectangle r1= new rectangle();
        r1.length=10;
        r1.bredth=15;
        System.out.println()
        }
}
/*Task
 * make a class rectangle
 * make 2 arrtibute in double, length and bredth
 * make a function areaOfRectangle that returns length * bredth
 * make a function perimeterOfRectangle that return 1(length + bredth)
 * make an object of the rectangle and print area and perimeter
 * 
 */

class rectangle{
    double length;
    double bredth;
    double areaOfRectangle(){
        return length*bredth;  
    }
    double perimeter(){
        return 2*(length + bredth);
        }

    }

    }

}

class Square{
    int sides;
    int area(){
        int area =sides*sides;
        return area;

    }
    void addSides(int val){
        sides = sides + val; //Sides will retain state/data
    }
}

class Person{
    //data/field/attributes/properties
    String name;
    int age;
    char gender;
    //procedures/functions/methods
    void introduction(){
        System.out.println("Hi my name is "+ name);
    }


}