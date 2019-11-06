
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hiepnguyen
 */
public class Test {
    int id;
    String name;

    public Test(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    public static void main(String[] args) {
        List<Test> list = new ArrayList();
        
        list.add(new Test(3,"C"));
        list.add(new Test(5,"A"));
        list.add(new Test(1,"D"));
        list.add(new Test(4,"E"));
        list.add(new Test(2,"B"));
        
        //List<Test> a = list.stream().sorted(Comparator.comparing(Test::getId)).collect(Collectors.toList());
        //List<Test> a = list.stream().sorted((p1,p2) -> p1.getName().compareTo(p2.getName())).collect(Collectors.toList());
        
        List<Test> a = list.stream().sorted((t1, t2) -> t2.getId() - t1.getId()).collect(Collectors.toList());
        a.forEach(n -> {
            System.out.println("ID: " + n.getId() + "      Name : " + n.getName());
        });
        
        
        
    }
}
