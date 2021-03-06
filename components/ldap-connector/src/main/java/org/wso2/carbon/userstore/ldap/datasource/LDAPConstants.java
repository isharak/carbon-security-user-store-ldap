/*
 *  Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.wso2.carbon.userstore.ldap.datasource;

/**
 * Class holding the default values for LDAP configuration.
 */
public class LDAPConstants {

    public static final String LDAP_DATASOURCE_TYPE = "LDAP";
    public static final String LDAP_CONTEXT_FACTORY = "com.sun.jndi.ldap.LdapCtxFactory";
    public static final String LDAP_POOLING_ENABLED = "com.sun.jndi.ldap.connect.pool";
    public static final String LDAP_REFERRAL = "java.naming.referral";
    public static final String LDAP_ATTRIBUTES_BINARY = "java.naming.ldap.attributes.binary";
    public static final String LDAP_READ_TIMEOUT = "com.sun.jndi.ldap.read.timeout";
    public static final String LDAP_CONNECTION_TIMEOUT = "com.sun.jndi.ldap.connect.timeout";

    //pooling constants
    public static final String LDAP_POOL_AUTHENTICATION = "com.sun.jndi.ldap.connect.pool.authentication";
    public static final String LDAP_POOL_DEBUG = "com.sun.jndi.ldap.connect.pool.debug";
    public static final String LDAP_POOL_INITSIZE = "com.sun.jndi.ldap.connect.pool.initsize";
    public static final String LDAP_POOL_MAXSIZE = "com.sun.jndi.ldap.connect.pool.maxsize";
    public static final String LDAP_POOL_PREFSIZE = "com.sun.jndi.ldap.connect.pool.prefsize";
    public static final String LDAP_POOL_PROTOCOL = "com.sun.jndi.ldap.connect.pool.protocol";
    public static final String LDAP_POOL_TIMEOUT = "com.sun.jndi.ldap.connect.pool.timeout";

    //dns constants
    public static final String DNS_URL = "urlOfDns";
    public static final String DNS_DOMAIN_NAME = "dnsDomainName";

    private LDAPConstants() {

    }
}
