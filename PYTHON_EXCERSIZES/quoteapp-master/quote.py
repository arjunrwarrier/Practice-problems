import requests
import json
import mysql.connector

try: 
    mydb=mysql.connector.connect(host = 'localhost', user='root',password='',database='quotesdb')
except mysql.connector.Error as e:
    print("Mysql connecter error",e)

mycursor = mydb.cursor()

data = requests.get("https://dummyjson.com/quotes").text

data_info = json.loads(data)

for i in data_info['quotes']:

    try:
        sql = "INSERT INTO `quotes`(`quote`, `author`) VALUES (%s,%s)"
        data = (i['quote'],i['author'])
        mycursor.execute(sql,data)
        mydb.commit()
    except mysql.connector.Error as e:
        print("Error ",e)
    print("Data inserted successfully, ", i['author'])