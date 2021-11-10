package Chapter9.houserent.view;

import Chapter9.houserent.domain.House;
import Chapter9.houserent.service.HouseService;
import Chapter9.houserent.utils.Utility;

/**
 * @Auther: xhq
 * @Date: 2021-11-10 - 12:38
 * @Description: Chapter9.houserent.view
 * @version: 1.0
 */
public class HouseView {
    //属性
    private boolean loop = true;
    private char key = ' ';
    private HouseService houseService =  new HouseService(3);

    //主菜单
    public void mainMenu(){
        do {
            System.out.println("\n---------------房屋出租系统---------------");
            System.out.println("\t\t\t1. 新 增 房 源");
            System.out.println("\t\t\t2. 查 找 房 屋");
            System.out.println("\t\t\t3. 删 除 房 屋");
            System.out.println("\t\t\t4. 修 改 房 屋 信 息");
            System.out.println("\t\t\t5. 房 屋 列 表");
            System.out.println("\t\t\t6. 退      出");
            System.out.print("请选择(1-6): ");
            key = Utility.readChar();
            switch (key){
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    update();
                    break;
                case '5':
                    listHouses();
                    break;
                case '6':
                    exit();
                    break;
                default:
                    System.out.println("输入错误");
            }
        }while(loop);
    }

    //添加房源界面
    public void addHouse(){
        System.out.println("\n---------------添加房源---------------");
        System.out.print("姓名：");
        String name = Utility.readString(8,"无");
        System.out.print("电话：");
        String phone = Utility.readString(12,"无");
        System.out.print("地址：");
        String address = Utility.readString(12,"无");
        System.out.print("月租：");
        int rent = Utility.readInt();
        System.out.print("状态(未出租/已出租)：");
        String state = Utility.readString(3,"无");
        //创新新房屋对象
        House newHouse = new House(0,name, phone, address, rent, state);
        //添加进数组
        if(houseService.add(newHouse)){
            System.out.println("添加成功");
        }else{
            System.out.println("已满，添加失败");
        }
    }

    //查找房源
    public void findHouse(){
        System.out.println("\n---------------查找房屋---------------");
        System.out.print("请输入你要查找id：");
        int id = Utility.readInt();
        House house = houseService.findById(id);
        if (house == null){
            System.out.println("该编号的房屋不存在");
            return;
        }
        System.out.println(house);
    }

    //删除房屋
    public void delHouse(){
        System.out.println("\n---------------删除房屋---------------");
        System.out.print("请选择待删除房屋编号(-1退出)：");
        int delId = Utility.readInt();
        if (delId == -1){
            System.out.println("放弃删除");
            return;
        }
        System.out.println("确认是否删除(Y/N)：");
        char choice = Utility.readConfirmSelection();
        if (choice == 'Y'){
            //执行删除
            if(houseService.del(delId)){//返回true删除成功
                System.out.println("删除房屋信息成功");
            }else{//否则输出删除失败
                System.out.println("删除失败，编号不存在");
            }
        }else{
            System.out.println("放弃删除");
        }

    }

    //修改房屋信息
    public void update(){
        System.out.println("\n---------------修改房屋信息---------------");
        System.out.print("请选择待修改房屋编号（-1退出）：");
        int updateId = Utility.readInt();
        if (updateId == -1){
            System.out.println("放弃修改");
            return;
        }
        //查找房屋
        House house = houseService.findById(updateId);
        if (house == null){
            System.out.println("查找不到该编号信息");
            return;
        }
        //修改信息
        System.out.print("姓名（"+house.getName()+"）: ");
        String name = Utility.readString(10,"");
        if (!"".equals(name)){
            house.setName(name);
        }
        System.out.print("电话（"+house.getPhone()+"）: ");
        String phone = Utility.readString(10,"");
        if (!"".equals(phone)){
            house.setPhone(phone);
        }
        System.out.print("地址（"+house.getAddress()+"）: ");
        String address = Utility.readString(10,"");
        if (!"".equals(address)){
            house.setAddress(address);
        }
        System.out.print("租金（"+house.getRent()+"）: ");
        int rent = Utility.readInt(-1);
        if (rent != -1){
            house.setRent(rent);
        }
        System.out.print("状态（"+house.getState()+"）: ");
        String state = Utility.readString(10,"");
        if (!"".equals(state)){
            house.setState(state);
        }
        System.out.println("---------------修改房屋完成---------------");
    }

    //房屋列表
    public void listHouses(){
        System.out.println("\n---------------房屋列表---------------");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t租金\t\t状态(未出租/已出租)");
        House[] houses = houseService.getHouses();//得到所有房屋信息
        //循环打印
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null){
                break;
            }
            System.out.println(houses[i]);
        }
    }

    //退出
    public void exit(){
        if (houseService.exit()){
            System.out.println("退出系统");
            loop = false;
        }
    }

}
