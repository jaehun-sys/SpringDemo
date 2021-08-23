package com.example.demo;

//작성자: 이재훈
public class Test {
    void run(){  }
}

class Test2 extends Test{
    //@Override //'이거 재정의야' 하고 컴파일러한테 정보를 주는 거임
    void ruN(){  }   //재정의
}


//한줄 주석
/* 여러줄 주석

주석은 실행에 영향을 안줌. 사람이 어떤 정보를 줌.abstract

@로 시작하는 주석 : Annotation
사람이 보는 주석이 아니라
    자바의 컴파일러에게 어떤 정보를 주거나,
    자바의 실행환경에게 어떤 정보를 주거나,

*/