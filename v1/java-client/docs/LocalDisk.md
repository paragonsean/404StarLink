

# LocalDisk

A Local attached disk resource.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**autoDelete** | **Boolean** | Optional. Output only. Specifies whether the disk will be auto-deleted when the instance is deleted (but not when the disk is detached from the instance). |  [optional] [readonly] |
|**boot** | **Boolean** | Optional. Output only. Indicates that this is a boot disk. The virtual machine will use the first partition of the disk for its root filesystem. |  [optional] [readonly] |
|**deviceName** | **String** | Optional. Output only. Specifies a unique device name of your choice that is reflected into the &#x60;/dev/disk/by-id/google-*&#x60; tree of a Linux operating system running within the instance. This name can be used to reference the device for mounting, resizing, and so on, from within the instance. If not specified, the server chooses a default device name to apply to this disk, in the form persistent-disk-x, where x is a number assigned by Google Compute Engine. This field is only applicable for persistent disks. |  [optional] [readonly] |
|**guestOsFeatures** | [**List&lt;RuntimeGuestOsFeature&gt;**](RuntimeGuestOsFeature.md) | Output only. Indicates a list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available options. |  [optional] [readonly] |
|**index** | **Integer** | Output only. A zero-based index to this disk, where 0 is reserved for the boot disk. If you have many disks attached to an instance, each disk would have a unique index number. |  [optional] [readonly] |
|**initializeParams** | [**LocalDiskInitializeParams**](LocalDiskInitializeParams.md) |  |  [optional] |
|**_interface** | **String** | Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI. Persistent disks must always use SCSI and the request will fail if you attempt to attach a persistent disk in any other format than SCSI. Local SSDs can use either NVME or SCSI. For performance characteristics of SCSI over NVMe, see Local SSD performance. Valid values: * &#x60;NVME&#x60; * &#x60;SCSI&#x60; |  [optional] |
|**kind** | **String** | Output only. Type of the resource. Always compute#attachedDisk for attached disks. |  [optional] [readonly] |
|**licenses** | **List&lt;String&gt;** | Output only. Any valid publicly visible licenses. |  [optional] [readonly] |
|**mode** | **String** | The mode in which to attach this disk, either &#x60;READ_WRITE&#x60; or &#x60;READ_ONLY&#x60;. If not specified, the default is to attach the disk in &#x60;READ_WRITE&#x60; mode. Valid values: * &#x60;READ_ONLY&#x60; * &#x60;READ_WRITE&#x60; |  [optional] |
|**source** | **String** | Specifies a valid partial or full URL to an existing Persistent Disk resource. |  [optional] |
|**type** | **String** | Specifies the type of the disk, either &#x60;SCRATCH&#x60; or &#x60;PERSISTENT&#x60;. If not specified, the default is &#x60;PERSISTENT&#x60;. Valid values: * &#x60;PERSISTENT&#x60; * &#x60;SCRATCH&#x60; |  [optional] |



