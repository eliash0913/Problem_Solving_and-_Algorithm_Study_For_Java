package LeetCode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P690_Employee_Importance {
    HashMap<Integer, Employee> employeeHMap = new HashMap<>();
    public int getImportance(List<Employee> employees, int id) {
        for(Employee employee : employees){
            employeeHMap.put(employee.id, employee);
        }
        return dfs(id);
    }

    public int dfs(int id){
        int importance = employeeHMap.get(id).importance;
        for(int eid : employeeHMap.get(id).subordinates){
            importance+=dfs(eid);
        }
        return importance;
    }



//    public int getImportance(List<Employee> employees, int id) {
//        Queue<Employee> queue = new LinkedList<>();
//        HashMap<Integer, Employee> employeeHMap = new HashMap<>();
//        for(Employee employee : employees){
//            employeeHMap.put(employee.id, employee);
//            if(employee.id == id) {
//                queue.add(employee);
//            }
//        }
//        int importance = 0;
//        while(!queue.isEmpty()) {
//            Employee employee = queue.poll();
//            importance+=employee.importance;
//            System.out.println(importance);
//            if(employee.subordinates.size() > 0){
//                for(int i : employee.subordinates)
//                    queue.add(employeeHMap.get(i));
//            }
//        }
//        return importance;
//    }
}

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};