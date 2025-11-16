# Development Log
Template:  
[Date] Feature/Change Title
* Changed By: who did this change
* Feature Description: Briefly describe what was done.
* Files Involved: filename1.java, filename2.md
* Completion Status: (Completed, In Progress, Planned) | (Tested)
* Notes: (Optional) Problems encountered, solutions, or follow-up work.
---
### [Nov 16, 2025] Add delete User UI and Function and debug 
* Changed By: Jinghao
* Function Description: As the title said
* Files Involved: AddRemoveUser.java
* Completion Status: Completed | Tested
  
---
### [Nov 10, 2025] Merge, delete, and modify Product functions, A sort function has been added to the table.
* Changed By: Jinghao
* Function Description: As the title said
* Files Involved: RemoveAndModifyProductInformation.java
* Completion Status: Completed | Tested

---
### [Nov 3, 2025] Created the function and ui of remove products
* Changed By: Jinghao
* Function Description: Now that we have the ability to add and save items, it's also necessary to have the ability to delete items and remove things from the properties file.
* Files Involved: src/removeProductInformation.java
* Completion Status: Completed | Tested
### [Nov 3, 2025] Improved the function of adding products
* Changed By: Jinghao
* Function Description: Now all additions will be stored in properties files, meaning this data is permanently saved.
* Files Involved: src/addProductInformation.java
* Completion Status: Completed | Tested

---
### [Oct 29, 2025] graph icons and engine change
* Changed By: Victor
* Function Description: As the graphic designer, I drew three icons.
* Documents involved: all src
* Completion Status: In Progress
* Note: login UI have finished, mainMenu Ul and addProductInformation UI is inprogress.
### [Oct 29, 2025] Major update, change engine! 
* Changed By: Jinghao
* Function Description: Switch to a different engine (written using NetBeans) for interaction.
* Documents involved: all src
* Completion Status: In Progress
* Note: login UI have finished, mainMenu Ul and addProductInformation UI is inprogress.

---
### [Oct 8, 2025] Create/return command to return to the main interface, preventing instantaneous rewind
* Changed By: Jinghao
* Function Description: Create/return command to return to the main interface, preventing instantaneous rewind
* Files Involved: src/main/Main.java, src/main/ProductsInformation.java, src/main/ReturnToMainMenu.java
* Completion Status: Completed | Tested
### [Oct 8, 2025] Bug Fix for Creating Product Price Input
* Changed By: Jinghao
* Feature Description: See test log for details
* Affected File: src/main/ProductsInformation.java
* Completion Status: Completed | Tested

---
### [Oct 6, 2025] Major Update! Product Information Module Completed
* Changed By: Jinghao
* Feature Description: The product information module is now fully implemented. Bugs have been fixed (all prices have been uniformly converted to float, and previously forgotten changes have been corrected). New input tests for String to float conversion have been added. The login interface has been optimized.
* Files Involved: src/main/Primenu.java, src/main/ProductsInformation.java, src/model/Product.java, src/service/ConfirmRequest.java, src/service/InputTest.java, src/service/Login.java, src/service/ProductList.java.
* Completion Status: Completed | Untested
* Note: The function to print the list/inspection information has not yet been implemented and cannot be tested.

---
### [Oct 2, 2025] Added LogOut Functionality (Created the logout in Primenu)
* Changed By: Jinghao
* Functionality Description: Logout can log out of the account, exit the program, and supports `/return` to return to the previous screen.
* File Involved: src/main/LogOut.java
* Completion Status: Completed | Tested


---
### [Oct 1, 2025] Formalize Product IDs
* Changed By: Jinghao
* Function Description: Formalizes product IDs, changing short to int.
* Files Involved: data/products.properties, src/model/Product.java, src/repository/ProductPropertiesFileParsing.java, src/service/ProductList.java
* Completion Status: Completed | Untested
### [Oct 1, 2025] By default, Login is connected to the Main file
* Changed By: Jinghao
* Function Description: Paves the way for future feature connections.
* Files Involved: src/main/Main.java
* Completion Status: Completed | Tested
### [Oct 1, 2025] Simplify import in ProductList
* Changed By: Jinghao
* Function Description: Change `integerInputTest();` to `InputTest.integerInputTest();` to avoid needing to import `static service.InputTest.integerInputTest;`.
* Relevant file: src/service/ProductList.java
* Completion status: Completed | Tested
### [Oct 1, 2025] Add login account function
* Changed By: Jinghao
* Function description: Add a login account function. It reads all users into a list, compares the login input, and checks if the account is "Admin" if successful, outputting a boolean value.
* Relevant file: src/service/Login.java
* Completion status: Completed | Tested

