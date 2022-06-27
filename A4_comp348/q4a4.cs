class Driver
{
    public static List<IShape> shapeList = new List<IShape>();
    static void Reader(string strg)
    {
        String[] list = strg.Split(',');
        Rectangle rec = new Rectangle();
        Circle circle = new Circle();
        if (list[0].Equals("Rectangle"))
        {
            shapeList.Add(rec.Parse(strg));
        }
        else if (list[0].Equals("Circle"))
        {
            shapeList.Add(circle.Parse(strg));
        }
    }
    
    static void Main(string[] args)
    {
        TextFileProcessor.LineRead += new TextFileProcessor.Reader);
        TextFileProcessor.Read("../../../shapeList.txt");
        
        Console.Write("Sorted by name + area:\n");
        var q1 = shapeList.OrderBy(shape => shape.Name).ThenBy(shape => shape.GetArea());
        q1.ToList().ForEach(x => Console.Write(x + "\n")); 
        
        Console.Write("\nSorted by Perimeter:\n");
        var q2 = // IEnumerable<int>
            from shape in shapeList
            orderby shape.GetPerimeter()
            select shape;
        q2.ToList().ForEach(x => Console.Write(x + "\n"));
        
        Console.Write("\nHere is the summary:\n");
        Console.Write("Average for rectangles:\n");
        Console.Write("Average for Area: ");
        var q3 = // IEnumerable<int>
            from shape in shapeList
            where shape.Name == "Rectangle"
            select shape.GetArea();
        var lst = q3.ToList();
        Console.Write(lst.Average() + " ");
        Console.Write("Average Perimeter: ");
        var q4 = // IEnumerable<int>
            from shape in shapeList
            where shape.Name == "Rectangle"
            select shape.GetPerimeter();
        lst = q4.ToList();
        Console.Write(lst.Average() + "\n");
        Console.Write("Circle averages:\n");
        Console.Write("Average Area: ");
        var q5 = // IEnumerable<int>
            from shape in shapeList
            where shape.Name == "Circle"
            select shape.GetArea();
        lst = q5.ToList();
        Console.Write(lst.Average() + " ");
        Console.Write("Average Perimeter: ");
        var q6 = // IEnumerable<int>
            from shape in shapeList
            where shape.Name == "Circle"
            select shape.GetPerimeter();
        lst = q6.ToList();
        Console.Write(lst.Average());
        Console.Write("\nTotal averages:\n");
        Console.Write("Average Area: ");
        var q7 = // IEnumerable<int>
            from shape in shapeList
            select shape.GetArea();
        lst = q7.ToList();
        Console.Write(lst.Average() + " ");
        Console.Write("Average Perimeter: ");
        var q8 = // IEnumerable<int>
            from shape in shapeList
            select shape.GetPerimeter();
        lst = q8.ToList();
        Console.Write(lst.Average());
        var q9 = // IEnumerable<int>
            from shape in shapeList
            select shape.GetArea();
        lst = q9.ToList();
        Console.Write("\nNumber of shapeList: " + lst.Count);
    }
}