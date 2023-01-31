

# AcceleratorConfig

Definition of a hardware accelerator. Note that not all combinations of `type` and `core_count` are valid. Check [GPUs on Compute Engine](https://cloud.google.com/compute/docs/gpus/#gpus-list) to find a valid combination. TPUs are not supported.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**coreCount** | **String** | Count of cores of this accelerator. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of this accelerator. |  [optional] |



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



