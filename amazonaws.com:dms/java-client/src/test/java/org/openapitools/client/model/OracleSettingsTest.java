/*
 * AWS Database Migration Service
 * <fullname>Database Migration Service</fullname> <p>Database Migration Service (DMS) can migrate your data to and from the most widely used commercial and open-source databases such as Oracle, PostgreSQL, Microsoft SQL Server, Amazon Redshift, MariaDB, Amazon Aurora, MySQL, and SAP Adaptive Server Enterprise (ASE). The service supports homogeneous migrations such as Oracle to Oracle, as well as heterogeneous migrations between different database platforms, such as Oracle to MySQL or SQL Server to PostgreSQL.</p> <p>For more information about DMS, see <a href=\"https://docs.aws.amazon.com/dms/latest/userguide/Welcome.html\">What Is Database Migration Service?</a> in the <i>Database Migration Service User Guide.</i> </p>
 *
 * The version of the OpenAPI document: 2016-01-01
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
import org.openapitools.client.model.CharLengthSemantics;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for OracleSettings
 */
public class OracleSettingsTest {
    private final OracleSettings model = new OracleSettings();

    /**
     * Model tests for OracleSettings
     */
    @Test
    public void testOracleSettings() {
        // TODO: test OracleSettings
    }

    /**
     * Test the property 'addSupplementalLogging'
     */
    @Test
    public void addSupplementalLoggingTest() {
        // TODO: test addSupplementalLogging
    }

    /**
     * Test the property 'archivedLogDestId'
     */
    @Test
    public void archivedLogDestIdTest() {
        // TODO: test archivedLogDestId
    }

    /**
     * Test the property 'additionalArchivedLogDestId'
     */
    @Test
    public void additionalArchivedLogDestIdTest() {
        // TODO: test additionalArchivedLogDestId
    }

    /**
     * Test the property 'extraArchivedLogDestIds'
     */
    @Test
    public void extraArchivedLogDestIdsTest() {
        // TODO: test extraArchivedLogDestIds
    }

    /**
     * Test the property 'allowSelectNestedTables'
     */
    @Test
    public void allowSelectNestedTablesTest() {
        // TODO: test allowSelectNestedTables
    }

    /**
     * Test the property 'parallelAsmReadThreads'
     */
    @Test
    public void parallelAsmReadThreadsTest() {
        // TODO: test parallelAsmReadThreads
    }

    /**
     * Test the property 'readAheadBlocks'
     */
    @Test
    public void readAheadBlocksTest() {
        // TODO: test readAheadBlocks
    }

    /**
     * Test the property 'accessAlternateDirectly'
     */
    @Test
    public void accessAlternateDirectlyTest() {
        // TODO: test accessAlternateDirectly
    }

    /**
     * Test the property 'useAlternateFolderForOnline'
     */
    @Test
    public void useAlternateFolderForOnlineTest() {
        // TODO: test useAlternateFolderForOnline
    }

    /**
     * Test the property 'oraclePathPrefix'
     */
    @Test
    public void oraclePathPrefixTest() {
        // TODO: test oraclePathPrefix
    }

    /**
     * Test the property 'usePathPrefix'
     */
    @Test
    public void usePathPrefixTest() {
        // TODO: test usePathPrefix
    }

    /**
     * Test the property 'replacePathPrefix'
     */
    @Test
    public void replacePathPrefixTest() {
        // TODO: test replacePathPrefix
    }

    /**
     * Test the property 'enableHomogenousTablespace'
     */
    @Test
    public void enableHomogenousTablespaceTest() {
        // TODO: test enableHomogenousTablespace
    }

    /**
     * Test the property 'directPathNoLog'
     */
    @Test
    public void directPathNoLogTest() {
        // TODO: test directPathNoLog
    }

    /**
     * Test the property 'archivedLogsOnly'
     */
    @Test
    public void archivedLogsOnlyTest() {
        // TODO: test archivedLogsOnly
    }

    /**
     * Test the property 'asmPassword'
     */
    @Test
    public void asmPasswordTest() {
        // TODO: test asmPassword
    }

    /**
     * Test the property 'asmServer'
     */
    @Test
    public void asmServerTest() {
        // TODO: test asmServer
    }

