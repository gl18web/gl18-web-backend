from flask import Flask, render_template, request, jsonify

app = Flask(__name__)


@app.route('/')
def zhixinghanshu():  # 代码放这(分类)
    return render_template("index.html")


@app.route('/')   #等前端写完
def zhuce():
    


if __name__ == '__main__':
    app.run(debug=true)
