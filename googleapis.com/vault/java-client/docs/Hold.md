

# Hold

A hold. A hold prevents the specified Google Workspace service from purging data for specific accounts or all members of an organizational unit. To work with Vault resources, the account must have the [required Vault privileges] (https://support.google.com/vault/answer/2799699) and access to the matter. To access a matter, the account must have created the matter, have the matter shared with them, or have the **View All Matters** privilege.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accounts** | [**List&lt;HeldAccount&gt;**](HeldAccount.md) | If set, the hold applies to the specified accounts and **orgUnit** must be empty. |  [optional] |
|**corpus** | [**CorpusEnum**](#CorpusEnum) | The service to be searched. |  [optional] |
|**holdId** | **String** | The unique immutable ID of the hold. Assigned during creation. |  [optional] |
|**name** | **String** | The name of the hold. |  [optional] |
|**orgUnit** | [**HeldOrgUnit**](HeldOrgUnit.md) |  |  [optional] |
|**query** | [**CorpusQuery**](CorpusQuery.md) |  |  [optional] |
|**updateTime** | **String** | The last time this hold was modified. |  [optional] |



## Enum: CorpusEnum

| Name | Value |
|---- | -----|
| CORPUS_TYPE_UNSPECIFIED | &quot;CORPUS_TYPE_UNSPECIFIED&quot; |
| DRIVE | &quot;DRIVE&quot; |
| MAIL | &quot;MAIL&quot; |
| GROUPS | &quot;GROUPS&quot; |
| HANGOUTS_CHAT | &quot;HANGOUTS_CHAT&quot; |
| VOICE | &quot;VOICE&quot; |



