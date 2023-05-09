import requests
import json
import mysql.connector

try: 
    mydb=mysql.connector.connect(host = 'localhost', user='root',password='',database='userinfodb')
except mysql.connector.Error as e:
    print("Mysql connecter error",e)

mycursor = mydb.cursor()

data = requests.get("https://reqres.in/api/users?page=1").text

data_info = json.loads(data)

for i in data_info['data']:

    try:
        sql = "INSERT INTO `userinfo`(`email`, `firstname`, `lastname`) VALUES (%s,%s,%s)"
        data = (i['email'],i['first_name'],i['last_name'])
        mycursor.execute(sql,data)
        mydb.commit()
    except mysql.connector.Error as e:
        print("Error ",e)
    print("Data inserted successfully, ", i['first_name'])