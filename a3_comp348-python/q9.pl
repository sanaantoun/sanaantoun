% question 9
sublist(_, 0, 0, []).
sublist([H | T], 0, L, [H | T1]):- L1 is L - 1,
sublist(T, 0, L1, T1).
sublist([_ | T], S, L, O):- S1 is S - 1,     
sublist(T, S1, L, O).

sublist([1, 2, 3, 4], 1, 2, O)
sublist([1, 2, 3, 4], 0, 0, O)
sublist([1, 2, 3, 4], 0, 10, O)
