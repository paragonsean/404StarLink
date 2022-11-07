# DefaultApi

All URIs are relative to *https://sts.amazonaws.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**gETAssumeRole**](DefaultApi.md#gETAssumeRole) | **GET** /#Action&#x3D;AssumeRole |  |
| [**gETAssumeRoleWithSAML**](DefaultApi.md#gETAssumeRoleWithSAML) | **GET** /#Action&#x3D;AssumeRoleWithSAML |  |
| [**gETAssumeRoleWithWebIdentity**](DefaultApi.md#gETAssumeRoleWithWebIdentity) | **GET** /#Action&#x3D;AssumeRoleWithWebIdentity |  |
| [**gETDecodeAuthorizationMessage**](DefaultApi.md#gETDecodeAuthorizationMessage) | **GET** /#Action&#x3D;DecodeAuthorizationMessage |  |
| [**gETGetAccessKeyInfo**](DefaultApi.md#gETGetAccessKeyInfo) | **GET** /#Action&#x3D;GetAccessKeyInfo |  |
| [**gETGetCallerIdentity**](DefaultApi.md#gETGetCallerIdentity) | **GET** /#Action&#x3D;GetCallerIdentity |  |
| [**gETGetFederationToken**](DefaultApi.md#gETGetFederationToken) | **GET** /#Action&#x3D;GetFederationToken |  |
| [**gETGetSessionToken**](DefaultApi.md#gETGetSessionToken) | **GET** /#Action&#x3D;GetSessionToken |  |
| [**pOSTAssumeRole**](DefaultApi.md#pOSTAssumeRole) | **POST** /#Action&#x3D;AssumeRole |  |
| [**pOSTAssumeRoleWithSAML**](DefaultApi.md#pOSTAssumeRoleWithSAML) | **POST** /#Action&#x3D;AssumeRoleWithSAML |  |
| [**pOSTAssumeRoleWithWebIdentity**](DefaultApi.md#pOSTAssumeRoleWithWebIdentity) | **POST** /#Action&#x3D;AssumeRoleWithWebIdentity |  |
| [**pOSTDecodeAuthorizationMessage**](DefaultApi.md#pOSTDecodeAuthorizationMessage) | **POST** /#Action&#x3D;DecodeAuthorizationMessage |  |
| [**pOSTGetAccessKeyInfo**](DefaultApi.md#pOSTGetAccessKeyInfo) | **POST** /#Action&#x3D;GetAccessKeyInfo |  |
| [**pOSTGetCallerIdentity**](DefaultApi.md#pOSTGetCallerIdentity) | **POST** /#Action&#x3D;GetCallerIdentity |  |
| [**pOSTGetFederationToken**](DefaultApi.md#pOSTGetFederationToken) | **POST** /#Action&#x3D;GetFederationToken |  |
| [**pOSTGetSessionToken**](DefaultApi.md#pOSTGetSessionToken) | **POST** /#Action&#x3D;GetSessionToken |  |


<a id="gETAssumeRole"></a>
# **gETAssumeRole**
> AssumeRoleResponse gETAssumeRole(roleArn, roleSessionName, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, policyArns, policy, durationSeconds, tags, transitiveTagKeys, externalId, serialNumber, tokenCode, sourceIdentity)



&lt;p&gt;Returns a set of temporary security credentials that you can use to access Amazon Web Services resources. These temporary credentials consist of an access key ID, a secret access key, and a security token. Typically, you use &lt;code&gt;AssumeRole&lt;/code&gt; within your account or for cross-account access. For a comparison of &lt;code&gt;AssumeRole&lt;/code&gt; with other API operations that produce temporary credentials, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html\&quot;&gt;Requesting Temporary Security Credentials&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#stsapi_comparison\&quot;&gt;Comparing the Amazon Web Services STS API operations&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt; &lt;b&gt;Permissions&lt;/b&gt; &lt;/p&gt; &lt;p&gt;The temporary security credentials created by &lt;code&gt;AssumeRole&lt;/code&gt; can be used to make API calls to any Amazon Web Services service with the following exception: You cannot call the Amazon Web Services STS &lt;code&gt;GetFederationToken&lt;/code&gt; or &lt;code&gt;GetSessionToken&lt;/code&gt; API operations.&lt;/p&gt; &lt;p&gt;(Optional) You can pass inline or managed &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session\&quot;&gt;session policies&lt;/a&gt; to this operation. You can pass a single JSON policy document to use as an inline session policy. You can also specify up to 10 managed policy Amazon Resource Names (ARNs) to use as managed session policies. The plaintext that you use for both inline and managed session policies can&#39;t exceed 2,048 characters. Passing policies to this operation returns new temporary credentials. The resulting session&#39;s permissions are the intersection of the role&#39;s identity-based policy and the session policies. You can use the role&#39;s temporary credentials in subsequent Amazon Web Services API calls to access resources in the account that owns the role. You cannot use session policies to grant more permissions than those allowed by the identity-based policy of the role that is being assumed. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session\&quot;&gt;Session Policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;When you create a role, you create two policies: A role trust policy that specifies &lt;i&gt;who&lt;/i&gt; can assume the role and a permissions policy that specifies &lt;i&gt;what&lt;/i&gt; can be done with the role. You specify the trusted principal who is allowed to assume the role in the role trust policy.&lt;/p&gt; &lt;p&gt;To assume a role from a different account, your Amazon Web Services account must be trusted by the role. The trust relationship is defined in the role&#39;s trust policy when the role is created. That trust policy states which accounts are allowed to delegate that access to users in the account. &lt;/p&gt; &lt;p&gt;A user who wants to access a role in a different account must also have permissions that are delegated from the user account administrator. The administrator must attach a policy that allows the user to call &lt;code&gt;AssumeRole&lt;/code&gt; for the ARN of the role in the other account.&lt;/p&gt; &lt;p&gt;To allow a user to assume a role in the same account, you can do either of the following:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;Attach a policy to the user that allows the user to call &lt;code&gt;AssumeRole&lt;/code&gt; (as long as the role&#39;s trust policy trusts the account).&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Add the user as a principal directly in the role&#39;s trust policy.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;You can do either because the role’s trust policy acts as an IAM resource-based policy. When a resource-based policy grants access to a principal in the same account, no additional identity-based policy is required. For more information about trust policies and resource-based policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html\&quot;&gt;IAM Policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt; &lt;b&gt;Tags&lt;/b&gt; &lt;/p&gt; &lt;p&gt;(Optional) You can pass tag key-value pairs to your session. These tags are called session tags. For more information about session tags, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html\&quot;&gt;Passing Session Tags in STS&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;An administrator must grant you the permissions necessary to pass session tags. The administrator can also create granular permissions to allow you to pass only specific session tags. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/tutorial_attribute-based-access-control.html\&quot;&gt;Tutorial: Using Tags for Attribute-Based Access Control&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;You can set the session tags as transitive. Transitive tags persist during role chaining. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html#id_session-tags_role-chaining\&quot;&gt;Chaining Roles with Session Tags&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt; &lt;b&gt;Using MFA with AssumeRole&lt;/b&gt; &lt;/p&gt; &lt;p&gt;(Optional) You can include multi-factor authentication (MFA) information when you call &lt;code&gt;AssumeRole&lt;/code&gt;. This is useful for cross-account scenarios to ensure that the user that assumes the role has been authenticated with an Amazon Web Services MFA device. In that scenario, the trust policy of the role being assumed includes a condition that tests for MFA authentication. If the caller does not include valid MFA information, the request to assume the role is denied. The condition in a trust policy that tests for MFA authentication might look like the following example.&lt;/p&gt; &lt;p&gt; &lt;code&gt;\&quot;Condition\&quot;: {\&quot;Bool\&quot;: {\&quot;aws:MultiFactorAuthPresent\&quot;: true}}&lt;/code&gt; &lt;/p&gt; &lt;p&gt;For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/MFAProtectedAPI.html\&quot;&gt;Configuring MFA-Protected API Access&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt; guide.&lt;/p&gt; &lt;p&gt;To use MFA with &lt;code&gt;AssumeRole&lt;/code&gt;, you pass values for the &lt;code&gt;SerialNumber&lt;/code&gt; and &lt;code&gt;TokenCode&lt;/code&gt; parameters. The &lt;code&gt;SerialNumber&lt;/code&gt; value identifies the user&#39;s hardware or virtual MFA device. The &lt;code&gt;TokenCode&lt;/code&gt; is the time-based one-time password (TOTP) that the MFA device produces. &lt;/p&gt;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sts.amazonaws.com");
    
    // Configure API key authorization: hmac
    ApiKeyAuth hmac = (ApiKeyAuth) defaultClient.getAuthentication("hmac");
    hmac.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //hmac.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String roleArn = "roleArn_example"; // String | The Amazon Resource Name (ARN) of the role to assume.
    String roleSessionName = "roleSessionName_example"; // String | <p>An identifier for the assumed role session.</p> <p>Use the role session name to uniquely identify a session when the same role is assumed by different principals or for different reasons. In cross-account scenarios, the role session name is visible to, and can be logged by the account that owns the role. The role session name is also used in the ARN of the assumed role principal. This means that subsequent cross-account API requests that use the temporary security credentials will expose the role session name to the external account in their CloudTrail logs.</p> <p>The regex used to validate this parameter is a string of characters consisting of upper- and lower-case alphanumeric characters with no spaces. You can also include underscores or any of the following characters: =,.@-</p>
    String action = "AssumeRole"; // String | 
    String version = "2011-06-15"; // String | 
    String xAmzContentSha256 = "xAmzContentSha256_example"; // String | 
    String xAmzDate = "xAmzDate_example"; // String | 
    String xAmzAlgorithm = "xAmzAlgorithm_example"; // String | 
    String xAmzCredential = "xAmzCredential_example"; // String | 
    String xAmzSecurityToken = "xAmzSecurityToken_example"; // String | 
    String xAmzSignature = "xAmzSignature_example"; // String | 
    String xAmzSignedHeaders = "xAmzSignedHeaders_example"; // String | 
    List<PolicyDescriptorType> policyArns = Arrays.asList(); // List<PolicyDescriptorType> | <p>The Amazon Resource Names (ARNs) of the IAM managed policies that you want to use as managed session policies. The policies must exist in the same account as the role.</p> <p>This parameter is optional. You can provide up to 10 managed policy ARNs. However, the plaintext that you use for both inline and managed session policies can't exceed 2,048 characters. For more information about ARNs, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs) and Amazon Web Services Service Namespaces</a> in the Amazon Web Services General Reference.</p> <note> <p>An Amazon Web Services conversion compresses the passed inline session policy, managed policy ARNs, and session tags into a packed binary format that has a separate limit. Your request can fail for this limit even if your plaintext meets the other requirements. The <code>PackedPolicySize</code> response element indicates by percentage how close the policies and tags for your request are to the upper size limit.</p> </note> <p>Passing policies to this operation returns new temporary credentials. The resulting session's permissions are the intersection of the role's identity-based policy and the session policies. You can use the role's temporary credentials in subsequent Amazon Web Services API calls to access resources in the account that owns the role. You cannot use session policies to grant more permissions than those allowed by the identity-based policy of the role that is being assumed. For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session\">Session Policies</a> in the <i>IAM User Guide</i>.</p>
    String policy = "policy_example"; // String | <p>An IAM policy in JSON format that you want to use as an inline session policy.</p> <p>This parameter is optional. Passing policies to this operation returns new temporary credentials. The resulting session's permissions are the intersection of the role's identity-based policy and the session policies. You can use the role's temporary credentials in subsequent Amazon Web Services API calls to access resources in the account that owns the role. You cannot use session policies to grant more permissions than those allowed by the identity-based policy of the role that is being assumed. For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session\">Session Policies</a> in the <i>IAM User Guide</i>.</p> <p>The plaintext that you use for both inline and managed session policies can't exceed 2,048 characters. The JSON policy characters can be any ASCII character from the space character to the end of the valid character list (\\u0020 through \\u00FF). It can also include the tab (\\u0009), linefeed (\\u000A), and carriage return (\\u000D) characters.</p> <note> <p>An Amazon Web Services conversion compresses the passed inline session policy, managed policy ARNs, and session tags into a packed binary format that has a separate limit. Your request can fail for this limit even if your plaintext meets the other requirements. The <code>PackedPolicySize</code> response element indicates by percentage how close the policies and tags for your request are to the upper size limit.</p> </note>
    Integer durationSeconds = 56; // Integer | <p>The duration, in seconds, of the role session. The value specified can range from 900 seconds (15 minutes) up to the maximum session duration set for the role. The maximum session duration setting can have a value from 1 hour to 12 hours. If you specify a value higher than this setting or the administrator setting (whichever is lower), the operation fails. For example, if you specify a session duration of 12 hours, but your administrator set the maximum session duration to 6 hours, your operation fails. </p> <p>Role chaining limits your Amazon Web Services CLI or Amazon Web Services API role session to a maximum of one hour. When you use the <code>AssumeRole</code> API operation to assume a role, you can specify the duration of your role session with the <code>DurationSeconds</code> parameter. You can specify a parameter value of up to 43200 seconds (12 hours), depending on the maximum session duration setting for your role. However, if you assume a role using role chaining and provide a <code>DurationSeconds</code> parameter value greater than one hour, the operation fails. To learn how to view the maximum value for your role, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session\">View the Maximum Session Duration Setting for a Role</a> in the <i>IAM User Guide</i>.</p> <p>By default, the value is set to <code>3600</code> seconds. </p> <note> <p>The <code>DurationSeconds</code> parameter is separate from the duration of a console session that you might request using the returned credentials. The request to the federation endpoint for a console sign-in token takes a <code>SessionDuration</code> parameter that specifies the maximum length of the console session. For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html\">Creating a URL that Enables Federated Users to Access the Amazon Web Services Management Console</a> in the <i>IAM User Guide</i>.</p> </note>
    List<Tag> tags = Arrays.asList(); // List<Tag> | <p>A list of session tags that you want to pass. Each session tag consists of a key name and an associated value. For more information about session tags, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html\">Tagging Amazon Web Services STS Sessions</a> in the <i>IAM User Guide</i>.</p> <p>This parameter is optional. You can pass up to 50 session tags. The plaintext session tag keys can’t exceed 128 characters, and the values can’t exceed 256 characters. For these and additional limits, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length\">IAM and STS Character Limits</a> in the <i>IAM User Guide</i>.</p> <note> <p>An Amazon Web Services conversion compresses the passed inline session policy, managed policy ARNs, and session tags into a packed binary format that has a separate limit. Your request can fail for this limit even if your plaintext meets the other requirements. The <code>PackedPolicySize</code> response element indicates by percentage how close the policies and tags for your request are to the upper size limit.</p> </note> <p>You can pass a session tag with the same key as a tag that is already attached to the role. When you do, session tags override a role tag with the same key. </p> <p>Tag key–value pairs are not case sensitive, but case is preserved. This means that you cannot have separate <code>Department</code> and <code>department</code> tag keys. Assume that the role has the <code>Department</code>=<code>Marketing</code> tag and you pass the <code>department</code>=<code>engineering</code> session tag. <code>Department</code> and <code>department</code> are not saved as separate tags, and the session tag passed in the request takes precedence over the role tag.</p> <p>Additionally, if you used temporary credentials to perform this operation, the new session inherits any transitive session tags from the calling session. If you pass a session tag with the same key as an inherited tag, the operation fails. To view the inherited tags for a session, see the CloudTrail logs. For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html#id_session-tags_ctlogs\">Viewing Session Tags in CloudTrail</a> in the <i>IAM User Guide</i>.</p>
    List<String> transitiveTagKeys = Arrays.asList(); // List<String> | <p>A list of keys for session tags that you want to set as transitive. If you set a tag key as transitive, the corresponding key and value passes to subsequent sessions in a role chain. For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html#id_session-tags_role-chaining\">Chaining Roles with Session Tags</a> in the <i>IAM User Guide</i>.</p> <p>This parameter is optional. When you set session tags as transitive, the session policy and session tags packed binary limit is not affected.</p> <p>If you choose not to specify a transitive tag key, then no tags are passed from this session to any subsequent sessions.</p>
    String externalId = "externalId_example"; // String | <p>A unique identifier that might be required when you assume a role in another account. If the administrator of the account to which the role belongs provided you with an external ID, then provide that value in the <code>ExternalId</code> parameter. This value can be any string, such as a passphrase or account number. A cross-account role is usually set up to trust everyone in an account. Therefore, the administrator of the trusting account might send an external ID to the administrator of the trusted account. That way, only someone with the ID can assume the role, rather than everyone in the account. For more information about the external ID, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html\">How to Use an External ID When Granting Access to Your Amazon Web Services Resources to a Third Party</a> in the <i>IAM User Guide</i>.</p> <p>The regex used to validate this parameter is a string of characters consisting of upper- and lower-case alphanumeric characters with no spaces. You can also include underscores or any of the following characters: =,.@:/-</p>
    String serialNumber = "serialNumber_example"; // String | <p>The identification number of the MFA device that is associated with the user who is making the <code>AssumeRole</code> call. Specify this value if the trust policy of the role being assumed includes a condition that requires MFA authentication. The value is either the serial number for a hardware device (such as <code>GAHT12345678</code>) or an Amazon Resource Name (ARN) for a virtual device (such as <code>arn:aws:iam::123456789012:mfa/user</code>).</p> <p>The regex used to validate this parameter is a string of characters consisting of upper- and lower-case alphanumeric characters with no spaces. You can also include underscores or any of the following characters: =,.@-</p>
    String tokenCode = "tokenCode_example"; // String | <p>The value provided by the MFA device, if the trust policy of the role being assumed requires MFA. (In other words, if the policy includes a condition that tests for MFA). If the role being assumed requires MFA and if the <code>TokenCode</code> value is missing or expired, the <code>AssumeRole</code> call returns an \"access denied\" error.</p> <p>The format for this parameter, as described by its regex pattern, is a sequence of six numeric digits.</p>
    String sourceIdentity = "sourceIdentity_example"; // String | <p>The source identity specified by the principal that is calling the <code>AssumeRole</code> operation.</p> <p>You can require users to specify a source identity when they assume a role. You do this by using the <code>sts:SourceIdentity</code> condition key in a role trust policy. You can use source identity information in CloudTrail logs to determine who took actions with a role. You can use the <code>aws:SourceIdentity</code> condition key to further control access to Amazon Web Services resources based on the value of source identity. For more information about using source identity, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html\">Monitor and control actions taken with assumed roles</a> in the <i>IAM User Guide</i>.</p> <p>The regex used to validate this parameter is a string of characters consisting of upper- and lower-case alphanumeric characters with no spaces. You can also include underscores or any of the following characters: =,.@-. You cannot use a value that begins with the text <code>aws:</code>. This prefix is reserved for Amazon Web Services internal use.</p>
    try {
      AssumeRoleResponse result = apiInstance.gETAssumeRole(roleArn, roleSessionName, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, policyArns, policy, durationSeconds, tags, transitiveTagKeys, externalId, serialNumber, tokenCode, sourceIdentity);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#gETAssumeRole");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **roleArn** | **String**| The Amazon Resource Name (ARN) of the role to assume. | |
| **roleSessionName** | **String**| &lt;p&gt;An identifier for the assumed role session.&lt;/p&gt; &lt;p&gt;Use the role session name to uniquely identify a session when the same role is assumed by different principals or for different reasons. In cross-account scenarios, the role session name is visible to, and can be logged by the account that owns the role. The role session name is also used in the ARN of the assumed role principal. This means that subsequent cross-account API requests that use the temporary security credentials will expose the role session name to the external account in their CloudTrail logs.&lt;/p&gt; &lt;p&gt;The regex used to validate this parameter is a string of characters consisting of upper- and lower-case alphanumeric characters with no spaces. You can also include underscores or any of the following characters: &#x3D;,.@-&lt;/p&gt; | |
| **action** | **String**|  | [enum: AssumeRole] |
| **version** | **String**|  | [enum: 2011-06-15] |
| **xAmzContentSha256** | **String**|  | [optional] |
| **xAmzDate** | **String**|  | [optional] |
| **xAmzAlgorithm** | **String**|  | [optional] |
| **xAmzCredential** | **String**|  | [optional] |
| **xAmzSecurityToken** | **String**|  | [optional] |
| **xAmzSignature** | **String**|  | [optional] |
| **xAmzSignedHeaders** | **String**|  | [optional] |
| **policyArns** | [**List&lt;PolicyDescriptorType&gt;**](PolicyDescriptorType.md)| &lt;p&gt;The Amazon Resource Names (ARNs) of the IAM managed policies that you want to use as managed session policies. The policies must exist in the same account as the role.&lt;/p&gt; &lt;p&gt;This parameter is optional. You can provide up to 10 managed policy ARNs. However, the plaintext that you use for both inline and managed session policies can&#39;t exceed 2,048 characters. For more information about ARNs, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\&quot;&gt;Amazon Resource Names (ARNs) and Amazon Web Services Service Namespaces&lt;/a&gt; in the Amazon Web Services General Reference.&lt;/p&gt; &lt;note&gt; &lt;p&gt;An Amazon Web Services conversion compresses the passed inline session policy, managed policy ARNs, and session tags into a packed binary format that has a separate limit. Your request can fail for this limit even if your plaintext meets the other requirements. The &lt;code&gt;PackedPolicySize&lt;/code&gt; response element indicates by percentage how close the policies and tags for your request are to the upper size limit.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;Passing policies to this operation returns new temporary credentials. The resulting session&#39;s permissions are the intersection of the role&#39;s identity-based policy and the session policies. You can use the role&#39;s temporary credentials in subsequent Amazon Web Services API calls to access resources in the account that owns the role. You cannot use session policies to grant more permissions than those allowed by the identity-based policy of the role that is being assumed. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session\&quot;&gt;Session Policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; | [optional] |
| **policy** | **String**| &lt;p&gt;An IAM policy in JSON format that you want to use as an inline session policy.&lt;/p&gt; &lt;p&gt;This parameter is optional. Passing policies to this operation returns new temporary credentials. The resulting session&#39;s permissions are the intersection of the role&#39;s identity-based policy and the session policies. You can use the role&#39;s temporary credentials in subsequent Amazon Web Services API calls to access resources in the account that owns the role. You cannot use session policies to grant more permissions than those allowed by the identity-based policy of the role that is being assumed. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session\&quot;&gt;Session Policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;The plaintext that you use for both inline and managed session policies can&#39;t exceed 2,048 characters. The JSON policy characters can be any ASCII character from the space character to the end of the valid character list (\\u0020 through \\u00FF). It can also include the tab (\\u0009), linefeed (\\u000A), and carriage return (\\u000D) characters.&lt;/p&gt; &lt;note&gt; &lt;p&gt;An Amazon Web Services conversion compresses the passed inline session policy, managed policy ARNs, and session tags into a packed binary format that has a separate limit. Your request can fail for this limit even if your plaintext meets the other requirements. The &lt;code&gt;PackedPolicySize&lt;/code&gt; response element indicates by percentage how close the policies and tags for your request are to the upper size limit.&lt;/p&gt; &lt;/note&gt; | [optional] |
| **durationSeconds** | **Integer**| &lt;p&gt;The duration, in seconds, of the role session. The value specified can range from 900 seconds (15 minutes) up to the maximum session duration set for the role. The maximum session duration setting can have a value from 1 hour to 12 hours. If you specify a value higher than this setting or the administrator setting (whichever is lower), the operation fails. For example, if you specify a session duration of 12 hours, but your administrator set the maximum session duration to 6 hours, your operation fails. &lt;/p&gt; &lt;p&gt;Role chaining limits your Amazon Web Services CLI or Amazon Web Services API role session to a maximum of one hour. When you use the &lt;code&gt;AssumeRole&lt;/code&gt; API operation to assume a role, you can specify the duration of your role session with the &lt;code&gt;DurationSeconds&lt;/code&gt; parameter. You can specify a parameter value of up to 43200 seconds (12 hours), depending on the maximum session duration setting for your role. However, if you assume a role using role chaining and provide a &lt;code&gt;DurationSeconds&lt;/code&gt; parameter value greater than one hour, the operation fails. To learn how to view the maximum value for your role, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session\&quot;&gt;View the Maximum Session Duration Setting for a Role&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;By default, the value is set to &lt;code&gt;3600&lt;/code&gt; seconds. &lt;/p&gt; &lt;note&gt; &lt;p&gt;The &lt;code&gt;DurationSeconds&lt;/code&gt; parameter is separate from the duration of a console session that you might request using the returned credentials. The request to the federation endpoint for a console sign-in token takes a &lt;code&gt;SessionDuration&lt;/code&gt; parameter that specifies the maximum length of the console session. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html\&quot;&gt;Creating a URL that Enables Federated Users to Access the Amazon Web Services Management Console&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/note&gt; | [optional] |
| **tags** | [**List&lt;Tag&gt;**](Tag.md)| &lt;p&gt;A list of session tags that you want to pass. Each session tag consists of a key name and an associated value. For more information about session tags, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html\&quot;&gt;Tagging Amazon Web Services STS Sessions&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;This parameter is optional. You can pass up to 50 session tags. The plaintext session tag keys can’t exceed 128 characters, and the values can’t exceed 256 characters. For these and additional limits, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length\&quot;&gt;IAM and STS Character Limits&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt;An Amazon Web Services conversion compresses the passed inline session policy, managed policy ARNs, and session tags into a packed binary format that has a separate limit. Your request can fail for this limit even if your plaintext meets the other requirements. The &lt;code&gt;PackedPolicySize&lt;/code&gt; response element indicates by percentage how close the policies and tags for your request are to the upper size limit.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;You can pass a session tag with the same key as a tag that is already attached to the role. When you do, session tags override a role tag with the same key. &lt;/p&gt; &lt;p&gt;Tag key–value pairs are not case sensitive, but case is preserved. This means that you cannot have separate &lt;code&gt;Department&lt;/code&gt; and &lt;code&gt;department&lt;/code&gt; tag keys. Assume that the role has the &lt;code&gt;Department&lt;/code&gt;&#x3D;&lt;code&gt;Marketing&lt;/code&gt; tag and you pass the &lt;code&gt;department&lt;/code&gt;&#x3D;&lt;code&gt;engineering&lt;/code&gt; session tag. &lt;code&gt;Department&lt;/code&gt; and &lt;code&gt;department&lt;/code&gt; are not saved as separate tags, and the session tag passed in the request takes precedence over the role tag.&lt;/p&gt; &lt;p&gt;Additionally, if you used temporary credentials to perform this operation, the new session inherits any transitive session tags from the calling session. If you pass a session tag with the same key as an inherited tag, the operation fails. To view the inherited tags for a session, see the CloudTrail logs. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html#id_session-tags_ctlogs\&quot;&gt;Viewing Session Tags in CloudTrail&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; | [optional] |
| **transitiveTagKeys** | [**List&lt;String&gt;**](String.md)| &lt;p&gt;A list of keys for session tags that you want to set as transitive. If you set a tag key as transitive, the corresponding key and value passes to subsequent sessions in a role chain. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html#id_session-tags_role-chaining\&quot;&gt;Chaining Roles with Session Tags&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;This parameter is optional. When you set session tags as transitive, the session policy and session tags packed binary limit is not affected.&lt;/p&gt; &lt;p&gt;If you choose not to specify a transitive tag key, then no tags are passed from this session to any subsequent sessions.&lt;/p&gt; | [optional] |
| **externalId** | **String**| &lt;p&gt;A unique identifier that might be required when you assume a role in another account. If the administrator of the account to which the role belongs provided you with an external ID, then provide that value in the &lt;code&gt;ExternalId&lt;/code&gt; parameter. This value can be any string, such as a passphrase or account number. A cross-account role is usually set up to trust everyone in an account. Therefore, the administrator of the trusting account might send an external ID to the administrator of the trusted account. That way, only someone with the ID can assume the role, rather than everyone in the account. For more information about the external ID, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html\&quot;&gt;How to Use an External ID When Granting Access to Your Amazon Web Services Resources to a Third Party&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;The regex used to validate this parameter is a string of characters consisting of upper- and lower-case alphanumeric characters with no spaces. You can also include underscores or any of the following characters: &#x3D;,.@:/-&lt;/p&gt; | [optional] |
| **serialNumber** | **String**| &lt;p&gt;The identification number of the MFA device that is associated with the user who is making the &lt;code&gt;AssumeRole&lt;/code&gt; call. Specify this value if the trust policy of the role being assumed includes a condition that requires MFA authentication. The value is either the serial number for a hardware device (such as &lt;code&gt;GAHT12345678&lt;/code&gt;) or an Amazon Resource Name (ARN) for a virtual device (such as &lt;code&gt;arn:aws:iam::123456789012:mfa/user&lt;/code&gt;).&lt;/p&gt; &lt;p&gt;The regex used to validate this parameter is a string of characters consisting of upper- and lower-case alphanumeric characters with no spaces. You can also include underscores or any of the following characters: &#x3D;,.@-&lt;/p&gt; | [optional] |
| **tokenCode** | **String**| &lt;p&gt;The value provided by the MFA device, if the trust policy of the role being assumed requires MFA. (In other words, if the policy includes a condition that tests for MFA). If the role being assumed requires MFA and if the &lt;code&gt;TokenCode&lt;/code&gt; value is missing or expired, the &lt;code&gt;AssumeRole&lt;/code&gt; call returns an \&quot;access denied\&quot; error.&lt;/p&gt; &lt;p&gt;The format for this parameter, as described by its regex pattern, is a sequence of six numeric digits.&lt;/p&gt; | [optional] |
| **sourceIdentity** | **String**| &lt;p&gt;The source identity specified by the principal that is calling the &lt;code&gt;AssumeRole&lt;/code&gt; operation.&lt;/p&gt; &lt;p&gt;You can require users to specify a source identity when they assume a role. You do this by using the &lt;code&gt;sts:SourceIdentity&lt;/code&gt; condition key in a role trust policy. You can use source identity information in CloudTrail logs to determine who took actions with a role. You can use the &lt;code&gt;aws:SourceIdentity&lt;/code&gt; condition key to further control access to Amazon Web Services resources based on the value of source identity. For more information about using source identity, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html\&quot;&gt;Monitor and control actions taken with assumed roles&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;The regex used to validate this parameter is a string of characters consisting of upper- and lower-case alphanumeric characters with no spaces. You can also include underscores or any of the following characters: &#x3D;,.@-. You cannot use a value that begins with the text &lt;code&gt;aws:&lt;/code&gt;. This prefix is reserved for Amazon Web Services internal use.&lt;/p&gt; | [optional] |

### Return type

[**AssumeRoleResponse**](AssumeRoleResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **480** | MalformedPolicyDocumentException |  -  |
| **481** | PackedPolicyTooLargeException |  -  |
| **482** | RegionDisabledException |  -  |
| **483** | ExpiredTokenException |  -  |

<a id="gETAssumeRoleWithSAML"></a>
# **gETAssumeRoleWithSAML**
> AssumeRoleWithSAMLResponse gETAssumeRoleWithSAML(roleArn, principalArn, saMLAssertion, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, policyArns, policy, durationSeconds)



&lt;p&gt;Returns a set of temporary security credentials for users who have been authenticated via a SAML authentication response. This operation provides a mechanism for tying an enterprise identity store or directory to role-based Amazon Web Services access without user-specific credentials or configuration. For a comparison of &lt;code&gt;AssumeRoleWithSAML&lt;/code&gt; with the other API operations that produce temporary credentials, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html\&quot;&gt;Requesting Temporary Security Credentials&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#stsapi_comparison\&quot;&gt;Comparing the Amazon Web Services STS API operations&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;The temporary security credentials returned by this operation consist of an access key ID, a secret access key, and a security token. Applications can use these temporary security credentials to sign calls to Amazon Web Services services.&lt;/p&gt; &lt;p&gt; &lt;b&gt;Session Duration&lt;/b&gt; &lt;/p&gt; &lt;p&gt;By default, the temporary security credentials created by &lt;code&gt;AssumeRoleWithSAML&lt;/code&gt; last for one hour. However, you can use the optional &lt;code&gt;DurationSeconds&lt;/code&gt; parameter to specify the duration of your session. Your role session lasts for the duration that you specify, or until the time specified in the SAML authentication response&#39;s &lt;code&gt;SessionNotOnOrAfter&lt;/code&gt; value, whichever is shorter. You can provide a &lt;code&gt;DurationSeconds&lt;/code&gt; value from 900 seconds (15 minutes) up to the maximum session duration setting for the role. This setting can have a value from 1 hour to 12 hours. To learn how to view the maximum value for your role, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session\&quot;&gt;View the Maximum Session Duration Setting for a Role&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. The maximum session duration limit applies when you use the &lt;code&gt;AssumeRole*&lt;/code&gt; API operations or the &lt;code&gt;assume-role*&lt;/code&gt; CLI commands. However the limit does not apply when you use those operations to create a console URL. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html\&quot;&gt;Using IAM Roles&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt; &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html#iam-term-role-chaining\&quot;&gt;Role chaining&lt;/a&gt; limits your CLI or Amazon Web Services API role session to a maximum of one hour. When you use the &lt;code&gt;AssumeRole&lt;/code&gt; API operation to assume a role, you can specify the duration of your role session with the &lt;code&gt;DurationSeconds&lt;/code&gt; parameter. You can specify a parameter value of up to 43200 seconds (12 hours), depending on the maximum session duration setting for your role. However, if you assume a role using role chaining and provide a &lt;code&gt;DurationSeconds&lt;/code&gt; parameter value greater than one hour, the operation fails.&lt;/p&gt; &lt;/note&gt; &lt;p&gt; &lt;b&gt;Permissions&lt;/b&gt; &lt;/p&gt; &lt;p&gt;The temporary security credentials created by &lt;code&gt;AssumeRoleWithSAML&lt;/code&gt; can be used to make API calls to any Amazon Web Services service with the following exception: you cannot call the STS &lt;code&gt;GetFederationToken&lt;/code&gt; or &lt;code&gt;GetSessionToken&lt;/code&gt; API operations.&lt;/p&gt; &lt;p&gt;(Optional) You can pass inline or managed &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session\&quot;&gt;session policies&lt;/a&gt; to this operation. You can pass a single JSON policy document to use as an inline session policy. You can also specify up to 10 managed policy Amazon Resource Names (ARNs) to use as managed session policies. The plaintext that you use for both inline and managed session policies can&#39;t exceed 2,048 characters. Passing policies to this operation returns new temporary credentials. The resulting session&#39;s permissions are the intersection of the role&#39;s identity-based policy and the session policies. You can use the role&#39;s temporary credentials in subsequent Amazon Web Services API calls to access resources in the account that owns the role. You cannot use session policies to grant more permissions than those allowed by the identity-based policy of the role that is being assumed. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session\&quot;&gt;Session Policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;Calling &lt;code&gt;AssumeRoleWithSAML&lt;/code&gt; does not require the use of Amazon Web Services security credentials. The identity of the caller is validated by using keys in the metadata document that is uploaded for the SAML provider entity for your identity provider. &lt;/p&gt; &lt;important&gt; &lt;p&gt;Calling &lt;code&gt;AssumeRoleWithSAML&lt;/code&gt; can result in an entry in your CloudTrail logs. The entry includes the value in the &lt;code&gt;NameID&lt;/code&gt; element of the SAML assertion. We recommend that you use a &lt;code&gt;NameIDType&lt;/code&gt; that is not associated with any personally identifiable information (PII). For example, you could instead use the persistent identifier (&lt;code&gt;urn:oasis:names:tc:SAML:2.0:nameid-format:persistent&lt;/code&gt;).&lt;/p&gt; &lt;/important&gt; &lt;p&gt; &lt;b&gt;Tags&lt;/b&gt; &lt;/p&gt; &lt;p&gt;(Optional) You can configure your IdP to pass attributes into your SAML assertion as session tags. Each session tag consists of a key name and an associated value. For more information about session tags, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html\&quot;&gt;Passing Session Tags in STS&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;You can pass up to 50 session tags. The plaintext session tag keys can’t exceed 128 characters and the values can’t exceed 256 characters. For these and additional limits, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length\&quot;&gt;IAM and STS Character Limits&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt;An Amazon Web Services conversion compresses the passed inline session policy, managed policy ARNs, and session tags into a packed binary format that has a separate limit. Your request can fail for this limit even if your plaintext meets the other requirements. The &lt;code&gt;PackedPolicySize&lt;/code&gt; response element indicates by percentage how close the policies and tags for your request are to the upper size limit.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;You can pass a session tag with the same key as a tag that is attached to the role. When you do, session tags override the role&#39;s tags with the same key.&lt;/p&gt; &lt;p&gt;An administrator must grant you the permissions necessary to pass session tags. The administrator can also create granular permissions to allow you to pass only specific session tags. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/tutorial_attribute-based-access-control.html\&quot;&gt;Tutorial: Using Tags for Attribute-Based Access Control&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;You can set the session tags as transitive. Transitive tags persist during role chaining. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html#id_session-tags_role-chaining\&quot;&gt;Chaining Roles with Session Tags&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt; &lt;b&gt;SAML Configuration&lt;/b&gt; &lt;/p&gt; &lt;p&gt;Before your application can call &lt;code&gt;AssumeRoleWithSAML&lt;/code&gt;, you must configure your SAML identity provider (IdP) to issue the claims required by Amazon Web Services. Additionally, you must use Identity and Access Management (IAM) to create a SAML provider entity in your Amazon Web Services account that represents your identity provider. You must also create an IAM role that specifies this SAML provider in its trust policy. &lt;/p&gt; &lt;p&gt;For more information, see the following resources:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html\&quot;&gt;About SAML 2.0-based Federation&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_create_saml.html\&quot;&gt;Creating SAML Identity Providers&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_create_saml_relying-party.html\&quot;&gt;Configuring a Relying Party and Claims&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-idp_saml.html\&quot;&gt;Creating a Role for SAML 2.0 Federation&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sts.amazonaws.com");
    
    // Configure API key authorization: hmac
    ApiKeyAuth hmac = (ApiKeyAuth) defaultClient.getAuthentication("hmac");
    hmac.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //hmac.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String roleArn = "roleArn_example"; // String | The Amazon Resource Name (ARN) of the role that the caller is assuming.
    String principalArn = "principalArn_example"; // String | The Amazon Resource Name (ARN) of the SAML provider in IAM that describes the IdP.
    String saMLAssertion = "saMLAssertion_example"; // String | <p>The base64 encoded SAML authentication response provided by the IdP.</p> <p>For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/create-role-saml-IdP-tasks.html\">Configuring a Relying Party and Adding Claims</a> in the <i>IAM User Guide</i>. </p>
    String action = "AssumeRoleWithSAML"; // String | 
    String version = "2011-06-15"; // String | 
    String xAmzContentSha256 = "xAmzContentSha256_example"; // String | 
    String xAmzDate = "xAmzDate_example"; // String | 
    String xAmzAlgorithm = "xAmzAlgorithm_example"; // String | 
    String xAmzCredential = "xAmzCredential_example"; // String | 
    String xAmzSecurityToken = "xAmzSecurityToken_example"; // String | 
    String xAmzSignature = "xAmzSignature_example"; // String | 
    String xAmzSignedHeaders = "xAmzSignedHeaders_example"; // String | 
    List<PolicyDescriptorType> policyArns = Arrays.asList(); // List<PolicyDescriptorType> | <p>The Amazon Resource Names (ARNs) of the IAM managed policies that you want to use as managed session policies. The policies must exist in the same account as the role.</p> <p>This parameter is optional. You can provide up to 10 managed policy ARNs. However, the plaintext that you use for both inline and managed session policies can't exceed 2,048 characters. For more information about ARNs, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs) and Amazon Web Services Service Namespaces</a> in the Amazon Web Services General Reference.</p> <note> <p>An Amazon Web Services conversion compresses the passed inline session policy, managed policy ARNs, and session tags into a packed binary format that has a separate limit. Your request can fail for this limit even if your plaintext meets the other requirements. The <code>PackedPolicySize</code> response element indicates by percentage how close the policies and tags for your request are to the upper size limit.</p> </note> <p>Passing policies to this operation returns new temporary credentials. The resulting session's permissions are the intersection of the role's identity-based policy and the session policies. You can use the role's temporary credentials in subsequent Amazon Web Services API calls to access resources in the account that owns the role. You cannot use session policies to grant more permissions than those allowed by the identity-based policy of the role that is being assumed. For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session\">Session Policies</a> in the <i>IAM User Guide</i>.</p>
    String policy = "policy_example"; // String | <p>An IAM policy in JSON format that you want to use as an inline session policy.</p> <p>This parameter is optional. Passing policies to this operation returns new temporary credentials. The resulting session's permissions are the intersection of the role's identity-based policy and the session policies. You can use the role's temporary credentials in subsequent Amazon Web Services API calls to access resources in the account that owns the role. You cannot use session policies to grant more permissions than those allowed by the identity-based policy of the role that is being assumed. For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session\">Session Policies</a> in the <i>IAM User Guide</i>. </p> <p>The plaintext that you use for both inline and managed session policies can't exceed 2,048 characters. The JSON policy characters can be any ASCII character from the space character to the end of the valid character list (\\u0020 through \\u00FF). It can also include the tab (\\u0009), linefeed (\\u000A), and carriage return (\\u000D) characters.</p> <note> <p>An Amazon Web Services conversion compresses the passed inline session policy, managed policy ARNs, and session tags into a packed binary format that has a separate limit. Your request can fail for this limit even if your plaintext meets the other requirements. The <code>PackedPolicySize</code> response element indicates by percentage how close the policies and tags for your request are to the upper size limit.</p> </note>
    Integer durationSeconds = 56; // Integer | <p>The duration, in seconds, of the role session. Your role session lasts for the duration that you specify for the <code>DurationSeconds</code> parameter, or until the time specified in the SAML authentication response's <code>SessionNotOnOrAfter</code> value, whichever is shorter. You can provide a <code>DurationSeconds</code> value from 900 seconds (15 minutes) up to the maximum session duration setting for the role. This setting can have a value from 1 hour to 12 hours. If you specify a value higher than this setting, the operation fails. For example, if you specify a session duration of 12 hours, but your administrator set the maximum session duration to 6 hours, your operation fails. To learn how to view the maximum value for your role, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session\">View the Maximum Session Duration Setting for a Role</a> in the <i>IAM User Guide</i>.</p> <p>By default, the value is set to <code>3600</code> seconds. </p> <note> <p>The <code>DurationSeconds</code> parameter is separate from the duration of a console session that you might request using the returned credentials. The request to the federation endpoint for a console sign-in token takes a <code>SessionDuration</code> parameter that specifies the maximum length of the console session. For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html\">Creating a URL that Enables Federated Users to Access the Amazon Web Services Management Console</a> in the <i>IAM User Guide</i>.</p> </note>
    try {
      AssumeRoleWithSAMLResponse result = apiInstance.gETAssumeRoleWithSAML(roleArn, principalArn, saMLAssertion, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, policyArns, policy, durationSeconds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#gETAssumeRoleWithSAML");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **roleArn** | **String**| The Amazon Resource Name (ARN) of the role that the caller is assuming. | |
| **principalArn** | **String**| The Amazon Resource Name (ARN) of the SAML provider in IAM that describes the IdP. | |
| **saMLAssertion** | **String**| &lt;p&gt;The base64 encoded SAML authentication response provided by the IdP.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/create-role-saml-IdP-tasks.html\&quot;&gt;Configuring a Relying Party and Adding Claims&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. &lt;/p&gt; | |
| **action** | **String**|  | [enum: AssumeRoleWithSAML] |
| **version** | **String**|  | [enum: 2011-06-15] |
| **xAmzContentSha256** | **String**|  | [optional] |
| **xAmzDate** | **String**|  | [optional] |
| **xAmzAlgorithm** | **String**|  | [optional] |
| **xAmzCredential** | **String**|  | [optional] |
| **xAmzSecurityToken** | **String**|  | [optional] |
| **xAmzSignature** | **String**|  | [optional] |
| **xAmzSignedHeaders** | **String**|  | [optional] |
| **policyArns** | [**List&lt;PolicyDescriptorType&gt;**](PolicyDescriptorType.md)| &lt;p&gt;The Amazon Resource Names (ARNs) of the IAM managed policies that you want to use as managed session policies. The policies must exist in the same account as the role.&lt;/p&gt; &lt;p&gt;This parameter is optional. You can provide up to 10 managed policy ARNs. However, the plaintext that you use for both inline and managed session policies can&#39;t exceed 2,048 characters. For more information about ARNs, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\&quot;&gt;Amazon Resource Names (ARNs) and Amazon Web Services Service Namespaces&lt;/a&gt; in the Amazon Web Services General Reference.&lt;/p&gt; &lt;note&gt; &lt;p&gt;An Amazon Web Services conversion compresses the passed inline session policy, managed policy ARNs, and session tags into a packed binary format that has a separate limit. Your request can fail for this limit even if your plaintext meets the other requirements. The &lt;code&gt;PackedPolicySize&lt;/code&gt; response element indicates by percentage how close the policies and tags for your request are to the upper size limit.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;Passing policies to this operation returns new temporary credentials. The resulting session&#39;s permissions are the intersection of the role&#39;s identity-based policy and the session policies. You can use the role&#39;s temporary credentials in subsequent Amazon Web Services API calls to access resources in the account that owns the role. You cannot use session policies to grant more permissions than those allowed by the identity-based policy of the role that is being assumed. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session\&quot;&gt;Session Policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; | [optional] |
| **policy** | **String**| &lt;p&gt;An IAM policy in JSON format that you want to use as an inline session policy.&lt;/p&gt; &lt;p&gt;This parameter is optional. Passing policies to this operation returns new temporary credentials. The resulting session&#39;s permissions are the intersection of the role&#39;s identity-based policy and the session policies. You can use the role&#39;s temporary credentials in subsequent Amazon Web Services API calls to access resources in the account that owns the role. You cannot use session policies to grant more permissions than those allowed by the identity-based policy of the role that is being assumed. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session\&quot;&gt;Session Policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. &lt;/p&gt; &lt;p&gt;The plaintext that you use for both inline and managed session policies can&#39;t exceed 2,048 characters. The JSON policy characters can be any ASCII character from the space character to the end of the valid character list (\\u0020 through \\u00FF). It can also include the tab (\\u0009), linefeed (\\u000A), and carriage return (\\u000D) characters.&lt;/p&gt; &lt;note&gt; &lt;p&gt;An Amazon Web Services conversion compresses the passed inline session policy, managed policy ARNs, and session tags into a packed binary format that has a separate limit. Your request can fail for this limit even if your plaintext meets the other requirements. The &lt;code&gt;PackedPolicySize&lt;/code&gt; response element indicates by percentage how close the policies and tags for your request are to the upper size limit.&lt;/p&gt; &lt;/note&gt; | [optional] |
| **durationSeconds** | **Integer**| &lt;p&gt;The duration, in seconds, of the role session. Your role session lasts for the duration that you specify for the &lt;code&gt;DurationSeconds&lt;/code&gt; parameter, or until the time specified in the SAML authentication response&#39;s &lt;code&gt;SessionNotOnOrAfter&lt;/code&gt; value, whichever is shorter. You can provide a &lt;code&gt;DurationSeconds&lt;/code&gt; value from 900 seconds (15 minutes) up to the maximum session duration setting for the role. This setting can have a value from 1 hour to 12 hours. If you specify a value higher than this setting, the operation fails. For example, if you specify a session duration of 12 hours, but your administrator set the maximum session duration to 6 hours, your operation fails. To learn how to view the maximum value for your role, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session\&quot;&gt;View the Maximum Session Duration Setting for a Role&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;By default, the value is set to &lt;code&gt;3600&lt;/code&gt; seconds. &lt;/p&gt; &lt;note&gt; &lt;p&gt;The &lt;code&gt;DurationSeconds&lt;/code&gt; parameter is separate from the duration of a console session that you might request using the returned credentials. The request to the federation endpoint for a console sign-in token takes a &lt;code&gt;SessionDuration&lt;/code&gt; parameter that specifies the maximum length of the console session. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html\&quot;&gt;Creating a URL that Enables Federated Users to Access the Amazon Web Services Management Console&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/note&gt; | [optional] |

### Return type

[**AssumeRoleWithSAMLResponse**](AssumeRoleWithSAMLResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **480** | MalformedPolicyDocumentException |  -  |
| **481** | PackedPolicyTooLargeException |  -  |
| **482** | IDPRejectedClaimException |  -  |
| **483** | InvalidIdentityTokenException |  -  |
| **484** | ExpiredTokenException |  -  |
| **485** | RegionDisabledException |  -  |

<a id="gETAssumeRoleWithWebIdentity"></a>
# **gETAssumeRoleWithWebIdentity**
> AssumeRoleWithWebIdentityResponse gETAssumeRoleWithWebIdentity(roleArn, roleSessionName, webIdentityToken, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, providerId, policyArns, policy, durationSeconds)



&lt;p&gt;Returns a set of temporary security credentials for users who have been authenticated in a mobile or web application with a web identity provider. Example providers include the OAuth 2.0 providers Login with Amazon and Facebook, or any OpenID Connect-compatible identity provider such as Google or &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-identity.html\&quot;&gt;Amazon Cognito federated identities&lt;/a&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt;For mobile applications, we recommend that you use Amazon Cognito. You can use Amazon Cognito with the &lt;a href&#x3D;\&quot;http://aws.amazon.com/sdkforios/\&quot;&gt;Amazon Web Services SDK for iOS Developer Guide&lt;/a&gt; and the &lt;a href&#x3D;\&quot;http://aws.amazon.com/sdkforandroid/\&quot;&gt;Amazon Web Services SDK for Android Developer Guide&lt;/a&gt; to uniquely identify a user. You can also supply the user with a consistent identity throughout the lifetime of an application.&lt;/p&gt; &lt;p&gt;To learn more about Amazon Cognito, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/mobile/sdkforandroid/developerguide/cognito-auth.html#d0e840\&quot;&gt;Amazon Cognito Overview&lt;/a&gt; in &lt;i&gt;Amazon Web Services SDK for Android Developer Guide&lt;/i&gt; and &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/mobile/sdkforios/developerguide/cognito-auth.html#d0e664\&quot;&gt;Amazon Cognito Overview&lt;/a&gt; in the &lt;i&gt;Amazon Web Services SDK for iOS Developer Guide&lt;/i&gt;.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;Calling &lt;code&gt;AssumeRoleWithWebIdentity&lt;/code&gt; does not require the use of Amazon Web Services security credentials. Therefore, you can distribute an application (for example, on mobile devices) that requests temporary security credentials without including long-term Amazon Web Services credentials in the application. You also don&#39;t need to deploy server-based proxy services that use long-term Amazon Web Services credentials. Instead, the identity of the caller is validated by using a token from the web identity provider. For a comparison of &lt;code&gt;AssumeRoleWithWebIdentity&lt;/code&gt; with the other API operations that produce temporary credentials, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html\&quot;&gt;Requesting Temporary Security Credentials&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#stsapi_comparison\&quot;&gt;Comparing the Amazon Web Services STS API operations&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;The temporary security credentials returned by this API consist of an access key ID, a secret access key, and a security token. Applications can use these temporary security credentials to sign calls to Amazon Web Services service API operations.&lt;/p&gt; &lt;p&gt; &lt;b&gt;Session Duration&lt;/b&gt; &lt;/p&gt; &lt;p&gt;By default, the temporary security credentials created by &lt;code&gt;AssumeRoleWithWebIdentity&lt;/code&gt; last for one hour. However, you can use the optional &lt;code&gt;DurationSeconds&lt;/code&gt; parameter to specify the duration of your session. You can provide a value from 900 seconds (15 minutes) up to the maximum session duration setting for the role. This setting can have a value from 1 hour to 12 hours. To learn how to view the maximum value for your role, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session\&quot;&gt;View the Maximum Session Duration Setting for a Role&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. The maximum session duration limit applies when you use the &lt;code&gt;AssumeRole*&lt;/code&gt; API operations or the &lt;code&gt;assume-role*&lt;/code&gt; CLI commands. However the limit does not apply when you use those operations to create a console URL. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html\&quot;&gt;Using IAM Roles&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. &lt;/p&gt; &lt;p&gt; &lt;b&gt;Permissions&lt;/b&gt; &lt;/p&gt; &lt;p&gt;The temporary security credentials created by &lt;code&gt;AssumeRoleWithWebIdentity&lt;/code&gt; can be used to make API calls to any Amazon Web Services service with the following exception: you cannot call the STS &lt;code&gt;GetFederationToken&lt;/code&gt; or &lt;code&gt;GetSessionToken&lt;/code&gt; API operations.&lt;/p&gt; &lt;p&gt;(Optional) You can pass inline or managed &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session\&quot;&gt;session policies&lt;/a&gt; to this operation. You can pass a single JSON policy document to use as an inline session policy. You can also specify up to 10 managed policy Amazon Resource Names (ARNs) to use as managed session policies. The plaintext that you use for both inline and managed session policies can&#39;t exceed 2,048 characters. Passing policies to this operation returns new temporary credentials. The resulting session&#39;s permissions are the intersection of the role&#39;s identity-based policy and the session policies. You can use the role&#39;s temporary credentials in subsequent Amazon Web Services API calls to access resources in the account that owns the role. You cannot use session policies to grant more permissions than those allowed by the identity-based policy of the role that is being assumed. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session\&quot;&gt;Session Policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt; &lt;b&gt;Tags&lt;/b&gt; &lt;/p&gt; &lt;p&gt;(Optional) You can configure your IdP to pass attributes into your web identity token as session tags. Each session tag consists of a key name and an associated value. For more information about session tags, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html\&quot;&gt;Passing Session Tags in STS&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;You can pass up to 50 session tags. The plaintext session tag keys can’t exceed 128 characters and the values can’t exceed 256 characters. For these and additional limits, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length\&quot;&gt;IAM and STS Character Limits&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt;An Amazon Web Services conversion compresses the passed inline session policy, managed policy ARNs, and session tags into a packed binary format that has a separate limit. Your request can fail for this limit even if your plaintext meets the other requirements. The &lt;code&gt;PackedPolicySize&lt;/code&gt; response element indicates by percentage how close the policies and tags for your request are to the upper size limit.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;You can pass a session tag with the same key as a tag that is attached to the role. When you do, the session tag overrides the role tag with the same key.&lt;/p&gt; &lt;p&gt;An administrator must grant you the permissions necessary to pass session tags. The administrator can also create granular permissions to allow you to pass only specific session tags. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/tutorial_attribute-based-access-control.html\&quot;&gt;Tutorial: Using Tags for Attribute-Based Access Control&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;You can set the session tags as transitive. Transitive tags persist during role chaining. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html#id_session-tags_role-chaining\&quot;&gt;Chaining Roles with Session Tags&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt; &lt;b&gt;Identities&lt;/b&gt; &lt;/p&gt; &lt;p&gt;Before your application can call &lt;code&gt;AssumeRoleWithWebIdentity&lt;/code&gt;, you must have an identity token from a supported identity provider and create a role that the application can assume. The role that your application assumes must trust the identity provider that is associated with the identity token. In other words, the identity provider must be specified in the role&#39;s trust policy. &lt;/p&gt; &lt;important&gt; &lt;p&gt;Calling &lt;code&gt;AssumeRoleWithWebIdentity&lt;/code&gt; can result in an entry in your CloudTrail logs. The entry includes the &lt;a href&#x3D;\&quot;http://openid.net/specs/openid-connect-core-1_0.html#Claims\&quot;&gt;Subject&lt;/a&gt; of the provided web identity token. We recommend that you avoid using any personally identifiable information (PII) in this field. For example, you could instead use a GUID or a pairwise identifier, as &lt;a href&#x3D;\&quot;http://openid.net/specs/openid-connect-core-1_0.html#SubjectIDTypes\&quot;&gt;suggested in the OIDC specification&lt;/a&gt;.&lt;/p&gt; &lt;/important&gt; &lt;p&gt;For more information about how to use web identity federation and the &lt;code&gt;AssumeRoleWithWebIdentity&lt;/code&gt; API, see the following resources: &lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_oidc_manual.html\&quot;&gt;Using Web Identity Federation API Operations for Mobile Apps&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#api_assumerolewithwebidentity\&quot;&gt;Federation Through a Web-based Identity Provider&lt;/a&gt;. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;a href&#x3D;\&quot;https://aws.amazon.com/blogs/aws/the-aws-web-identity-federation-playground/\&quot;&gt; Web Identity Federation Playground&lt;/a&gt;. Walk through the process of authenticating through Login with Amazon, Facebook, or Google, getting temporary security credentials, and then using those credentials to make a request to Amazon Web Services. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;a href&#x3D;\&quot;http://aws.amazon.com/sdkforios/\&quot;&gt;Amazon Web Services SDK for iOS Developer Guide&lt;/a&gt; and &lt;a href&#x3D;\&quot;http://aws.amazon.com/sdkforandroid/\&quot;&gt;Amazon Web Services SDK for Android Developer Guide&lt;/a&gt;. These toolkits contain sample apps that show how to invoke the identity providers. The toolkits then show how to use the information from these providers to get and use temporary security credentials. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;a href&#x3D;\&quot;http://aws.amazon.com/articles/web-identity-federation-with-mobile-applications\&quot;&gt;Web Identity Federation with Mobile Applications&lt;/a&gt;. This article discusses web identity federation and shows an example of how to use web identity federation to get access to content in Amazon S3. &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sts.amazonaws.com");
    
    // Configure API key authorization: hmac
    ApiKeyAuth hmac = (ApiKeyAuth) defaultClient.getAuthentication("hmac");
    hmac.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //hmac.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String roleArn = "roleArn_example"; // String | The Amazon Resource Name (ARN) of the role that the caller is assuming.
    String roleSessionName = "roleSessionName_example"; // String | <p>An identifier for the assumed role session. Typically, you pass the name or identifier that is associated with the user who is using your application. That way, the temporary security credentials that your application will use are associated with that user. This session name is included as part of the ARN and assumed role ID in the <code>AssumedRoleUser</code> response element.</p> <p>The regex used to validate this parameter is a string of characters consisting of upper- and lower-case alphanumeric characters with no spaces. You can also include underscores or any of the following characters: =,.@-</p>
    String webIdentityToken = "webIdentityToken_example"; // String | The OAuth 2.0 access token or OpenID Connect ID token that is provided by the identity provider. Your application must get this token by authenticating the user who is using your application with a web identity provider before the application makes an <code>AssumeRoleWithWebIdentity</code> call. 
    String action = "AssumeRoleWithWebIdentity"; // String | 
    String version = "2011-06-15"; // String | 
    String xAmzContentSha256 = "xAmzContentSha256_example"; // String | 
    String xAmzDate = "xAmzDate_example"; // String | 
    String xAmzAlgorithm = "xAmzAlgorithm_example"; // String | 
    String xAmzCredential = "xAmzCredential_example"; // String | 
    String xAmzSecurityToken = "xAmzSecurityToken_example"; // String | 
    String xAmzSignature = "xAmzSignature_example"; // String | 
    String xAmzSignedHeaders = "xAmzSignedHeaders_example"; // String | 
    String providerId = "providerId_example"; // String | <p>The fully qualified host component of the domain name of the OAuth 2.0 identity provider. Do not specify this value for an OpenID Connect identity provider.</p> <p>Currently <code>www.amazon.com</code> and <code>graph.facebook.com</code> are the only supported identity providers for OAuth 2.0 access tokens. Do not include URL schemes and port numbers.</p> <p>Do not specify this value for OpenID Connect ID tokens.</p>
    List<PolicyDescriptorType> policyArns = Arrays.asList(); // List<PolicyDescriptorType> | <p>The Amazon Resource Names (ARNs) of the IAM managed policies that you want to use as managed session policies. The policies must exist in the same account as the role.</p> <p>This parameter is optional. You can provide up to 10 managed policy ARNs. However, the plaintext that you use for both inline and managed session policies can't exceed 2,048 characters. For more information about ARNs, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs) and Amazon Web Services Service Namespaces</a> in the Amazon Web Services General Reference.</p> <note> <p>An Amazon Web Services conversion compresses the passed inline session policy, managed policy ARNs, and session tags into a packed binary format that has a separate limit. Your request can fail for this limit even if your plaintext meets the other requirements. The <code>PackedPolicySize</code> response element indicates by percentage how close the policies and tags for your request are to the upper size limit.</p> </note> <p>Passing policies to this operation returns new temporary credentials. The resulting session's permissions are the intersection of the role's identity-based policy and the session policies. You can use the role's temporary credentials in subsequent Amazon Web Services API calls to access resources in the account that owns the role. You cannot use session policies to grant more permissions than those allowed by the identity-based policy of the role that is being assumed. For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session\">Session Policies</a> in the <i>IAM User Guide</i>.</p>
    String policy = "policy_example"; // String | <p>An IAM policy in JSON format that you want to use as an inline session policy.</p> <p>This parameter is optional. Passing policies to this operation returns new temporary credentials. The resulting session's permissions are the intersection of the role's identity-based policy and the session policies. You can use the role's temporary credentials in subsequent Amazon Web Services API calls to access resources in the account that owns the role. You cannot use session policies to grant more permissions than those allowed by the identity-based policy of the role that is being assumed. For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session\">Session Policies</a> in the <i>IAM User Guide</i>.</p> <p>The plaintext that you use for both inline and managed session policies can't exceed 2,048 characters. The JSON policy characters can be any ASCII character from the space character to the end of the valid character list (\\u0020 through \\u00FF). It can also include the tab (\\u0009), linefeed (\\u000A), and carriage return (\\u000D) characters.</p> <note> <p>An Amazon Web Services conversion compresses the passed inline session policy, managed policy ARNs, and session tags into a packed binary format that has a separate limit. Your request can fail for this limit even if your plaintext meets the other requirements. The <code>PackedPolicySize</code> response element indicates by percentage how close the policies and tags for your request are to the upper size limit.</p> </note>
    Integer durationSeconds = 56; // Integer | <p>The duration, in seconds, of the role session. The value can range from 900 seconds (15 minutes) up to the maximum session duration setting for the role. This setting can have a value from 1 hour to 12 hours. If you specify a value higher than this setting, the operation fails. For example, if you specify a session duration of 12 hours, but your administrator set the maximum session duration to 6 hours, your operation fails. To learn how to view the maximum value for your role, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session\">View the Maximum Session Duration Setting for a Role</a> in the <i>IAM User Guide</i>.</p> <p>By default, the value is set to <code>3600</code> seconds. </p> <note> <p>The <code>DurationSeconds</code> parameter is separate from the duration of a console session that you might request using the returned credentials. The request to the federation endpoint for a console sign-in token takes a <code>SessionDuration</code> parameter that specifies the maximum length of the console session. For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html\">Creating a URL that Enables Federated Users to Access the Amazon Web Services Management Console</a> in the <i>IAM User Guide</i>.</p> </note>
    try {
      AssumeRoleWithWebIdentityResponse result = apiInstance.gETAssumeRoleWithWebIdentity(roleArn, roleSessionName, webIdentityToken, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, providerId, policyArns, policy, durationSeconds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#gETAssumeRoleWithWebIdentity");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **roleArn** | **String**| The Amazon Resource Name (ARN) of the role that the caller is assuming. | |
| **roleSessionName** | **String**| &lt;p&gt;An identifier for the assumed role session. Typically, you pass the name or identifier that is associated with the user who is using your application. That way, the temporary security credentials that your application will use are associated with that user. This session name is included as part of the ARN and assumed role ID in the &lt;code&gt;AssumedRoleUser&lt;/code&gt; response element.&lt;/p&gt; &lt;p&gt;The regex used to validate this parameter is a string of characters consisting of upper- and lower-case alphanumeric characters with no spaces. You can also include underscores or any of the following characters: &#x3D;,.@-&lt;/p&gt; | |
| **webIdentityToken** | **String**| The OAuth 2.0 access token or OpenID Connect ID token that is provided by the identity provider. Your application must get this token by authenticating the user who is using your application with a web identity provider before the application makes an &lt;code&gt;AssumeRoleWithWebIdentity&lt;/code&gt; call.  | |
| **action** | **String**|  | [enum: AssumeRoleWithWebIdentity] |
| **version** | **String**|  | [enum: 2011-06-15] |
| **xAmzContentSha256** | **String**|  | [optional] |
| **xAmzDate** | **String**|  | [optional] |
| **xAmzAlgorithm** | **String**|  | [optional] |
| **xAmzCredential** | **String**|  | [optional] |
| **xAmzSecurityToken** | **String**|  | [optional] |
| **xAmzSignature** | **String**|  | [optional] |
| **xAmzSignedHeaders** | **String**|  | [optional] |
| **providerId** | **String**| &lt;p&gt;The fully qualified host component of the domain name of the OAuth 2.0 identity provider. Do not specify this value for an OpenID Connect identity provider.&lt;/p&gt; &lt;p&gt;Currently &lt;code&gt;www.amazon.com&lt;/code&gt; and &lt;code&gt;graph.facebook.com&lt;/code&gt; are the only supported identity providers for OAuth 2.0 access tokens. Do not include URL schemes and port numbers.&lt;/p&gt; &lt;p&gt;Do not specify this value for OpenID Connect ID tokens.&lt;/p&gt; | [optional] |
| **policyArns** | [**List&lt;PolicyDescriptorType&gt;**](PolicyDescriptorType.md)| &lt;p&gt;The Amazon Resource Names (ARNs) of the IAM managed policies that you want to use as managed session policies. The policies must exist in the same account as the role.&lt;/p&gt; &lt;p&gt;This parameter is optional. You can provide up to 10 managed policy ARNs. However, the plaintext that you use for both inline and managed session policies can&#39;t exceed 2,048 characters. For more information about ARNs, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\&quot;&gt;Amazon Resource Names (ARNs) and Amazon Web Services Service Namespaces&lt;/a&gt; in the Amazon Web Services General Reference.&lt;/p&gt; &lt;note&gt; &lt;p&gt;An Amazon Web Services conversion compresses the passed inline session policy, managed policy ARNs, and session tags into a packed binary format that has a separate limit. Your request can fail for this limit even if your plaintext meets the other requirements. The &lt;code&gt;PackedPolicySize&lt;/code&gt; response element indicates by percentage how close the policies and tags for your request are to the upper size limit.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;Passing policies to this operation returns new temporary credentials. The resulting session&#39;s permissions are the intersection of the role&#39;s identity-based policy and the session policies. You can use the role&#39;s temporary credentials in subsequent Amazon Web Services API calls to access resources in the account that owns the role. You cannot use session policies to grant more permissions than those allowed by the identity-based policy of the role that is being assumed. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session\&quot;&gt;Session Policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; | [optional] |
| **policy** | **String**| &lt;p&gt;An IAM policy in JSON format that you want to use as an inline session policy.&lt;/p&gt; &lt;p&gt;This parameter is optional. Passing policies to this operation returns new temporary credentials. The resulting session&#39;s permissions are the intersection of the role&#39;s identity-based policy and the session policies. You can use the role&#39;s temporary credentials in subsequent Amazon Web Services API calls to access resources in the account that owns the role. You cannot use session policies to grant more permissions than those allowed by the identity-based policy of the role that is being assumed. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session\&quot;&gt;Session Policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;The plaintext that you use for both inline and managed session policies can&#39;t exceed 2,048 characters. The JSON policy characters can be any ASCII character from the space character to the end of the valid character list (\\u0020 through \\u00FF). It can also include the tab (\\u0009), linefeed (\\u000A), and carriage return (\\u000D) characters.&lt;/p&gt; &lt;note&gt; &lt;p&gt;An Amazon Web Services conversion compresses the passed inline session policy, managed policy ARNs, and session tags into a packed binary format that has a separate limit. Your request can fail for this limit even if your plaintext meets the other requirements. The &lt;code&gt;PackedPolicySize&lt;/code&gt; response element indicates by percentage how close the policies and tags for your request are to the upper size limit.&lt;/p&gt; &lt;/note&gt; | [optional] |
| **durationSeconds** | **Integer**| &lt;p&gt;The duration, in seconds, of the role session. The value can range from 900 seconds (15 minutes) up to the maximum session duration setting for the role. This setting can have a value from 1 hour to 12 hours. If you specify a value higher than this setting, the operation fails. For example, if you specify a session duration of 12 hours, but your administrator set the maximum session duration to 6 hours, your operation fails. To learn how to view the maximum value for your role, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session\&quot;&gt;View the Maximum Session Duration Setting for a Role&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;By default, the value is set to &lt;code&gt;3600&lt;/code&gt; seconds. &lt;/p&gt; &lt;note&gt; &lt;p&gt;The &lt;code&gt;DurationSeconds&lt;/code&gt; parameter is separate from the duration of a console session that you might request using the returned credentials. The request to the federation endpoint for a console sign-in token takes a &lt;code&gt;SessionDuration&lt;/code&gt; parameter that specifies the maximum length of the console session. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html\&quot;&gt;Creating a URL that Enables Federated Users to Access the Amazon Web Services Management Console&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/note&gt; | [optional] |

### Return type

[**AssumeRoleWithWebIdentityResponse**](AssumeRoleWithWebIdentityResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **480** | MalformedPolicyDocumentException |  -  |
| **481** | PackedPolicyTooLargeException |  -  |
| **482** | IDPRejectedClaimException |  -  |
| **483** | IDPCommunicationErrorException |  -  |
| **484** | InvalidIdentityTokenException |  -  |
| **485** | ExpiredTokenException |  -  |
| **486** | RegionDisabledException |  -  |

<a id="gETDecodeAuthorizationMessage"></a>
# **gETDecodeAuthorizationMessage**
> DecodeAuthorizationMessageResponse gETDecodeAuthorizationMessage(encodedMessage, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders)



&lt;p&gt;Decodes additional information about the authorization status of a request from an encoded message returned in response to an Amazon Web Services request.&lt;/p&gt; &lt;p&gt;For example, if a user is not authorized to perform an operation that he or she has requested, the request returns a &lt;code&gt;Client.UnauthorizedOperation&lt;/code&gt; response (an HTTP 403 response). Some Amazon Web Services operations additionally return an encoded message that can provide details about this authorization failure. &lt;/p&gt; &lt;note&gt; &lt;p&gt;Only certain Amazon Web Services operations return an encoded authorization message. The documentation for an individual operation indicates whether that operation returns an encoded message in addition to returning an HTTP code.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;The message is encoded because the details of the authorization status can contain privileged information that the user who requested the operation should not see. To decode an authorization status message, a user must be granted permissions through an IAM &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html\&quot;&gt;policy&lt;/a&gt; to request the &lt;code&gt;DecodeAuthorizationMessage&lt;/code&gt; (&lt;code&gt;sts:DecodeAuthorizationMessage&lt;/code&gt;) action. &lt;/p&gt; &lt;p&gt;The decoded message includes the following type of information:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;Whether the request was denied due to an explicit deny or due to the absence of an explicit allow. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html#policy-eval-denyallow\&quot;&gt;Determining Whether a Request is Allowed or Denied&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The principal who made the request.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The requested action.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The requested resource.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The values of condition keys in the context of the user&#39;s request.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sts.amazonaws.com");
    
    // Configure API key authorization: hmac
    ApiKeyAuth hmac = (ApiKeyAuth) defaultClient.getAuthentication("hmac");
    hmac.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //hmac.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String encodedMessage = "encodedMessage_example"; // String | The encoded message that was returned with the response.
    String action = "DecodeAuthorizationMessage"; // String | 
    String version = "2011-06-15"; // String | 
    String xAmzContentSha256 = "xAmzContentSha256_example"; // String | 
    String xAmzDate = "xAmzDate_example"; // String | 
    String xAmzAlgorithm = "xAmzAlgorithm_example"; // String | 
    String xAmzCredential = "xAmzCredential_example"; // String | 
    String xAmzSecurityToken = "xAmzSecurityToken_example"; // String | 
    String xAmzSignature = "xAmzSignature_example"; // String | 
    String xAmzSignedHeaders = "xAmzSignedHeaders_example"; // String | 
    try {
      DecodeAuthorizationMessageResponse result = apiInstance.gETDecodeAuthorizationMessage(encodedMessage, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#gETDecodeAuthorizationMessage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **encodedMessage** | **String**| The encoded message that was returned with the response. | |
| **action** | **String**|  | [enum: DecodeAuthorizationMessage] |
| **version** | **String**|  | [enum: 2011-06-15] |
| **xAmzContentSha256** | **String**|  | [optional] |
| **xAmzDate** | **String**|  | [optional] |
| **xAmzAlgorithm** | **String**|  | [optional] |
| **xAmzCredential** | **String**|  | [optional] |
| **xAmzSecurityToken** | **String**|  | [optional] |
| **xAmzSignature** | **String**|  | [optional] |
| **xAmzSignedHeaders** | **String**|  | [optional] |

### Return type

[**DecodeAuthorizationMessageResponse**](DecodeAuthorizationMessageResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **480** | InvalidAuthorizationMessageException |  -  |

<a id="gETGetAccessKeyInfo"></a>
# **gETGetAccessKeyInfo**
> GetAccessKeyInfoResponse gETGetAccessKeyInfo(accessKeyId, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders)



&lt;p&gt;Returns the account identifier for the specified access key ID.&lt;/p&gt; &lt;p&gt;Access keys consist of two parts: an access key ID (for example, &lt;code&gt;AKIAIOSFODNN7EXAMPLE&lt;/code&gt;) and a secret access key (for example, &lt;code&gt;wJalrXUtnFEMI/K7MDENG/bPxRfiCYEXAMPLEKEY&lt;/code&gt;). For more information about access keys, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_access-keys.html\&quot;&gt;Managing Access Keys for IAM Users&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;When you pass an access key ID to this operation, it returns the ID of the Amazon Web Services account to which the keys belong. Access key IDs beginning with &lt;code&gt;AKIA&lt;/code&gt; are long-term credentials for an IAM user or the Amazon Web Services account root user. Access key IDs beginning with &lt;code&gt;ASIA&lt;/code&gt; are temporary credentials that are created using STS operations. If the account in the response belongs to you, you can sign in as the root user and review your root user access keys. Then, you can pull a &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_getting-report.html\&quot;&gt;credentials report&lt;/a&gt; to learn which IAM user owns the keys. To learn who requested the temporary credentials for an &lt;code&gt;ASIA&lt;/code&gt; access key, view the STS events in your &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/cloudtrail-integration.html\&quot;&gt;CloudTrail logs&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;This operation does not indicate the state of the access key. The key might be active, inactive, or deleted. Active keys might not have permissions to perform an operation. Providing a deleted access key might return an error that the key doesn&#39;t exist.&lt;/p&gt;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sts.amazonaws.com");
    
    // Configure API key authorization: hmac
    ApiKeyAuth hmac = (ApiKeyAuth) defaultClient.getAuthentication("hmac");
    hmac.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //hmac.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String accessKeyId = "accessKeyId_example"; // String | <p>The identifier of an access key.</p> <p>This parameter allows (through its regex pattern) a string of characters that can consist of any upper- or lowercase letter or digit.</p>
    String action = "GetAccessKeyInfo"; // String | 
    String version = "2011-06-15"; // String | 
    String xAmzContentSha256 = "xAmzContentSha256_example"; // String | 
    String xAmzDate = "xAmzDate_example"; // String | 
    String xAmzAlgorithm = "xAmzAlgorithm_example"; // String | 
    String xAmzCredential = "xAmzCredential_example"; // String | 
    String xAmzSecurityToken = "xAmzSecurityToken_example"; // String | 
    String xAmzSignature = "xAmzSignature_example"; // String | 
    String xAmzSignedHeaders = "xAmzSignedHeaders_example"; // String | 
    try {
      GetAccessKeyInfoResponse result = apiInstance.gETGetAccessKeyInfo(accessKeyId, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#gETGetAccessKeyInfo");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accessKeyId** | **String**| &lt;p&gt;The identifier of an access key.&lt;/p&gt; &lt;p&gt;This parameter allows (through its regex pattern) a string of characters that can consist of any upper- or lowercase letter or digit.&lt;/p&gt; | |
| **action** | **String**|  | [enum: GetAccessKeyInfo] |
| **version** | **String**|  | [enum: 2011-06-15] |
| **xAmzContentSha256** | **String**|  | [optional] |
| **xAmzDate** | **String**|  | [optional] |
| **xAmzAlgorithm** | **String**|  | [optional] |
| **xAmzCredential** | **String**|  | [optional] |
| **xAmzSecurityToken** | **String**|  | [optional] |
| **xAmzSignature** | **String**|  | [optional] |
| **xAmzSignedHeaders** | **String**|  | [optional] |

### Return type

[**GetAccessKeyInfoResponse**](GetAccessKeyInfoResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="gETGetCallerIdentity"></a>
# **gETGetCallerIdentity**
> GetCallerIdentityResponse gETGetCallerIdentity(action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders)



&lt;p&gt;Returns details about the IAM user or role whose credentials are used to call the operation.&lt;/p&gt; &lt;note&gt; &lt;p&gt;No permissions are required to perform this operation. If an administrator adds a policy to your IAM user or role that explicitly denies access to the &lt;code&gt;sts:GetCallerIdentity&lt;/code&gt; action, you can still perform this operation. Permissions are not required because the same information is returned when an IAM user or role is denied access. To view an example response, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_access-denied-delete-mfa\&quot;&gt;I Am Not Authorized to Perform: iam:DeleteVirtualMFADevice&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/note&gt;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sts.amazonaws.com");
    
    // Configure API key authorization: hmac
    ApiKeyAuth hmac = (ApiKeyAuth) defaultClient.getAuthentication("hmac");
    hmac.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //hmac.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String action = "GetCallerIdentity"; // String | 
    String version = "2011-06-15"; // String | 
    String xAmzContentSha256 = "xAmzContentSha256_example"; // String | 
    String xAmzDate = "xAmzDate_example"; // String | 
    String xAmzAlgorithm = "xAmzAlgorithm_example"; // String | 
    String xAmzCredential = "xAmzCredential_example"; // String | 
    String xAmzSecurityToken = "xAmzSecurityToken_example"; // String | 
    String xAmzSignature = "xAmzSignature_example"; // String | 
    String xAmzSignedHeaders = "xAmzSignedHeaders_example"; // String | 
    try {
      GetCallerIdentityResponse result = apiInstance.gETGetCallerIdentity(action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#gETGetCallerIdentity");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **action** | **String**|  | [enum: GetCallerIdentity] |
| **version** | **String**|  | [enum: 2011-06-15] |
| **xAmzContentSha256** | **String**|  | [optional] |
| **xAmzDate** | **String**|  | [optional] |
| **xAmzAlgorithm** | **String**|  | [optional] |
| **xAmzCredential** | **String**|  | [optional] |
| **xAmzSecurityToken** | **String**|  | [optional] |
| **xAmzSignature** | **String**|  | [optional] |
| **xAmzSignedHeaders** | **String**|  | [optional] |

### Return type

[**GetCallerIdentityResponse**](GetCallerIdentityResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="gETGetFederationToken"></a>
# **gETGetFederationToken**
> GetFederationTokenResponse gETGetFederationToken(name, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, policy, policyArns, durationSeconds, tags)



&lt;p&gt;Returns a set of temporary security credentials (consisting of an access key ID, a secret access key, and a security token) for a federated user. A typical use is in a proxy application that gets temporary security credentials on behalf of distributed applications inside a corporate network. You must call the &lt;code&gt;GetFederationToken&lt;/code&gt; operation using the long-term security credentials of an IAM user. As a result, this call is appropriate in contexts where those credentials can be safely stored, usually in a server-based application. For a comparison of &lt;code&gt;GetFederationToken&lt;/code&gt; with the other API operations that produce temporary credentials, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html\&quot;&gt;Requesting Temporary Security Credentials&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#stsapi_comparison\&quot;&gt;Comparing the Amazon Web Services STS API operations&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt;You can create a mobile-based or browser-based app that can authenticate users using a web identity provider like Login with Amazon, Facebook, Google, or an OpenID Connect-compatible identity provider. In this case, we recommend that you use &lt;a href&#x3D;\&quot;http://aws.amazon.com/cognito/\&quot;&gt;Amazon Cognito&lt;/a&gt; or &lt;code&gt;AssumeRoleWithWebIdentity&lt;/code&gt;. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#api_assumerolewithwebidentity\&quot;&gt;Federation Through a Web-based Identity Provider&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;You can also call &lt;code&gt;GetFederationToken&lt;/code&gt; using the security credentials of an Amazon Web Services account root user, but we do not recommend it. Instead, we recommend that you create an IAM user for the purpose of the proxy application. Then attach a policy to the IAM user that limits federated users to only the actions and resources that they need to access. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/best-practices.html\&quot;&gt;IAM Best Practices&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. &lt;/p&gt; &lt;p&gt; &lt;b&gt;Session duration&lt;/b&gt; &lt;/p&gt; &lt;p&gt;The temporary credentials are valid for the specified duration, from 900 seconds (15 minutes) up to a maximum of 129,600 seconds (36 hours). The default session duration is 43,200 seconds (12 hours). Temporary credentials obtained by using the Amazon Web Services account root user credentials have a maximum duration of 3,600 seconds (1 hour).&lt;/p&gt; &lt;p&gt; &lt;b&gt;Permissions&lt;/b&gt; &lt;/p&gt; &lt;p&gt;You can use the temporary credentials created by &lt;code&gt;GetFederationToken&lt;/code&gt; in any Amazon Web Services service with the following exceptions:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;You cannot call any IAM operations using the CLI or the Amazon Web Services API. This limitation does not apply to console sessions.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;You cannot call any STS operations except &lt;code&gt;GetCallerIdentity&lt;/code&gt;.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;You can use temporary credentials for single sign-on (SSO) to the console.&lt;/p&gt; &lt;p&gt;You must pass an inline or managed &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session\&quot;&gt;session policy&lt;/a&gt; to this operation. You can pass a single JSON policy document to use as an inline session policy. You can also specify up to 10 managed policy Amazon Resource Names (ARNs) to use as managed session policies. The plaintext that you use for both inline and managed session policies can&#39;t exceed 2,048 characters.&lt;/p&gt; &lt;p&gt;Though the session policy parameters are optional, if you do not pass a policy, then the resulting federated user session has no permissions. When you pass session policies, the session permissions are the intersection of the IAM user policies and the session policies that you pass. This gives you a way to further restrict the permissions for a federated user. You cannot use session policies to grant more permissions than those that are defined in the permissions policy of the IAM user. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session\&quot;&gt;Session Policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. For information about using &lt;code&gt;GetFederationToken&lt;/code&gt; to create temporary security credentials, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#api_getfederationtoken\&quot;&gt;GetFederationToken—Federation Through a Custom Identity Broker&lt;/a&gt;. &lt;/p&gt; &lt;p&gt;You can use the credentials to access a resource that has a resource-based policy. If that policy specifically references the federated user session in the &lt;code&gt;Principal&lt;/code&gt; element of the policy, the session has the permissions allowed by the policy. These permissions are granted in addition to the permissions granted by the session policies.&lt;/p&gt; &lt;p&gt; &lt;b&gt;Tags&lt;/b&gt; &lt;/p&gt; &lt;p&gt;(Optional) You can pass tag key-value pairs to your session. These are called session tags. For more information about session tags, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html\&quot;&gt;Passing Session Tags in STS&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt;You can create a mobile-based or browser-based app that can authenticate users using a web identity provider like Login with Amazon, Facebook, Google, or an OpenID Connect-compatible identity provider. In this case, we recommend that you use &lt;a href&#x3D;\&quot;http://aws.amazon.com/cognito/\&quot;&gt;Amazon Cognito&lt;/a&gt; or &lt;code&gt;AssumeRoleWithWebIdentity&lt;/code&gt;. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#api_assumerolewithwebidentity\&quot;&gt;Federation Through a Web-based Identity Provider&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;An administrator must grant you the permissions necessary to pass session tags. The administrator can also create granular permissions to allow you to pass only specific session tags. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/tutorial_attribute-based-access-control.html\&quot;&gt;Tutorial: Using Tags for Attribute-Based Access Control&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;Tag key–value pairs are not case sensitive, but case is preserved. This means that you cannot have separate &lt;code&gt;Department&lt;/code&gt; and &lt;code&gt;department&lt;/code&gt; tag keys. Assume that the user that you are federating has the &lt;code&gt;Department&lt;/code&gt;&#x3D;&lt;code&gt;Marketing&lt;/code&gt; tag and you pass the &lt;code&gt;department&lt;/code&gt;&#x3D;&lt;code&gt;engineering&lt;/code&gt; session tag. &lt;code&gt;Department&lt;/code&gt; and &lt;code&gt;department&lt;/code&gt; are not saved as separate tags, and the session tag passed in the request takes precedence over the user tag.&lt;/p&gt;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sts.amazonaws.com");
    
    // Configure API key authorization: hmac
    ApiKeyAuth hmac = (ApiKeyAuth) defaultClient.getAuthentication("hmac");
    hmac.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //hmac.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String name = "name_example"; // String | <p>The name of the federated user. The name is used as an identifier for the temporary security credentials (such as <code>Bob</code>). For example, you can reference the federated user name in a resource-based policy, such as in an Amazon S3 bucket policy.</p> <p>The regex used to validate this parameter is a string of characters consisting of upper- and lower-case alphanumeric characters with no spaces. You can also include underscores or any of the following characters: =,.@-</p>
    String action = "GetFederationToken"; // String | 
    String version = "2011-06-15"; // String | 
    String xAmzContentSha256 = "xAmzContentSha256_example"; // String | 
    String xAmzDate = "xAmzDate_example"; // String | 
    String xAmzAlgorithm = "xAmzAlgorithm_example"; // String | 
    String xAmzCredential = "xAmzCredential_example"; // String | 
    String xAmzSecurityToken = "xAmzSecurityToken_example"; // String | 
    String xAmzSignature = "xAmzSignature_example"; // String | 
    String xAmzSignedHeaders = "xAmzSignedHeaders_example"; // String | 
    String policy = "policy_example"; // String | <p>An IAM policy in JSON format that you want to use as an inline session policy.</p> <p>You must pass an inline or managed <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session\">session policy</a> to this operation. You can pass a single JSON policy document to use as an inline session policy. You can also specify up to 10 managed policy Amazon Resource Names (ARNs) to use as managed session policies.</p> <p>This parameter is optional. However, if you do not pass any session policies, then the resulting federated user session has no permissions.</p> <p>When you pass session policies, the session permissions are the intersection of the IAM user policies and the session policies that you pass. This gives you a way to further restrict the permissions for a federated user. You cannot use session policies to grant more permissions than those that are defined in the permissions policy of the IAM user. For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session\">Session Policies</a> in the <i>IAM User Guide</i>.</p> <p>The resulting credentials can be used to access a resource that has a resource-based policy. If that policy specifically references the federated user session in the <code>Principal</code> element of the policy, the session has the permissions allowed by the policy. These permissions are granted in addition to the permissions that are granted by the session policies.</p> <p>The plaintext that you use for both inline and managed session policies can't exceed 2,048 characters. The JSON policy characters can be any ASCII character from the space character to the end of the valid character list (\\u0020 through \\u00FF). It can also include the tab (\\u0009), linefeed (\\u000A), and carriage return (\\u000D) characters.</p> <note> <p>An Amazon Web Services conversion compresses the passed inline session policy, managed policy ARNs, and session tags into a packed binary format that has a separate limit. Your request can fail for this limit even if your plaintext meets the other requirements. The <code>PackedPolicySize</code> response element indicates by percentage how close the policies and tags for your request are to the upper size limit.</p> </note>
    List<PolicyDescriptorType> policyArns = Arrays.asList(); // List<PolicyDescriptorType> | <p>The Amazon Resource Names (ARNs) of the IAM managed policies that you want to use as a managed session policy. The policies must exist in the same account as the IAM user that is requesting federated access.</p> <p>You must pass an inline or managed <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session\">session policy</a> to this operation. You can pass a single JSON policy document to use as an inline session policy. You can also specify up to 10 managed policy Amazon Resource Names (ARNs) to use as managed session policies. The plaintext that you use for both inline and managed session policies can't exceed 2,048 characters. You can provide up to 10 managed policy ARNs. For more information about ARNs, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs) and Amazon Web Services Service Namespaces</a> in the Amazon Web Services General Reference.</p> <p>This parameter is optional. However, if you do not pass any session policies, then the resulting federated user session has no permissions.</p> <p>When you pass session policies, the session permissions are the intersection of the IAM user policies and the session policies that you pass. This gives you a way to further restrict the permissions for a federated user. You cannot use session policies to grant more permissions than those that are defined in the permissions policy of the IAM user. For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session\">Session Policies</a> in the <i>IAM User Guide</i>.</p> <p>The resulting credentials can be used to access a resource that has a resource-based policy. If that policy specifically references the federated user session in the <code>Principal</code> element of the policy, the session has the permissions allowed by the policy. These permissions are granted in addition to the permissions that are granted by the session policies.</p> <note> <p>An Amazon Web Services conversion compresses the passed inline session policy, managed policy ARNs, and session tags into a packed binary format that has a separate limit. Your request can fail for this limit even if your plaintext meets the other requirements. The <code>PackedPolicySize</code> response element indicates by percentage how close the policies and tags for your request are to the upper size limit.</p> </note>
    Integer durationSeconds = 56; // Integer | The duration, in seconds, that the session should last. Acceptable durations for federation sessions range from 900 seconds (15 minutes) to 129,600 seconds (36 hours), with 43,200 seconds (12 hours) as the default. Sessions obtained using Amazon Web Services account root user credentials are restricted to a maximum of 3,600 seconds (one hour). If the specified duration is longer than one hour, the session obtained by using root user credentials defaults to one hour.
    List<Tag> tags = Arrays.asList(); // List<Tag> | <p>A list of session tags. Each session tag consists of a key name and an associated value. For more information about session tags, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html\">Passing Session Tags in STS</a> in the <i>IAM User Guide</i>.</p> <p>This parameter is optional. You can pass up to 50 session tags. The plaintext session tag keys can’t exceed 128 characters and the values can’t exceed 256 characters. For these and additional limits, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length\">IAM and STS Character Limits</a> in the <i>IAM User Guide</i>.</p> <note> <p>An Amazon Web Services conversion compresses the passed inline session policy, managed policy ARNs, and session tags into a packed binary format that has a separate limit. Your request can fail for this limit even if your plaintext meets the other requirements. The <code>PackedPolicySize</code> response element indicates by percentage how close the policies and tags for your request are to the upper size limit.</p> </note> <p>You can pass a session tag with the same key as a tag that is already attached to the user you are federating. When you do, session tags override a user tag with the same key. </p> <p>Tag key–value pairs are not case sensitive, but case is preserved. This means that you cannot have separate <code>Department</code> and <code>department</code> tag keys. Assume that the role has the <code>Department</code>=<code>Marketing</code> tag and you pass the <code>department</code>=<code>engineering</code> session tag. <code>Department</code> and <code>department</code> are not saved as separate tags, and the session tag passed in the request takes precedence over the role tag.</p>
    try {
      GetFederationTokenResponse result = apiInstance.gETGetFederationToken(name, action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, policy, policyArns, durationSeconds, tags);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#gETGetFederationToken");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| &lt;p&gt;The name of the federated user. The name is used as an identifier for the temporary security credentials (such as &lt;code&gt;Bob&lt;/code&gt;). For example, you can reference the federated user name in a resource-based policy, such as in an Amazon S3 bucket policy.&lt;/p&gt; &lt;p&gt;The regex used to validate this parameter is a string of characters consisting of upper- and lower-case alphanumeric characters with no spaces. You can also include underscores or any of the following characters: &#x3D;,.@-&lt;/p&gt; | |
| **action** | **String**|  | [enum: GetFederationToken] |
| **version** | **String**|  | [enum: 2011-06-15] |
| **xAmzContentSha256** | **String**|  | [optional] |
| **xAmzDate** | **String**|  | [optional] |
| **xAmzAlgorithm** | **String**|  | [optional] |
| **xAmzCredential** | **String**|  | [optional] |
| **xAmzSecurityToken** | **String**|  | [optional] |
| **xAmzSignature** | **String**|  | [optional] |
| **xAmzSignedHeaders** | **String**|  | [optional] |
| **policy** | **String**| &lt;p&gt;An IAM policy in JSON format that you want to use as an inline session policy.&lt;/p&gt; &lt;p&gt;You must pass an inline or managed &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session\&quot;&gt;session policy&lt;/a&gt; to this operation. You can pass a single JSON policy document to use as an inline session policy. You can also specify up to 10 managed policy Amazon Resource Names (ARNs) to use as managed session policies.&lt;/p&gt; &lt;p&gt;This parameter is optional. However, if you do not pass any session policies, then the resulting federated user session has no permissions.&lt;/p&gt; &lt;p&gt;When you pass session policies, the session permissions are the intersection of the IAM user policies and the session policies that you pass. This gives you a way to further restrict the permissions for a federated user. You cannot use session policies to grant more permissions than those that are defined in the permissions policy of the IAM user. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session\&quot;&gt;Session Policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;The resulting credentials can be used to access a resource that has a resource-based policy. If that policy specifically references the federated user session in the &lt;code&gt;Principal&lt;/code&gt; element of the policy, the session has the permissions allowed by the policy. These permissions are granted in addition to the permissions that are granted by the session policies.&lt;/p&gt; &lt;p&gt;The plaintext that you use for both inline and managed session policies can&#39;t exceed 2,048 characters. The JSON policy characters can be any ASCII character from the space character to the end of the valid character list (\\u0020 through \\u00FF). It can also include the tab (\\u0009), linefeed (\\u000A), and carriage return (\\u000D) characters.&lt;/p&gt; &lt;note&gt; &lt;p&gt;An Amazon Web Services conversion compresses the passed inline session policy, managed policy ARNs, and session tags into a packed binary format that has a separate limit. Your request can fail for this limit even if your plaintext meets the other requirements. The &lt;code&gt;PackedPolicySize&lt;/code&gt; response element indicates by percentage how close the policies and tags for your request are to the upper size limit.&lt;/p&gt; &lt;/note&gt; | [optional] |
| **policyArns** | [**List&lt;PolicyDescriptorType&gt;**](PolicyDescriptorType.md)| &lt;p&gt;The Amazon Resource Names (ARNs) of the IAM managed policies that you want to use as a managed session policy. The policies must exist in the same account as the IAM user that is requesting federated access.&lt;/p&gt; &lt;p&gt;You must pass an inline or managed &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session\&quot;&gt;session policy&lt;/a&gt; to this operation. You can pass a single JSON policy document to use as an inline session policy. You can also specify up to 10 managed policy Amazon Resource Names (ARNs) to use as managed session policies. The plaintext that you use for both inline and managed session policies can&#39;t exceed 2,048 characters. You can provide up to 10 managed policy ARNs. For more information about ARNs, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\&quot;&gt;Amazon Resource Names (ARNs) and Amazon Web Services Service Namespaces&lt;/a&gt; in the Amazon Web Services General Reference.&lt;/p&gt; &lt;p&gt;This parameter is optional. However, if you do not pass any session policies, then the resulting federated user session has no permissions.&lt;/p&gt; &lt;p&gt;When you pass session policies, the session permissions are the intersection of the IAM user policies and the session policies that you pass. This gives you a way to further restrict the permissions for a federated user. You cannot use session policies to grant more permissions than those that are defined in the permissions policy of the IAM user. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session\&quot;&gt;Session Policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;The resulting credentials can be used to access a resource that has a resource-based policy. If that policy specifically references the federated user session in the &lt;code&gt;Principal&lt;/code&gt; element of the policy, the session has the permissions allowed by the policy. These permissions are granted in addition to the permissions that are granted by the session policies.&lt;/p&gt; &lt;note&gt; &lt;p&gt;An Amazon Web Services conversion compresses the passed inline session policy, managed policy ARNs, and session tags into a packed binary format that has a separate limit. Your request can fail for this limit even if your plaintext meets the other requirements. The &lt;code&gt;PackedPolicySize&lt;/code&gt; response element indicates by percentage how close the policies and tags for your request are to the upper size limit.&lt;/p&gt; &lt;/note&gt; | [optional] |
| **durationSeconds** | **Integer**| The duration, in seconds, that the session should last. Acceptable durations for federation sessions range from 900 seconds (15 minutes) to 129,600 seconds (36 hours), with 43,200 seconds (12 hours) as the default. Sessions obtained using Amazon Web Services account root user credentials are restricted to a maximum of 3,600 seconds (one hour). If the specified duration is longer than one hour, the session obtained by using root user credentials defaults to one hour. | [optional] |
| **tags** | [**List&lt;Tag&gt;**](Tag.md)| &lt;p&gt;A list of session tags. Each session tag consists of a key name and an associated value. For more information about session tags, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html\&quot;&gt;Passing Session Tags in STS&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;This parameter is optional. You can pass up to 50 session tags. The plaintext session tag keys can’t exceed 128 characters and the values can’t exceed 256 characters. For these and additional limits, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length\&quot;&gt;IAM and STS Character Limits&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt;An Amazon Web Services conversion compresses the passed inline session policy, managed policy ARNs, and session tags into a packed binary format that has a separate limit. Your request can fail for this limit even if your plaintext meets the other requirements. The &lt;code&gt;PackedPolicySize&lt;/code&gt; response element indicates by percentage how close the policies and tags for your request are to the upper size limit.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;You can pass a session tag with the same key as a tag that is already attached to the user you are federating. When you do, session tags override a user tag with the same key. &lt;/p&gt; &lt;p&gt;Tag key–value pairs are not case sensitive, but case is preserved. This means that you cannot have separate &lt;code&gt;Department&lt;/code&gt; and &lt;code&gt;department&lt;/code&gt; tag keys. Assume that the role has the &lt;code&gt;Department&lt;/code&gt;&#x3D;&lt;code&gt;Marketing&lt;/code&gt; tag and you pass the &lt;code&gt;department&lt;/code&gt;&#x3D;&lt;code&gt;engineering&lt;/code&gt; session tag. &lt;code&gt;Department&lt;/code&gt; and &lt;code&gt;department&lt;/code&gt; are not saved as separate tags, and the session tag passed in the request takes precedence over the role tag.&lt;/p&gt; | [optional] |

### Return type

[**GetFederationTokenResponse**](GetFederationTokenResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **480** | MalformedPolicyDocumentException |  -  |
| **481** | PackedPolicyTooLargeException |  -  |
| **482** | RegionDisabledException |  -  |

<a id="gETGetSessionToken"></a>
# **gETGetSessionToken**
> GetSessionTokenResponse gETGetSessionToken(action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, durationSeconds, serialNumber, tokenCode)



&lt;p&gt;Returns a set of temporary credentials for an Amazon Web Services account or IAM user. The credentials consist of an access key ID, a secret access key, and a security token. Typically, you use &lt;code&gt;GetSessionToken&lt;/code&gt; if you want to use MFA to protect programmatic calls to specific Amazon Web Services API operations like Amazon EC2 &lt;code&gt;StopInstances&lt;/code&gt;. MFA-enabled IAM users would need to call &lt;code&gt;GetSessionToken&lt;/code&gt; and submit an MFA code that is associated with their MFA device. Using the temporary security credentials that are returned from the call, IAM users can then make programmatic calls to API operations that require MFA authentication. If you do not supply a correct MFA code, then the API returns an access denied error. For a comparison of &lt;code&gt;GetSessionToken&lt;/code&gt; with the other API operations that produce temporary credentials, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html\&quot;&gt;Requesting Temporary Security Credentials&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#stsapi_comparison\&quot;&gt;Comparing the Amazon Web Services STS API operations&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt;No permissions are required for users to perform this operation. The purpose of the &lt;code&gt;sts:GetSessionToken&lt;/code&gt; operation is to authenticate the user using MFA. You cannot use policies to control authentication operations. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_getsessiontoken.html\&quot;&gt;Permissions for GetSessionToken&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/note&gt; &lt;p&gt; &lt;b&gt;Session Duration&lt;/b&gt; &lt;/p&gt; &lt;p&gt;The &lt;code&gt;GetSessionToken&lt;/code&gt; operation must be called by using the long-term Amazon Web Services security credentials of the Amazon Web Services account root user or an IAM user. Credentials that are created by IAM users are valid for the duration that you specify. This duration can range from 900 seconds (15 minutes) up to a maximum of 129,600 seconds (36 hours), with a default of 43,200 seconds (12 hours). Credentials based on account credentials can range from 900 seconds (15 minutes) up to 3,600 seconds (1 hour), with a default of 1 hour. &lt;/p&gt; &lt;p&gt; &lt;b&gt;Permissions&lt;/b&gt; &lt;/p&gt; &lt;p&gt;The temporary security credentials created by &lt;code&gt;GetSessionToken&lt;/code&gt; can be used to make API calls to any Amazon Web Services service with the following exceptions:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;You cannot call any IAM API operations unless MFA authentication information is included in the request.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;You cannot call any STS API &lt;i&gt;except&lt;/i&gt; &lt;code&gt;AssumeRole&lt;/code&gt; or &lt;code&gt;GetCallerIdentity&lt;/code&gt;.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;note&gt; &lt;p&gt;We recommend that you do not call &lt;code&gt;GetSessionToken&lt;/code&gt; with Amazon Web Services account root user credentials. Instead, follow our &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/best-practices.html#create-iam-users\&quot;&gt;best practices&lt;/a&gt; by creating one or more IAM users, giving them the necessary permissions, and using IAM users for everyday interaction with Amazon Web Services. &lt;/p&gt; &lt;/note&gt; &lt;p&gt;The credentials that are returned by &lt;code&gt;GetSessionToken&lt;/code&gt; are based on permissions associated with the user whose credentials were used to call the operation. If &lt;code&gt;GetSessionToken&lt;/code&gt; is called using Amazon Web Services account root user credentials, the temporary credentials have root user permissions. Similarly, if &lt;code&gt;GetSessionToken&lt;/code&gt; is called using the credentials of an IAM user, the temporary credentials have the same permissions as the IAM user. &lt;/p&gt; &lt;p&gt;For more information about using &lt;code&gt;GetSessionToken&lt;/code&gt; to create temporary credentials, go to &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#api_getsessiontoken\&quot;&gt;Temporary Credentials for Users in Untrusted Environments&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. &lt;/p&gt;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sts.amazonaws.com");
    
    // Configure API key authorization: hmac
    ApiKeyAuth hmac = (ApiKeyAuth) defaultClient.getAuthentication("hmac");
    hmac.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //hmac.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String action = "GetSessionToken"; // String | 
    String version = "2011-06-15"; // String | 
    String xAmzContentSha256 = "xAmzContentSha256_example"; // String | 
    String xAmzDate = "xAmzDate_example"; // String | 
    String xAmzAlgorithm = "xAmzAlgorithm_example"; // String | 
    String xAmzCredential = "xAmzCredential_example"; // String | 
    String xAmzSecurityToken = "xAmzSecurityToken_example"; // String | 
    String xAmzSignature = "xAmzSignature_example"; // String | 
    String xAmzSignedHeaders = "xAmzSignedHeaders_example"; // String | 
    Integer durationSeconds = 56; // Integer | The duration, in seconds, that the credentials should remain valid. Acceptable durations for IAM user sessions range from 900 seconds (15 minutes) to 129,600 seconds (36 hours), with 43,200 seconds (12 hours) as the default. Sessions for Amazon Web Services account owners are restricted to a maximum of 3,600 seconds (one hour). If the duration is longer than one hour, the session for Amazon Web Services account owners defaults to one hour.
    String serialNumber = "serialNumber_example"; // String | <p>The identification number of the MFA device that is associated with the IAM user who is making the <code>GetSessionToken</code> call. Specify this value if the IAM user has a policy that requires MFA authentication. The value is either the serial number for a hardware device (such as <code>GAHT12345678</code>) or an Amazon Resource Name (ARN) for a virtual device (such as <code>arn:aws:iam::123456789012:mfa/user</code>). You can find the device for an IAM user by going to the Amazon Web Services Management Console and viewing the user's security credentials. </p> <p>The regex used to validate this parameter is a string of characters consisting of upper- and lower-case alphanumeric characters with no spaces. You can also include underscores or any of the following characters: =,.@:/-</p>
    String tokenCode = "tokenCode_example"; // String | <p>The value provided by the MFA device, if MFA is required. If any policy requires the IAM user to submit an MFA code, specify this value. If MFA authentication is required, the user must provide a code when requesting a set of temporary security credentials. A user who fails to provide the code receives an \"access denied\" response when requesting resources that require MFA authentication.</p> <p>The format for this parameter, as described by its regex pattern, is a sequence of six numeric digits.</p>
    try {
      GetSessionTokenResponse result = apiInstance.gETGetSessionToken(action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, durationSeconds, serialNumber, tokenCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#gETGetSessionToken");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **action** | **String**|  | [enum: GetSessionToken] |
| **version** | **String**|  | [enum: 2011-06-15] |
| **xAmzContentSha256** | **String**|  | [optional] |
| **xAmzDate** | **String**|  | [optional] |
| **xAmzAlgorithm** | **String**|  | [optional] |
| **xAmzCredential** | **String**|  | [optional] |
| **xAmzSecurityToken** | **String**|  | [optional] |
| **xAmzSignature** | **String**|  | [optional] |
| **xAmzSignedHeaders** | **String**|  | [optional] |
| **durationSeconds** | **Integer**| The duration, in seconds, that the credentials should remain valid. Acceptable durations for IAM user sessions range from 900 seconds (15 minutes) to 129,600 seconds (36 hours), with 43,200 seconds (12 hours) as the default. Sessions for Amazon Web Services account owners are restricted to a maximum of 3,600 seconds (one hour). If the duration is longer than one hour, the session for Amazon Web Services account owners defaults to one hour. | [optional] |
| **serialNumber** | **String**| &lt;p&gt;The identification number of the MFA device that is associated with the IAM user who is making the &lt;code&gt;GetSessionToken&lt;/code&gt; call. Specify this value if the IAM user has a policy that requires MFA authentication. The value is either the serial number for a hardware device (such as &lt;code&gt;GAHT12345678&lt;/code&gt;) or an Amazon Resource Name (ARN) for a virtual device (such as &lt;code&gt;arn:aws:iam::123456789012:mfa/user&lt;/code&gt;). You can find the device for an IAM user by going to the Amazon Web Services Management Console and viewing the user&#39;s security credentials. &lt;/p&gt; &lt;p&gt;The regex used to validate this parameter is a string of characters consisting of upper- and lower-case alphanumeric characters with no spaces. You can also include underscores or any of the following characters: &#x3D;,.@:/-&lt;/p&gt; | [optional] |
| **tokenCode** | **String**| &lt;p&gt;The value provided by the MFA device, if MFA is required. If any policy requires the IAM user to submit an MFA code, specify this value. If MFA authentication is required, the user must provide a code when requesting a set of temporary security credentials. A user who fails to provide the code receives an \&quot;access denied\&quot; response when requesting resources that require MFA authentication.&lt;/p&gt; &lt;p&gt;The format for this parameter, as described by its regex pattern, is a sequence of six numeric digits.&lt;/p&gt; | [optional] |

### Return type

[**GetSessionTokenResponse**](GetSessionTokenResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **480** | RegionDisabledException |  -  |

<a id="pOSTAssumeRole"></a>
# **pOSTAssumeRole**
> AssumeRoleResponse pOSTAssumeRole(action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, assumeRoleRequest)



&lt;p&gt;Returns a set of temporary security credentials that you can use to access Amazon Web Services resources. These temporary credentials consist of an access key ID, a secret access key, and a security token. Typically, you use &lt;code&gt;AssumeRole&lt;/code&gt; within your account or for cross-account access. For a comparison of &lt;code&gt;AssumeRole&lt;/code&gt; with other API operations that produce temporary credentials, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html\&quot;&gt;Requesting Temporary Security Credentials&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#stsapi_comparison\&quot;&gt;Comparing the Amazon Web Services STS API operations&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt; &lt;b&gt;Permissions&lt;/b&gt; &lt;/p&gt; &lt;p&gt;The temporary security credentials created by &lt;code&gt;AssumeRole&lt;/code&gt; can be used to make API calls to any Amazon Web Services service with the following exception: You cannot call the Amazon Web Services STS &lt;code&gt;GetFederationToken&lt;/code&gt; or &lt;code&gt;GetSessionToken&lt;/code&gt; API operations.&lt;/p&gt; &lt;p&gt;(Optional) You can pass inline or managed &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session\&quot;&gt;session policies&lt;/a&gt; to this operation. You can pass a single JSON policy document to use as an inline session policy. You can also specify up to 10 managed policy Amazon Resource Names (ARNs) to use as managed session policies. The plaintext that you use for both inline and managed session policies can&#39;t exceed 2,048 characters. Passing policies to this operation returns new temporary credentials. The resulting session&#39;s permissions are the intersection of the role&#39;s identity-based policy and the session policies. You can use the role&#39;s temporary credentials in subsequent Amazon Web Services API calls to access resources in the account that owns the role. You cannot use session policies to grant more permissions than those allowed by the identity-based policy of the role that is being assumed. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session\&quot;&gt;Session Policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;When you create a role, you create two policies: A role trust policy that specifies &lt;i&gt;who&lt;/i&gt; can assume the role and a permissions policy that specifies &lt;i&gt;what&lt;/i&gt; can be done with the role. You specify the trusted principal who is allowed to assume the role in the role trust policy.&lt;/p&gt; &lt;p&gt;To assume a role from a different account, your Amazon Web Services account must be trusted by the role. The trust relationship is defined in the role&#39;s trust policy when the role is created. That trust policy states which accounts are allowed to delegate that access to users in the account. &lt;/p&gt; &lt;p&gt;A user who wants to access a role in a different account must also have permissions that are delegated from the user account administrator. The administrator must attach a policy that allows the user to call &lt;code&gt;AssumeRole&lt;/code&gt; for the ARN of the role in the other account.&lt;/p&gt; &lt;p&gt;To allow a user to assume a role in the same account, you can do either of the following:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;Attach a policy to the user that allows the user to call &lt;code&gt;AssumeRole&lt;/code&gt; (as long as the role&#39;s trust policy trusts the account).&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Add the user as a principal directly in the role&#39;s trust policy.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;You can do either because the role’s trust policy acts as an IAM resource-based policy. When a resource-based policy grants access to a principal in the same account, no additional identity-based policy is required. For more information about trust policies and resource-based policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html\&quot;&gt;IAM Policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt; &lt;b&gt;Tags&lt;/b&gt; &lt;/p&gt; &lt;p&gt;(Optional) You can pass tag key-value pairs to your session. These tags are called session tags. For more information about session tags, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html\&quot;&gt;Passing Session Tags in STS&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;An administrator must grant you the permissions necessary to pass session tags. The administrator can also create granular permissions to allow you to pass only specific session tags. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/tutorial_attribute-based-access-control.html\&quot;&gt;Tutorial: Using Tags for Attribute-Based Access Control&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;You can set the session tags as transitive. Transitive tags persist during role chaining. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html#id_session-tags_role-chaining\&quot;&gt;Chaining Roles with Session Tags&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt; &lt;b&gt;Using MFA with AssumeRole&lt;/b&gt; &lt;/p&gt; &lt;p&gt;(Optional) You can include multi-factor authentication (MFA) information when you call &lt;code&gt;AssumeRole&lt;/code&gt;. This is useful for cross-account scenarios to ensure that the user that assumes the role has been authenticated with an Amazon Web Services MFA device. In that scenario, the trust policy of the role being assumed includes a condition that tests for MFA authentication. If the caller does not include valid MFA information, the request to assume the role is denied. The condition in a trust policy that tests for MFA authentication might look like the following example.&lt;/p&gt; &lt;p&gt; &lt;code&gt;\&quot;Condition\&quot;: {\&quot;Bool\&quot;: {\&quot;aws:MultiFactorAuthPresent\&quot;: true}}&lt;/code&gt; &lt;/p&gt; &lt;p&gt;For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/MFAProtectedAPI.html\&quot;&gt;Configuring MFA-Protected API Access&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt; guide.&lt;/p&gt; &lt;p&gt;To use MFA with &lt;code&gt;AssumeRole&lt;/code&gt;, you pass values for the &lt;code&gt;SerialNumber&lt;/code&gt; and &lt;code&gt;TokenCode&lt;/code&gt; parameters. The &lt;code&gt;SerialNumber&lt;/code&gt; value identifies the user&#39;s hardware or virtual MFA device. The &lt;code&gt;TokenCode&lt;/code&gt; is the time-based one-time password (TOTP) that the MFA device produces. &lt;/p&gt;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sts.amazonaws.com");
    
    // Configure API key authorization: hmac
    ApiKeyAuth hmac = (ApiKeyAuth) defaultClient.getAuthentication("hmac");
    hmac.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //hmac.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String action = "AssumeRole"; // String | 
    String version = "2011-06-15"; // String | 
    String xAmzContentSha256 = "xAmzContentSha256_example"; // String | 
    String xAmzDate = "xAmzDate_example"; // String | 
    String xAmzAlgorithm = "xAmzAlgorithm_example"; // String | 
    String xAmzCredential = "xAmzCredential_example"; // String | 
    String xAmzSecurityToken = "xAmzSecurityToken_example"; // String | 
    String xAmzSignature = "xAmzSignature_example"; // String | 
    String xAmzSignedHeaders = "xAmzSignedHeaders_example"; // String | 
    AssumeRoleRequest assumeRoleRequest = new AssumeRoleRequest(); // AssumeRoleRequest | 
    try {
      AssumeRoleResponse result = apiInstance.pOSTAssumeRole(action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, assumeRoleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#pOSTAssumeRole");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **action** | **String**|  | [enum: AssumeRole] |
| **version** | **String**|  | [enum: 2011-06-15] |
| **xAmzContentSha256** | **String**|  | [optional] |
| **xAmzDate** | **String**|  | [optional] |
| **xAmzAlgorithm** | **String**|  | [optional] |
| **xAmzCredential** | **String**|  | [optional] |
| **xAmzSecurityToken** | **String**|  | [optional] |
| **xAmzSignature** | **String**|  | [optional] |
| **xAmzSignedHeaders** | **String**|  | [optional] |
| **assumeRoleRequest** | [**AssumeRoleRequest**](AssumeRoleRequest.md)|  | [optional] |

### Return type

[**AssumeRoleResponse**](AssumeRoleResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: text/xml
 - **Accept**: text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **480** | MalformedPolicyDocumentException |  -  |
| **481** | PackedPolicyTooLargeException |  -  |
| **482** | RegionDisabledException |  -  |
| **483** | ExpiredTokenException |  -  |

<a id="pOSTAssumeRoleWithSAML"></a>
# **pOSTAssumeRoleWithSAML**
> AssumeRoleWithSAMLResponse pOSTAssumeRoleWithSAML(action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, assumeRoleWithSAMLRequest)



&lt;p&gt;Returns a set of temporary security credentials for users who have been authenticated via a SAML authentication response. This operation provides a mechanism for tying an enterprise identity store or directory to role-based Amazon Web Services access without user-specific credentials or configuration. For a comparison of &lt;code&gt;AssumeRoleWithSAML&lt;/code&gt; with the other API operations that produce temporary credentials, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html\&quot;&gt;Requesting Temporary Security Credentials&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#stsapi_comparison\&quot;&gt;Comparing the Amazon Web Services STS API operations&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;The temporary security credentials returned by this operation consist of an access key ID, a secret access key, and a security token. Applications can use these temporary security credentials to sign calls to Amazon Web Services services.&lt;/p&gt; &lt;p&gt; &lt;b&gt;Session Duration&lt;/b&gt; &lt;/p&gt; &lt;p&gt;By default, the temporary security credentials created by &lt;code&gt;AssumeRoleWithSAML&lt;/code&gt; last for one hour. However, you can use the optional &lt;code&gt;DurationSeconds&lt;/code&gt; parameter to specify the duration of your session. Your role session lasts for the duration that you specify, or until the time specified in the SAML authentication response&#39;s &lt;code&gt;SessionNotOnOrAfter&lt;/code&gt; value, whichever is shorter. You can provide a &lt;code&gt;DurationSeconds&lt;/code&gt; value from 900 seconds (15 minutes) up to the maximum session duration setting for the role. This setting can have a value from 1 hour to 12 hours. To learn how to view the maximum value for your role, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session\&quot;&gt;View the Maximum Session Duration Setting for a Role&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. The maximum session duration limit applies when you use the &lt;code&gt;AssumeRole*&lt;/code&gt; API operations or the &lt;code&gt;assume-role*&lt;/code&gt; CLI commands. However the limit does not apply when you use those operations to create a console URL. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html\&quot;&gt;Using IAM Roles&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt; &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html#iam-term-role-chaining\&quot;&gt;Role chaining&lt;/a&gt; limits your CLI or Amazon Web Services API role session to a maximum of one hour. When you use the &lt;code&gt;AssumeRole&lt;/code&gt; API operation to assume a role, you can specify the duration of your role session with the &lt;code&gt;DurationSeconds&lt;/code&gt; parameter. You can specify a parameter value of up to 43200 seconds (12 hours), depending on the maximum session duration setting for your role. However, if you assume a role using role chaining and provide a &lt;code&gt;DurationSeconds&lt;/code&gt; parameter value greater than one hour, the operation fails.&lt;/p&gt; &lt;/note&gt; &lt;p&gt; &lt;b&gt;Permissions&lt;/b&gt; &lt;/p&gt; &lt;p&gt;The temporary security credentials created by &lt;code&gt;AssumeRoleWithSAML&lt;/code&gt; can be used to make API calls to any Amazon Web Services service with the following exception: you cannot call the STS &lt;code&gt;GetFederationToken&lt;/code&gt; or &lt;code&gt;GetSessionToken&lt;/code&gt; API operations.&lt;/p&gt; &lt;p&gt;(Optional) You can pass inline or managed &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session\&quot;&gt;session policies&lt;/a&gt; to this operation. You can pass a single JSON policy document to use as an inline session policy. You can also specify up to 10 managed policy Amazon Resource Names (ARNs) to use as managed session policies. The plaintext that you use for both inline and managed session policies can&#39;t exceed 2,048 characters. Passing policies to this operation returns new temporary credentials. The resulting session&#39;s permissions are the intersection of the role&#39;s identity-based policy and the session policies. You can use the role&#39;s temporary credentials in subsequent Amazon Web Services API calls to access resources in the account that owns the role. You cannot use session policies to grant more permissions than those allowed by the identity-based policy of the role that is being assumed. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session\&quot;&gt;Session Policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;Calling &lt;code&gt;AssumeRoleWithSAML&lt;/code&gt; does not require the use of Amazon Web Services security credentials. The identity of the caller is validated by using keys in the metadata document that is uploaded for the SAML provider entity for your identity provider. &lt;/p&gt; &lt;important&gt; &lt;p&gt;Calling &lt;code&gt;AssumeRoleWithSAML&lt;/code&gt; can result in an entry in your CloudTrail logs. The entry includes the value in the &lt;code&gt;NameID&lt;/code&gt; element of the SAML assertion. We recommend that you use a &lt;code&gt;NameIDType&lt;/code&gt; that is not associated with any personally identifiable information (PII). For example, you could instead use the persistent identifier (&lt;code&gt;urn:oasis:names:tc:SAML:2.0:nameid-format:persistent&lt;/code&gt;).&lt;/p&gt; &lt;/important&gt; &lt;p&gt; &lt;b&gt;Tags&lt;/b&gt; &lt;/p&gt; &lt;p&gt;(Optional) You can configure your IdP to pass attributes into your SAML assertion as session tags. Each session tag consists of a key name and an associated value. For more information about session tags, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html\&quot;&gt;Passing Session Tags in STS&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;You can pass up to 50 session tags. The plaintext session tag keys can’t exceed 128 characters and the values can’t exceed 256 characters. For these and additional limits, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length\&quot;&gt;IAM and STS Character Limits&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt;An Amazon Web Services conversion compresses the passed inline session policy, managed policy ARNs, and session tags into a packed binary format that has a separate limit. Your request can fail for this limit even if your plaintext meets the other requirements. The &lt;code&gt;PackedPolicySize&lt;/code&gt; response element indicates by percentage how close the policies and tags for your request are to the upper size limit.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;You can pass a session tag with the same key as a tag that is attached to the role. When you do, session tags override the role&#39;s tags with the same key.&lt;/p&gt; &lt;p&gt;An administrator must grant you the permissions necessary to pass session tags. The administrator can also create granular permissions to allow you to pass only specific session tags. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/tutorial_attribute-based-access-control.html\&quot;&gt;Tutorial: Using Tags for Attribute-Based Access Control&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;You can set the session tags as transitive. Transitive tags persist during role chaining. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html#id_session-tags_role-chaining\&quot;&gt;Chaining Roles with Session Tags&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt; &lt;b&gt;SAML Configuration&lt;/b&gt; &lt;/p&gt; &lt;p&gt;Before your application can call &lt;code&gt;AssumeRoleWithSAML&lt;/code&gt;, you must configure your SAML identity provider (IdP) to issue the claims required by Amazon Web Services. Additionally, you must use Identity and Access Management (IAM) to create a SAML provider entity in your Amazon Web Services account that represents your identity provider. You must also create an IAM role that specifies this SAML provider in its trust policy. &lt;/p&gt; &lt;p&gt;For more information, see the following resources:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html\&quot;&gt;About SAML 2.0-based Federation&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_create_saml.html\&quot;&gt;Creating SAML Identity Providers&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_create_saml_relying-party.html\&quot;&gt;Configuring a Relying Party and Claims&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-idp_saml.html\&quot;&gt;Creating a Role for SAML 2.0 Federation&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sts.amazonaws.com");
    
    // Configure API key authorization: hmac
    ApiKeyAuth hmac = (ApiKeyAuth) defaultClient.getAuthentication("hmac");
    hmac.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //hmac.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String action = "AssumeRoleWithSAML"; // String | 
    String version = "2011-06-15"; // String | 
    String xAmzContentSha256 = "xAmzContentSha256_example"; // String | 
    String xAmzDate = "xAmzDate_example"; // String | 
    String xAmzAlgorithm = "xAmzAlgorithm_example"; // String | 
    String xAmzCredential = "xAmzCredential_example"; // String | 
    String xAmzSecurityToken = "xAmzSecurityToken_example"; // String | 
    String xAmzSignature = "xAmzSignature_example"; // String | 
    String xAmzSignedHeaders = "xAmzSignedHeaders_example"; // String | 
    AssumeRoleWithSAMLRequest assumeRoleWithSAMLRequest = new AssumeRoleWithSAMLRequest(); // AssumeRoleWithSAMLRequest | 
    try {
      AssumeRoleWithSAMLResponse result = apiInstance.pOSTAssumeRoleWithSAML(action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, assumeRoleWithSAMLRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#pOSTAssumeRoleWithSAML");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **action** | **String**|  | [enum: AssumeRoleWithSAML] |
| **version** | **String**|  | [enum: 2011-06-15] |
| **xAmzContentSha256** | **String**|  | [optional] |
| **xAmzDate** | **String**|  | [optional] |
| **xAmzAlgorithm** | **String**|  | [optional] |
| **xAmzCredential** | **String**|  | [optional] |
| **xAmzSecurityToken** | **String**|  | [optional] |
| **xAmzSignature** | **String**|  | [optional] |
| **xAmzSignedHeaders** | **String**|  | [optional] |
| **assumeRoleWithSAMLRequest** | [**AssumeRoleWithSAMLRequest**](AssumeRoleWithSAMLRequest.md)|  | [optional] |

### Return type

[**AssumeRoleWithSAMLResponse**](AssumeRoleWithSAMLResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: text/xml
 - **Accept**: text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **480** | MalformedPolicyDocumentException |  -  |
| **481** | PackedPolicyTooLargeException |  -  |
| **482** | IDPRejectedClaimException |  -  |
| **483** | InvalidIdentityTokenException |  -  |
| **484** | ExpiredTokenException |  -  |
| **485** | RegionDisabledException |  -  |

<a id="pOSTAssumeRoleWithWebIdentity"></a>
# **pOSTAssumeRoleWithWebIdentity**
> AssumeRoleWithWebIdentityResponse pOSTAssumeRoleWithWebIdentity(action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, assumeRoleWithWebIdentityRequest)



&lt;p&gt;Returns a set of temporary security credentials for users who have been authenticated in a mobile or web application with a web identity provider. Example providers include the OAuth 2.0 providers Login with Amazon and Facebook, or any OpenID Connect-compatible identity provider such as Google or &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-identity.html\&quot;&gt;Amazon Cognito federated identities&lt;/a&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt;For mobile applications, we recommend that you use Amazon Cognito. You can use Amazon Cognito with the &lt;a href&#x3D;\&quot;http://aws.amazon.com/sdkforios/\&quot;&gt;Amazon Web Services SDK for iOS Developer Guide&lt;/a&gt; and the &lt;a href&#x3D;\&quot;http://aws.amazon.com/sdkforandroid/\&quot;&gt;Amazon Web Services SDK for Android Developer Guide&lt;/a&gt; to uniquely identify a user. You can also supply the user with a consistent identity throughout the lifetime of an application.&lt;/p&gt; &lt;p&gt;To learn more about Amazon Cognito, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/mobile/sdkforandroid/developerguide/cognito-auth.html#d0e840\&quot;&gt;Amazon Cognito Overview&lt;/a&gt; in &lt;i&gt;Amazon Web Services SDK for Android Developer Guide&lt;/i&gt; and &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/mobile/sdkforios/developerguide/cognito-auth.html#d0e664\&quot;&gt;Amazon Cognito Overview&lt;/a&gt; in the &lt;i&gt;Amazon Web Services SDK for iOS Developer Guide&lt;/i&gt;.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;Calling &lt;code&gt;AssumeRoleWithWebIdentity&lt;/code&gt; does not require the use of Amazon Web Services security credentials. Therefore, you can distribute an application (for example, on mobile devices) that requests temporary security credentials without including long-term Amazon Web Services credentials in the application. You also don&#39;t need to deploy server-based proxy services that use long-term Amazon Web Services credentials. Instead, the identity of the caller is validated by using a token from the web identity provider. For a comparison of &lt;code&gt;AssumeRoleWithWebIdentity&lt;/code&gt; with the other API operations that produce temporary credentials, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html\&quot;&gt;Requesting Temporary Security Credentials&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#stsapi_comparison\&quot;&gt;Comparing the Amazon Web Services STS API operations&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;The temporary security credentials returned by this API consist of an access key ID, a secret access key, and a security token. Applications can use these temporary security credentials to sign calls to Amazon Web Services service API operations.&lt;/p&gt; &lt;p&gt; &lt;b&gt;Session Duration&lt;/b&gt; &lt;/p&gt; &lt;p&gt;By default, the temporary security credentials created by &lt;code&gt;AssumeRoleWithWebIdentity&lt;/code&gt; last for one hour. However, you can use the optional &lt;code&gt;DurationSeconds&lt;/code&gt; parameter to specify the duration of your session. You can provide a value from 900 seconds (15 minutes) up to the maximum session duration setting for the role. This setting can have a value from 1 hour to 12 hours. To learn how to view the maximum value for your role, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session\&quot;&gt;View the Maximum Session Duration Setting for a Role&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. The maximum session duration limit applies when you use the &lt;code&gt;AssumeRole*&lt;/code&gt; API operations or the &lt;code&gt;assume-role*&lt;/code&gt; CLI commands. However the limit does not apply when you use those operations to create a console URL. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html\&quot;&gt;Using IAM Roles&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. &lt;/p&gt; &lt;p&gt; &lt;b&gt;Permissions&lt;/b&gt; &lt;/p&gt; &lt;p&gt;The temporary security credentials created by &lt;code&gt;AssumeRoleWithWebIdentity&lt;/code&gt; can be used to make API calls to any Amazon Web Services service with the following exception: you cannot call the STS &lt;code&gt;GetFederationToken&lt;/code&gt; or &lt;code&gt;GetSessionToken&lt;/code&gt; API operations.&lt;/p&gt; &lt;p&gt;(Optional) You can pass inline or managed &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session\&quot;&gt;session policies&lt;/a&gt; to this operation. You can pass a single JSON policy document to use as an inline session policy. You can also specify up to 10 managed policy Amazon Resource Names (ARNs) to use as managed session policies. The plaintext that you use for both inline and managed session policies can&#39;t exceed 2,048 characters. Passing policies to this operation returns new temporary credentials. The resulting session&#39;s permissions are the intersection of the role&#39;s identity-based policy and the session policies. You can use the role&#39;s temporary credentials in subsequent Amazon Web Services API calls to access resources in the account that owns the role. You cannot use session policies to grant more permissions than those allowed by the identity-based policy of the role that is being assumed. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session\&quot;&gt;Session Policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt; &lt;b&gt;Tags&lt;/b&gt; &lt;/p&gt; &lt;p&gt;(Optional) You can configure your IdP to pass attributes into your web identity token as session tags. Each session tag consists of a key name and an associated value. For more information about session tags, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html\&quot;&gt;Passing Session Tags in STS&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;You can pass up to 50 session tags. The plaintext session tag keys can’t exceed 128 characters and the values can’t exceed 256 characters. For these and additional limits, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length\&quot;&gt;IAM and STS Character Limits&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt;An Amazon Web Services conversion compresses the passed inline session policy, managed policy ARNs, and session tags into a packed binary format that has a separate limit. Your request can fail for this limit even if your plaintext meets the other requirements. The &lt;code&gt;PackedPolicySize&lt;/code&gt; response element indicates by percentage how close the policies and tags for your request are to the upper size limit.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;You can pass a session tag with the same key as a tag that is attached to the role. When you do, the session tag overrides the role tag with the same key.&lt;/p&gt; &lt;p&gt;An administrator must grant you the permissions necessary to pass session tags. The administrator can also create granular permissions to allow you to pass only specific session tags. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/tutorial_attribute-based-access-control.html\&quot;&gt;Tutorial: Using Tags for Attribute-Based Access Control&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;You can set the session tags as transitive. Transitive tags persist during role chaining. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html#id_session-tags_role-chaining\&quot;&gt;Chaining Roles with Session Tags&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt; &lt;b&gt;Identities&lt;/b&gt; &lt;/p&gt; &lt;p&gt;Before your application can call &lt;code&gt;AssumeRoleWithWebIdentity&lt;/code&gt;, you must have an identity token from a supported identity provider and create a role that the application can assume. The role that your application assumes must trust the identity provider that is associated with the identity token. In other words, the identity provider must be specified in the role&#39;s trust policy. &lt;/p&gt; &lt;important&gt; &lt;p&gt;Calling &lt;code&gt;AssumeRoleWithWebIdentity&lt;/code&gt; can result in an entry in your CloudTrail logs. The entry includes the &lt;a href&#x3D;\&quot;http://openid.net/specs/openid-connect-core-1_0.html#Claims\&quot;&gt;Subject&lt;/a&gt; of the provided web identity token. We recommend that you avoid using any personally identifiable information (PII) in this field. For example, you could instead use a GUID or a pairwise identifier, as &lt;a href&#x3D;\&quot;http://openid.net/specs/openid-connect-core-1_0.html#SubjectIDTypes\&quot;&gt;suggested in the OIDC specification&lt;/a&gt;.&lt;/p&gt; &lt;/important&gt; &lt;p&gt;For more information about how to use web identity federation and the &lt;code&gt;AssumeRoleWithWebIdentity&lt;/code&gt; API, see the following resources: &lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_oidc_manual.html\&quot;&gt;Using Web Identity Federation API Operations for Mobile Apps&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#api_assumerolewithwebidentity\&quot;&gt;Federation Through a Web-based Identity Provider&lt;/a&gt;. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;a href&#x3D;\&quot;https://aws.amazon.com/blogs/aws/the-aws-web-identity-federation-playground/\&quot;&gt; Web Identity Federation Playground&lt;/a&gt;. Walk through the process of authenticating through Login with Amazon, Facebook, or Google, getting temporary security credentials, and then using those credentials to make a request to Amazon Web Services. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;a href&#x3D;\&quot;http://aws.amazon.com/sdkforios/\&quot;&gt;Amazon Web Services SDK for iOS Developer Guide&lt;/a&gt; and &lt;a href&#x3D;\&quot;http://aws.amazon.com/sdkforandroid/\&quot;&gt;Amazon Web Services SDK for Android Developer Guide&lt;/a&gt;. These toolkits contain sample apps that show how to invoke the identity providers. The toolkits then show how to use the information from these providers to get and use temporary security credentials. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;a href&#x3D;\&quot;http://aws.amazon.com/articles/web-identity-federation-with-mobile-applications\&quot;&gt;Web Identity Federation with Mobile Applications&lt;/a&gt;. This article discusses web identity federation and shows an example of how to use web identity federation to get access to content in Amazon S3. &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sts.amazonaws.com");
    
    // Configure API key authorization: hmac
    ApiKeyAuth hmac = (ApiKeyAuth) defaultClient.getAuthentication("hmac");
    hmac.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //hmac.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String action = "AssumeRoleWithWebIdentity"; // String | 
    String version = "2011-06-15"; // String | 
    String xAmzContentSha256 = "xAmzContentSha256_example"; // String | 
    String xAmzDate = "xAmzDate_example"; // String | 
    String xAmzAlgorithm = "xAmzAlgorithm_example"; // String | 
    String xAmzCredential = "xAmzCredential_example"; // String | 
    String xAmzSecurityToken = "xAmzSecurityToken_example"; // String | 
    String xAmzSignature = "xAmzSignature_example"; // String | 
    String xAmzSignedHeaders = "xAmzSignedHeaders_example"; // String | 
    AssumeRoleWithWebIdentityRequest assumeRoleWithWebIdentityRequest = new AssumeRoleWithWebIdentityRequest(); // AssumeRoleWithWebIdentityRequest | 
    try {
      AssumeRoleWithWebIdentityResponse result = apiInstance.pOSTAssumeRoleWithWebIdentity(action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, assumeRoleWithWebIdentityRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#pOSTAssumeRoleWithWebIdentity");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **action** | **String**|  | [enum: AssumeRoleWithWebIdentity] |
| **version** | **String**|  | [enum: 2011-06-15] |
| **xAmzContentSha256** | **String**|  | [optional] |
| **xAmzDate** | **String**|  | [optional] |
| **xAmzAlgorithm** | **String**|  | [optional] |
| **xAmzCredential** | **String**|  | [optional] |
| **xAmzSecurityToken** | **String**|  | [optional] |
| **xAmzSignature** | **String**|  | [optional] |
| **xAmzSignedHeaders** | **String**|  | [optional] |
| **assumeRoleWithWebIdentityRequest** | [**AssumeRoleWithWebIdentityRequest**](AssumeRoleWithWebIdentityRequest.md)|  | [optional] |

### Return type

[**AssumeRoleWithWebIdentityResponse**](AssumeRoleWithWebIdentityResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: text/xml
 - **Accept**: text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **480** | MalformedPolicyDocumentException |  -  |
| **481** | PackedPolicyTooLargeException |  -  |
| **482** | IDPRejectedClaimException |  -  |
| **483** | IDPCommunicationErrorException |  -  |
| **484** | InvalidIdentityTokenException |  -  |
| **485** | ExpiredTokenException |  -  |
| **486** | RegionDisabledException |  -  |

<a id="pOSTDecodeAuthorizationMessage"></a>
# **pOSTDecodeAuthorizationMessage**
> DecodeAuthorizationMessageResponse pOSTDecodeAuthorizationMessage(action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, decodeAuthorizationMessageRequest)



&lt;p&gt;Decodes additional information about the authorization status of a request from an encoded message returned in response to an Amazon Web Services request.&lt;/p&gt; &lt;p&gt;For example, if a user is not authorized to perform an operation that he or she has requested, the request returns a &lt;code&gt;Client.UnauthorizedOperation&lt;/code&gt; response (an HTTP 403 response). Some Amazon Web Services operations additionally return an encoded message that can provide details about this authorization failure. &lt;/p&gt; &lt;note&gt; &lt;p&gt;Only certain Amazon Web Services operations return an encoded authorization message. The documentation for an individual operation indicates whether that operation returns an encoded message in addition to returning an HTTP code.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;The message is encoded because the details of the authorization status can contain privileged information that the user who requested the operation should not see. To decode an authorization status message, a user must be granted permissions through an IAM &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html\&quot;&gt;policy&lt;/a&gt; to request the &lt;code&gt;DecodeAuthorizationMessage&lt;/code&gt; (&lt;code&gt;sts:DecodeAuthorizationMessage&lt;/code&gt;) action. &lt;/p&gt; &lt;p&gt;The decoded message includes the following type of information:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;Whether the request was denied due to an explicit deny or due to the absence of an explicit allow. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html#policy-eval-denyallow\&quot;&gt;Determining Whether a Request is Allowed or Denied&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The principal who made the request.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The requested action.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The requested resource.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The values of condition keys in the context of the user&#39;s request.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sts.amazonaws.com");
    
    // Configure API key authorization: hmac
    ApiKeyAuth hmac = (ApiKeyAuth) defaultClient.getAuthentication("hmac");
    hmac.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //hmac.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String action = "DecodeAuthorizationMessage"; // String | 
    String version = "2011-06-15"; // String | 
    String xAmzContentSha256 = "xAmzContentSha256_example"; // String | 
    String xAmzDate = "xAmzDate_example"; // String | 
    String xAmzAlgorithm = "xAmzAlgorithm_example"; // String | 
    String xAmzCredential = "xAmzCredential_example"; // String | 
    String xAmzSecurityToken = "xAmzSecurityToken_example"; // String | 
    String xAmzSignature = "xAmzSignature_example"; // String | 
    String xAmzSignedHeaders = "xAmzSignedHeaders_example"; // String | 
    DecodeAuthorizationMessageRequest decodeAuthorizationMessageRequest = new DecodeAuthorizationMessageRequest(); // DecodeAuthorizationMessageRequest | 
    try {
      DecodeAuthorizationMessageResponse result = apiInstance.pOSTDecodeAuthorizationMessage(action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, decodeAuthorizationMessageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#pOSTDecodeAuthorizationMessage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **action** | **String**|  | [enum: DecodeAuthorizationMessage] |
| **version** | **String**|  | [enum: 2011-06-15] |
| **xAmzContentSha256** | **String**|  | [optional] |
| **xAmzDate** | **String**|  | [optional] |
| **xAmzAlgorithm** | **String**|  | [optional] |
| **xAmzCredential** | **String**|  | [optional] |
| **xAmzSecurityToken** | **String**|  | [optional] |
| **xAmzSignature** | **String**|  | [optional] |
| **xAmzSignedHeaders** | **String**|  | [optional] |
| **decodeAuthorizationMessageRequest** | [**DecodeAuthorizationMessageRequest**](DecodeAuthorizationMessageRequest.md)|  | [optional] |

### Return type

[**DecodeAuthorizationMessageResponse**](DecodeAuthorizationMessageResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: text/xml
 - **Accept**: text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **480** | InvalidAuthorizationMessageException |  -  |

<a id="pOSTGetAccessKeyInfo"></a>
# **pOSTGetAccessKeyInfo**
> GetAccessKeyInfoResponse pOSTGetAccessKeyInfo(action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, getAccessKeyInfoRequest)



&lt;p&gt;Returns the account identifier for the specified access key ID.&lt;/p&gt; &lt;p&gt;Access keys consist of two parts: an access key ID (for example, &lt;code&gt;AKIAIOSFODNN7EXAMPLE&lt;/code&gt;) and a secret access key (for example, &lt;code&gt;wJalrXUtnFEMI/K7MDENG/bPxRfiCYEXAMPLEKEY&lt;/code&gt;). For more information about access keys, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_access-keys.html\&quot;&gt;Managing Access Keys for IAM Users&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;When you pass an access key ID to this operation, it returns the ID of the Amazon Web Services account to which the keys belong. Access key IDs beginning with &lt;code&gt;AKIA&lt;/code&gt; are long-term credentials for an IAM user or the Amazon Web Services account root user. Access key IDs beginning with &lt;code&gt;ASIA&lt;/code&gt; are temporary credentials that are created using STS operations. If the account in the response belongs to you, you can sign in as the root user and review your root user access keys. Then, you can pull a &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_getting-report.html\&quot;&gt;credentials report&lt;/a&gt; to learn which IAM user owns the keys. To learn who requested the temporary credentials for an &lt;code&gt;ASIA&lt;/code&gt; access key, view the STS events in your &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/cloudtrail-integration.html\&quot;&gt;CloudTrail logs&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;This operation does not indicate the state of the access key. The key might be active, inactive, or deleted. Active keys might not have permissions to perform an operation. Providing a deleted access key might return an error that the key doesn&#39;t exist.&lt;/p&gt;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sts.amazonaws.com");
    
    // Configure API key authorization: hmac
    ApiKeyAuth hmac = (ApiKeyAuth) defaultClient.getAuthentication("hmac");
    hmac.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //hmac.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String action = "GetAccessKeyInfo"; // String | 
    String version = "2011-06-15"; // String | 
    String xAmzContentSha256 = "xAmzContentSha256_example"; // String | 
    String xAmzDate = "xAmzDate_example"; // String | 
    String xAmzAlgorithm = "xAmzAlgorithm_example"; // String | 
    String xAmzCredential = "xAmzCredential_example"; // String | 
    String xAmzSecurityToken = "xAmzSecurityToken_example"; // String | 
    String xAmzSignature = "xAmzSignature_example"; // String | 
    String xAmzSignedHeaders = "xAmzSignedHeaders_example"; // String | 
    GetAccessKeyInfoRequest getAccessKeyInfoRequest = new GetAccessKeyInfoRequest(); // GetAccessKeyInfoRequest | 
    try {
      GetAccessKeyInfoResponse result = apiInstance.pOSTGetAccessKeyInfo(action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, getAccessKeyInfoRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#pOSTGetAccessKeyInfo");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **action** | **String**|  | [enum: GetAccessKeyInfo] |
| **version** | **String**|  | [enum: 2011-06-15] |
| **xAmzContentSha256** | **String**|  | [optional] |
| **xAmzDate** | **String**|  | [optional] |
| **xAmzAlgorithm** | **String**|  | [optional] |
| **xAmzCredential** | **String**|  | [optional] |
| **xAmzSecurityToken** | **String**|  | [optional] |
| **xAmzSignature** | **String**|  | [optional] |
| **xAmzSignedHeaders** | **String**|  | [optional] |
| **getAccessKeyInfoRequest** | [**GetAccessKeyInfoRequest**](GetAccessKeyInfoRequest.md)|  | [optional] |

### Return type

[**GetAccessKeyInfoResponse**](GetAccessKeyInfoResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: text/xml
 - **Accept**: text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="pOSTGetCallerIdentity"></a>
# **pOSTGetCallerIdentity**
> GetCallerIdentityResponse pOSTGetCallerIdentity(action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, body)



&lt;p&gt;Returns details about the IAM user or role whose credentials are used to call the operation.&lt;/p&gt; &lt;note&gt; &lt;p&gt;No permissions are required to perform this operation. If an administrator adds a policy to your IAM user or role that explicitly denies access to the &lt;code&gt;sts:GetCallerIdentity&lt;/code&gt; action, you can still perform this operation. Permissions are not required because the same information is returned when an IAM user or role is denied access. To view an example response, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_access-denied-delete-mfa\&quot;&gt;I Am Not Authorized to Perform: iam:DeleteVirtualMFADevice&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/note&gt;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sts.amazonaws.com");
    
    // Configure API key authorization: hmac
    ApiKeyAuth hmac = (ApiKeyAuth) defaultClient.getAuthentication("hmac");
    hmac.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //hmac.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String action = "GetCallerIdentity"; // String | 
    String version = "2011-06-15"; // String | 
    String xAmzContentSha256 = "xAmzContentSha256_example"; // String | 
    String xAmzDate = "xAmzDate_example"; // String | 
    String xAmzAlgorithm = "xAmzAlgorithm_example"; // String | 
    String xAmzCredential = "xAmzCredential_example"; // String | 
    String xAmzSecurityToken = "xAmzSecurityToken_example"; // String | 
    String xAmzSignature = "xAmzSignature_example"; // String | 
    String xAmzSignedHeaders = "xAmzSignedHeaders_example"; // String | 
    Object body = null; // Object | 
    try {
      GetCallerIdentityResponse result = apiInstance.pOSTGetCallerIdentity(action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#pOSTGetCallerIdentity");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **action** | **String**|  | [enum: GetCallerIdentity] |
| **version** | **String**|  | [enum: 2011-06-15] |
| **xAmzContentSha256** | **String**|  | [optional] |
| **xAmzDate** | **String**|  | [optional] |
| **xAmzAlgorithm** | **String**|  | [optional] |
| **xAmzCredential** | **String**|  | [optional] |
| **xAmzSecurityToken** | **String**|  | [optional] |
| **xAmzSignature** | **String**|  | [optional] |
| **xAmzSignedHeaders** | **String**|  | [optional] |
| **body** | **Object**|  | [optional] |

### Return type

[**GetCallerIdentityResponse**](GetCallerIdentityResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: text/xml
 - **Accept**: text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="pOSTGetFederationToken"></a>
# **pOSTGetFederationToken**
> GetFederationTokenResponse pOSTGetFederationToken(action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, getFederationTokenRequest)



&lt;p&gt;Returns a set of temporary security credentials (consisting of an access key ID, a secret access key, and a security token) for a federated user. A typical use is in a proxy application that gets temporary security credentials on behalf of distributed applications inside a corporate network. You must call the &lt;code&gt;GetFederationToken&lt;/code&gt; operation using the long-term security credentials of an IAM user. As a result, this call is appropriate in contexts where those credentials can be safely stored, usually in a server-based application. For a comparison of &lt;code&gt;GetFederationToken&lt;/code&gt; with the other API operations that produce temporary credentials, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html\&quot;&gt;Requesting Temporary Security Credentials&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#stsapi_comparison\&quot;&gt;Comparing the Amazon Web Services STS API operations&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt;You can create a mobile-based or browser-based app that can authenticate users using a web identity provider like Login with Amazon, Facebook, Google, or an OpenID Connect-compatible identity provider. In this case, we recommend that you use &lt;a href&#x3D;\&quot;http://aws.amazon.com/cognito/\&quot;&gt;Amazon Cognito&lt;/a&gt; or &lt;code&gt;AssumeRoleWithWebIdentity&lt;/code&gt;. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#api_assumerolewithwebidentity\&quot;&gt;Federation Through a Web-based Identity Provider&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;You can also call &lt;code&gt;GetFederationToken&lt;/code&gt; using the security credentials of an Amazon Web Services account root user, but we do not recommend it. Instead, we recommend that you create an IAM user for the purpose of the proxy application. Then attach a policy to the IAM user that limits federated users to only the actions and resources that they need to access. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/best-practices.html\&quot;&gt;IAM Best Practices&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. &lt;/p&gt; &lt;p&gt; &lt;b&gt;Session duration&lt;/b&gt; &lt;/p&gt; &lt;p&gt;The temporary credentials are valid for the specified duration, from 900 seconds (15 minutes) up to a maximum of 129,600 seconds (36 hours). The default session duration is 43,200 seconds (12 hours). Temporary credentials obtained by using the Amazon Web Services account root user credentials have a maximum duration of 3,600 seconds (1 hour).&lt;/p&gt; &lt;p&gt; &lt;b&gt;Permissions&lt;/b&gt; &lt;/p&gt; &lt;p&gt;You can use the temporary credentials created by &lt;code&gt;GetFederationToken&lt;/code&gt; in any Amazon Web Services service with the following exceptions:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;You cannot call any IAM operations using the CLI or the Amazon Web Services API. This limitation does not apply to console sessions.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;You cannot call any STS operations except &lt;code&gt;GetCallerIdentity&lt;/code&gt;.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;You can use temporary credentials for single sign-on (SSO) to the console.&lt;/p&gt; &lt;p&gt;You must pass an inline or managed &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session\&quot;&gt;session policy&lt;/a&gt; to this operation. You can pass a single JSON policy document to use as an inline session policy. You can also specify up to 10 managed policy Amazon Resource Names (ARNs) to use as managed session policies. The plaintext that you use for both inline and managed session policies can&#39;t exceed 2,048 characters.&lt;/p&gt; &lt;p&gt;Though the session policy parameters are optional, if you do not pass a policy, then the resulting federated user session has no permissions. When you pass session policies, the session permissions are the intersection of the IAM user policies and the session policies that you pass. This gives you a way to further restrict the permissions for a federated user. You cannot use session policies to grant more permissions than those that are defined in the permissions policy of the IAM user. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session\&quot;&gt;Session Policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. For information about using &lt;code&gt;GetFederationToken&lt;/code&gt; to create temporary security credentials, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#api_getfederationtoken\&quot;&gt;GetFederationToken—Federation Through a Custom Identity Broker&lt;/a&gt;. &lt;/p&gt; &lt;p&gt;You can use the credentials to access a resource that has a resource-based policy. If that policy specifically references the federated user session in the &lt;code&gt;Principal&lt;/code&gt; element of the policy, the session has the permissions allowed by the policy. These permissions are granted in addition to the permissions granted by the session policies.&lt;/p&gt; &lt;p&gt; &lt;b&gt;Tags&lt;/b&gt; &lt;/p&gt; &lt;p&gt;(Optional) You can pass tag key-value pairs to your session. These are called session tags. For more information about session tags, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html\&quot;&gt;Passing Session Tags in STS&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt;You can create a mobile-based or browser-based app that can authenticate users using a web identity provider like Login with Amazon, Facebook, Google, or an OpenID Connect-compatible identity provider. In this case, we recommend that you use &lt;a href&#x3D;\&quot;http://aws.amazon.com/cognito/\&quot;&gt;Amazon Cognito&lt;/a&gt; or &lt;code&gt;AssumeRoleWithWebIdentity&lt;/code&gt;. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#api_assumerolewithwebidentity\&quot;&gt;Federation Through a Web-based Identity Provider&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;An administrator must grant you the permissions necessary to pass session tags. The administrator can also create granular permissions to allow you to pass only specific session tags. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/tutorial_attribute-based-access-control.html\&quot;&gt;Tutorial: Using Tags for Attribute-Based Access Control&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;Tag key–value pairs are not case sensitive, but case is preserved. This means that you cannot have separate &lt;code&gt;Department&lt;/code&gt; and &lt;code&gt;department&lt;/code&gt; tag keys. Assume that the user that you are federating has the &lt;code&gt;Department&lt;/code&gt;&#x3D;&lt;code&gt;Marketing&lt;/code&gt; tag and you pass the &lt;code&gt;department&lt;/code&gt;&#x3D;&lt;code&gt;engineering&lt;/code&gt; session tag. &lt;code&gt;Department&lt;/code&gt; and &lt;code&gt;department&lt;/code&gt; are not saved as separate tags, and the session tag passed in the request takes precedence over the user tag.&lt;/p&gt;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sts.amazonaws.com");
    
    // Configure API key authorization: hmac
    ApiKeyAuth hmac = (ApiKeyAuth) defaultClient.getAuthentication("hmac");
    hmac.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //hmac.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String action = "GetFederationToken"; // String | 
    String version = "2011-06-15"; // String | 
    String xAmzContentSha256 = "xAmzContentSha256_example"; // String | 
    String xAmzDate = "xAmzDate_example"; // String | 
    String xAmzAlgorithm = "xAmzAlgorithm_example"; // String | 
    String xAmzCredential = "xAmzCredential_example"; // String | 
    String xAmzSecurityToken = "xAmzSecurityToken_example"; // String | 
    String xAmzSignature = "xAmzSignature_example"; // String | 
    String xAmzSignedHeaders = "xAmzSignedHeaders_example"; // String | 
    GetFederationTokenRequest getFederationTokenRequest = new GetFederationTokenRequest(); // GetFederationTokenRequest | 
    try {
      GetFederationTokenResponse result = apiInstance.pOSTGetFederationToken(action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, getFederationTokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#pOSTGetFederationToken");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **action** | **String**|  | [enum: GetFederationToken] |
| **version** | **String**|  | [enum: 2011-06-15] |
| **xAmzContentSha256** | **String**|  | [optional] |
| **xAmzDate** | **String**|  | [optional] |
| **xAmzAlgorithm** | **String**|  | [optional] |
| **xAmzCredential** | **String**|  | [optional] |
| **xAmzSecurityToken** | **String**|  | [optional] |
| **xAmzSignature** | **String**|  | [optional] |
| **xAmzSignedHeaders** | **String**|  | [optional] |
| **getFederationTokenRequest** | [**GetFederationTokenRequest**](GetFederationTokenRequest.md)|  | [optional] |

### Return type

[**GetFederationTokenResponse**](GetFederationTokenResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: text/xml
 - **Accept**: text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **480** | MalformedPolicyDocumentException |  -  |
| **481** | PackedPolicyTooLargeException |  -  |
| **482** | RegionDisabledException |  -  |

<a id="pOSTGetSessionToken"></a>
# **pOSTGetSessionToken**
> GetSessionTokenResponse pOSTGetSessionToken(action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, getSessionTokenRequest)



&lt;p&gt;Returns a set of temporary credentials for an Amazon Web Services account or IAM user. The credentials consist of an access key ID, a secret access key, and a security token. Typically, you use &lt;code&gt;GetSessionToken&lt;/code&gt; if you want to use MFA to protect programmatic calls to specific Amazon Web Services API operations like Amazon EC2 &lt;code&gt;StopInstances&lt;/code&gt;. MFA-enabled IAM users would need to call &lt;code&gt;GetSessionToken&lt;/code&gt; and submit an MFA code that is associated with their MFA device. Using the temporary security credentials that are returned from the call, IAM users can then make programmatic calls to API operations that require MFA authentication. If you do not supply a correct MFA code, then the API returns an access denied error. For a comparison of &lt;code&gt;GetSessionToken&lt;/code&gt; with the other API operations that produce temporary credentials, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html\&quot;&gt;Requesting Temporary Security Credentials&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#stsapi_comparison\&quot;&gt;Comparing the Amazon Web Services STS API operations&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt;No permissions are required for users to perform this operation. The purpose of the &lt;code&gt;sts:GetSessionToken&lt;/code&gt; operation is to authenticate the user using MFA. You cannot use policies to control authentication operations. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_getsessiontoken.html\&quot;&gt;Permissions for GetSessionToken&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/note&gt; &lt;p&gt; &lt;b&gt;Session Duration&lt;/b&gt; &lt;/p&gt; &lt;p&gt;The &lt;code&gt;GetSessionToken&lt;/code&gt; operation must be called by using the long-term Amazon Web Services security credentials of the Amazon Web Services account root user or an IAM user. Credentials that are created by IAM users are valid for the duration that you specify. This duration can range from 900 seconds (15 minutes) up to a maximum of 129,600 seconds (36 hours), with a default of 43,200 seconds (12 hours). Credentials based on account credentials can range from 900 seconds (15 minutes) up to 3,600 seconds (1 hour), with a default of 1 hour. &lt;/p&gt; &lt;p&gt; &lt;b&gt;Permissions&lt;/b&gt; &lt;/p&gt; &lt;p&gt;The temporary security credentials created by &lt;code&gt;GetSessionToken&lt;/code&gt; can be used to make API calls to any Amazon Web Services service with the following exceptions:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;You cannot call any IAM API operations unless MFA authentication information is included in the request.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;You cannot call any STS API &lt;i&gt;except&lt;/i&gt; &lt;code&gt;AssumeRole&lt;/code&gt; or &lt;code&gt;GetCallerIdentity&lt;/code&gt;.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;note&gt; &lt;p&gt;We recommend that you do not call &lt;code&gt;GetSessionToken&lt;/code&gt; with Amazon Web Services account root user credentials. Instead, follow our &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/best-practices.html#create-iam-users\&quot;&gt;best practices&lt;/a&gt; by creating one or more IAM users, giving them the necessary permissions, and using IAM users for everyday interaction with Amazon Web Services. &lt;/p&gt; &lt;/note&gt; &lt;p&gt;The credentials that are returned by &lt;code&gt;GetSessionToken&lt;/code&gt; are based on permissions associated with the user whose credentials were used to call the operation. If &lt;code&gt;GetSessionToken&lt;/code&gt; is called using Amazon Web Services account root user credentials, the temporary credentials have root user permissions. Similarly, if &lt;code&gt;GetSessionToken&lt;/code&gt; is called using the credentials of an IAM user, the temporary credentials have the same permissions as the IAM user. &lt;/p&gt; &lt;p&gt;For more information about using &lt;code&gt;GetSessionToken&lt;/code&gt; to create temporary credentials, go to &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#api_getsessiontoken\&quot;&gt;Temporary Credentials for Users in Untrusted Environments&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. &lt;/p&gt;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sts.amazonaws.com");
    
    // Configure API key authorization: hmac
    ApiKeyAuth hmac = (ApiKeyAuth) defaultClient.getAuthentication("hmac");
    hmac.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //hmac.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String action = "GetSessionToken"; // String | 
    String version = "2011-06-15"; // String | 
    String xAmzContentSha256 = "xAmzContentSha256_example"; // String | 
    String xAmzDate = "xAmzDate_example"; // String | 
    String xAmzAlgorithm = "xAmzAlgorithm_example"; // String | 
    String xAmzCredential = "xAmzCredential_example"; // String | 
    String xAmzSecurityToken = "xAmzSecurityToken_example"; // String | 
    String xAmzSignature = "xAmzSignature_example"; // String | 
    String xAmzSignedHeaders = "xAmzSignedHeaders_example"; // String | 
    GetSessionTokenRequest getSessionTokenRequest = new GetSessionTokenRequest(); // GetSessionTokenRequest | 
    try {
      GetSessionTokenResponse result = apiInstance.pOSTGetSessionToken(action, version, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, getSessionTokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#pOSTGetSessionToken");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **action** | **String**|  | [enum: GetSessionToken] |
| **version** | **String**|  | [enum: 2011-06-15] |
| **xAmzContentSha256** | **String**|  | [optional] |
| **xAmzDate** | **String**|  | [optional] |
| **xAmzAlgorithm** | **String**|  | [optional] |
| **xAmzCredential** | **String**|  | [optional] |
| **xAmzSecurityToken** | **String**|  | [optional] |
| **xAmzSignature** | **String**|  | [optional] |
| **xAmzSignedHeaders** | **String**|  | [optional] |
| **getSessionTokenRequest** | [**GetSessionTokenRequest**](GetSessionTokenRequest.md)|  | [optional] |

### Return type

[**GetSessionTokenResponse**](GetSessionTokenResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: text/xml
 - **Accept**: text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **480** | RegionDisabledException |  -  |

