% question 10 
every-other([],[]).
every-other([X],[X]).
every-other([X, _ | T], [X | Y]):- every-other(T,Y).

every-other([], L)
every-other([1], L)
every-other([1,2], L)
every-other([1,2,3], L)
every-other([1,2,3,4], L)
