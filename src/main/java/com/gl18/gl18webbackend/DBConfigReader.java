package com.gl18.gl18webbackend;

import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Logger;


public class DBConfigReader {
    private Logger logger = Logger.getLogger("gl18-bkend");
    public String dbhost = null;
    public String dbusername = null;
    public String dbpasswd = null;
    public String dbname = null;

    public String recaptcha_key = null;


    @SuppressWarnings("ResultOfMethodCallIgnored")
    public DBConfigReader(){
        try {
            String folder = "config/database";
            String fileName = "config/database/config.yml";
            File file = new File(fileName);
            File folderFile = new File(folder);
            if (!file.exists() || !folderFile.exists()){
                String content = "#Mysql Host\n" +
                        "dbhost: \"localhost\"\n" +
                        "#MySQL Username\n" +
                        "dbusername: \"root\"\n" +
                        "#MySQL Password\n" +
                        "dbpasswd: \"\"\n" +
                        "#Database name\n" +
                        "dbname: \"database\"\n" +
                        "#RECAPTCHA private key\n" +
                        "recaptcha_key: \"your_key_here\"";
                folderFile.mkdirs();
                file.createNewFile();
                FileWriter fileWritter = new FileWriter(fileName,true);
                fileWritter.write(content);
                fileWritter.close();
                logger.warning("配置已生成！请先调整配置后再打开后端");
                System.exit(0);
            }
            Yaml yaml = new Yaml();
            Object obj = yaml.load(new FileInputStream(file));
            Map map = (Map)obj;
            this.dbhost = (String) map.get("dbhost");
            this.dbusername = (String) map.get("dbusername");
            this.dbpasswd = (String) map.get("dbpasswd");
            this.dbname = (String) map.get("dbname");
            this.recaptcha_key = (String) map.get("recaptcha_key");

        } catch (IOException e){
            e.printStackTrace();
        }

    }
}

