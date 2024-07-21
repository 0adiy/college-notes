% Facts
food(apples).
food(pizza).
eats(bill, peanuts).
alive(bill).

% Rules
likes(john, X) :-
	food(X).
food(X) :-
	eats(P, X), 
	alive(P).
eats(david, X) :-
	eats(bill, X).


% Query
% ?- likes(john, peanuts).