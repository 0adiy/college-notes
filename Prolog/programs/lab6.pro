% Fibonnaci

% base case
fib(0,M) :- M=0, !.
fib(1,M) :- M=1, !.

% recursive rule
fib(Num, Output) :-
    Prev1 is Num - 1, % Prev1 := Num - 1
    Prev2 is Num - 2, % Prev2 := Num -2
	fib(Prev1, A), % A := fib(Prev1)
	fib(Prev2, B), % B := fib(Prev2)
    Output is A + B. % return Output := A + B