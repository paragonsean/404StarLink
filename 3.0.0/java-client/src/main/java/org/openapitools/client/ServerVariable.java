/*
 * Maharashtra State Board of Secondary and Higher Secondary Education, Maharashtra
 * Class X and XII marksheets and passing certificates of Maharashtra State Board of Secondary and Higher Secondary Education (https://mahahsscboard.maharashtra.gov.in/) are available in DigiLocker for years 1990 to 2017.
 *
 * The version of the OpenAPI document: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client;

import java.util.HashSet;

/**
 * Representing a Server Variable for server URL template substitution.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T02:09:29.445066-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class ServerVariable {
    public String description;
    public String defaultValue;
    public HashSet<String> enumValues = null;

    /**
     * @param description A description for the server variable.
     * @param defaultValue The default value to use for substitution.
     * @param enumValues An enumeration of string values to be used if the substitution options are from a limited set.
     */
    public ServerVariable(String description, String defaultValue, HashSet<String> enumValues) {
        this.description = description;
        this.defaultValue = defaultValue;
        this.enumValues = enumValues;
    }
}
