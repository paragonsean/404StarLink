

# UpgradeInstanceInternalRequest

Request for upgrading a notebook instance from within the VM

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Optional. The optional UpgradeType. Setting this field will search for additional compute images to upgrade this instance. |  [optional] |
|**vmId** | **String** | Required. The VM hardware token for authenticating the VM. https://cloud.google.com/compute/docs/instances/verifying-instance-identity |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| TYPE_UNSPECIFIED | &quot;UPGRADE_TYPE_UNSPECIFIED&quot; |
| FRAMEWORK | &quot;UPGRADE_FRAMEWORK&quot; |
| OS | &quot;UPGRADE_OS&quot; |
| CUDA | &quot;UPGRADE_CUDA&quot; |
| ALL | &quot;UPGRADE_ALL&quot; |



