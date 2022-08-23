package Exception.ExceptionTest;

/*
    throws和throw的最大的区别在于：
        throws用在方法声明后面，跟的是异常类名。
        throw用在方法体内，跟的是异常对象名。
 */

public class Teacher {

    public void checkScore(int score) throws ScoreException{
        if(score<0 || score>100){
            throw new ScoreException("输入的分数有误，分数应该在1-100之间");
        }else{
            System.out.println("分数正常");
        }
    }

}
