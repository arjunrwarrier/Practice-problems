import requests
import json
import mysql.connector

try:
    mydb = mysql.connector.connect(host = 'localhost', user = 'root', password='',database = 'tododb')
except mysql.connector.Error as e:
    print("Connector error ",e)

mycursor = mydb.cursor()

data = requests.get("https://jsonplaceholder.typicode.com/todos").text

data_info = json.loads(data)

for i in data_info:
    id = str(i['userId'])
    if(i['completed'] == False):
        sql = "INSERT INTO `todo`(`userid`, `title`, `completed`) VALUES ('"+id+"','"+i['title']+"','"+str(i['completed'])+"')"
        mycursor.execute(sql)
        mydb.commit()
        print("Data inserted successfully: ",i['userId'])
