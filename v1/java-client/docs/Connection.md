

# Connection

Connection represents an instance of connector.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authConfig** | [**AuthConfig**](AuthConfig.md) |  |  [optional] |
|**configVariables** | [**List&lt;ConfigVariable&gt;**](ConfigVariable.md) | Optional. Configuration for configuring the connection with an external system. |  [optional] |
|**connectorVersion** | **String** | Required. Connector version on which the connection is created. The format is: projects/_*_/locations/_*_/providers/_*_/connectors/_*_/versions/_* Only global location is supported for ConnectorVersion resource. |  [optional] |
|**createTime** | **String** | Output only. Created time. |  [optional] [readonly] |
|**description** | **String** | Optional. Description of the resource. |  [optional] |
|**destinationConfigs** | [**List&lt;DestinationConfig&gt;**](DestinationConfig.md) | Optional. Configuration of the Connector&#39;s destination. Only accepted for Connectors that accepts user defined destination(s). |  [optional] |
|**envoyImageLocation** | **String** | Output only. GCR location where the envoy image is stored. formatted like: gcr.io/{bucketName}/{imageName} |  [optional] [readonly] |
|**imageLocation** | **String** | Output only. GCR location where the runtime image is stored. formatted like: gcr.io/{bucketName}/{imageName} |  [optional] [readonly] |
|**labels** | **Map&lt;String, String&gt;** | Optional. Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources |  [optional] |
|**lockConfig** | [**LockConfig**](LockConfig.md) |  |  [optional] |
|**logConfig** | [**ConnectorsLogConfig**](ConnectorsLogConfig.md) |  |  [optional] |
|**name** | **String** | Output only. Resource name of the Connection. Format: projects/{project}/locations/{location}/connections/{connection} |  [optional] [readonly] |
|**nodeConfig** | [**NodeConfig**](NodeConfig.md) |  |  [optional] |
|**serviceAccount** | **String** | Optional. Service account needed for runtime plane to access GCP resources. |  [optional] |
|**serviceDirectory** | **String** | Output only. The name of the Service Directory service name. Used for Private Harpoon to resolve the ILB address. e.g. \&quot;projects/cloud-connectors-e2e-testing/locations/us-central1/namespaces/istio-system/services/istio-ingressgateway-connectors\&quot; |  [optional] [readonly] |
|**sslConfig** | [**SslConfig**](SslConfig.md) |  |  [optional] |
|**status** | [**ConnectionStatus**](ConnectionStatus.md) |  |  [optional] |
|**suspended** | **Boolean** | Optional. Suspended indicates if a user has suspended a connection or not. |  [optional] |
|**updateTime** | **String** | Output only. Updated time. |  [optional] [readonly] |



