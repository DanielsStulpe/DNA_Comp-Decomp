# DNA Compression and Decompression

This Java program provides functionality for compressing and decompressing DNA sequences using a custom encoding scheme. It supports commands for compression (`comp`) and decompression (`decomp`). The encoding scheme represents DNA sequences using a compact byte representation.

______

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
______

## Commands
- `comp` [DNA_SEQUENCE]: Compress the given DNA sequence.
- `decomp` [LENGTH] [BYTE_1] [BYTE_2] ...: Decompress the byte representation back to the original DNA sequence.
- `exit`: Exit the program.

_____

## Input Format
- DNA sequences should only contain the characters A, C, G, and T.
- The length of the original DNA sequence should be specified during decompression.

_____

## Example
```java
comp ACTGCTAG
// Output: 10 6A 15

decomp 8 10 6A 15
// Output: ACTGCTAG
```

______

## Acknowledgments
- This program was created as part of a coding exercise. Feel free to use, modify, and contribute to this project!
