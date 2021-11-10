package Chapter9.houserent.service;

import Chapter9.houserent.domain.House;
import Chapter9.houserent.utils.Utility;

/**
 * @Auther: xhq
 * @Date: 2021-11-10 - 12:38
 * @Description: Chapter9.houserent.service
 * @version: 1.0
 * HouseService.java<=>类 [业务层]
 * //定义House[] ,保存House对象
 * 1. 响应HouseView的调用
 * 2. 完成对房屋信息的各种操作(增删改查c[create]r[read]u[update]d[delete])
 */
public class HouseService {
    private House[] houses;
    private int count = 1;
    private int idCount = 1;

    //constructor
    public HouseService(int size) {
        this.houses = new House[size];
        houses[0] = new House(1,"jack","112", "海淀区", 2000, "未出租");
    }

    public House[] getHouses() {
        return houses;
    }

    //添加房屋
    public boolean add(House newHouse){
        //如果满了，返回false
        if (count == houses.length){
            return false;
        }
        houses[count++] = newHouse;
        newHouse.setId(++idCount);
        return true;
    }

    //查找房屋
    public House findById(int id){
        for (int i = 0; i < count; i++) {
            if (houses[i].getId() == id){
                return houses[i];
            }
        }
        return null;
    }
    
    //删除房屋
    public boolean del(int delId){
        //查找该房屋,有的话返回下标，否则返回-1
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (houses[i].getId() == delId){
                index = i;
            }
        }
        //下标为-1，删除失败返回false
        if (index == -1) {
            return false;
        }
        //下标不为1，执行删除
        for (int i = index; i < count-1; i++) {
            houses[i]=houses[i+1];
        }
        houses[--count] = null;
        return true;
    }

    //退出
    public boolean exit(){
        char exit = Utility.readConfirmSelection();
        if (exit == 'N'){
            return false;
        }
        return true;
    }
}
