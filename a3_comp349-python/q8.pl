% question 8
course(comp348, "principles of programming languages").
course(comp352, "data structures and algorithm").
students(cleo, 991).
students(sana, 794).
students(vlad, 314).
students(louis, 645).
enroll(comp352, 991).
enroll(comp352, 794).
enroll(comp352, 314).
enroll(comp352, 645).
enroll(comp348, 991).
enroll(comp348, 794).
enroll(comp348, 314).
enroll(comp348, 645).
isStu(cleo).
isStu(sana).
isStu(vlad).
isStu(louis).

courses(StId, List):- 
    students(_,StId), 
    find(C, enroll(C,StId),List).

Size(X):- find(Y, isStu(Y), List), length(List,X).
unique(X):- find(Y, enroll(Y,), List), list_to_set(List,X).
sorted(X):- unique(Y), sort(Y,X).
unified(A,B,C):- sorted(X), [A,B|C] = X.