    /**
     * Test the property 'asmUser'
     */
    @Test
    public void asmUserTest() {
        // TODO: test asmUser
    }

    /**
     * Test the property 'charLengthSemantics'
     */
    @Test
    public void charLengthSemanticsTest() {
        // TODO: test charLengthSemantics
    }

    /**
     * Test the property 'databaseName'
     */
    @Test
    public void databaseNameTest() {
        // TODO: test databaseName
    }

    /**
     * Test the property 'directPathParallelLoad'
     */
    @Test
    public void directPathParallelLoadTest() {
        // TODO: test directPathParallelLoad
    }

    /**
     * Test the property 'failTasksOnLobTruncation'
     */
    @Test
    public void failTasksOnLobTruncationTest() {
        // TODO: test failTasksOnLobTruncation
    }

    /**
     * Test the property 'numberDatatypeScale'
     */
    @Test
    public void numberDatatypeScaleTest() {
        // TODO: test numberDatatypeScale
    }

    /**
     * Test the property 'password'
     */
    @Test
    public void passwordTest() {
        // TODO: test password
    }

    /**
     * Test the property 'port'
     */
    @Test
    public void portTest() {
        // TODO: test port
    }

    /**
     * Test the property 'readTableSpaceName'
     */
    @Test
    public void readTableSpaceNameTest() {
        // TODO: test readTableSpaceName
    }

    /**
     * Test the property 'retryInterval'
     */
    @Test
    public void retryIntervalTest() {
        // TODO: test retryInterval
    }

    /**
     * Test the property 'securityDbEncryption'
     */
    @Test
    public void securityDbEncryptionTest() {
        // TODO: test securityDbEncryption
    }

    /**
     * Test the property 'securityDbEncryptionName'
     */
    @Test
    public void securityDbEncryptionNameTest() {
        // TODO: test securityDbEncryptionName
    }

    /**
     * Test the property 'serverName'
     */
    @Test
    public void serverNameTest() {
        // TODO: test serverName
    }

    /**
     * Test the property 'spatialDataOptionToGeoJsonFunctionName'
     */
    @Test
    public void spatialDataOptionToGeoJsonFunctionNameTest() {
        // TODO: test spatialDataOptionToGeoJsonFunctionName
    }

    /**
     * Test the property 'standbyDelayTime'
     */
    @Test
    public void standbyDelayTimeTest() {
        // TODO: test standbyDelayTime
    }

    /**
     * Test the property 'username'
     */
    @Test
    public void usernameTest() {
        // TODO: test username
    }

    /**
     * Test the property 'useBFile'
     */
    @Test
    public void useBFileTest() {
        // TODO: test useBFile
    }

    /**
     * Test the property 'useDirectPathFullLoad'
     */
    @Test
    public void useDirectPathFullLoadTest() {
        // TODO: test useDirectPathFullLoad
    }

    /**
     * Test the property 'useLogminerReader'
     */
    @Test
    public void useLogminerReaderTest() {
        // TODO: test useLogminerReader
    }

    /**
     * Test the property 'secretsManagerAccessRoleArn'
     */
    @Test
    public void secretsManagerAccessRoleArnTest() {
        // TODO: test secretsManagerAccessRoleArn
    }

    /**
     * Test the property 'secretsManagerSecretId'
     */
    @Test
    public void secretsManagerSecretIdTest() {
        // TODO: test secretsManagerSecretId
    }

    /**
     * Test the property 'secretsManagerOracleAsmAccessRoleArn'
     */
    @Test
    public void secretsManagerOracleAsmAccessRoleArnTest() {
        // TODO: test secretsManagerOracleAsmAccessRoleArn
    }

    /**
     * Test the property 'secretsManagerOracleAsmSecretId'
     */
    @Test
    public void secretsManagerOracleAsmSecretIdTest() {
        // TODO: test secretsManagerOracleAsmSecretId
    }

    /**
     * Test the property 'trimSpaceInChar'
     */
    @Test
    public void trimSpaceInCharTest() {
        // TODO: test trimSpaceInChar
    }

    /**
     * Test the property 'convertTimestampWithZoneToUTC'
     */
    @Test
    public void convertTimestampWithZoneToUTCTest() {
        // TODO: test convertTimestampWithZoneToUTC
    }

}
