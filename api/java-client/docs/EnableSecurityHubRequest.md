

# EnableSecurityHubRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | **Map&lt;String, String&gt;** | The tags to add to the hub resource when you enable Security Hub. |  [optional] |
|**enableDefaultStandards** | **Boolean** | Whether to enable the security standards that Security Hub has designated as automatically enabled. If you do not provide a value for &lt;code&gt;EnableDefaultStandards&lt;/code&gt;, it is set to &lt;code&gt;true&lt;/code&gt;. To not enable the automatically enabled standards, set &lt;code&gt;EnableDefaultStandards&lt;/code&gt; to &lt;code&gt;false&lt;/code&gt;. |  [optional] |
|**controlFindingGenerator** | [**ControlFindingGeneratorEnum**](#ControlFindingGeneratorEnum) | &lt;p&gt;This field, used when enabling Security Hub, specifies whether the calling account has consolidated control findings turned on. If the value for this field is set to &lt;code&gt;SECURITY_CONTROL&lt;/code&gt;, Security Hub generates a single finding for a control check even when the check applies to multiple enabled standards.&lt;/p&gt; &lt;p&gt;If the value for this field is set to &lt;code&gt;STANDARD_CONTROL&lt;/code&gt;, Security Hub generates separate findings for a control check when the check applies to multiple enabled standards.&lt;/p&gt; &lt;p&gt;The value for this field in a member account matches the value in the administrator account. For accounts that aren&#39;t part of an organization, the default value of this field is &lt;code&gt;SECURITY_CONTROL&lt;/code&gt; if you enabled Security Hub on or after February 23, 2023.&lt;/p&gt; |  [optional] |



## Enum: ControlFindingGeneratorEnum

| Name | Value |
|---- | -----|
| STANDARD_CONTROL | &quot;STANDARD_CONTROL&quot; |
| SECURITY_CONTROL | &quot;SECURITY_CONTROL&quot; |



