#include <windows.h>
HANDLE pipe = CreateFile(
(LPCWSTR)"\\\\.\\pipe\\multi-lang-assignment",
GENERIC_READ | GENERIC_WRITE, 0, NULL, OPEN_EXISTING, 0, NULL);