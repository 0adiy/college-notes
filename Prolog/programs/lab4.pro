% Facts
man(dashrat).
man(ram).
man(laxman).
man(bharat).
man(luv).
man(kush).

woman(kaushaliya). 
woman(urmila).
woman(sita).

father(dashrat, ram). % dashrat is father of ram
father(dashrat, laxman).
father(dashrat, bharat).
father(ram, luv).
father(ram, kush).

wife(kaushaliya, dashrat). % kaushaliya is wife of dashrat
wife(sita, ram). 
wife(urmila, laxman).


% Rules
parent(P, C) :-
	father(P, C);
	father(F, C), 
	wife(P, F).
child(C, P) :-
	parent(P, C).
son(S, P) :-
	man(S), 
	parent(P, S).
daughter(D, P) :-
	woman(D), 
	parent(P, D).
brother(Bro, Sib) :-
	man(Bro), 
	father(F, Bro), 
	father(F, Sib), Bro \= Sib.
sister(Sis, Sib) :-
	woman(Sis), 
	father(F, Sis), 
	father(F, Sib), Sis \= Sib.
uncle(U, C) :-
	brother(U, P), 
	parent(P, C).
aunt(A, C) :-
	woman(A), 
	sister(A, P), 
	parent(P, C).
ancestor(Anc, Des) :-
	parent(Anc, Des);
	parent(Anc, Intermediate), 
	ancestor(Intermediate, Des).

% Query
% ?- parent(ram, luv).