

# RuntimeAcceleratorConfig

Definition of the types of hardware accelerators that can be used. Definition of the types of hardware accelerators that can be used. See [Compute Engine AcceleratorTypes](https://cloud.google.com/compute/docs/reference/beta/acceleratorTypes). Examples: * `nvidia-tesla-k80` * `nvidia-tesla-p100` * `nvidia-tesla-v100` * `nvidia-tesla-p4` * `nvidia-tesla-t4` * `nvidia-tesla-a100`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**coreCount** | **String** | Count of cores of this accelerator. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Accelerator model. |  [optional] |



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
| TPU_V2 | &quot;TPU_V2&quot; |
| TPU_V3 | &quot;TPU_V3&quot; |
| NVIDIA_TESLA_T4_VWS | &quot;NVIDIA_TESLA_T4_VWS&quot; |
| NVIDIA_TESLA_P100_VWS | &quot;NVIDIA_TESLA_P100_VWS&quot; |
| NVIDIA_TESLA_P4_VWS | &quot;NVIDIA_TESLA_P4_VWS&quot; |



