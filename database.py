import pymysql
class Database:
    #设置数据库的连接参数
    host = "暂时不懂"
    user = "root"
    password = "Gl18admin!"
    #大概是连接数据库用的
    def __init__(self,db):
        connect = pymysql.connect(host=self.host,user=self.user,password=self.password,database=db)
        self.cursor = connect.cursor()
