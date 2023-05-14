

# KafkaSettings

Provides information that describes an Apache Kafka endpoint. This information includes the output format of records applied to the endpoint and details of transaction and control table data information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**broker** | [**String**](String.md) |  |  [optional] |
|**topic** | [**String**](String.md) |  |  [optional] |
|**messageFormat** | [**MessageFormatValue**](MessageFormatValue.md) |  |  [optional] |
|**includeTransactionDetails** | [**Boolean**](Boolean.md) |  |  [optional] |
|**includePartitionValue** | [**Boolean**](Boolean.md) |  |  [optional] |
|**partitionIncludeSchemaTable** | [**Boolean**](Boolean.md) |  |  [optional] |
|**includeTableAlterOperations** | [**Boolean**](Boolean.md) |  |  [optional] |
|**includeControlDetails** | [**Boolean**](Boolean.md) |  |  [optional] |
|**messageMaxBytes** | [**Integer**](Integer.md) |  |  [optional] |
|**includeNullAndEmpty** | [**Boolean**](Boolean.md) |  |  [optional] |
|**securityProtocol** | [**KafkaSecurityProtocol**](KafkaSecurityProtocol.md) |  |  [optional] |
|**sslClientCertificateArn** | [**String**](String.md) |  |  [optional] |
|**sslClientKeyArn** | [**String**](String.md) |  |  [optional] |
|**sslClientKeyPassword** | [**String**](String.md) |  |  [optional] |
|**sslCaCertificateArn** | [**String**](String.md) |  |  [optional] |
|**saslUsername** | [**String**](String.md) |  |  [optional] |
|**saslPassword** | [**String**](String.md) |  |  [optional] |
|**noHexPrefix** | [**Boolean**](Boolean.md) |  |  [optional] |
|**saslMechanism** | [**KafkaSaslMechanism**](KafkaSaslMechanism.md) |  |  [optional] |



