/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.DBProcess;

/**
 *
 * @author CuongTQ
 */
@WebService(serviceName = "myServices")
public class myServices {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "operation")
    public double operation(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        //TODO write your implementation code here:
        return a+b;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getListName")
    public java.util.List<String> getListName() {
        //TODO write your implementation code here:
        DBProcess db = new DBProcess();
        return db.getNames();
    }
}
