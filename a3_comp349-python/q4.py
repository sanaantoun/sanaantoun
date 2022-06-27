Question 4:
class Multiset:
    S:set

    def _init_(self,S):
        self.S=S

#changing to overloading operator
        #a
    def _add_(self,a):
        return self.S.add(a)


    #b
    def _truediv_(self,other):
        L=list(self.S)
        res=list(filter(lambda num: num != other,L))
        return set(res)


    #c
    def m(self,rep):
        count=0
        for val in self.S:
            if val==rep:
                count+=1
        return count

#d
    def union(self,otherset):
        Multi=set()
        for x in otherset:
            num1=staticmethod(m(self.S,x))
            num2=staticmethod(m(otherset,x))
            if num1>=num2:
                for n in range(num1):
                    Multi.append(x)
            else:
                for n in range(num2):
                    Multi.append(x)
        return Multi

#e
 def intersection(self,otherset):
         Multi=set()
        a=0
        for x in otherset:
            if x!=a:
                num1=staticmethod(m(self.S,x))
                num2=staticmethod(m(otherset,x))
                if num1<=num2:
                    for n in range(num1):
                        Multi.append(x)
                else:
                    for n in range(num2):
                        Multi.append(x)
                a=x
        return Multi

    

    #f
    def _sub_(self,otherset):
        for x in otherset:
            for y in self.S.copy():
                if x==y:
                    self.S.remove(x)
                    break
