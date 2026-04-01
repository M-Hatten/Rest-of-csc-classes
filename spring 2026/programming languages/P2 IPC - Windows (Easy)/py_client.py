# must run "pip install pywin32" from terminal to install
from win32file import *
pipe = CreateFile(
r"\\.\pipe\multi-lang-assignment",
GENERIC_READ | GENERIC_WRITE, 0, None, OPEN_EXISTING, 0, None)