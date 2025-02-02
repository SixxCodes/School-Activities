import math

def add(x, y):
    return x + y

def subtract(x, y):
    return x - y

def multiply(x, y):
    return x * y

def divide(x, y):
    if y != 0:
        return x / y
    else:
        return "\n\tError: Division by zero"

def modulus(x, y):
    return x % y

def exponent(x, y):
    return x ** y

def square_root(x):
    if x >= 0:
        return math.sqrt(x)
    else:
        return "\n\tError: Square root of a negative number"

def sine(x):
    return math.sin(math.radians(x))

def cosine(x):
    return math.cos(math.radians(x))

def tangent(x):
    return math.tan(math.radians(x))

def natural_log(x):
    if x > 0:
        return math.log(x)
    else:
        return "\n\tError: Logarithm of a non-positive number"

def log_base_10(x):
    if x > 0:
        return math.log10(x)
    else:
        return "\n\tError: Logarithm of a non-positive number"

#####prints

print("***SCIENTIFIC CALCULATOR***")
print("Welcome to the Python Calculator!")
while True:
    print("\nSelect an operation:")
    print("1. Addition")
    print("2. Subtraction")
    print("3. Multiplication")
    print("4. Division")
    print("5. Modulus")
    print("6. Exponentiation")
    print("7. Square Root")
    print("8. Sine")
    print("9. Cosine")
    print("10. Tangent")
    print("11. Logarithm (Natural)")
    print("12. Logarithm (Base 10)")
    print("13. Exit")

    try:
        choice = input("\nEnter choice (1-13): ")

        if choice == '13':
            print("Exiting the calculator.")
            exit(0)

        elif choice in ('1', '2', '3', '4', '5', '6'):
            num1 = float(input("Enter first number: "))
            num2 = float(input("Enter second number: "))

            if choice == '1':
                print("Result:", add(num1, num2))
            elif choice == '2':
                print("Result:", subtract(num1, num2))
            elif choice == '3':
                print("Result:", multiply(num1, num2))
            elif choice == '4':
                print("Result:", divide(num1, num2))
            elif choice == '5':
                print("Result:", modulus(num1, num2))
            elif choice == '6':
                print("Result:", exponent(num1, num2))

        elif choice in ('7', '8', '9', '10', '11', '12'):
            num = float(input("Enter a number: "))

            if choice == '7':
                print("Result:", square_root(num))
            elif choice == '8':
                print("Result:", sine(num))
            elif choice == '9':
                print("Result:", cosine(num))
            elif choice == '10':
                print("Result:", tangent(num))
            elif choice == '11':
                print("Result:", natural_log(num))
            elif choice == '12':
                print("Result:", log_base_10(num))

        else:
            print("Invalid input. Please select a number between 1 and 13.")

    except ValueError:
        print("This is not a number!")
    except Exception as e:
        print(f"An error occurred: {e}")


while True:
    try:

        choice = int(input("Enter choice (1-13): "))

        num1 = int(input("Enter first number: "))
        num2 = int(input("Enter second number: "))

        print("Result: ")

    except ValueError:
        print("This is not a number!")
