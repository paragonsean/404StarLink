

# UpdateOrganizationConfigurationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**autoEnable** | **Boolean** | &lt;p&gt;Whether to automatically enable Security Hub for new accounts in the organization.&lt;/p&gt; &lt;p&gt;By default, this is &lt;code&gt;false&lt;/code&gt;, and new accounts are not added automatically.&lt;/p&gt; &lt;p&gt;To automatically enable Security Hub for new accounts, set this to &lt;code&gt;true&lt;/code&gt;.&lt;/p&gt; |  |
|**autoEnableStandards** | [**AutoEnableStandardsEnum**](#AutoEnableStandardsEnum) | &lt;p&gt;Whether to automatically enable Security Hub &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards-enable-disable.html\&quot;&gt;default standards&lt;/a&gt; for new member accounts in the organization.&lt;/p&gt; &lt;p&gt;By default, this parameter is equal to &lt;code&gt;DEFAULT&lt;/code&gt;, and new member accounts are automatically enabled with default Security Hub standards.&lt;/p&gt; &lt;p&gt;To opt out of enabling default standards for new member accounts, set this parameter equal to &lt;code&gt;NONE&lt;/code&gt;.&lt;/p&gt; |  [optional] |



## Enum: AutoEnableStandardsEnum

| Name | Value |
|---- | -----|
| NONE | &quot;NONE&quot; |
| DEFAULT | &quot;DEFAULT&quot; |



