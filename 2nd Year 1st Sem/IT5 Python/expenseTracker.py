expenses = []

def add_expense():

    add_description = input("Enter description: ")
    add_category = input("Enter category: ")
    add_amount = float(input("Enter amount: "))

    expense = {

        'description': add_description,
        'category': add_category,
        'amount': add_amount

    }
    expenses.append(expense)

    print("Expense added successfully!")

def view_all_expenses():

    if not expenses:

        print("No expenses are recorded. Create a new one!")
        return

    print("All Expenses:")
    total_spent = 0

    for i, expense in enumerate(expenses, 1):

        print(
            f"{i}. Description: {expense['description']}, Category: {expense['category']}, Amount: ${expense['amount']}")

        total_spent += expense['amount']

    print(f"Total Spent: ${total_spent}")

def view_expenses_by_category():

    category = input("Enter category to view: ")
    filtered_expenses = [expense for expense in expenses if expense['category'].lower() == category.lower()]

    if not filtered_expenses:

        print(f"No expenses found in category '{category}'.")
        return

    print(f"Expenses in category '{category}':")
    total_in_category = 0

    for expense in filtered_expenses:

        print(f"Description: {expense['description']}, Amount: ${expense['amount']}")
        total_in_category += expense['amount']

    print(f"Total in category: ${total_in_category}")

def delete_expense():

    description = input("Enter description to delete: ")
    global expenses
    original_length = len(expenses)
    expenses = [expense for expense in expenses if expense['description'].lower() != description.lower()]

    if len(expenses) < original_length:

        print("Expense deleted successfully!")

    else:

        print("Expense not found.")

def generate_report():

    if not expenses:

        print("No expenses recorded.")
        return

    total_expenses = len(expenses)
    total_amount_spent = sum(expense['amount'] for expense in expenses)

    category_spending = {}

    for expense in expenses:

        if expense['category'] in category_spending:

            category_spending[expense['category']] += expense['amount']

        else:

            category_spending[expense['category']] = expense['amount']

    max_spending_category = max(category_spending, key=category_spending.get)
    max_spending_amount = category_spending[max_spending_category]

    print("Expense Report:")
    print(f"Total Expenses: {total_expenses}")
    print(f"Total Amount Spent: ${total_amount_spent}")
    print(f"Category with Highest Spending: {max_spending_category} (${max_spending_amount})")

print('''\nWelcome to the Expense Tracker\n
    1. Add an Expense
    2. View All Expenses
    3. View Expenses by Category
    4. Delete an Expense
    5. Generate Report
    6. Exit''')

while True:

    choice = int(input("\nEnter your choice: "))

    if choice == 1:

        add_expense()

    elif choice == 2:

        view_all_expenses()

    elif choice == 3:

        view_expenses_by_category()

    elif choice == 4:

        delete_expense()

    elif choice == 5:

        generate_report()

    elif choice == 6:

        print("Thank you for using the Expense Tracker!")
        exit(0)

    else:

        print("Invalid choice!\nPlease try again.")
