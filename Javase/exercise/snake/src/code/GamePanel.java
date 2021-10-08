package code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class GamePanel extends JPanel {
    boolean isStart = false;
    //定义数组，存储蛇的坐标
    int[] snakeX = new int[200];
    int[] snakeY = new int[200];
    //蛇的长度
    int length;
    //定义蛇的行走方向
    String direction;
    int foodX;
    int foodY;
    // 加入定时器
    Timer timer;

    public void init(){
        //初始化方向
        direction = "R";
        //初始化食物坐标
        foodX = 300;
        foodY = 200;
        //初始化蛇的长度
        length = 3;
        //初始化蛇头坐标
        snakeX[0]=175;
        snakeY[0]=275;
        //初始化第一节身子坐标
        snakeX[1]=150;
        snakeY[1]=275;
        //初始化第一节身子坐标
        snakeX[2]=125;
        snakeY[2]=275;
    }
    public GamePanel(){
        init();
        this.setFocusable(true);
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                int keyCode = e.getKeyCode();
                System.out.println(keyCode);
                if(keyCode==KeyEvent.VK_SPACE){
                    isStart =! isStart;
                    repaint();
                }
                if(keyCode == KeyEvent.VK_UP){
                    direction = "U";
                }
                if(keyCode == KeyEvent.VK_DOWN){
                    direction = "D";
                }
                if(keyCode == KeyEvent.VK_LEFT){
                    direction = "L";
                }
                if(keyCode == KeyEvent.VK_RIGHT){
                    direction = "R";
                }
            }
        });
        timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(isStart){
                    for(int i=length-1;i>0;i--){
                        snakeX[i] = snakeX[i-1];
                        snakeY[i] = snakeY[i-1];
                    }
                    if("R".equals(direction)){
                        snakeX[0]+=25;
                    }
                    if("L".equals(direction)){
                        snakeX[0]-=25;
                    }
                    if("U".equals(direction)){
                        snakeY[0]-=25;
                    }
                    if("D".equals(direction)){
                        snakeY[0]+=25;
                    }
                    if(snakeX[0]>750){
                        snakeX[0]=25;
                    }
                    if(snakeX[0]<25){
                        snakeX[0]=750;
                    }
                    if(snakeY[0]<60){
                        snakeY[0]=750;
                    }
                    if(snakeY[0]>750){
                        snakeY[0]=60;
                    }
                    if(snakeX[0]==foodX&&snakeY[0]==foodY){
                        length++;
                        //随机生成新坐标
                        foodX = ((int)Math.random()*30+1)*25;//[25,750]
                        foodY = (new Random().nextInt(26)+4)*25;//[100,725]
                    }
                    repaint();
                }
            }
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        this.setBackground(new Color(218, 239, 199, 255));

        Images.headerImg.paintIcon(this,g,10,10);
        g.setColor(new Color(177, 220, 220));
        g.fillRect(10,70,770,685);

        //画蛇
        //蛇头
        if("R".equals(direction)){
            Images.rightImg.paintIcon(this,g,snakeX[0],snakeY[0]);
        }
        if("L".equals(direction)){
            Images.leftImg.paintIcon(this,g,snakeX[0],snakeY[0]);
        }
        if("U".equals(direction)){
            Images.upImg.paintIcon(this,g,snakeX[0],snakeY[0]);
        }
        if("D".equals(direction)){
            Images.downImg.paintIcon(this,g,snakeX[0],snakeY[0]);
        }
//        //画第一节身子
//        Images.bodyImg.paintIcon(this,g,snakeX[1],snakeY[1]);
//        //画第二节身子
//        Images.bodyImg.paintIcon(this,g,snakeX[2],snakeY[2]);
        //循环画身子
        for(int i =1;i<length;i++){
            Images.bodyImg.paintIcon(this,g,snakeX[i],snakeY[i]);
        }

        if(isStart == false){
            g.setColor(new Color(250, 196, 196));
            g.setFont(new Font("微软雅黑",Font.BOLD,40));
            g.drawString("点击空格开始游戏",250,330);
        }
        //画食物
        Images.foodImg.paintIcon(this,g,foodX,foodY);
    }
}
