% Factorial

% base case
fact(0,1).
fact(1, M):-
    M = 1, !.

% recursive rule
fact(X, Y):-
    Z is X - 1, % Z := (X-1)
    fact(Z, R), % R := Factorial(Z) 
    Y is X * R. % return Y := X * R 