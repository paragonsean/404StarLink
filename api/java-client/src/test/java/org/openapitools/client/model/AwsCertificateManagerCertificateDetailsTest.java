/*
 * AWS SecurityHub
 * <p>Security Hub provides you with a comprehensive view of the security state of your Amazon Web Services environment and resources. It also provides you with the readiness status of your environment based on controls from supported security standards. Security Hub collects security data from Amazon Web Services accounts, services, and integrated third-party products and helps you analyze security trends in your environment to identify the highest priority security issues. For more information about Security Hub, see the <a href=\"https://docs.aws.amazon.com/securityhub/latest/userguide/what-is-securityhub.html\">Security HubUser Guide</a>.</p> <p>When you use operations in the Security Hub API, the requests are executed only in the Amazon Web Services Region that is currently active or in the specific Amazon Web Services Region that you specify in your request. Any configuration or settings change that results from the operation is applied only to that Region. To make the same change in other Regions, run the same command for each Region in which you want to apply the change.</p> <p>For example, if your Region is set to <code>us-west-2</code>, when you use <code>CreateMembers</code> to add a member account to Security Hub, the association of the member account with the administrator account is created only in the <code>us-west-2</code> Region. Security Hub must be enabled for the member account in the same Region that the invitation was sent from.</p> <p>The following throttling limits apply to using Security Hub API operations.</p> <ul> <li> <p> <code>BatchEnableStandards</code> - <code>RateLimit</code> of 1 request per second. <code>BurstLimit</code> of 1 request per second.</p> </li> <li> <p> <code>GetFindings</code> - <code>RateLimit</code> of 3 requests per second. <code>BurstLimit</code> of 6 requests per second.</p> </li> <li> <p> <code>BatchImportFindings</code> - <code>RateLimit</code> of 10 requests per second. <code>BurstLimit</code> of 30 requests per second.</p> </li> <li> <p> <code>BatchUpdateFindings</code> - <code>RateLimit</code> of 10 requests per second. <code>BurstLimit</code> of 30 requests per second.</p> </li> <li> <p> <code>UpdateStandardsControl</code> - <code>RateLimit</code> of 1 request per second. <code>BurstLimit</code> of 5 requests per second.</p> </li> <li> <p>All other operations - <code>RateLimit</code> of 10 requests per second. <code>BurstLimit</code> of 30 requests per second.</p> </li> </ul>
 *
 * The version of the OpenAPI document: 2018-10-26
 * Contact: mike.ralphson@gmail.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.AwsCertificateManagerCertificateDetailsOptions;
import org.openapitools.client.model.AwsCertificateManagerCertificateDetailsRenewalSummary;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for AwsCertificateManagerCertificateDetails
 */
public class AwsCertificateManagerCertificateDetailsTest {
    private final AwsCertificateManagerCertificateDetails model = new AwsCertificateManagerCertificateDetails();

    /**
     * Model tests for AwsCertificateManagerCertificateDetails
     */
    @Test
    public void testAwsCertificateManagerCertificateDetails() {
        // TODO: test AwsCertificateManagerCertificateDetails
    }

    /**
     * Test the property 'certificateAuthorityArn'
     */
    @Test
    public void certificateAuthorityArnTest() {
        // TODO: test certificateAuthorityArn
    }

    /**
     * Test the property 'createdAt'
     */
    @Test
    public void createdAtTest() {
        // TODO: test createdAt
    }

    /**
     * Test the property 'domainName'
     */
    @Test
    public void domainNameTest() {
        // TODO: test domainName
    }

    /**
     * Test the property 'domainValidationOptions'
     */
    @Test
    public void domainValidationOptionsTest() {
        // TODO: test domainValidationOptions
    }

    /**
     * Test the property 'extendedKeyUsages'
     */
    @Test
    public void extendedKeyUsagesTest() {
        // TODO: test extendedKeyUsages
    }

    /**
     * Test the property 'failureReason'
     */
    @Test
    public void failureReasonTest() {
        // TODO: test failureReason
    }

    /**
     * Test the property 'importedAt'
     */
    @Test
    public void importedAtTest() {
        // TODO: test importedAt
    }

    /**
     * Test the property 'inUseBy'
     */
    @Test
    public void inUseByTest() {
        // TODO: test inUseBy
    }

    /**
     * Test the property 'issuedAt'
     */
    @Test
    public void issuedAtTest() {
        // TODO: test issuedAt
    }

    /**
     * Test the property 'issuer'
     */
    @Test
    public void issuerTest() {
        // TODO: test issuer
    }

    /**
     * Test the property 'keyAlgorithm'
     */
    @Test
    public void keyAlgorithmTest() {
        // TODO: test keyAlgorithm
    }

    /**
     * Test the property 'keyUsages'
     */
    @Test
    public void keyUsagesTest() {
        // TODO: test keyUsages
    }

    /**
     * Test the property 'notAfter'
     */
    @Test
    public void notAfterTest() {
        // TODO: test notAfter
    }

    /**
     * Test the property 'notBefore'
     */
    @Test
    public void notBeforeTest() {
        // TODO: test notBefore
    }

    /**
     * Test the property 'options'
     */
    @Test
    public void optionsTest() {
        // TODO: test options
    }

    /**
     * Test the property 'renewalEligibility'
     */
    @Test
    public void renewalEligibilityTest() {
        // TODO: test renewalEligibility
    }

    /**
     * Test the property 'renewalSummary'
     */
    @Test
    public void renewalSummaryTest() {
        // TODO: test renewalSummary
    }

    /**
     * Test the property 'serial'
     */
    @Test
    public void serialTest() {
        // TODO: test serial
    }

    /**
     * Test the property 'signatureAlgorithm'
     */
    @Test
    public void signatureAlgorithmTest() {
        // TODO: test signatureAlgorithm
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
        // TODO: test status
    }

    /**
     * Test the property 'subject'
     */
    @Test
    public void subjectTest() {
        // TODO: test subject
    }

    /**
     * Test the property 'subjectAlternativeNames'
     */
    @Test
    public void subjectAlternativeNamesTest() {
        // TODO: test subjectAlternativeNames
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        // TODO: test type
    }

}
