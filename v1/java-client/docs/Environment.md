

# Environment

Definition of a software environment that is used to start a notebook instance.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**containerImage** | [**ContainerImage**](ContainerImage.md) |  |  [optional] |
|**createTime** | **String** | Output only. The time at which this environment was created. |  [optional] [readonly] |
|**description** | **String** | A brief description of this environment. |  [optional] |
|**displayName** | **String** | Display name of this environment for the UI. |  [optional] |
|**name** | **String** | Output only. Name of this environment. Format: &#x60;projects/{project_id}/locations/{location}/environments/{environment_id}&#x60; |  [optional] [readonly] |
|**postStartupScript** | **String** | Path to a Bash script that automatically runs after a notebook instance fully boots up. The path must be a URL or Cloud Storage path. Example: &#x60;\&quot;gs://path-to-file/file-name\&quot;&#x60; |  [optional] |
|**vmImage** | [**VmImage**](VmImage.md) |  |  [optional] |



