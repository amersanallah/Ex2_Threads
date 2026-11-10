# Project README

## Table of Contents

1. [Introduction](#introduction)
2. [Subset Sum Algorithm and Thread Synchronization](#subset-sum-algorithm-and-thread-synchronization)
3. [Data Structure Refactoring to ArrayList<Integer>](#data-structure-refactoring-to-arraylistinteger)
4. [Code Documentation with Javadoc](#code-documentation-with-javadoc)
5. [Authors and Git Collaboration Roles](#authors-and-git-collaboration-roles)
6. [Licensing](#licensing)

## Introduction

This project implements a recursive multithreaded Subset Sum algorithm using Java. The primary goal is to find if there
exists a subset within an array that sums up to a given target value (`b`). The implementation utilizes multithreading
for efficiency, with multiple threads working on the problem concurrently. Thread synchronization is crucial to ensure
data consistency.

## Subset Sum Algorithm and Thread Synchronization

The Subset Sum algorithm recursively checks all possible subsets of the given array to find if any subset sums up to the
target value `b`. The algorithm splits the array into two parts and assigns one part to each thread, ensuring that they
do not interfere with each other. Each thread explores its assigned subset independently.

### Thread Synchronization

Thread synchronization is achieved using a shared `SharedData` object, which contains an `ArrayList<Integer>` for
storing the input array, a boolean array `winArray` to mark winning indices, and a flag to indicate if the target sum
has been found. The `rec` method in the `ThreadCheckArray` class ensures that only one thread can set the flag or modify
the `winArray` at any given time using synchronized blocks.

## Data Structure Refactoring to ArrayList<Integer>

The data structure used in this project has been refactored to use an `ArrayList<Integer>` instead of a fixed-size
array. This change enhances flexibility and adaptability, allowing for dynamic resizing of the input array without
additional overhead.

## Code Documentation with Javadoc

Javadoc comments have been added throughout the codebase to document classes, methods, and variables. The documentation
includes descriptions of parameters, return values, and any side effects. This makes it easier for other developers to
understand and use the code.

### Example Javadoc Comments

```java
/**
 * Constructs a new instance of SharedData with an ArrayList and an integer.
 *
 * @param array the ArrayList to store integers
 * @param b the integer value
 */
public SharedData(ArrayList<Integer> array, int b) {
    this.array = array;
    this.b = b;
    // Initialize winArray using the size of the ArrayList
    this.winArray = new boolean[array.size()];
}
```

## Authors and Git Collaboration Roles

### Authors

- **[Author Name]**: [Description of role, e.g., lead developer]

### Git Collaboration Roles

- **[Git Username]**: [Role description, e.g., code reviewer]
- **[Another Git Username]**: [Role description, e.g., tester]

## Licensing

This project is licensed under the "Braude College Academic License." The full text of the license can be found in the
`LICENSE` file.

By contributing to this project, you agree to comply with the terms and conditions of the Braude College Academic
License.# Project README

## Table of Contents

1. [Introduction](#introduction)
2. [Subset Sum Algorithm and Thread Synchronization](#subset-sum-algorithm-and-thread-synchronization)
3. [Data Structure Refactoring to ArrayList<Integer>](#data-structure-refactoring-to-arraylistinteger)
4. [Code Documentation with Javadoc](#code-documentation-with-javadoc)
5. [Authors and Git Collaboration Roles](#authors-and-git-collaboration-roles)
6. [Licensing](#licensing)

## Introduction

This project implements a recursive multithreaded Subset Sum algorithm using Java. The primary goal is to find if there
exists a subset within an array that sums up to a given target value (`b`). The implementation utilizes multithreading
for efficiency, with multiple threads working on the problem concurrently. Thread synchronization is crucial to ensure
data consistency.

## Subset Sum Algorithm and Thread Synchronization

The Subset Sum algorithm recursively checks all possible subsets of the given array to find if any subset sums up to the
target value `b`. The algorithm splits the array into two parts and assigns one part to each thread, ensuring that they
do not interfere with each other. Each thread explores its assigned subset independently.

### Thread Synchronization

Thread synchronization is achieved using a shared `SharedData` object, which contains an `ArrayList<Integer>` for
storing the input array, a boolean array `winArray` to mark winning indices, and a flag to indicate if the target sum
has been found. The `rec` method in the `ThreadCheckArray` class ensures that only one thread can set the flag or modify
the `winArray` at any given time using synchronized blocks.

## Data Structure Refactoring to ArrayList<Integer>

The data structure used in this project has been refactored to use an `ArrayList<Integer>` instead of a fixed-size
array. This change enhances flexibility and adaptability, allowing for dynamic resizing of the input array without
additional overhead.

## Code Documentation with Javadoc

Javadoc comments have been added throughout the codebase to document classes, methods, and variables. The documentation
includes descriptions of parameters, return values, and any side effects. This makes it easier for other developers to
understand and use the code.

### Example Javadoc Comments

```java
/**
 * Constructs a new instance of SharedData with an ArrayList and an integer.
 *
 * @param array the ArrayList to store integers
 * @param b the integer value
 */
public SharedData(ArrayList<Integer> array, int b) {
    this.array = array;
    this.b = b;
    // Initialize winArray using the size of the ArrayList
    this.winArray = new boolean[array.size()];
}
```

## Authors and Git Collaboration Roles

### Authors

- **[Author Name]**: [Description of role, e.g., lead developer]

### Git Collaboration Roles

- **[Git Username]**: [Role description, e.g., code reviewer]
- **[Another Git Username]**: [Role description, e.g., tester]

## Licensing

This project is licensed under the "Braude College Academic License." The full text of the license can be found in the
`LICENSE` file.

By contributing to this project, you agree to comply with the terms and conditions of the Braude College Academic
License.# Project README

## Table of Contents

1. [Introduction](#introduction)
2. [Subset Sum Algorithm and Thread Synchronization](#subset-sum-algorithm-and-thread-synchronization)
3. [Data Structure Refactoring to ArrayList<Integer>](#data-structure-refactoring-to-arraylistinteger)
4. [Code Documentation with Javadoc](#code-documentation-with-javadoc)
5. [Authors and Git Collaboration Roles](#authors-and-git-collaboration-roles)
6. [Licensing](#licensing)

## Introduction

This project implements a recursive multithreaded Subset Sum algorithm using Java. The primary goal is to find if there
exists a subset within an array that sums up to a given target value (`b`). The implementation utilizes multithreading
for efficiency, with multiple threads working on the problem concurrently. Thread synchronization is crucial to ensure
data consistency.

## Subset Sum Algorithm and Thread Synchronization

The Subset Sum algorithm recursively checks all possible subsets of the given array to find if any subset sums up to the
target value `b`. The algorithm splits the array into two parts and assigns one part to each thread, ensuring that they
do not interfere with each other. Each thread explores its assigned subset independently.

### Thread Synchronization

Thread synchronization is achieved using a shared `SharedData` object, which contains an `ArrayList<Integer>` for
storing the input array, a boolean array `winArray` to mark winning indices, and a flag to indicate if the target sum
has been found. The `rec` method in the `ThreadCheckArray` class ensures that only one thread can set the flag or modify
the `winArray` at any given time using synchronized blocks.

## Data Structure Refactoring to ArrayList<Integer>

The data structure used in this project has been refactored to use an `ArrayList<Integer>` instead of a fixed-size
array. This change enhances flexibility and adaptability, allowing for dynamic resizing of the input array without
additional overhead.

## Code Documentation with Javadoc

Javadoc comments have been added throughout the codebase to document classes, methods, and variables. The documentation
includes descriptions of parameters, return values, and any side effects. This makes it easier for other developers to
understand and use the code.

### Example Javadoc Comments

```java
/**
 * Constructs a new instance of SharedData with an ArrayList and an integer.
 *
 * @param array the ArrayList to store integers
 * @param b the integer value
 */
public SharedData(ArrayList<Integer> array, int b) {
    this.array = array;
    this.b = b;
    // Initialize winArray using the size of the ArrayList
    this.winArray = new boolean[array.size()];
}
```

## Authors and Git Collaboration Roles

### Authors

- Amir: Repository Creator and Lead Developer (Student A)

### Git Collaboration Roles

- Amir Sanallah: Refactoring to ArrayList, Javadoc documentation, and base synchronization.
- Gaith Mostafa: Code Reviewer, Tester, and handling merge conflicts (Student B).
## Licensing

This project is licensed under the "Braude College Academic License." The full text of the license can be found in the
`LICENSE` file.

By contributing to this project, you agree to comply with the terms and conditions of the Braude College Academic
License.