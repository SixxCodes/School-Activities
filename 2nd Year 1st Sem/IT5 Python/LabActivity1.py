print("Welcome to Miaw!👋\nPlease fill up the form!\n")

try:
    namePut = input("Enter your Name: ")
    agePut = int(input("Enter your Age: "))
    locPut = input("Enter your address/location: ")
    kotPut = input("Enter your favorite quote: ")

    print("Welcome, " + namePut + "!!👋")
    print("\nHere is your profile summary: \n\n--------------------------")
    print("Name: " + namePut)
    print("Age: " + str(agePut))
    print("Location: " + locPut)
    print("Favorite Quote: \"" + kotPut + "\"")
    print("Quote length: " + str(len(kotPut)) + " characters")

except ValueError:
    print("Please input a number in the \"Age\" field!")