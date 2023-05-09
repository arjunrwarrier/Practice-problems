import requests
import json
import mysql.connector

try: 
    mydb=mysql.connector.connect(host = 'localhost', user='root',password='',database='usdatadb')
except mysql.connector.Error as e:
    print("Mysql connecter error",e)

mycursor = mydb.cursor()

data = requests.get("https://datausa.io/api/data?drilldowns=Nation&measures=Population").text

data_info = json.loads(data)

for i in data_info['data']:
    idyear=str(i['ID Year'])
    year = str(i['Year'])
    population = str(i['Population'])

    sql = "INSERT INTO `uspublicdata`(`idnation`, `nation`, `idyear`, `year`, `population`, `slugnation`) VALUES ('"+i['ID Nation']+"','"+i['Nation']+"','"+idyear+"','"+year+"','"+population+"','"+i['Slug Nation']+"')"
    mycursor.execute(sql)
    mydb.commit()
    print("Data inserted successfully, ", i['ID Nation'])


