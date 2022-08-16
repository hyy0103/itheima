package ParameterAndReturnValues.Jumpping;

/*
    操作类
 */

public class JumppingOperator { //Jumpping j = new Cat();

    public void useJumpping(Jumpping j){
        j.jump();
    }

    public Jumpping getJumpping(){
        Jumpping j = new Cat();
        return j;
    }

}
