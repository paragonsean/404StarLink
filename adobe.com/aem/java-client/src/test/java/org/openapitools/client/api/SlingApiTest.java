/*
 * Adobe Experience Manager (AEM) API
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * The version of the OpenAPI document: 3.7.1-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import java.math.BigDecimal;
import java.io.File;
import org.openapitools.client.model.KeystoreInfo;
import org.openapitools.client.model.TruststoreInfo;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SlingApi
 */
@Disabled
public class SlingApiTest {

    private final SlingApi api = new SlingApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteAgentTest() throws ApiException {
        String runmode = null;
        String name = null;
        api.deleteAgent(runmode, name);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteNodeTest() throws ApiException {
        String path = null;
        String name = null;
        api.deleteNode(path, name);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAgentTest() throws ApiException {
        String runmode = null;
        String name = null;
        api.getAgent(runmode, name);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAgentsTest() throws ApiException {
        String runmode = null;
        String response = api.getAgents(runmode);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAuthorizableKeystoreTest() throws ApiException {
        String intermediatePath = null;
        String authorizableId = null;
        KeystoreInfo response = api.getAuthorizableKeystore(intermediatePath, authorizableId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getKeystoreTest() throws ApiException {
        String intermediatePath = null;
        String authorizableId = null;
        File response = api.getKeystore(intermediatePath, authorizableId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getNodeTest() throws ApiException {
        String path = null;
        String name = null;
        api.getNode(path, name);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPackageTest() throws ApiException {
        String group = null;
        String name = null;
        String version = null;
        File response = api.getPackage(group, name, version);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPackageFilterTest() throws ApiException {
        String group = null;
        String name = null;
        String version = null;
        String response = api.getPackageFilter(group, name, version);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getQueryTest() throws ApiException {
        String path = null;
        BigDecimal pLimit = null;
        String _1property = null;
        String _1propertyValue = null;
        String response = api.getQuery(path, pLimit, _1property, _1propertyValue);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTruststoreTest() throws ApiException {
        File response = api.getTruststore();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTruststoreInfoTest() throws ApiException {
        TruststoreInfo response = api.getTruststoreInfo();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postAgentTest() throws ApiException {
        String runmode = null;
        String name = null;
        Boolean jcrColonContentCqColonDistribute = null;
        String jcrColonContentCqColonDistributeAtTypeHint = null;
        String jcrColonContentCqColonName = null;
        String jcrColonContentCqColonTemplate = null;
        Boolean jcrColonContentEnabled = null;
        String jcrColonContentJcrColonDescription = null;
        String jcrColonContentJcrColonLastModified = null;
        String jcrColonContentJcrColonLastModifiedBy = null;
        String jcrColonContentJcrColonMixinTypes = null;
        String jcrColonContentJcrColonTitle = null;
        String jcrColonContentLogLevel = null;
        Boolean jcrColonContentNoStatusUpdate = null;
        Boolean jcrColonContentNoVersioning = null;
        BigDecimal jcrColonContentProtocolConnectTimeout = null;
        Boolean jcrColonContentProtocolHTTPConnectionClosed = null;
        String jcrColonContentProtocolHTTPExpired = null;
        List<String> jcrColonContentProtocolHTTPHeaders = null;
        String jcrColonContentProtocolHTTPHeadersAtTypeHint = null;
        String jcrColonContentProtocolHTTPMethod = null;
        Boolean jcrColonContentProtocolHTTPSRelaxed = null;
        String jcrColonContentProtocolInterface = null;
        BigDecimal jcrColonContentProtocolSocketTimeout = null;
        String jcrColonContentProtocolVersion = null;
        String jcrColonContentProxyNTLMDomain = null;
        String jcrColonContentProxyNTLMHost = null;
        String jcrColonContentProxyHost = null;
        String jcrColonContentProxyPassword = null;
        BigDecimal jcrColonContentProxyPort = null;
        String jcrColonContentProxyUser = null;
        BigDecimal jcrColonContentQueueBatchMaxSize = null;
        String jcrColonContentQueueBatchMode = null;
        BigDecimal jcrColonContentQueueBatchWaitTime = null;
        String jcrColonContentRetryDelay = null;
        Boolean jcrColonContentReverseReplication = null;
        String jcrColonContentSerializationType = null;
        String jcrColonContentSlingColonResourceType = null;
        String jcrColonContentSsl = null;
        String jcrColonContentTransportNTLMDomain = null;
        String jcrColonContentTransportNTLMHost = null;
        String jcrColonContentTransportPassword = null;
        String jcrColonContentTransportUri = null;
        String jcrColonContentTransportUser = null;
        Boolean jcrColonContentTriggerDistribute = null;
        Boolean jcrColonContentTriggerModified = null;
        Boolean jcrColonContentTriggerOnOffTime = null;
        Boolean jcrColonContentTriggerReceive = null;
        Boolean jcrColonContentTriggerSpecific = null;
        String jcrColonContentUserId = null;
        String jcrColonPrimaryType = null;
        String colonOperation = null;
        api.postAgent(runmode, name, jcrColonContentCqColonDistribute, jcrColonContentCqColonDistributeAtTypeHint, jcrColonContentCqColonName, jcrColonContentCqColonTemplate, jcrColonContentEnabled, jcrColonContentJcrColonDescription, jcrColonContentJcrColonLastModified, jcrColonContentJcrColonLastModifiedBy, jcrColonContentJcrColonMixinTypes, jcrColonContentJcrColonTitle, jcrColonContentLogLevel, jcrColonContentNoStatusUpdate, jcrColonContentNoVersioning, jcrColonContentProtocolConnectTimeout, jcrColonContentProtocolHTTPConnectionClosed, jcrColonContentProtocolHTTPExpired, jcrColonContentProtocolHTTPHeaders, jcrColonContentProtocolHTTPHeadersAtTypeHint, jcrColonContentProtocolHTTPMethod, jcrColonContentProtocolHTTPSRelaxed, jcrColonContentProtocolInterface, jcrColonContentProtocolSocketTimeout, jcrColonContentProtocolVersion, jcrColonContentProxyNTLMDomain, jcrColonContentProxyNTLMHost, jcrColonContentProxyHost, jcrColonContentProxyPassword, jcrColonContentProxyPort, jcrColonContentProxyUser, jcrColonContentQueueBatchMaxSize, jcrColonContentQueueBatchMode, jcrColonContentQueueBatchWaitTime, jcrColonContentRetryDelay, jcrColonContentReverseReplication, jcrColonContentSerializationType, jcrColonContentSlingColonResourceType, jcrColonContentSsl, jcrColonContentTransportNTLMDomain, jcrColonContentTransportNTLMHost, jcrColonContentTransportPassword, jcrColonContentTransportUri, jcrColonContentTransportUser, jcrColonContentTriggerDistribute, jcrColonContentTriggerModified, jcrColonContentTriggerOnOffTime, jcrColonContentTriggerReceive, jcrColonContentTriggerSpecific, jcrColonContentUserId, jcrColonPrimaryType, colonOperation);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postAuthorizableKeystoreTest() throws ApiException {
        String intermediatePath = null;
        String authorizableId = null;
        String colonOperation = null;
        String currentPassword = null;
        String newPassword = null;
        String rePassword = null;
        String keyPassword = null;
        String keyStorePass = null;
        String alias = null;
        String newAlias = null;
        String removeAlias = null;
        File certChain = null;
        File keyStore = null;
        File pk = null;
        KeystoreInfo response = api.postAuthorizableKeystore(intermediatePath, authorizableId, colonOperation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, alias, newAlias, removeAlias, certChain, keyStore, pk);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postAuthorizablesTest() throws ApiException {
        String authorizableId = null;
        String intermediatePath = null;
        String createUser = null;
        String createGroup = null;
        String repColonPassword = null;
        String profileGivenName = null;
        String response = api.postAuthorizables(authorizableId, intermediatePath, createUser, createGroup, repColonPassword, profileGivenName);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postConfigAdobeGraniteSamlAuthenticationHandlerTest() throws ApiException {
        String keyStorePassword = null;
        String keyStorePasswordAtTypeHint = null;
        Integer serviceRanking = null;
        String serviceRankingAtTypeHint = null;
        Boolean idpHttpRedirect = null;
        String idpHttpRedirectAtTypeHint = null;
        Boolean createUser = null;
        String createUserAtTypeHint = null;
        String defaultRedirectUrl = null;
        String defaultRedirectUrlAtTypeHint = null;
        String userIDAttribute = null;
        String userIDAttributeAtTypeHint = null;
        List<String> defaultGroups = null;
        String defaultGroupsAtTypeHint = null;
        String idpCertAlias = null;
        String idpCertAliasAtTypeHint = null;
        Boolean addGroupMemberships = null;
        String addGroupMembershipsAtTypeHint = null;
        List<String> path = null;
        String pathAtTypeHint = null;
        List<String> synchronizeAttributes = null;
        String synchronizeAttributesAtTypeHint = null;
        Integer clockTolerance = null;
        String clockToleranceAtTypeHint = null;
        String groupMembershipAttribute = null;
        String groupMembershipAttributeAtTypeHint = null;
        String idpUrl = null;
        String idpUrlAtTypeHint = null;
        String logoutUrl = null;
        String logoutUrlAtTypeHint = null;
        String serviceProviderEntityId = null;
        String serviceProviderEntityIdAtTypeHint = null;
        String assertionConsumerServiceURL = null;
        String assertionConsumerServiceURLAtTypeHint = null;
        Boolean handleLogout = null;
        String handleLogoutAtTypeHint = null;
        String spPrivateKeyAlias = null;
        String spPrivateKeyAliasAtTypeHint = null;
        Boolean useEncryption = null;
        String useEncryptionAtTypeHint = null;
        String nameIdFormat = null;
        String nameIdFormatAtTypeHint = null;
        String digestMethod = null;
        String digestMethodAtTypeHint = null;
        String signatureMethod = null;
        String signatureMethodAtTypeHint = null;
        String userIntermediatePath = null;
        String userIntermediatePathAtTypeHint = null;
        api.postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword, keyStorePasswordAtTypeHint, serviceRanking, serviceRankingAtTypeHint, idpHttpRedirect, idpHttpRedirectAtTypeHint, createUser, createUserAtTypeHint, defaultRedirectUrl, defaultRedirectUrlAtTypeHint, userIDAttribute, userIDAttributeAtTypeHint, defaultGroups, defaultGroupsAtTypeHint, idpCertAlias, idpCertAliasAtTypeHint, addGroupMemberships, addGroupMembershipsAtTypeHint, path, pathAtTypeHint, synchronizeAttributes, synchronizeAttributesAtTypeHint, clockTolerance, clockToleranceAtTypeHint, groupMembershipAttribute, groupMembershipAttributeAtTypeHint, idpUrl, idpUrlAtTypeHint, logoutUrl, logoutUrlAtTypeHint, serviceProviderEntityId, serviceProviderEntityIdAtTypeHint, assertionConsumerServiceURL, assertionConsumerServiceURLAtTypeHint, handleLogout, handleLogoutAtTypeHint, spPrivateKeyAlias, spPrivateKeyAliasAtTypeHint, useEncryption, useEncryptionAtTypeHint, nameIdFormat, nameIdFormatAtTypeHint, digestMethod, digestMethodAtTypeHint, signatureMethod, signatureMethodAtTypeHint, userIntermediatePath, userIntermediatePathAtTypeHint);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postConfigApacheFelixJettyBasedHttpServiceTest() throws ApiException {
        Boolean orgApacheFelixHttpsNio = null;
        String orgApacheFelixHttpsNioAtTypeHint = null;
        String orgApacheFelixHttpsKeystore = null;
        String orgApacheFelixHttpsKeystoreAtTypeHint = null;
        String orgApacheFelixHttpsKeystorePassword = null;
        String orgApacheFelixHttpsKeystorePasswordAtTypeHint = null;
        String orgApacheFelixHttpsKeystoreKey = null;
        String orgApacheFelixHttpsKeystoreKeyAtTypeHint = null;
        String orgApacheFelixHttpsKeystoreKeyPassword = null;
        String orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint = null;
        String orgApacheFelixHttpsTruststore = null;
        String orgApacheFelixHttpsTruststoreAtTypeHint = null;
        String orgApacheFelixHttpsTruststorePassword = null;
        String orgApacheFelixHttpsTruststorePasswordAtTypeHint = null;
        String orgApacheFelixHttpsClientcertificate = null;
        String orgApacheFelixHttpsClientcertificateAtTypeHint = null;
        Boolean orgApacheFelixHttpsEnable = null;
        String orgApacheFelixHttpsEnableAtTypeHint = null;
        String orgOsgiServiceHttpPortSecure = null;
        String orgOsgiServiceHttpPortSecureAtTypeHint = null;
        api.postConfigApacheFelixJettyBasedHttpService(orgApacheFelixHttpsNio, orgApacheFelixHttpsNioAtTypeHint, orgApacheFelixHttpsKeystore, orgApacheFelixHttpsKeystoreAtTypeHint, orgApacheFelixHttpsKeystorePassword, orgApacheFelixHttpsKeystorePasswordAtTypeHint, orgApacheFelixHttpsKeystoreKey, orgApacheFelixHttpsKeystoreKeyAtTypeHint, orgApacheFelixHttpsKeystoreKeyPassword, orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint, orgApacheFelixHttpsTruststore, orgApacheFelixHttpsTruststoreAtTypeHint, orgApacheFelixHttpsTruststorePassword, orgApacheFelixHttpsTruststorePasswordAtTypeHint, orgApacheFelixHttpsClientcertificate, orgApacheFelixHttpsClientcertificateAtTypeHint, orgApacheFelixHttpsEnable, orgApacheFelixHttpsEnableAtTypeHint, orgOsgiServiceHttpPortSecure, orgOsgiServiceHttpPortSecureAtTypeHint);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postConfigApacheHttpComponentsProxyConfigurationTest() throws ApiException {
        String proxyHost = null;
        String proxyHostAtTypeHint = null;
        Integer proxyPort = null;
        String proxyPortAtTypeHint = null;
        List<String> proxyExceptions = null;
        String proxyExceptionsAtTypeHint = null;
        Boolean proxyEnabled = null;
        String proxyEnabledAtTypeHint = null;
        String proxyUser = null;
        String proxyUserAtTypeHint = null;
        String proxyPassword = null;
        String proxyPasswordAtTypeHint = null;
        api.postConfigApacheHttpComponentsProxyConfiguration(proxyHost, proxyHostAtTypeHint, proxyPort, proxyPortAtTypeHint, proxyExceptions, proxyExceptionsAtTypeHint, proxyEnabled, proxyEnabledAtTypeHint, proxyUser, proxyUserAtTypeHint, proxyPassword, proxyPasswordAtTypeHint);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postConfigApacheSlingDavExServletTest() throws ApiException {
        String alias = null;
        String aliasAtTypeHint = null;
        Boolean davCreateAbsoluteUri = null;
        String davCreateAbsoluteUriAtTypeHint = null;
        api.postConfigApacheSlingDavExServlet(alias, aliasAtTypeHint, davCreateAbsoluteUri, davCreateAbsoluteUriAtTypeHint);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postConfigApacheSlingGetServletTest() throws ApiException {
        String jsonMaximumresults = null;
        String jsonMaximumresultsAtTypeHint = null;
        Boolean enableHtml = null;
        String enableHtmlAtTypeHint = null;
        Boolean enableTxt = null;
        String enableTxtAtTypeHint = null;
        Boolean enableXml = null;
        String enableXmlAtTypeHint = null;
        api.postConfigApacheSlingGetServlet(jsonMaximumresults, jsonMaximumresultsAtTypeHint, enableHtml, enableHtmlAtTypeHint, enableTxt, enableTxtAtTypeHint, enableXml, enableXmlAtTypeHint);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postConfigApacheSlingReferrerFilterTest() throws ApiException {
        Boolean allowEmpty = null;
        String allowEmptyAtTypeHint = null;
        String allowHosts = null;
        String allowHostsAtTypeHint = null;
        String allowHostsRegexp = null;
        String allowHostsRegexpAtTypeHint = null;
        String filterMethods = null;
        String filterMethodsAtTypeHint = null;
        api.postConfigApacheSlingReferrerFilter(allowEmpty, allowEmptyAtTypeHint, allowHosts, allowHostsAtTypeHint, allowHostsRegexp, allowHostsRegexpAtTypeHint, filterMethods, filterMethodsAtTypeHint);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postConfigPropertyTest() throws ApiException {
        String configNodeName = null;
        api.postConfigProperty(configNodeName);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postNodeTest() throws ApiException {
        String path = null;
        String name = null;
        String colonOperation = null;
        String deleteAuthorizable = null;
        File _file = null;
        api.postNode(path, name, colonOperation, deleteAuthorizable, _file);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postNodeRwTest() throws ApiException {
        String path = null;
        String name = null;
        String addMembers = null;
        api.postNodeRw(path, name, addMembers);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postPathTest() throws ApiException {
        String path = null;
        String jcrColonPrimaryType = null;
        String colonName = null;
        api.postPath(path, jcrColonPrimaryType, colonName);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postQueryTest() throws ApiException {
        String path = null;
        BigDecimal pLimit = null;
        String _1property = null;
        String _1propertyValue = null;
        String response = api.postQuery(path, pLimit, _1property, _1propertyValue);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postTreeActivationTest() throws ApiException {
        Boolean ignoredeactivated = null;
        Boolean onlymodified = null;
        String path = null;
        String cmd = null;
        api.postTreeActivation(ignoredeactivated, onlymodified, path, cmd);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postTruststoreTest() throws ApiException {
        String colonOperation = null;
        String newPassword = null;
        String rePassword = null;
        String keyStoreType = null;
        String removeAlias = null;
        File certificate = null;
        String response = api.postTruststore(colonOperation, newPassword, rePassword, keyStoreType, removeAlias, certificate);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postTruststorePKCS12Test() throws ApiException {
        File truststoreP12 = null;
        String response = api.postTruststorePKCS12(truststoreP12);
        // TODO: test validations
    }

}
