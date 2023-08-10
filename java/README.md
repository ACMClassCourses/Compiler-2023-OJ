# 纯 Java 项目提交（不需要在 OJ 上从 g4 文件生成 Java 代码）

*注意：此目录为纯 Java 项目的样例，如果你需要在 OJ 上从 g4 生成 Java，请参考 [java-g4 项目](../java-g4/)！*

对于纯 Java 项目，你需要在项目根目录下包含
- 一个 `Makefile`，参见本目录下的 [`Makefile`](Makefile)。
- 一个 `bin/mxc`，参见本目录下的 [`bin/mxc`](bin/mxc)。

请检查：
- 如果你的项目源文件不在 `src` 下，而是直接在根目录下，请将 Makefile 开头的 `src` 替换为 `.`。
- 如果你的项目需要使用的不是 `antlr-4.13.0-complete.jar`，请将 Makefile 中的 `ANTLR_JAR` 替换为你的 jar 文件名。
  关于你可以使用的 antlr4 环境，参见 [README#3.1 antlr4 环境](../README.md#31-antlr4-环境)。

  **注意：请务必保持生成 g4 时与运行时依赖的版本一致性。**
- 如果你的项目不希望使用 Java20，请将 Makefile 中的 `javac` 和 `bin/mxc` 中 `java` 替换成对应的 java
  版本，比如如果你需要使用 Java11，你需要分别将二者替换为 `javac11` 以及 `java11`。
- 如果你的根目录下的 `.gitignore` 中包含 `bin/`，请将其移除，并添加本目录下的 `bin/.gitignore` 到 `bin/` 目录。
