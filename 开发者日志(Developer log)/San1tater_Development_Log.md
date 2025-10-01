# San1tater's Development Log

模版:
  [日期] 功能/改动标题
* 功能描述:简要描述做了什么
* 涉及文件: filename1.java, filename2.md
* 完成状态:(已完成,进行中,计划中)|(有无测试)
* 备注:(可选)遇到的问题、解决方法或后续工作.

---
### [Oct 1, 2025] 添加登录账号功能 (Add login account function)
* 功能描述: 添加登录账号功能, 以读取所有用户到一个list中再将登录输入的进行对比, 最终如果成功登录将检车账号是否为Admin, 输出一个boolean 值
* 涉及文件: src/service/Login.java
* 完成状态: 已完成|已测试
* 备注: 略

---
### [Sep 30, 2025] 添加产品存储文件及读取文件功能 (Add product storage file and file reading functions)
* 功能描述: 添加产品存储文件及读取文件功能, 以及将product中价格值类改为float值.
* 涉及文件: src/repository/ProductPropertiesFileParsing.java, src/model/Product.java, data/products.properties
* 完成状态: 已完成|已测试
* 备注: 这个和之前product inventory是两种东西, 还不能配合到一起, 之前的这个没有考虑到永久储存.
### [Sep 30, 2025] 优化Help功能 (Optimize Help Function)
* 功能描述: 将Colour.java的功能加入到help中, 使得显示的help文本为黑底红字
* 涉及文件: src/service/Help.java
* 完成状态: 已完成|已测试
* 备注: 为什么不要白底黑字! 为什么不要白底黑字! 为什么不要白底黑字!
### [Sep 30, 2025] 优化存储文件路径 (Optimize storage file path)
* 功能描述: 将service中的处理文件读写存的文件专门放入到一个专门的文件夹“repository”中, 使得未来维护更简单!
* 涉及文件: src/repository/AddNewUserToProperties.java, src/repository/UserPropertiesFileParsing.java
* 完成状态: 已完成
* 备注: 哈哈哈哈哈哈哈啊哈哈哈哈哈, 学校你专门盯着计算机课薅呗, 我吃柠檬, 啊稀巴! 八嘎牙路啊! 

---
### [Sep 29, 2025] 开发了用户信息存储文件 (Developed user information storage files)
* 功能描述: 从properties文件中读取文件并储存在一个list中, 还有添加新用户功能(自动储存到properties文件中)
* 涉及文件: data/users.properties.java, src/service/AddNewUserToProperties.java, src/service/UserPropertiesFileParsing.java
* 完成状态: 已完成|以测试
* 备注: properties还是太权威了
### [Sep 29, 2025] 删减用户子类; 只保留User父类 (Delete the User subclass; only keep the User parent class) 
* 功能描述: User类增加String值 “Role”用来填写职位, 以此判定权限
* 删除文件: (delete) model/Admin.java, model/Employee.java;
* 涉及文件: model/User.java
* 完成状态: 已完成|未测试
* 备注: 这个操作是为了以后写json文件.
### [Sep 29, 2025] 增添用户类及其子类 (User Class and its son class added)
* 功能描述: User作为父类让 Admin 与 Employee 子类继承.
* 涉及文件: model/User.java, model/Admin.java, model/Employee.java
* 完成状态: 已完成|未测试
* 备注: 以后检测权限可以直接使用 instanceof 来检测用户是否拥有 Admin 权限.

---
### [Sep 28, 2025] 增添整数输入测试功能 (Integer input test added)  
* 功能描述: 整数输入测试功能入口与功能
* 涉及文件: service/InputTest.java
* 完成状态: 已完成|已测试
* 备注: 无。
### [Sep 28, 2025] 增添减少商品存货功能 (Reduce product inventory added) 
* 功能描述: 减少商品存货功能入口与功能
* 涉及文件: service/ProductList.java
* 完成状态: 已完成|未测试
* 备注: 无。
### [Sep 28, 2025] 增添添加商品存货功能 (Add product inventory added)  
* 功能描述: 添加商品存货功能入口与功能
* 涉及文件: service/ProductList.java
* 完成状态: 已完成|未测试
* 备注: 无。
### [Sep 28, 2025] 增添添加商品信息功能 (Add product information added)  
* 功能描述: 添加商品信息功能入口与功能
* 涉及文件: service/ProductList.java
* 完成状态: 已完成|已测试
* 备注: 无。
### [Sep 28, 2025] 增添商品类 (Product category Class added)  
* 功能描述: 创建好商品类别, 可以直接引用创建
* 涉及文件: model/Product.java
* 完成状态: 已完成|已测试
* 备注: 无。 

---
### [Sep 27, 2025] 增添Help功能 (Help function added)  
* 功能描述: /help指令触发后的功能, 显示所有指令
* 涉及文件: service/Help.java
* 完成状态: 已完成|已测试
* 备注: 如果有新指令加入记得加入到指令表中
