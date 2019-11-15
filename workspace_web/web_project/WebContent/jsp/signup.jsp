<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>회원가입</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
    <script src="join.js" type="text/javascript"></script>
   
</head>

<body>
    <article class="container">
        <div class="page-header">
            <div class="col-md-6 col-md-offset-3" style="text-align: center;">
                <h3>회원가입</h3>
            </div>
        </div>
        <div class="col-sm-6 col-md-offset-3">


        <form role="form" name="join" method = "POST" action="JoinOk.jsp">
          <div class="form-group">
                <label for="inputID">아이디</label>
                <div style="display: flex;">
                <input type="text" class="form-control" id="inputID" placeholder="아이디를 입력해주세요" name="ID" onkeydown="inputIdChk()" style="width: 80%;">
                

                <button type="button" class="btn btn-info" onclick="openIdChk()" style="font-size: 0.7em; margin-left: 2%; margin-right: 0px;">
                    중복확인
                </button>
                <input type="hidden" name = "idDuplication" value ="idUnchecked">
              </div>
            </div>
            
           <div class="form-group">
                <label for="inputPassword">비밀번호</label>
                <input type="password" class="form-control" id="inputPassword" name = "pwd" placeholder="비밀번호를 입력해주세요">
            </div>
            <div class="form-group">
                <label for="inputPasswordCheck">비밀번호 확인</label>
                <input type="password" class="form-control" id="inputPasswordCheck" name="repwd" placeholder="비밀번호 확인을 위해 다시한번 입력 해 주세요">
            </div>
            <div class="form-group" >
                <label for="inputName">성명</label>
                <input type="text" class="form-control" id="inputName" name="name" placeholder="이름을 입력해 주세요">
            </div>
            <div class="form-group">
                <label for="InputEmail">생년월일</label>
                <input type="date" class="form-control" id="InputBirth" name="birthDay">
            </div>
            <div class="form-group">
                <label for="InputEmail">이메일 주소</label>
                <input type="email" class="form-control" id="InputEmail" placeholder="이메일 주소를 입력해주세요" name = "eMail">
            </div>
            
            <div class="form-group">
                <label for="inputMobile">휴대폰 번호</label>
                <div class="form-group" style="display: flex;">
                <select name="mobileCarrier" >
                    <option value="KT">KT</option>
                    <option value="LG">LG</option>
                    <option value="SKT">SKT</option>
                </select>
                <input type="tel" class="form-control" name = "phoneNumber" id="inputMobile" placeholder="휴대폰번호를 입력해 주세요">
                </div>
            </div>
            <div class="form-group">
                <label for="inputtelNO">성별</label>
                <div class="form-group" style="text-align: center;">
                <input type="radio" name="gender" value="남" checked="checked"> 남
                <input type="radio" name="gender" value="녀" style="margin-left: 20%;"> 녀
                </div>
            </div>

            <div class="form-group">
                <label>약관 동의</label>
                <div data-toggle="buttons">
                    <label class="btn btn-info active">
                        <span class="fa fa-check"></span>
                        <input id="agree" type="checkbox" autocomplete="off" checked>
                    </label>
                    <a href="#">이용약관</a>에 동의합니다.
                </div>
            </div>

            <div class="form-group text-center">
                <button type="button" id="join-submit" class="btn btn-info" onclick="checkValue()">
                    회원가입<i class="fa fa-check spaceLeft"></i>
                </button>
                <button type="button" class="btn btn-Light" style="margin-left: 20%;">
                    가입취소<i class="fa fa-times spaceLeft"></i>
                </button>
            </div>
            
        </form>
        </div>

    </article>
    

</body>

</html>