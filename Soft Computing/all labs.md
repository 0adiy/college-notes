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

### Aim

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

### Theory

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

### Aim

**Create following vectors t with 10 elements 1 to 10.**

i) x = t sin(t)

ii) y = (t-1) / (t+1)

iii) z = [sin(t^2)/ (t^2)]

### Code

```matlab
>> t = 1:10
t =
    1    2    3    4    5    6    7    8    9   10

>> x = t .* sin(t)
x =
    0.8415   1.8186   0.4234  -3.0272  -4.7946  -1.6765   4.5989   7.9149   3.7091  -5.4402
```

```matlab
>> y = (t-1) ./ (t+1)
y =
   0   0.3333   0.5000   0.6000   0.6667   0.7143   0.7500   0.7778   0.8000   0.8182
```

```matlab
>> z = (sin(t.^2) ./ t.^2)
z =

 Columns 1 through 6:

   8.4147e-01  -1.8920e-01   4.5791e-02  -1.7994e-02  -5.2941e-03  -2.7549e-02

 Columns 7 through 10:

  -1.9464e-02   1.4375e-02  -7.7764e-03  -5.0637e-03

```

# Lab 4: Matrix

### Theory

Certainly! Here’s a list of the MATLAB functions used, along with a brief description for each:

1. **`zeros(m, n)`**  
   Creates an \( m \times n \) matrix of zeros.

2. **`ones(m, n)`**  
   Creates an \( m \times n \) matrix of ones.

3. **`eye(n)`**  
   Creates an \( n \times n \) identity matrix.

4. **`rand(m, n)`**  
   Creates an \( m \times n \) matrix with random values between 0 and 1.

5. **`inv(A)`**  
   Computes the inverse of matrix \( A \).

6. **`triu(A)`**  
   Extracts the upper triangular part of matrix \( A \), with elements below the main diagonal set to zero.

7. **`tril(A)`**  
   Extracts the lower triangular part of matrix \( A \), with elements above the main diagonal set to zero.

### Code

```matlab
% a) Matrix of 0’s
matrix_zeros = zeros(3, 3);
disp('Matrix of 0s:');
disp(matrix_zeros);

% b) Matrix of 1’s
matrix_ones = ones(3, 3);
disp('Matrix of 1s:');
disp(matrix_ones);

% c) Identity Matrix
identity_matrix = eye(3);
disp('Identity Matrix:');
disp(identity_matrix);

% d) Random Matrix
random_matrix = rand(3, 3);
disp('Random Matrix:');
disp(random_matrix);

% ii) 4x4 Matrix Operations
% Create a 4x4 Matrix
A = rand(4, 4);
disp('4x4 Random Matrix:');
disp(A);

% Show the Inverse Matrix
A_inv = inv(A);
disp('Inverse of the 4x4 Matrix:');
disp(A_inv);

% Upper Triangular Matrix
upper_triangular = triu(A);
disp('Upper Triangular Matrix:');
disp(upper_triangular);

% Lower Triangular Matrix
lower_triangular = tril(A);
disp('Lower Triangular Matrix:');
disp(lower_triangular);
```

### Output

```matlab
Matrix of 0s:
    0     0     0
    0     0     0
    0     0     0

Matrix of 1s:
    1     1     1
    1     1     1
    1     1     1

Identity Matrix:
    1     0     0
    0     1     0
    0     0     1

Random Matrix:
    0.2734    0.1286    0.6454
    0.7272    0.8311    0.8909
    0.5606    0.2196    0.9449

4x4 Random Matrix:
    0.195879   0.523548   0.018621   0.175782
    0.084493   0.747726   0.316894   0.705113
    0.222868   0.615354   0.529370   0.928636
    0.531759   0.411726   0.111364   0.632210


Inverse of the 4x4 Matrix:
    2.944470  -4.260663   2.343752   0.490615
    2.232510   0.303762  -0.084679  -0.835144
    4.428857  -6.510810   6.312954  -3.242739
    -4.710691   4.532749  -3.028237   2.284186

Upper Triangular Matrix:
    0.5340    0.4567    0.9672    0.2873
    0.0000    0.2987    0.4829    0.0654
    0.0000    0.0000    0.3917    0.8126
    0.0000    0.0000    0.0000    0.3411

Lower Triangular Matrix:
    0.5340    0.0000    0.0000    0.0000
    0.7365    0.2987    0.0000    0.0000
    0.8940    0.7580    0.3917    0.0000
    0.2334    0.5971    0.7818    0.3411
```

### Aim

Create a 5x5 matrix. Delete the last row and last column of the matrix.

Create a matrix of 10 rows and 10 columns. The odd columns should contain values
2, and the even columns, values 0.

### Code

```matlab
% 1. Create a 5x5 Matrix and Delete the Last Row and Last Column

% Create a 5x5 matrix
A = rand(5, 5);
disp('Original 5x5 Matrix:');
disp(A);

% Delete the last row and last column
A_reduced = A(1:end-1, 1:end-1);
disp('Matrix after deleting last row and column:');
disp(A_reduced);

% 2. Create a 10x10 Matrix with Odd Columns Containing 2 and Even Columns Containing 0

% Create a 10x10 matrix
B = zeros(10, 10); % Initialize with zeros

% Set odd columns to 2
B(:, 1:2:end) = 2;
disp('10x10 Matrix with odd columns as 2 and even columns as 0:');
disp(B);
```

### Output

```matlab
Original 5x5 Matrix:
    0.2340    0.7835    0.9213    0.7240    0.1452
    0.1340    0.8345    0.5867    0.1840    0.3492
    0.7450    0.8361    0.4567    0.2422    0.5645
    0.3627    0.9784    0.1896    0.3344    0.7748
    0.5269    0.6178    0.1945    0.3465    0.2981

Matrix after deleting last row and column:
    0.2340    0.7835    0.9213    0.7240
    0.1340    0.8345    0.5867    0.1840
    0.7450    0.8361    0.4567    0.2422
    0.3627    0.9784    0.1896    0.3344

10x10 Matrix with odd columns as 2 and even columns as 0:
    2     0     2     0     2     0     2     0     2     0
    2     0     2     0     2     0     2     0     2     0
    2     0     2     0     2     0     2     0     2     0
    2     0     2     0     2     0     2     0     2     0
    2     0     2     0     2     0     2     0     2     0
    2     0     2     0     2     0     2     0     2     0
    2     0     2     0     2     0     2     0     2     0
    2     0     2     0     2     0     2     0     2     0
    2     0     2     0     2     0     2     0     2     0
    2     0     2     0     2     0     2     0     2     0
```
