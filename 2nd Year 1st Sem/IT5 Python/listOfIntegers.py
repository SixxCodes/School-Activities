def main():
    #ngayo input
    while True:
        try:
            count = int(input("How many numbers do you want to type? "))
            if count <= 0:
                print("Please enter a positive number.")
                continue
            break
        except ValueError:
            print("Invalid input. Please enter a valid integer.")

    #loop ni sya
    numbers = []
    for i in range(count):
        while True:
            try:
                num = int(input(f"Enter number {i + 1}: "))
                numbers.append(num)
                break
            except ValueError:
                print("Invalid input. Please enter a valid integer.")

    #a.) Print the total number of items in the list
    print(f"\na.) Total number of items: {len(numbers)}")

    #b.) Print the last item in the list
    if numbers:
        print(f"b.) Last item: {numbers[-1]}")
    else:
        print("b.) The list is empty.")

    #c.) Print the list in reverse order
    print(f"c.) List in reverse order: {numbers[::-1]}")

    #d.) Print "Yes" if the list contains 5, "No" otherwise
    if 5 in numbers:
        print("d.) yes")
    else:
        print("d.) no")

    #e.)Print the number of fives in the list
    print(f"e.) Number of fives: {numbers.count(5)}")

    #f.)Remove the first and last items, sort the remaining items, and print the result
    
    modified_list = numbers[1:-1]
    modified_list.sort()
    print(f"f.) Final Result: {modified_list}")

#public static void main(String[] args){
if __name__ == "__main__":
    main()
#}