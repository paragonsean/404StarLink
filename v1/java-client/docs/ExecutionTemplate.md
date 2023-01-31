

# ExecutionTemplate

The description a notebook execution workload.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**acceleratorConfig** | [**SchedulerAcceleratorConfig**](SchedulerAcceleratorConfig.md) |  |  [optional] |
|**containerImageUri** | **String** | Container Image URI to a DLVM Example: &#39;gcr.io/deeplearning-platform-release/base-cu100&#39; More examples can be found at: https://cloud.google.com/ai-platform/deep-learning-containers/docs/choosing-container |  [optional] |
|**dataprocParameters** | [**DataprocParameters**](DataprocParameters.md) |  |  [optional] |
|**inputNotebookFile** | **String** | Path to the notebook file to execute. Must be in a Google Cloud Storage bucket. Format: &#x60;gs://{bucket_name}/{folder}/{notebook_file_name}&#x60; Ex: &#x60;gs://notebook_user/scheduled_notebooks/sentiment_notebook.ipynb&#x60; |  [optional] |
|**jobType** | [**JobTypeEnum**](#JobTypeEnum) | The type of Job to be used on this execution. |  [optional] |
|**kernelSpec** | **String** | Name of the kernel spec to use. This must be specified if the kernel spec name on the execution target does not match the name in the input notebook file. |  [optional] |
|**labels** | **Map&lt;String, String&gt;** | Labels for execution. If execution is scheduled, a field included will be &#39;nbs-scheduled&#39;. Otherwise, it is an immediate execution, and an included field will be &#39;nbs-immediate&#39;. Use fields to efficiently index between various types of executions. |  [optional] |
|**masterType** | **String** | Specifies the type of virtual machine to use for your training job&#39;s master worker. You must specify this field when &#x60;scaleTier&#x60; is set to &#x60;CUSTOM&#x60;. You can use certain Compute Engine machine types directly in this field. The following types are supported: - &#x60;n1-standard-4&#x60; - &#x60;n1-standard-8&#x60; - &#x60;n1-standard-16&#x60; - &#x60;n1-standard-32&#x60; - &#x60;n1-standard-64&#x60; - &#x60;n1-standard-96&#x60; - &#x60;n1-highmem-2&#x60; - &#x60;n1-highmem-4&#x60; - &#x60;n1-highmem-8&#x60; - &#x60;n1-highmem-16&#x60; - &#x60;n1-highmem-32&#x60; - &#x60;n1-highmem-64&#x60; - &#x60;n1-highmem-96&#x60; - &#x60;n1-highcpu-16&#x60; - &#x60;n1-highcpu-32&#x60; - &#x60;n1-highcpu-64&#x60; - &#x60;n1-highcpu-96&#x60; Alternatively, you can use the following legacy machine types: - &#x60;standard&#x60; - &#x60;large_model&#x60; - &#x60;complex_model_s&#x60; - &#x60;complex_model_m&#x60; - &#x60;complex_model_l&#x60; - &#x60;standard_gpu&#x60; - &#x60;complex_model_m_gpu&#x60; - &#x60;complex_model_l_gpu&#x60; - &#x60;standard_p100&#x60; - &#x60;complex_model_m_p100&#x60; - &#x60;standard_v100&#x60; - &#x60;large_model_v100&#x60; - &#x60;complex_model_m_v100&#x60; - &#x60;complex_model_l_v100&#x60; Finally, if you want to use a TPU for training, specify &#x60;cloud_tpu&#x60; in this field. Learn more about the [special configuration options for training with TPU](https://cloud.google.com/ai-platform/training/docs/using-tpus#configuring_a_custom_tpu_machine). |  [optional] |
|**outputNotebookFolder** | **String** | Path to the notebook folder to write to. Must be in a Google Cloud Storage bucket path. Format: &#x60;gs://{bucket_name}/{folder}&#x60; Ex: &#x60;gs://notebook_user/scheduled_notebooks&#x60; |  [optional] |
|**parameters** | **String** | Parameters used within the &#39;input_notebook_file&#39; notebook. |  [optional] |
|**paramsYamlFile** | **String** | Parameters to be overridden in the notebook during execution. Ref https://papermill.readthedocs.io/en/latest/usage-parameterize.html on how to specifying parameters in the input notebook and pass them here in an YAML file. Ex: &#x60;gs://notebook_user/scheduled_notebooks/sentiment_notebook_params.yaml&#x60; |  [optional] |
|**scaleTier** | [**ScaleTierEnum**](#ScaleTierEnum) | Required. Scale tier of the hardware used for notebook execution. DEPRECATED Will be discontinued. As right now only CUSTOM is supported. |  [optional] |
|**serviceAccount** | **String** | The email address of a service account to use when running the execution. You must have the &#x60;iam.serviceAccounts.actAs&#x60; permission for the specified service account. |  [optional] |
|**tensorboard** | **String** | The name of a Vertex AI [Tensorboard] resource to which this execution will upload Tensorboard logs. Format: &#x60;projects/{project}/locations/{location}/tensorboards/{tensorboard}&#x60; |  [optional] |
|**vertexAiParameters** | [**VertexAIParameters**](VertexAIParameters.md) |  |  [optional] |



## Enum: JobTypeEnum

| Name | Value |
|---- | -----|
| JOB_TYPE_UNSPECIFIED | &quot;JOB_TYPE_UNSPECIFIED&quot; |
| VERTEX_AI | &quot;VERTEX_AI&quot; |
| DATAPROC | &quot;DATAPROC&quot; |



## Enum: ScaleTierEnum

| Name | Value |
|---- | -----|
| SCALE_TIER_UNSPECIFIED | &quot;SCALE_TIER_UNSPECIFIED&quot; |
| BASIC | &quot;BASIC&quot; |
| STANDARD_1 | &quot;STANDARD_1&quot; |
| PREMIUM_1 | &quot;PREMIUM_1&quot; |
| BASIC_GPU | &quot;BASIC_GPU&quot; |
| BASIC_TPU | &quot;BASIC_TPU&quot; |
| CUSTOM | &quot;CUSTOM&quot; |



