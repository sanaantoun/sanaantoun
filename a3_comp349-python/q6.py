import math
 
with open('shape.txt', 'r') as file:
    i = 1
   
    for line in file:
        line = line.strip()
        line = line.split(' ')
       
        if line[0] == 'shape':
            print(i, ': Shape, perimeter: undefined, area: undefined')
         
        elif line[0] in ['ellipse', 'rhombus']:
            if line[0] == 'ellipse':
                if int(line[1]) < 0 or int(line[2]) < 0:
                    print('    Error: Invalid Ellipse')
                    print(i, ': Ellipse, perimeter: undefined, area: undefined')
               
                else:
                    area = math.pi * int(line[1]) * int(line[2])
                    print(i, ': Ellipse, perimeter: undefined, area: {:.5f}'.format(area))
                   
            elif line[0] == 'rhombus':
                if int(line[1]) < 0 or int(line[2]) < 0:
                    print('    Error: Invalid Rhombus')
                    print(i, ': Rhombus, perimeter: undefined, area: undefined')
               
                else:
                    perimeter = 4.0 * math.sqrt((int(line[1])/2)**2 + (int(line[2])/2)**2);
                    area = (int(line[1]) * int(line[2]))/2
                    inradius = (int(line[1]) * int(line[2])) / perimeter
               
                    print(i, ': Rhombus, perimeter: {:.5f}'.format(perimeter),', area:', area)
                    print('    in-radius: {:.5f}'.format(inradius))
                 
        elif line[0] == 'circle':  
            if int(line[1]) < 0:  
                print('    Error: Invalid Circle')
                print(i, ': Circle, perimeter: undefined, area: undefined')
               
            else:
                perimeter = 2.0 * math.pi * int(line[1])  
                area = math.pi * int(line[1]) * int(line[1])
               
                print(i, ': Circle, perimeter: {:.5f}'.format(perimeter),', area: {:.5f}'.format(area))
       
        i += 1

