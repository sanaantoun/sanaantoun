/* Question 12 */
% start and final states
start(a).
start(b).

final(a).
final(d).
final(f).

% transactions
tran(a,0,b).
tran(a,1,c).
tran(b,0,a).
tran(b,1,d).
tran(c,0,f).
tran(c,1,e).
tran(d,0,f).
tran(d,1,e).
tran(e,0,e).
tran(e,1,e).
tran(f,0,f).
tran(f,1,e).

% find last state
find_last(Q,[],Q).
find_last(Q,[H|T],Q2) :- tran(Q,H,Q1),find_last(Q1,T,Q2).

% check acceptance
is_accepted(L) :- start(Q),find_last(Q,L,Q1),final(Q1),!.


