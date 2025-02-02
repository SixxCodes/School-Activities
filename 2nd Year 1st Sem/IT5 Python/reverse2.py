from reverse1 import reverse_string

def main():
    user_input = input("Enter a string to reverse: ")
    reversed_string = reverse_string(user_input)
    print("Reversed string:", reversed_string)

if __name__ == "__main__":
    main()