---
### [Sep 30, 2025] Add product storage file and file reading functions
* Changed By: Jinghao
* Function Description: Add product storage file and file reading functions, and change the price value class in the product to a float value.
* Files Involved: src/repository/ProductPropertiesFileParsing.java, src/model/Product.java, data/products.properties
* Completion Status: Completed | Tested
* Notes: This is different from the previous product inventory and cannot be integrated yet. The previous version did not consider permanent storage.
### [Sep 30, 2025] Optimize Help Function
* Changed By: Jinghao
* Function Description: Add the functionality from Colour.java to the help function, making the displayed help text black with red text.
* Files Involved: src/service/Help.java
* Completion Status: Completed | Tested
### [Sep 30, 2025] Optimize storage file path
* Changed By: Jinghao
* Function Description: The files processed by the service for reading, writing, and storing files will be placed in a dedicated folder called "repository," making future maintenance easier!
* Files Involved: src/repository/AddNewUserToProperties.java, src/repository/UserPropertiesFileParsing.java
* Completion Status: Completed
### [Sep 30, 2025] Initial Directory
* Changed By: Victor
* Function Description: Enables the application to speak frankly and openly.
* Files Involved: main/Primenu.java
* Completion Status: Completed
### [Sep 30, 2025] Script UI Four-Color Visual Assistance System
* Changed By: Victor
* Function Description: Creates usable colors
* File Involved: src/ui/colour.java
* Completion Status: Completed

---
### [Sep 29, 2025] Developed user information storage files
* Changed By: Jinghao
* Function Description: Reads files from properties files and stores them in a list; also includes a function to add new users (automatically saving to the properties file).
* Files Involved: data/users.properties.java, src/service/AddNewUserToProperties.java, src/service/UserPropertiesFileParsing.java
* Completion Status: Completed | Tested
### [Sep 29, 2025] Deleted the User subclass; only kept the User parent class.
* Changed By: Jinghao
* Function Description: Added a String value "Role" to the User class to fill in the job title, thus determining permissions.
* Deleted Files: (delete) model/Admin.java, model/Employee.java;
* Files Involved: model/User.java
* Completion Status: Completed | Untested
### [Sep 29, 2025] Added User Class and its subclasses
* Changed By: Jinghao
* Function Description: User is used as the parent class, which is inherited by the subclasses Admin and Employee.
* Files Involved: model/User.java, model/Admin.java, model/Employee.java
* Completion Status: Completed | Untested
* Note: In the future, permission checks can be performed directly using instanceof to check if a user has Admin permissions.

---
### [Sep 28, 2025] Added Integer Input Test Functionality
* Changed By: Jinghao
* Function Description: Integer input test function entry and functionality
* File Involved: service/InputTest.java
* Completion Status: Completed | Tested
### [Sep 28, 2025] Added Reduce Product Inventory Functionality
* Changed By: Jinghao
* Function Description: Reduce product inventory function entry and functionality
* File Involved: service/ProductList.java
* Completion Status: Completed | Untested
### [Sep 28, 2025] Added Add Product Inventory Functionality
* Changed By: Jinghao
* Function Description: Add product inventory function entry and functionality
* File Involved: service/ProductList.java
* Completion Status: Completed | Untested
### [Sep 28, 2025] Added product information function
* Changed By: Jinghao
* Function description: Entry point and function for adding product information
* File involved: service/ProductList.java
* Completion status: Completed | Tested
### [Sep 28, 2025] Added product category class
* Changed By: Jinghao
* Function description: Product categories can be directly referenced for creation.
* File involved: model/Product.java
* Completion status: Completed | Tested

---
### [Sep 27, 2025] Added Help Function
* Changed By: Jinghao
* Function Description: Displays all commands triggered by the /help command.
* File Involved: service/Help.java
* Completion Status: Completed | Tested
* Note: Remember to add any new commands to the command list.

---
### [Sep 26, 2025] Script UI Four-Color Visual Assistance System
* Changed By: Victor
* Function Description: Wish List
* Related Files: Wish List
* Completion Status: Folder Created
### [Sep 26, 2025] Script UI Select the Sound Control System
* Changed By: Victor
* Function Description: Wish List
* Related Files: Wish List
* Completion Status: Folder Created
### [Sep 26, 2025] Calculation of Weighted Average Cost Unit Price at the End of the Month
* Changed By: Victor
* Function Description: Wish List
* Related Files: Wish List
* Completion Status: Folder Created
### [Sep 26, 2025] Database Database Multiple Writes
* Changed By: Victor
* Function Description: Wish List
* Files Involved: Wish List
* Completion Status: Folder Created
