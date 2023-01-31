

# RuntimeSoftwareConfig

Specifies the selection and configuration of software inside the runtime. The properties to set on runtime. Properties keys are specified in `key:value` format, for example: * `idle_shutdown: true` * `idle_shutdown_timeout: 180` * `enable_health_monitoring: true`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customGpuDriverPath** | **String** | Specify a custom Cloud Storage path where the GPU driver is stored. If not specified, we&#39;ll automatically choose from official GPU drivers. |  [optional] |
|**disableTerminal** | **Boolean** | Bool indicating whether JupyterLab terminal will be available or not. Default: False |  [optional] |
|**enableHealthMonitoring** | **Boolean** | Verifies core internal services are running. Default: True |  [optional] |
|**idleShutdown** | **Boolean** | Runtime will automatically shutdown after idle_shutdown_time. Default: True |  [optional] |
|**idleShutdownTimeout** | **Integer** | Time in minutes to wait before shutting down runtime. Default: 180 minutes |  [optional] |
|**installGpuDriver** | **Boolean** | Install Nvidia Driver automatically. Default: True |  [optional] |
|**kernels** | [**List&lt;ContainerImage&gt;**](ContainerImage.md) | Optional. Use a list of container images to use as Kernels in the notebook instance. |  [optional] |
|**mixerDisabled** | **Boolean** | Bool indicating whether mixer client should be disabled. Default: False |  [optional] |
|**notebookUpgradeSchedule** | **String** | Cron expression in UTC timezone, used to schedule instance auto upgrade. Please follow the [cron format](https://en.wikipedia.org/wiki/Cron). |  [optional] |
|**postStartupScript** | **String** | Path to a Bash script that automatically runs after a notebook instance fully boots up. The path must be a URL or Cloud Storage path (&#x60;gs://path-to-file/file-name&#x60;). |  [optional] |
|**postStartupScriptBehavior** | [**PostStartupScriptBehaviorEnum**](#PostStartupScriptBehaviorEnum) | Behavior for the post startup script. |  [optional] |
|**upgradeable** | **Boolean** | Output only. Bool indicating whether an newer image is available in an image family. |  [optional] [readonly] |
|**version** | **String** | Output only. version of boot image such as M100, from release label of the image. |  [optional] [readonly] |



## Enum: PostStartupScriptBehaviorEnum

| Name | Value |
|---- | -----|
| POST_STARTUP_SCRIPT_BEHAVIOR_UNSPECIFIED | &quot;POST_STARTUP_SCRIPT_BEHAVIOR_UNSPECIFIED&quot; |
| RUN_EVERY_START | &quot;RUN_EVERY_START&quot; |
| DOWNLOAD_AND_RUN_EVERY_START | &quot;DOWNLOAD_AND_RUN_EVERY_START&quot; |



