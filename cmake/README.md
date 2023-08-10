# CMake 项目提交

需要注意的是，应当使用 configure，不要使用 Makefile（见[configure 说明](#configure)）。

## `configure`

由于 CMake 会覆写 Makefile，因此我们不使用 Makefile，而是直接使用 CMake。

注意不要在项目根目录中执行 `cmake .`，因为这样会产生一个 `Makefile`。如果有这个
`Makefile`，OJ 会在下一步执行 `make`。

## 依赖项

评测机中已经安装了 antlr4 的 C++ 运行时
([antlr4-runtime](https://archlinux.org/packages/extra/x86_64/antlr4-runtime/))。
