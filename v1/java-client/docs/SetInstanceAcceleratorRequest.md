

# SetInstanceAcceleratorRequest

Request for setting instance accelerator.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**coreCount** | **String** | Required. Count of cores of this accelerator. Note that not all combinations of &#x60;type&#x60; and &#x60;core_count&#x60; are valid. Check [GPUs on Compute Engine](https://cloud.google.com/compute/docs/gpus/#gpus-list) to find a valid combination. TPUs are not supported. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Required. Type of this accelerator. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ACCELERATOR_TYPE_UNSPECIFIED | &quot;ACCELERATOR_TYPE_UNSPECIFIED&quot; |
| NVIDIA_TESLA_K80 | &quot;NVIDIA_TESLA_K80&quot; |
| NVIDIA_TESLA_P100 | &quot;NVIDIA_TESLA_P100&quot; |
| NVIDIA_TESLA_V100 | &quot;NVIDIA_TESLA_V100&quot; |
| NVIDIA_TESLA_P4 | &quot;NVIDIA_TESLA_P4&quot; |
| NVIDIA_TESLA_T4 | &quot;NVIDIA_TESLA_T4&quot; |
| NVIDIA_TESLA_A100 | &quot;NVIDIA_TESLA_A100&quot; |
| NVIDIA_TESLA_T4_VWS | &quot;NVIDIA_TESLA_T4_VWS&quot; |
| NVIDIA_TESLA_P100_VWS | &quot;NVIDIA_TESLA_P100_VWS&quot; |
| NVIDIA_TESLA_P4_VWS | &quot;NVIDIA_TESLA_P4_VWS&quot; |
| TPU_V2 | &quot;TPU_V2&quot; |
| TPU_V3 | &quot;TPU_V3&quot; |



