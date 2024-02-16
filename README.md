# DNA Compression and Decompression

This Java program provides functionality for compressing and decompressing DNA sequences using a custom encoding scheme. It supports commands for compression (`comp`) and decompression (`decomp`). The encoding scheme represents DNA sequences using a compact byte representation.


## Table of Contents

1. [Task](#task)
2. [Usage](#usage)
3. [Commands](#commands)
4. [Input Format](#input-format)
5. [Example](#example)
6. [Acknowledgments](#acknowledgments)


## Task

Nucleotides that form genes in DNA molecules are denoted by one of four values: A, C, G, or T. If the gene description is stored in a variable of type String, then encoding each nucleotide will require two bytes, or 16 bits, as String-type strings in the Java language consist of Unicode characters. However, for encoding the four possible values, two bits can be used, for example, encoding A with bits 00, C with bits 01, G with 10, and T with 11. Then the amount of memory needed to store the gene description can be reduced by 8 times (from 16 bits to 2 bits for each nucleotide encoding). *[David Kopec "Classic Science Problems in Python"]*


## Usage

### Compression (comp)

To compress a DNA sequence, use the `comp` command followed by the DNA sequence:

```java
comp ACTGCTAG
```

This will output the compressed byte representation of the DNA sequence.

### Decompression (decomp)

To decompress a byte representation, use the decomp command followed by the length of the original DNA sequence and the compressed bytes:

```java
decomp 8 1A 45 3F
```

This will output the original DNA sequence.

### Exit

To exit the program, use the exit command:

```java
exit
```


## Commands
- `comp` [DNA_SEQUENCE]: Compress the given DNA sequence.
- `decomp` [LENGTH] [BYTE_1] [BYTE_2] ...: Decompress the byte representation back to the original DNA sequence.
- `exit`: Exit the program.


## Input Format
- DNA sequences should only contain the characters A, C, G, and T.
- The length of the original DNA sequence should be specified during decompression.


## Example
```java
comp ACTGCTAG
// Output: 10 6A 15

decomp 8 10 6A 15
// Output: ACTGCTAG
```


## Acknowledgments
- This program was created as part of a coding exercise. Feel free to use, modify, and contribute to this project!
