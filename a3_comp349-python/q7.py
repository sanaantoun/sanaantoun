import math
 
sDict = {'Circle(s)' : 0, 'Ellipse(s)' : 0, 'Rhombus(s)' : 0}
with open('shape.txt', 'r') as file:
    i = 1
   
    for line in file:
        line = line.strip()
        line = line.split(' ')
       
        if line[0] == 'ellipse':  
            sDict['Ellipse(s)'] += 1    
               
        elif line[0] == 'rhombus':  
            sDict['Rhombus(s)'] += 1
                 
        elif line[0] == 'circle':  
            sDict['Circle(s)'] += 1
           
        i += 1
 
print('Statistics:')
 
for k in sDict:
    print('    ', k, ': ', sDict[k], sep = '')
   
print('    --')
print('    Shape(s): ', i-1, sep = '')
