/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bd.connection;
import com.sforce.soap.enterprise.Connector;
import com.sforce.soap.enterprise.EnterpriseConnection;
import com.sforce.ws.ConnectionException;
import com.sforce.ws.ConnectorConfig;
/**
 *
 * @author Siddhrajsinh_Atodari
 */

public class SFConnector {
    static EnterpriseConnection connection;
    public static EnterpriseConnection sfdcConncetion() {
        //System.setProperty("salesforce.config.dir", "conf");
        //beanfactory = ProcessConfig.getBeanFactory();
        //beanObj = ((LoaderBean) beanfactory.getBean("attachmentBean"));
        ConnectorConfig config = new ConnectorConfig();
        config.setUsername("sid.demo@yahoo.com");
        config.setPassword("Siddh@4489DnFsBoKaroezOFz7T5fnbIdV");
        try {
            connection = Connector.newConnection(config);
        } catch (ConnectionException e1) {
            e1.printStackTrace();
        }
        return connection;
    }
}
