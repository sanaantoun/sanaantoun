class Main{
    public static void Shape.Print(this Shape shape){
        Console.WriteLine(this.toString);
    }

    public static Rectangle Rectangle.Parse(string input){
        for (int i=0; i< input.Length; i++)
        {
            if (Char.IsDigit(input[i]) && side1.Length = 0)
                side1 += input[i];
            if (Char.IsDigit(input[i]) && side1.Length != 0)
                side2 += input[i];
        }

        Rectangle r1 = new Rectangle(side1, side2);
        return r1;
    }

    
}

public partial class Circle{
    public static Circle Circle.Parse(string input){
        for (int i=0; i< input.Length; i++)
        {
            if (Char.IsDigit(input[i]) && radius.Length = 0)
                radius += input[i];
        }

        Circle c1 = new Circle(radius)
        return c1;
    }
}