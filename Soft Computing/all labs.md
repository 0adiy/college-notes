# Lab 1: Introduction
Matlab is a high-level programming language and interactive environment for numerical computing, visualization, and programming. It is used for solving linear and nonlinear problems numerically, and for analyzing data and developing algorithms. Matlab provides a command-line interface, a GUI environment, and a programming language. It is available for Windows, Mac, and Linux operating systems.


## Basic Syntax

**Variables** - Variables are used to store values. They can be assigned values using the `=` operator. Matlab also provides a range of built-in functions for working with variables.

**Built-in functions** - functions that are built into Matlab. They are used to perform specific tasks. Like the `disp` function, which displays the value of a variable. Matlab also provides a wide range of built-in functions for mathematical operations, data analysis, and more.

**Operators** - Operators are used to perform operations on variables. Matlab supports a wide range of operators, including arithmetic, relational, logical, and assignment operators.

**Comments** - Comments are used to add notes to your code.

```matlab
% This is a comment

% This is a variable
x = 1; 

% This is another variable
y = 2;

% using the + operator
z = x + y; 

% display the value of z
disp(z); 
```







# Lab 2
Evaluate the following expressions:

a) e^(π√163)
```matlab
>> e^( pi * sqrt(163) )
ans = 
    2.6254e+17
```

b) log10(e^3)
```matlab
>> log10(e^3)
ans = 
    1.3029
```

c) sin^2(π/6) + cos^2(π/6)
```matlab
>> sin(pi/6) ^ 2 + cos(pi/6) ^ 2
ans = 
    1
```

d) 3^x = 17
```matlab
>> x = log(17)/log(3)
x = 
		2.5789
```

e) 3 (√5 -1) / (√5 +1)^2 -1
```matlab
>> 3 * ((sqrt(5)-1) / (sqrt(5)+1)^2)  - 1
ans = 
    -0.6459
```







# Lab 3: Vectors and Matrices
Vectors are used to store multiple values in a single variable. They can be created using the `[]` operator. The values of a vector can be accessed using the `()` operator. Vectors are one dimensional while matrices are multi-dimensional. A scaler is a vector with only one element.
```matlab
>> v = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
v =
    1    2    3    4    5    6    7    8    9   10
```

Indexing starts from 1
```matlab
>> v(1) 
ans = 
    1
```

Creating vectors with a range of values using the `:` operator.
```matlab
>> vec = [1:4]
vec =
   1   2   3   4
```

Concatenating vectors.
```matlab
>> vec = [1:4]
vec = 
   1   2   3   4

>> vec2 = [5:8]
vec2 = 
   5   6   7   8

>> v = [vec, vec2]
v = 
   1   2   3   4   5   6   7   8

>> v2 = [vec; vec2]
v2 = 
   1   2   3   4
   5   6   7   8
```


**Create following vectors t with 10 elements 1 to 10.**

i) x = t sin(t)
```matlab
>> t = 1:10
t =
    1    2    3    4    5    6    7    8    9   10

>> x = t .* sin(t)
x =
    0.8415   1.8186   0.4234  -3.0272  -4.7946  -1.6765   4.5989   7.9149   3.7091  -5.4402
```

ii) y = (t-1) / (t+1)
```matlab
>> y = (t-1) ./ (t+1)
y =
   0   0.3333   0.5000   0.6000   0.6667   0.7143   0.7500   0.7778   0.8000   0.8182
```

iii) z = [sin(t^2)/ (t^2)]
```matlab
>> z = (sin(t.^2) ./ t.^2)
z =

 Columns 1 through 6:

   8.4147e-01  -1.8920e-01   4.5791e-02  -1.7994e-02  -5.2941e-03  -2.7549e-02

 Columns 7 through 10:

  -1.9464e-02   1.4375e-02  -7.7764e-03  -5.0637e-03

```
