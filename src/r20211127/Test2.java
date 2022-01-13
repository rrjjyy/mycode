package r20211127;


import java.util.Scanner;

 class ErJinZhi{
    public String trans(int zheng){
        String temp = "";
        while(zheng!=0){
            temp = (zheng%2)+temp;
            zheng = zheng/2;
        }
        return temp;
    }

    public String trans(float xiao){
        if(xiao>1){
            return "false";
        }
        String temp = "";
        int weishu = 10;        //小数位数
        for(int i=0;i<weishu;i++){
            xiao*=2;
            if(xiao>=1){
                temp+="1";
                xiao = xiao-1;
            }else{
                temp+="0";
            }
        }
        return temp;
    }



    public static void main(String[] args){
        System.out.println("请输入一个浮点数：");
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();

        int zheng = (int)n;
        float xiao = n-zheng;

        String temp = new ErJinZhi().trans(zheng);
        String temp2 = new ErJinZhi().trans(xiao);
        String result=temp+"."+temp2;
        System.out.println("二进制："+temp+"."+temp2);
        System.out.println("16进制："+Integer.toHexString(Float.floatToIntBits(n)));
        System.out.println( "地址为："+Integer.toHexString(System.identityHashCode(n)));

    }
}

