# Input Output Test Log
## Use to fix bug and record problems

---
### [Oct 8, 2025] Product Price int-float problem [Fixed]
* Found By: San1tater
* Description: When creating a product and entering a price, if you enter a number with a decimal point, a request to enter an integer will be triggered.
* Preliminary guess: A positive integer input test was added to the price input code. Because a positive float input test wasn't written in the early stages of development, the positive integer input test was added directly. However, after changing the price from an int to a float, the input test wasn't properly modified.
* Test input-output image:
<img width="637" height="273" alt="截屏2025-10-08 20 02 41" src="https://github.com/user-attachments/assets/008e0657-cdcc-487c-9b87-eea73bb1246a" />  
* Comment: Investigation completed, consistent with the hypothesis.
