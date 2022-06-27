#Question 5:
    class shape:
    id=0

    def _init_(self,id):
        self.id+=1
    
    def area(self):
        pass
    
    def perimeter(self):
        pass

    def print(self):
        print("id: {:5f}, Name:{:5s} ,perimeter: {:5f}, area: {:5f}\neccentricity: {:5f}".format(self.id,type(self)._name_,self.perimeter, self.area))


class circle(shape):
    def _init_(self, radius):
        super()._init_()
        self.radius = radius
    
    def area(self):
        return math.pi * self.radius * self.radius

    def perimeter(self):
        return 2 * math.pi * self.radius
    

class ellipse(shape):
    def _init_(self, a, b):
        super()._init_()
        self.a = a
        self.b = b
        
    def area(self):
        return math.pi * self.a * self.b

    def eccentricity(self):
        return math.sqrt(abs((self.a * self.a) - (self.b * self.b)))
    

class rhombus(shape):
    
    def _init_(self, diag1, diag2):
        super()._init_()
        self.diag1 = diag1
        self.diag2 = diag2
        self.side = math.sqrt((self.diag1 * self.diag1) + (self.diag2 * self.diag2)) / 2
    def perimeter(self):
        return 4 * self.side
    def area(self):
        return (self.diag1 * self.diag2) / 2
    def inradius(self):
        return (self.diag1 * self.diag2) / (4 * self.side)
