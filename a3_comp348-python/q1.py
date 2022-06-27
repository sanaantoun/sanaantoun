#question1
def lucas(n) :
    if (n == 0) :
        return 2
    if (n == 1) :
        return 1

    return lucas(n - 1) + lucas(n - 2) 

def main():  
    n = input("enter n:")
    n= int(n)
    for j in range(n):
        print(lucas(j), end='')
    print()
    print(lucas(n))
    
if __name__ == '__main__':
    main()
