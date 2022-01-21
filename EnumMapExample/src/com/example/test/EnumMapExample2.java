package com.example.test;

import java.io.BufferedOutputStream;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

enum ProjectStatus {
    ACTIVE,
    INACTIVE,
    START,
    FINISH;
}

public class EnumMapExample2 {

    public static void main(final String[] args) {
        final EnumMap<ProjectStatus, Project> enumMap = new EnumMap<>(ProjectStatus.class);
        boolean statusCondition = false;
        boolean projectCondition = false;

        enumMap.put(ProjectStatus.ACTIVE, new Project(100, "Customer Management System", "Customer Management System"));
        enumMap.put(ProjectStatus.INACTIVE, new Project(200, "Employee Management System", "Employee Management System"));
        enumMap.put(ProjectStatus.START, new Project(300, "Netflix software maintenance", "Netflix Software Engineer"));
        enumMap.put(ProjectStatus.FINISH, new Project(400, "Facebook Software Development", "Facebook Software Development"));
        for (final Map.Entry<ProjectStatus, Project> entry : enumMap.entrySet()) {
            final ProjectStatus projectStatus = entry.getKey();
            System.out.println(" Key -> " + projectStatus.name());
            final Project project = entry.getValue();
            System.out.println(" Value -> " + project.toString());
        }

        System.out.println("===========================================");
        System.out.println("Iteration in EnumMap -> ProjectStatus : ");
        for (ProjectStatus status : ProjectStatus.values()) {
            System.out.println(status);
        }
        System.out.println("===========================================");

        // Copy of EnumMap
        EnumMap<ProjectStatus, Project> copyEnumMap = enumMap.clone();

        // void putAll(Map<? extends K,? extends V> m) - Copies all of the mappings from the
        // specified map to this map
        copyEnumMap.putAll(enumMap);


        // size() method
        int numOfKeyValue = copyEnumMap.size();
        System.out.println("Number of key-value mappings in this map : " + numOfKeyValue);

        // Set keySet() - Returns a Set view of the keys contained in this map.
        Set<ProjectStatus> keys = enumMap.keySet();
        System.out.println("Keys of EnumMap : " + keys);

        // values() method
        System.out.println("EnumMap values are : " + copyEnumMap.values());

        // containsKey(Object key)
        if (enumMap.containsKey(ProjectStatus.START)){
            statusCondition = true;
        } else {
            statusCondition = false;
        }
        System.out.println("=====================================================================");
        System.out.println("status condition in enumMap for key START is : " + statusCondition);
        System.out.println("=====================================================================");


        if (enumMap.containsValue(enumMap.get(ProjectStatus.START))){
            projectCondition = true;
        } else {
            projectCondition = false;
        }
        System.out.println("=====================================================================");
        System.out.println("project condition in enumMap for value Project is : " + projectCondition);
        System.out.println("===================================================================");


    }

}

class Project {
    private int id;
    private String name;
    private String desc;

    public Project(final int id, final String name, final String desc){
        this.id = id;
        this.name = name;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
