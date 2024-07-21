# Lab 1
## <ins>Aim</ins> - Find a man is mortal or not
## <ins>Code</ins>
```pro
man(alok).
man(aman).
man(aayush).
mortal(X) :- man(X).
```
## <ins>Output</ins>
```
1 ?- mortal(A).
A = alok ;
A = aman ;
A = aayush.

2 ?- mortal(alok).
true.
```

# Lab 2
## <ins>Aim</ins> - Find which person are mortal or not
## <ins>Code</ins>
```pro
man(alok).
man(aman).
man(aayush).
woman(aisha).
woman(apporva).

person(X) :- man(X); woman(X).
mortal(X) :- person(X).
```
## <ins>Output</ins>
```
1 ?- mortal(A).
A = alok ;
A = aman ;
A = aayush ;
A = aisha ;
A = apporva.

2 ?- person(alok).
true.
```

# Lab 3
## <ins>Aim</ins> - Prove that “John likes Peanuts”.
1. John likes all kinds of food.
2. Apples are food.
3. Pizza is a food.
4. Anything anyone eats and isn’t killed by is a food.
5. Bill eats Peanuts and is still alive.
6. David eats everything Bill eats.
## <ins>Code</ins>
```pro
% Facts
food(apples).
food(pizza).
eats(bill, peanuts).
alive(bill).

% Rules
likes(john, X) :- food(X).
food(X) :- eats(P, X), alive(P).
eats(david, X) :- eats(bill, X).
```
## <ins>Output</ins>
```
1 ?- likes(john, peanuts).
true .
```

# Lab 4
## <ins>Aim</ins> - Write a prolog program to find the rules for parent, child, son, daughter, brother, sister, uncle, aunt, ancestor given the facts about man, woman, father and wife only.
## <ins>Code</ins>
```pro
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
parent(P, C) :- father(P, C); father(F, C),  wife(P, F).
child(C, P) :- parent(P, C).
son(S, P) :- man(S),  parent(P, S).
daughter(D, P) :- woman(D),  parent(P, D).
brother(Bro, Sib) :- man(Bro),  father(F, Bro),  father(F, Sib), Bro \= Sib.
sister(Sis, Sib) :- woman(Sis),  father(F, Sis),  father(F, Sib), Sis \= Sib.
uncle(U, C) :- brother(U, P),  parent(P, C).
aunt(A, C) :- woman(A),  sister(A, P),  parent(P, C).
ancestor(Anc, Des) :- parent(Anc, Des); parent(Anc, Intermediate),  ancestor(Intermediate, Des).
```
## <ins>Output</ins>
```
1 ?- parent(ram, X).
X = luv ;
X = kush ;
false.

2 ?- uncle(U, luv).
U = laxman ;
U = bharat ;
false.

3 ?- ancestor(dashrat, luv).
true .
```

# Lab 5
## <ins>Aim</ins> - Write a prolog program to calculate factorial value.
## <ins>Code</ins> 
```
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
```
## <ins>Output</ins>
```
1 ?- fact(0, M).
M = 1.

2 ?- fact(5, M).
M = 120.

3 ?- fact(10, M).
M = 3628800.
```

# Lab 6
## <ins>Aim</ins> - Write a prolog program to calculate Fibonacci.
## <ins>Code</ins> 
```
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
```
## <ins>Output</ins>
```
1 ?- fib(1,A).                               
A = 1.

2 ?- fib(2,A). 
A = 1.

3 ?- fib(1,A), fib(2,B), fib(3,C), fib(4,D), fib(5,E), fib(6,F), fib(7,G).  
A = B, B = 1,
C = 2,
D = 3,
E = 5,
F = 8,
G = 13.
```