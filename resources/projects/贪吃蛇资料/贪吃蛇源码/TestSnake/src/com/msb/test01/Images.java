package com.msb.test01;

import javax.swing.*;
import java.net.URL;

/**
 * @author : msb-zhaoss
 */
public class Images {
    //首先将图片的路径进行封装为对象：
    public static URL bodyURL = Images.class.getResource("/images/body.png");
    //封装图片：
    public static ImageIcon bodyImg = new ImageIcon(bodyURL);
    //首先将图片的路径进行封装为对象：
    public static URL downURL = Images.class.getResource("/images/down.png");
    //封装图片：
    public static ImageIcon downImg = new ImageIcon(downURL);
    //首先将图片的路径进行封装为对象：
    public static URL foodURL = Images.class.getResource("/images/food.png");
    //封装图片：
    public static ImageIcon foodImg = new ImageIcon(foodURL);
    //首先将图片的路径进行封装为对象：
    public static URL headerURL = Images.class.getResource("/images/header.png");
    //封装图片：
    public static ImageIcon headerImg = new ImageIcon(headerURL);
    //首先将图片的路径进行封装为对象：
    public static URL leftURL = Images.class.getResource("/images/left.png");
    //封装图片：
    public static ImageIcon leftImg = new ImageIcon(leftURL);
    //首先将图片的路径进行封装为对象：
    public static URL rightURL = Images.class.getResource("/images/right.png");
    //封装图片：
    public static ImageIcon rightImg = new ImageIcon(rightURL);
    //首先将图片的路径进行封装为对象：
    public static URL upURL = Images.class.getResource("/images/up.png");
    //封装图片：
    public static ImageIcon upImg = new ImageIcon(upURL);

}
