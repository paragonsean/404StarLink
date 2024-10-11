

# UpdateSecurityHubConfigurationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**autoEnableControls** | **Boolean** | &lt;p&gt;Whether to automatically enable new controls when they are added to standards that are enabled.&lt;/p&gt; &lt;p&gt;By default, this is set to &lt;code&gt;true&lt;/code&gt;, and new controls are enabled automatically. To not automatically enable new controls, set this to &lt;code&gt;false&lt;/code&gt;. &lt;/p&gt; |  [optional] |
|**controlFindingGenerator** | [**ControlFindingGeneratorEnum**](#ControlFindingGeneratorEnum) | &lt;p&gt;Updates whether the calling account has consolidated control findings turned on. If the value for this field is set to &lt;code&gt;SECURITY_CONTROL&lt;/code&gt;, Security Hub generates a single finding for a control check even when the check applies to multiple enabled standards.&lt;/p&gt; &lt;p&gt;If the value for this field is set to &lt;code&gt;STANDARD_CONTROL&lt;/code&gt;, Security Hub generates separate findings for a control check when the check applies to multiple enabled standards.&lt;/p&gt; &lt;p&gt;For accounts that are part of an organization, this value can only be updated in the administrator account.&lt;/p&gt; |  [optional] |



## Enum: ControlFindingGeneratorEnum

| Name | Value |
|---- | -----|
| STANDARD_CONTROL | &quot;STANDARD_CONTROL&quot; |
| SECURITY_CONTROL | &quot;SECURITY_CONTROL&quot; |



