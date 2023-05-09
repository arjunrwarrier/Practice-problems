import mysql.connector

mydb = mysql.connector.connect(host = 'localhost', user = 'root', password = '', database = 'recipedb')

mycursor = mydb.cursor()


while True:
    print("\nSelect an option from the menu ")
    print("1. Add Recipe")
    print("2. View all recipes")
    print("3. Search a recipe")
    print("4. Update a recipe")
    print("5. Delete recipe")
    print("6. Display total recipes in each category")
    print("7. View recipes in a specific category")
    print("8. Search for recipe with first letter")
    print("9.exit\n")

    choice = int(input("Enter an option: "))
    if(choice == 1):
        print("Recipe data insertion")

        rtitle = input("Enter recipe name: ")
        rdesc = input("Enter recipe description: ")
        rpreparedby = input("Recipe prepared by: ")
        ringredients = input("Enter the ingredients: ")
        rcategory = input("Enter the recipe category: ")

        sql = 'INSERT INTO `recipes`(`title`, `description`, `preparedby`, `ingredients`, `recipecategory`) VALUES(%s,%s,%s,%s,%s)'
        data = (rtitle,rdesc,rpreparedby,ringredients,rcategory)
        mycursor.execute(sql,data)
        mydb.commit()
        print("Recipe's data inserted successfully.")

    elif(choice == 2):
        print("View Recipe")
        sql = "SELECT * FROM `recipes`"
        mycursor.execute(sql)
        result = mycursor.fetchall()
        for i in result:
            print(i)
    elif(choice == 3):
        print("Searching a Recipe")
        rname = input("Enter the recipe name to search: ")
        sql = "SELECT `title`, `description`, `preparedby`, `ingredients`, `recipecategory` FROM `recipes` WHERE `title` = '"+rname+"'"
        mycursor.execute(sql)
        result =mycursor.fetchall()
        print(result)

    elif (choice == 4):
        print("update Recipe")
        rname = input("Enter the recipe name: ")
        rdesc = input("Enter recipe description to update: ")
        rpreparedby = input("Enter to update who prepared: ")
        ringredients = input("Enter the ingredients to update: ")
        rcategory = input("Enter the recipe category to update: ")

        sql = "UPDATE `recipes` SET `description`='"+rdesc+"',`preparedby`='"+rpreparedby+"',`ingredients`='"+ringredients+"',`recipecategory`='"+rcategory+"' WHERE `title`='"+rname+"'"
        mycursor.execute(sql)
        mydb.commit()
        print("Recipe data updated successfully.")

    elif(choice == 5):
        print("delete a Recipe")
        rname = input("Enter recipe name to delete: ")
        sql = "DELETE FROM `recipes` WHERE `title` = '"+rname+"'"
        mycursor.execute(sql)
        mydb.commit()
        print("Recipe data deleted successfully.")
    elif(choice==6):
        print("Total recipes in Veg and Non-veg")
        sql = "SELECT COUNT(*)AS total, recipecategory FROM recipes GROUP BY recipecategory"
        mycursor.execute(sql)
        result = mycursor.fetchall()
        for i in result:
            print(i)
    elif(choice == 7):
        print("View recipe from a specific category")
        rcategory = input("Enter the category to view recipe:")
        sql = "SELECT * FROM recipes WHERE `recipecategory` = '"+rcategory+"'"
        mycursor.execute(sql)
        result = mycursor.fetchall()
        for i in result:
            print(i)
    elif(choice == 8):
        print("Search a recipe by letter")
        rletter = input("Enter the letter to search: ")
        sql = "SELECT `title`, `description`, `preparedby`, `ingredients`, `recipecategory` FROM `recipes` WHERE `title` LIKE'"+rletter+"%'"
        mycursor.execute(sql)
        result = mycursor.fetchall()
        for i in result:
            print(i)
    
    elif(choice==9):
        break