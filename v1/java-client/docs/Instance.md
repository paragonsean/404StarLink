

# Instance

The definition of a notebook instance.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**acceleratorConfig** | [**AcceleratorConfig**](AcceleratorConfig.md) |  |  [optional] |
|**bootDiskSizeGb** | **String** | Input only. The size of the boot disk in GB attached to this instance, up to a maximum of 64000 GB (64 TB). The minimum recommended value is 100 GB. If not specified, this defaults to 100. |  [optional] |
|**bootDiskType** | [**BootDiskTypeEnum**](#BootDiskTypeEnum) | Input only. The type of the boot disk attached to this instance, defaults to standard persistent disk (&#x60;PD_STANDARD&#x60;). |  [optional] |
|**canIpForward** | **Boolean** | Optional. Flag to enable ip forwarding or not, default false/off. https://cloud.google.com/vpc/docs/using-routes#canipforward |  [optional] |
|**containerImage** | [**ContainerImage**](ContainerImage.md) |  |  [optional] |
|**createTime** | **String** | Output only. Instance creation time. |  [optional] [readonly] |
|**creator** | **String** | Output only. Email address of entity that sent original CreateInstance request. |  [optional] [readonly] |
|**customGpuDriverPath** | **String** | Specify a custom Cloud Storage path where the GPU driver is stored. If not specified, we&#39;ll automatically choose from official GPU drivers. |  [optional] |
|**dataDiskSizeGb** | **String** | Input only. The size of the data disk in GB attached to this instance, up to a maximum of 64000 GB (64 TB). You can choose the size of the data disk based on how big your notebooks and data are. If not specified, this defaults to 100. |  [optional] |
|**dataDiskType** | [**DataDiskTypeEnum**](#DataDiskTypeEnum) | Input only. The type of the data disk attached to this instance, defaults to standard persistent disk (&#x60;PD_STANDARD&#x60;). |  [optional] |
|**diskEncryption** | [**DiskEncryptionEnum**](#DiskEncryptionEnum) | Input only. Disk encryption method used on the boot and data disks, defaults to GMEK. |  [optional] |
|**disks** | [**List&lt;Disk&gt;**](Disk.md) | Output only. Attached disks to notebook instance. |  [optional] [readonly] |
|**installGpuDriver** | **Boolean** | Whether the end user authorizes Google Cloud to install GPU driver on this instance. If this field is empty or set to false, the GPU driver won&#39;t be installed. Only applicable to instances with GPUs. |  [optional] |
|**instanceOwners** | **List&lt;String&gt;** | Input only. The owner of this instance after creation. Format: &#x60;alias@example.com&#x60; Currently supports one owner only. If not specified, all of the service account users of your VM instance&#39;s service account can use the instance. |  [optional] |
|**kmsKey** | **String** | Input only. The KMS key used to encrypt the disks, only applicable if disk_encryption is CMEK. Format: &#x60;projects/{project_id}/locations/{location}/keyRings/{key_ring_id}/cryptoKeys/{key_id}&#x60; Learn more about [using your own encryption keys](/kms/docs/quickstart). |  [optional] |
|**labels** | **Map&lt;String, String&gt;** | Labels to apply to this instance. These can be later modified by the setLabels method. |  [optional] |
|**machineType** | **String** | Required. The [Compute Engine machine type](https://cloud.google.com/compute/docs/machine-types) of this instance. |  [optional] |
|**metadata** | **Map&lt;String, String&gt;** | Custom metadata to apply to this instance. |  [optional] |
|**name** | **String** | Output only. The name of this notebook instance. Format: &#x60;projects/{project_id}/locations/{location}/instances/{instance_id}&#x60; |  [optional] [readonly] |
|**network** | **String** | The name of the VPC that this instance is in. Format: &#x60;projects/{project_id}/global/networks/{network_id}&#x60; |  [optional] |
|**nicType** | [**NicTypeEnum**](#NicTypeEnum) | Optional. The type of vNIC to be used on this interface. This may be gVNIC or VirtioNet. |  [optional] |
|**noProxyAccess** | **Boolean** | If true, the notebook instance will not register with the proxy. |  [optional] |
|**noPublicIp** | **Boolean** | If true, no public IP will be assigned to this instance. |  [optional] |
|**noRemoveDataDisk** | **Boolean** | Input only. If true, the data disk will not be auto deleted when deleting the instance. |  [optional] |
|**postStartupScript** | **String** | Path to a Bash script that automatically runs after a notebook instance fully boots up. The path must be a URL or Cloud Storage path (&#x60;gs://path-to-file/file-name&#x60;). |  [optional] |
|**proxyUri** | **String** | Output only. The proxy endpoint that is used to access the Jupyter notebook. |  [optional] [readonly] |
|**reservationAffinity** | [**ReservationAffinity**](ReservationAffinity.md) |  |  [optional] |
|**serviceAccount** | **String** | The service account on this instance, giving access to other Google Cloud services. You can use any service account within the same project, but you must have the service account user permission to use the instance. If not specified, the [Compute Engine default service account](https://cloud.google.com/compute/docs/access/service-accounts#default_service_account) is used. |  [optional] |
|**serviceAccountScopes** | **List&lt;String&gt;** | Optional. The URIs of service account scopes to be included in Compute Engine instances. If not specified, the following [scopes](https://cloud.google.com/compute/docs/access/service-accounts#accesscopesiam) are defined: - https://www.googleapis.com/auth/cloud-platform - https://www.googleapis.com/auth/userinfo.email If not using default scopes, you need at least: https://www.googleapis.com/auth/compute |  [optional] |
|**shieldedInstanceConfig** | [**ShieldedInstanceConfig**](ShieldedInstanceConfig.md) |  |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | Output only. The state of this instance. |  [optional] [readonly] |
|**subnet** | **String** | The name of the subnet that this instance is in. Format: &#x60;projects/{project_id}/regions/{region}/subnetworks/{subnetwork_id}&#x60; |  [optional] |
|**tags** | **List&lt;String&gt;** | Optional. The Compute Engine tags to add to runtime (see [Tagging instances](https://cloud.google.com/compute/docs/label-or-tag-resources#tags)). |  [optional] |
|**updateTime** | **String** | Output only. Instance update time. |  [optional] [readonly] |
|**upgradeHistory** | [**List&lt;UpgradeHistoryEntry&gt;**](UpgradeHistoryEntry.md) | The upgrade history of this instance. |  [optional] |
|**vmImage** | [**VmImage**](VmImage.md) |  |  [optional] |



## Enum: BootDiskTypeEnum

| Name | Value |
|---- | -----|
| DISK_TYPE_UNSPECIFIED | &quot;DISK_TYPE_UNSPECIFIED&quot; |
| PD_STANDARD | &quot;PD_STANDARD&quot; |
| PD_SSD | &quot;PD_SSD&quot; |
| PD_BALANCED | &quot;PD_BALANCED&quot; |
| PD_EXTREME | &quot;PD_EXTREME&quot; |



## Enum: DataDiskTypeEnum

| Name | Value |
|---- | -----|
| DISK_TYPE_UNSPECIFIED | &quot;DISK_TYPE_UNSPECIFIED&quot; |
| PD_STANDARD | &quot;PD_STANDARD&quot; |
| PD_SSD | &quot;PD_SSD&quot; |
| PD_BALANCED | &quot;PD_BALANCED&quot; |
| PD_EXTREME | &quot;PD_EXTREME&quot; |



## Enum: DiskEncryptionEnum

| Name | Value |
|---- | -----|
| DISK_ENCRYPTION_UNSPECIFIED | &quot;DISK_ENCRYPTION_UNSPECIFIED&quot; |
| GMEK | &quot;GMEK&quot; |
| CMEK | &quot;CMEK&quot; |



## Enum: NicTypeEnum

| Name | Value |
|---- | -----|
| UNSPECIFIED_NIC_TYPE | &quot;UNSPECIFIED_NIC_TYPE&quot; |
| VIRTIO_NET | &quot;VIRTIO_NET&quot; |
| GVNIC | &quot;GVNIC&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| STATE_UNSPECIFIED | &quot;STATE_UNSPECIFIED&quot; |
| STARTING | &quot;STARTING&quot; |
| PROVISIONING | &quot;PROVISIONING&quot; |
| ACTIVE | &quot;ACTIVE&quot; |
| STOPPING | &quot;STOPPING&quot; |
| STOPPED | &quot;STOPPED&quot; |
| DELETED | &quot;DELETED&quot; |
| UPGRADING | &quot;UPGRADING&quot; |
| INITIALIZING | &quot;INITIALIZING&quot; |
| REGISTERING | &quot;REGISTERING&quot; |
| SUSPENDING | &quot;SUSPENDING&quot; |
| SUSPENDED | &quot;SUSPENDED&quot; |



