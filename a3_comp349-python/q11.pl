% question 11
lucas(0, 2) :- !.
lucas(1, 1) :- !.
lucas(N, R) :-
    N > 1,
    Num1 is N - 1,
    Num2 is N - 2,
    lucas(Num1, Left),
    lucas(Num2, Right),
    R is Left + Right.
seq(N, Result) :- numlist(0, N, List), maplist(lucas, List, Result).


 seq(7, Result)
 seq(5, Result).
 seq(4, Result).
