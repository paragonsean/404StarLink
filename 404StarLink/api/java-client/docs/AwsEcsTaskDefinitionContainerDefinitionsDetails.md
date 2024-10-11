

# AwsEcsTaskDefinitionContainerDefinitionsDetails

A container definition that describes a container in the task.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**command** | [**List**](List.md) |  |  [optional] |
|**cpu** | [**Integer**](Integer.md) |  |  [optional] |
|**dependsOn** | [**List**](List.md) |  |  [optional] |
|**disableNetworking** | [**Boolean**](Boolean.md) |  |  [optional] |
|**dnsSearchDomains** | [**List**](List.md) |  |  [optional] |
|**dnsServers** | [**List**](List.md) |  |  [optional] |
|**dockerLabels** | [**Map**](Map.md) |  |  [optional] |
|**dockerSecurityOptions** | [**List**](List.md) |  |  [optional] |
|**entryPoint** | [**List**](List.md) |  |  [optional] |
|**environment** | [**List**](List.md) |  |  [optional] |
|**environmentFiles** | [**List**](List.md) |  |  [optional] |
|**essential** | [**Boolean**](Boolean.md) |  |  [optional] |
|**extraHosts** | [**List**](List.md) |  |  [optional] |
|**firelensConfiguration** | [**AwsEcsTaskDefinitionContainerDefinitionsDetailsFirelensConfiguration**](AwsEcsTaskDefinitionContainerDefinitionsDetailsFirelensConfiguration.md) |  |  [optional] |
|**healthCheck** | [**AwsEcsTaskDefinitionContainerDefinitionsDetailsHealthCheck**](AwsEcsTaskDefinitionContainerDefinitionsDetailsHealthCheck.md) |  |  [optional] |
|**hostname** | [**String**](String.md) |  |  [optional] |
|**image** | [**String**](String.md) |  |  [optional] |
|**interactive** | [**Boolean**](Boolean.md) |  |  [optional] |
|**links** | [**List**](List.md) |  |  [optional] |
|**linuxParameters** | [**AwsEcsTaskDefinitionContainerDefinitionsDetailsLinuxParameters**](AwsEcsTaskDefinitionContainerDefinitionsDetailsLinuxParameters.md) |  |  [optional] |
|**logConfiguration** | [**AwsEcsTaskDefinitionContainerDefinitionsDetailsLogConfiguration**](AwsEcsTaskDefinitionContainerDefinitionsDetailsLogConfiguration.md) |  |  [optional] |
|**memory** | [**Integer**](Integer.md) |  |  [optional] |
|**memoryReservation** | [**Integer**](Integer.md) |  |  [optional] |
|**mountPoints** | [**List**](List.md) |  |  [optional] |
|**name** | [**String**](String.md) |  |  [optional] |
|**portMappings** | [**List**](List.md) |  |  [optional] |
|**privileged** | [**Boolean**](Boolean.md) |  |  [optional] |
|**pseudoTerminal** | [**Boolean**](Boolean.md) |  |  [optional] |
|**readonlyRootFilesystem** | [**Boolean**](Boolean.md) |  |  [optional] |
|**repositoryCredentials** | [**AwsEcsTaskDefinitionContainerDefinitionsDetailsRepositoryCredentials**](AwsEcsTaskDefinitionContainerDefinitionsDetailsRepositoryCredentials.md) |  |  [optional] |
|**resourceRequirements** | [**List**](List.md) |  |  [optional] |
|**secrets** | [**List**](List.md) |  |  [optional] |
|**startTimeout** | [**Integer**](Integer.md) |  |  [optional] |
|**stopTimeout** | [**Integer**](Integer.md) |  |  [optional] |
|**systemControls** | [**List**](List.md) |  |  [optional] |
|**ulimits** | [**List**](List.md) |  |  [optional] |
|**user** | [**String**](String.md) |  |  [optional] |
|**volumesFrom** | [**List**](List.md) |  |  [optional] |
|**workingDirectory** | [**String**](String.md) |  |  [optional] |



