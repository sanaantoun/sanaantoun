#question3
def createset(li):
    set1 = []
    for value in li:
        if value not in set1:
            set1.append(value)
    return set1

listtt = [1,2,2,2,3,3,4,4,4,5,6,6,7,8,10,9,9,12,14]
set1 = createset(listtt)
print(set1)


