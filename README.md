# Two-Pointer Approach to Array Problems ✌️

This repository contains a collection of Java implementations for common array manipulation and search problems solved using the **Two-Pointer Approach**.

The Two-Pointer technique is an extremely efficient and popular method for solving array and list-based problems. It typically involves using two pointers (indices) that move through the array simultaneously, often from opposite ends or at different speeds, to reduce the time complexity, commonly achieving **O(n)** time complexity.

---

### 📂 Repository Contents

Each Java file demonstrates the application of the Two-Pointer approach to a specific array problem:

| File Name | Description | Key Concept |
| :--- | :--- | :--- |
| `Check_String_Palindrome_Array2P.java` | Checks if a given string (or character array) is a palindrome. | Pointers move **inward** from both ends. |
| `Check_Two_String_Are_Anagrams_Array2P.java` | Checks if two strings are anagrams of each other. | *Note: While the primary method for anagrams often uses counting, this may demonstrate a two-pointer comparison variant.* |
| `Count_Pairs_With_Given_Sum_Array2P.java` | Counts pairs of elements in a sorted array whose sum equals a target value. | Pointers move **inward** based on sum comparison. |
| `Intersection_of_Two_Sorted_Array2P.java` | Finds the common elements (intersection) between two sorted arrays. | Pointers move **linearly** on both arrays. |
| `Merge_Two_Sorted_Array2P.java` | Merges two sorted arrays into a single sorted array. | Pointers move **linearly** while comparing elements. |
| `Move_Zeros_to_End_Array2P.java` | Rearranges an array such that all zeros are moved to the end while maintaining the relative order of the non-zero elements. | **Slow/Fast Pointers** (or Two Pointers for swapping). |
| `Remove_Duplicates_from_Sorted_Array2P.java` | Removes duplicate elements from a sorted array in-place. | **Slow/Fast Pointers** (or Two Pointers for overwriting). |
| `Reverse_an_Array2P.java` | Reverses the elements of an array. | Pointers move **inward** from both ends, performing swaps. |
| `Sum_of_Two_No_Equals_Target_Array2P.java` | Finds if there is a pair of numbers in a sorted array that sums up to a target value. | Pointers move **inward** based on sum comparison. |

---

### 🚀 Getting Started

To run these examples:

1.  **Clone the repository:**
    ```bash
    git clone [Your Repository URL]
    ```
2.  **Navigate to the directory:**
    ```bash
    cd two-pointer-array-problems
    ```
3.  **Compile and Run** any `.java` file using a Java Development Kit (JDK):
    ```bash
    javac <FileName>.java
    java <FileName>
    ```

---

*Feel free to star ⭐️ the repository if you find this collection helpful!*
