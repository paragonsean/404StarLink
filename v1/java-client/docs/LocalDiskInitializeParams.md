

# LocalDiskInitializeParams

Input only. Specifies the parameters for a new disk that will be created alongside the new instance. Use initialization parameters to create boot disks or local SSDs attached to the new runtime. This property is mutually exclusive with the source property; you can only define one or the other, but not both.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Optional. Provide this property when creating the disk. |  [optional] |
|**diskName** | **String** | Optional. Specifies the disk name. If not specified, the default is to use the name of the instance. If the disk with the instance name exists already in the given zone/region, a new name will be automatically generated. |  [optional] |
|**diskSizeGb** | **String** | Optional. Specifies the size of the disk in base-2 GB. If not specified, the disk will be the same size as the image (usually 10GB). If specified, the size must be equal to or larger than 10GB. Default 100 GB. |  [optional] |
|**diskType** | [**DiskTypeEnum**](#DiskTypeEnum) | Input only. The type of the boot disk attached to this instance, defaults to standard persistent disk (&#x60;PD_STANDARD&#x60;). |  [optional] |
|**labels** | **Map&lt;String, String&gt;** | Optional. Labels to apply to this disk. These can be later modified by the disks.setLabels method. This field is only applicable for persistent disks. |  [optional] |



## Enum: DiskTypeEnum

| Name | Value |
|---- | -----|
| DISK_TYPE_UNSPECIFIED | &quot;DISK_TYPE_UNSPECIFIED&quot; |
| PD_STANDARD | &quot;PD_STANDARD&quot; |
| PD_SSD | &quot;PD_SSD&quot; |
| PD_BALANCED | &quot;PD_BALANCED&quot; |
| PD_EXTREME | &quot;PD_EXTREME&quot; |



