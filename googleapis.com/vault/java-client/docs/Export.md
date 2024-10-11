

# Export

An export. To work with Vault resources, the account must have the [required Vault privileges](https://support.google.com/vault/answer/2799699) and access to the matter. To access a matter, the account must have created the matter, have the matter shared with them, or have the **View All Matters** privilege.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cloudStorageSink** | [**CloudStorageSink**](CloudStorageSink.md) |  |  [optional] |
|**createTime** | **String** | Output only. The time when the export was created. |  [optional] |
|**exportOptions** | [**ExportOptions**](ExportOptions.md) |  |  [optional] |
|**id** | **String** | Output only. The generated export ID. |  [optional] |
|**matterId** | **String** | Output only. The matter ID. |  [optional] |
|**name** | **String** | The export name. Don&#39;t use special characters (~!$&#39;(),;@:/?) in the name, they can prevent you from downloading exports. |  [optional] |
|**query** | [**Query**](Query.md) |  |  [optional] |
|**requester** | [**UserInfo**](UserInfo.md) |  |  [optional] |
|**stats** | [**ExportStats**](ExportStats.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Output only. The status of the export. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| EXPORT_STATUS_UNSPECIFIED | &quot;EXPORT_STATUS_UNSPECIFIED&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| FAILED | &quot;FAILED&quot; |
| IN_PROGRESS | &quot;IN_PROGRESS&quot; |



