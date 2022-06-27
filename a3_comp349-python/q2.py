#question2a
def lucaslist(n):
    f1=2
    f2=1
    mylist=[]
    
    for j in range(n):
        mylist.append(f1)
        f1, f2=f2, f1+f2
    return mylist

def main():  
    n = input("enter n:")
    n= int(n)
    print(lucaslist(n))
    

if __name__ == '__main__':
    main()

#question2b
def lucasgenerator(n):
    f1=2
    f2=1
    
    for j in range(n):
        yield f1
        f1, f2 = f2, f1+f2

def main():  
    n = input("enter n:")
    n= int(n)
    
    for value in lucasgenerator(n):
        print(value)

if __name__ == '__main__':
    main()
