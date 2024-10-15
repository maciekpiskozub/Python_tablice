import json

from flask import Flask, jsonify, request

app = Flask(__name__)


@app.route('/')
def hello_world():
    return 'Hello World!'


list_of_salaries = [
    {"name": "Przemek", "salary": 3000},
    {"name": "Michał", "salary": 4000},
    {"name": "Roch", "salary": 5000},
    {"name": "Ziemowit", "salary": 6000}
]


@app.route('/salaries')
def salaries():
    return jsonify(list_of_salaries)
    # return json.dumps(list_of_salaries)


@app.route('/salaries', methods=['POST'])
def add_salary():
    list_of_salaries.append(request.get_json())
    return '', 204


if __name__ == '__main__':
    app.run()
