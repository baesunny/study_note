## 📝 FastAPI STUDY

#### FastAPI란?
FastAPI는 Python을 기반으로 개발된 현대적이고 빠른 웹 프레임워크로, 
API 개발에 특히 초점을 맞추어 설계되었고 높은 성능과 직관적인 문법을 제공한다.

#### VSCODE로 FastAPI 시작하기

1. vscode 실행 후에 open folder를 통해 프로젝트 폴더 열기
2. 터미널에서 pip isntall fastapi uvicorn 입력

3. 기본 app 만들기

   
<pre>
<code>
import fastapi
app = fastapi.FastAPI()

@app.get('/')
def home():
   return {"message": "Welcome Home!"}
</code>
</pre>


5. 기본 app을 생성하였다면 아래의 코드를 입력하여 앱을 실행한다.
