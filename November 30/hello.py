#%% SIMPLE DECORATIONSimport colorama
from colorama import Fore
from colorama import Style
import random
colors = [Fore.RED, Fore.YELLOW, Fore.BLUE, Fore.GREEN, Fore.MAGENTA]
def chritsmas_tree(height):
    for i in range(height):
        branch = ''
        if i % 2 == 0:
            branch = '*' * (2 * i + 1)
            randcolor = random.choice(colors)
        else:
            branch = '~' * (2 * i + 1)

        if i == height - 1:
            decoration = '^'
        elif i % 2 == 0:
            decoration = 'O'
        else:
            decoration = 'o'

        print(' ' * (height - i - 1) + {randcolor}branch + decoration)
    for i in range(2):
        print(" "*(height-1) + "*")

chritsmas_tree(10)

#%% RAINBOW TREE

##NOTE!! Google Colab does not support colorama package. Try this on your own VS Code
import colorama
from colorama import Fore
from colorama import Style
import random

colors = [Fore.RED, Fore.YELLOW, Fore.BLUE, Fore.GREEN, Fore.MAGENTA]

def christmas_tree(height):
    for i in range(height):
        for j in range(0, height-i-1):
            print(end = " ")
        for j in range(0, i+1):
            print(f'{random.choice(colors)}*', end = " ")
        print()
    for i in range(2):
        print(" "*(height-1) + "*")

christmas_tree(20)


