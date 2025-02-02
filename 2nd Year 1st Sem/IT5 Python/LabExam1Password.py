butangStr = input("Enter a string: ")

arrButanged = []

for i, char in enumerate(butangStr):
    #upper ang 1st char
    if i == 0:
        arrButanged.append(char.upper())
    #ang vowels replace sa next
    elif char in "aeiouAEIOU":
        vowels = "aeiouaAEIOUA"
        index = vowels.index(char)
        arrButanged.append(vowels[index + 1])
    #ang S ug s to $
    elif char == 's' or char == 'S':
        arrButanged.append('$')
    #double ang numbers
    elif char.isdigit():
        arrButanged.append(str(int(char) * 2))
    #T ug t to +
    elif char == 't' or char == 'T':
        arrButanged.append('+')
    #whitespace to _
    elif char == ' ':
        arrButanged.append('_')
    #isumpay ang uban na wlay sub
    else:
        arrButanged.append(char)

#i-join na
result = ''.join(arrButanged)
print(f"Coded string: {result}")
