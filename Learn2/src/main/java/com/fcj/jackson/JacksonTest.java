package com.fcj.jackson;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by fcj on 11/13/15.
 */
public class JacksonTest {



    public static void main(String[] args){
        ObjectMapper mapper = new ObjectMapper();
        String studentJSON = "{\"name\" : \"Beijing\", \"age\" : 21}";
        try{
            // read
            Student student = mapper.readValue(studentJSON, Student.class);
            System.out.println(student);
            //  write
            studentJSON = mapper.writeValueAsString(student);
            System.out.println(studentJSON);
        }catch (JsonParseException e){

        }catch (JsonMappingException e){

        }catch (IOException e){

        }



    }






}





class Student {

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [ name: " + name + ", age: " + age + " ]";
    }
}