

# BatchUpdateFindingsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**findingIdentifiers** | [**List&lt;AwsSecurityFindingIdentifier&gt;**](AwsSecurityFindingIdentifier.md) | &lt;p&gt;The list of findings to update. &lt;code&gt;BatchUpdateFindings&lt;/code&gt; can be used to update up to 100 findings at a time.&lt;/p&gt; &lt;p&gt;For each finding, the list provides the finding identifier and the ARN of the finding provider.&lt;/p&gt; |  |
|**note** | [**BatchUpdateFindingsRequestNote**](BatchUpdateFindingsRequestNote.md) |  |  [optional] |
|**severity** | [**BatchUpdateFindingsRequestSeverity**](BatchUpdateFindingsRequestSeverity.md) |  |  [optional] |
|**verificationState** | [**VerificationStateEnum**](#VerificationStateEnum) | &lt;p&gt;Indicates the veracity of a finding.&lt;/p&gt; &lt;p&gt;The available values for &lt;code&gt;VerificationState&lt;/code&gt; are as follows.&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;UNKNOWN&lt;/code&gt; – The default disposition of a security finding&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;TRUE_POSITIVE&lt;/code&gt; – The security finding is confirmed&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;FALSE_POSITIVE&lt;/code&gt; – The security finding was determined to be a false alarm&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;BENIGN_POSITIVE&lt;/code&gt; – A special case of &lt;code&gt;TRUE_POSITIVE&lt;/code&gt; where the finding doesn&#39;t pose any threat, is expected, or both&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; |  [optional] |
|**confidence** | **Integer** | &lt;p&gt;The updated value for the finding confidence. Confidence is defined as the likelihood that a finding accurately identifies the behavior or issue that it was intended to identify.&lt;/p&gt; &lt;p&gt;Confidence is scored on a 0-100 basis using a ratio scale, where 0 means zero percent confidence and 100 means 100 percent confidence.&lt;/p&gt; |  [optional] |
|**criticality** | **Integer** | &lt;p&gt;The updated value for the level of importance assigned to the resources associated with the findings.&lt;/p&gt; &lt;p&gt;A score of 0 means that the underlying resources have no criticality, and a score of 100 is reserved for the most critical resources. &lt;/p&gt; |  [optional] |
|**types** | **List&lt;String&gt;** | &lt;p&gt;One or more finding types in the format of namespace/category/classifier that classify a finding.&lt;/p&gt; &lt;p&gt;Valid namespace values are as follows.&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;Software and Configuration Checks&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;TTPs&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Effects&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Unusual Behaviors&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Sensitive Data Identifications &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; |  [optional] |
|**userDefinedFields** | **Map&lt;String, String&gt;** | A list of name/value string pairs associated with the finding. These are custom, user-defined fields added to a finding. |  [optional] |
|**workflow** | [**BatchUpdateFindingsRequestWorkflow**](BatchUpdateFindingsRequestWorkflow.md) |  |  [optional] |
|**relatedFindings** | [**List&lt;RelatedFinding&gt;**](RelatedFinding.md) | A list of findings that are related to the updated findings. |  [optional] |



## Enum: VerificationStateEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;UNKNOWN&quot; |
| TRUE_POSITIVE | &quot;TRUE_POSITIVE&quot; |
| FALSE_POSITIVE | &quot;FALSE_POSITIVE&quot; |
| BENIGN_POSITIVE | &quot;BENIGN_POSITIVE&quot; |



