# Mx* Compiler 2023 OJ 提交要求与模板

## 1. 提交要求

当提交到 OJ 后，OJ 会首先建构你的编译器程序（见[建构部分](#11-建构)），然后以不同的参数运行你的编译器。

注意：建构的过程中**可以**使用网络，但运行时**不可以**使用。

### 1.1. 建构

*目前最长建构时间为 2 分钟，如果觉得不够用，可以预建构项目或联系助教。*

- 首先，OJ 会检查项目根目录下是否存在 configure 文件，如果有的话，会执行
  ```sh
  ./configure
  ```

- 然后，OJ 检查项目根目录是否是一个合法的 GNU make 项目，如果是的话，会执行
  ```sh
  make
  ```

在执行完这些操作后，项目中应当存在一个 `bin/` 的目录，其中包含了你的编译器程序
`mxc`、编译器的内建功能对应汇编 `builtin.s`（如果你还在 semantic 阶段，请忽略此文件）
和你的程序的依赖项（已经作为系统依赖项的除外）。

**请注意：`bin/` 目录将会被单独打包并执行，因此 `bin/` 目录下的所有内容都不能依赖除 `bin/` 目录自身以外的项目资源。**
**特别是不可以使用软链接将项目其他位置的文件连接到 `bin/` 下。**

你的程序需要支持以下命令行参数：（具体要求见 [1.2. 执行](#12-运行)）
- 仅检查语法（标准输入作为程序）
  ```sh
  ./mxc -fsyntax-only
  ```
- 生成汇编（标准输入作为程序）
  ```sh
  ./mxc -S
  ```

### 1.2. 执行

- 仅语法检查
  OJ 会以以下命令运行你的编译器：
  ```sh
  ./mxc -fsyntax-only
  ```

  如果你的编译器以非 0 的返回值退出，则认为存在输入的程序语法错误。
- 生成汇编
  ```sh
  ./mxc -S
  ```

  你的编译器 stdout 输出将会作为 `output.s` 连同你的编译器的内建功能对应汇编
  `builtin.s`（请在编译期放到 `bin/builtin.s` 中，如果没放到此处，则认为没有 `builtin.s`）一起被
  ravel 模拟运行。

## 2. 模板

- [CMake 项目提交](cmake/)：用 CMake 建构的项目
- [纯 Java 项目](java/)：不需要在建构时生成 Java 代码的项目（项目中已经包含了 antlr4 生成的 Java 代码）
- [Java + g4 项目](java-g4/)：需要在建构时生成 Java 代码的项目（项目中不包含 antlr4 生成的 Java 代码）

## 3. 运行环境

### 3.1. Antlr4 环境

#### 3.1.1. Antlr4 Java

我们提供了所有 4.13.0 及之前的 antlr4 环境，安装在 `/usr/share/java/` 下。

| 安装在 OJ 系统上的 Antlr4 环境 |
| ---------------------------------------------------------------- |
|`/usr/share/java/antlr-4.0-complete.jar`                          |
|`/usr/share/java/antlr-4.1-complete.jar`                          |
|`/usr/share/java/antlr-4.2-complete.jar`                          |
|`/usr/share/java/antlr-4.2.1-complete.jar`                        |
|`/usr/share/java/antlr-4.2.2-complete.jar`                        |
|`/usr/share/java/antlr-4.3-complete.jar`                          |
|`/usr/share/java/antlr-4.4-complete.jar`                          |
|`/usr/share/java/antlr-4.5-complete.jar`                          |
|`/usr/share/java/antlr-4.5.1-complete.jar`                        |
|`/usr/share/java/antlr-4.5.2-complete.jar`                        |
|`/usr/share/java/antlr-4.5.3-complete.jar`                        |
|`/usr/share/java/antlr-4.6-complete.jar`                          |
|`/usr/share/java/antlr-4.7-complete.jar`                          |
|`/usr/share/java/antlr-4.7.1-complete.jar`                        |
|`/usr/share/java/antlr-4.7.2-complete.jar`                        |
|`/usr/share/java/antlr-4.8-complete.jar`                          |
|`/usr/share/java/antlr-4.9-complete.jar`                          |
|`/usr/share/java/antlr-4.9.1-complete.jar`                        |
|`/usr/share/java/antlr-4.9.2-complete.jar`                        |
|`/usr/share/java/antlr-4.9.3-complete.jar`                        |
|`/usr/share/java/antlr-4.10-complete.jar`                         |
|`/usr/share/java/antlr-4.10.1-complete.jar`                       |
|`/usr/share/java/antlr-4.11.0-complete.jar`                       |
|`/usr/share/java/antlr-4.11.1-complete.jar`                       |
|`/usr/share/java/antlr-4.12.0-complete.jar`                       |
|`/usr/share/java/antlr-4.13.0-complete.jar`                       |
|`/usr/share/java/antlr-complete.jar -> antlr-4.13.0-complete.jar` |
|`/usr/share/java/antlr-runtime-4.0.jar`                           |
|`/usr/share/java/antlr-runtime-4.1.jar`                           |
|`/usr/share/java/antlr-runtime-4.2.1.jar`                         |
|`/usr/share/java/antlr-runtime-4.2.2.jar`                         |
|`/usr/share/java/antlr-runtime-4.2.jar`                           |
|`/usr/share/java/antlr-runtime-4.3.jar`                           |
|`/usr/share/java/antlr-runtime-4.4.jar`                           |
|`/usr/share/java/antlr-runtime-4.5.1.jar`                         |
|`/usr/share/java/antlr-runtime-4.5.2.jar`                         |
|`/usr/share/java/antlr-runtime-4.5.3.jar`                         |
|`/usr/share/java/antlr-runtime-4.5.jar`                           |
|`/usr/share/java/antlr-runtime-4.6.jar`                           |
|`/usr/share/java/antlr-runtime-4.7.1.jar`                         |
|`/usr/share/java/antlr-runtime-4.7.2.jar`                         |
|`/usr/share/java/antlr-runtime-4.7.jar`                           |
|`/usr/share/java/antlr-runtime-4.8.jar`                           |
|`/usr/share/java/antlr-runtime-4.9.1.jar`                         |
|`/usr/share/java/antlr-runtime-4.9.2.jar`                         |
|`/usr/share/java/antlr-runtime-4.9.3.jar`                         |
|`/usr/share/java/antlr-runtime-4.9.jar`                           |
|`/usr/share/java/antlr-runtime-4.10.1.jar`                        |
|`/usr/share/java/antlr-runtime-4.10.jar`                          |
|`/usr/share/java/antlr-runtime-4.11.0.jar`                        |
|`/usr/share/java/antlr-runtime-4.11.1.jar`                        |
|`/usr/share/java/antlr-runtime-4.12.0.jar`                        |
|`/usr/share/java/antlr-runtime-4.13.0.jar`                        |

#### 3.1.2. Antlr4 C++ 环境

我们安装了 Arch Linux 下的 [extra/antlr4-runtime 包](https://archlinux.org/packages/extra/x86_64/antlr4-runtime/)。

#### 3.1.3. Antlr4 Python 环境

我们安装了 Arch Linux 下的 [extra/python-antlr4 包](https://archlinux.org/packages/extra/any/python-antlr4/)。
