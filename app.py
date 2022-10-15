from flask import Flask

app = Flask(__name__)


@app.route('/')
def zhixinghanshu():  # 代码放这
    return render_template("index.html")


if __name__ == '__main__':
    app.run(debug=true)
