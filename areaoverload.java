class Overload
{
    void area(float x) 
    {
        System.out.println("The area of the square is " + Math.pow(x, 2) + " sq units");
    }
    void area(float x, float y) 
    {
        System.out.println("The area of the rectangle is " + x * y + " sq units");
    }

    void area(double x) 
    {
        double z = 3.14 * x * x;
        System.out.println("The area of the circle is " + z + " sq units");
    }

    void area(float x, float y, float z) 
    {
        float s = (x + y + z) / 2;
        double area = Math.sqrt(s * (s - x) * (s - y) * (s - z));
        System.out.println("The area of the triangle is " + area + " sq units");
    }

    void area(double r, double h) 
    {
        double area = 2 * 3.14 * r * (r + h);
        System.out.println("The lateral surface area of the cylinder is " + area + " sq units");
    }
}
class areaoverload 
{
    public static void main(String args[]) {
        Overload ob = new Overload();
        ob.area(5);
        ob.area(11, 12);
        ob.area(2.5);
        ob.area(3, 4, 5);
        ob.area(2.0, 4.0);
    }
}
