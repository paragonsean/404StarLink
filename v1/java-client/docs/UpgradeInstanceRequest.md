

# UpgradeInstanceRequest

Request for upgrading a notebook instance

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Optional. The optional UpgradeType. Setting this field will search for additional compute images to upgrade this instance. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| TYPE_UNSPECIFIED | &quot;UPGRADE_TYPE_UNSPECIFIED&quot; |
| FRAMEWORK | &quot;UPGRADE_FRAMEWORK&quot; |
| OS | &quot;UPGRADE_OS&quot; |
| CUDA | &quot;UPGRADE_CUDA&quot; |
| ALL | &quot;UPGRADE_ALL&quot; |



