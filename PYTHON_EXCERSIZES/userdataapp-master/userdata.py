import requests
import json
import mysql.connector

try:
    mydb = mysql.connector.connect(host = 'localhost', user='root', password ='',database='userdatadb')
except mysql.connector.Error as e:
    print("Mysql connector error ",e)

mycursor = mydb.cursor()

data = requests.get("https://dummyjson.com/users").text

data_info = json.loads(data)

for i in data_info['users']:
    try:
        sql = "INSERT INTO `userdata`(`firstnamae`, `lastname`, `maidenname`, `age`, `gender`, `email`, `phone`, `username`, `password`, `dob`, `bloodgroup`, `height`, `weight`, `eyecolor`) VALUES (%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s)"
        data= (i['firstName'],i['lastName'],i['maidenName'],i['age'],i['gender'],i['email'],i['phone'],i['username'],i['password'],i['birthDate'],i['bloodGroup'],i['height'],i['weight'],i['eyeColor'])
        mycursor.execute(sql,data)
        mydb.commit()
    except mysql.connector.Error as e:
        print("Error ",e)

    print("Data inserted successfully, ",i['firstName'])
        