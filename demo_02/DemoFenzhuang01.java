package demo_02;

public class DemoFenzhuang01 {
    public static void main(String[] args) {
        //面向对象三大特性：封装、继承、多态
        //1.方法就是一种封装
        //2.关键字private也是封装
        //封装就是将一些信息隐藏起来对于外界不可见
        int [] array={78,90,87,76,96};
        int max=getMax(array);
        System.out.println("最大值："+max);
    }
    public static int getMax(int [] array){
        int max=array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]>max){
                max=array[i];
            }
        }
        return max;
    }
}
