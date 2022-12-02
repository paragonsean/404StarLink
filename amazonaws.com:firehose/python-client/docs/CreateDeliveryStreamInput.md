# CreateDeliveryStreamInput


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**delivery_stream_name** | **str** |  | 
**delivery_stream_type** | [**DeliveryStreamType**](DeliveryStreamType.md) |  | [optional] 
**kinesis_stream_source_configuration** | [**CreateDeliveryStreamInputKinesisStreamSourceConfiguration**](CreateDeliveryStreamInputKinesisStreamSourceConfiguration.md) |  | [optional] 
**delivery_stream_encryption_configuration_input** | [**CreateDeliveryStreamInputDeliveryStreamEncryptionConfigurationInput**](CreateDeliveryStreamInputDeliveryStreamEncryptionConfigurationInput.md) |  | [optional] 
**s3_destination_configuration** | [**CreateDeliveryStreamInputS3DestinationConfiguration**](CreateDeliveryStreamInputS3DestinationConfiguration.md) |  | [optional] 
**extended_s3_destination_configuration** | [**CreateDeliveryStreamInputExtendedS3DestinationConfiguration**](CreateDeliveryStreamInputExtendedS3DestinationConfiguration.md) |  | [optional] 
**redshift_destination_configuration** | [**CreateDeliveryStreamInputRedshiftDestinationConfiguration**](CreateDeliveryStreamInputRedshiftDestinationConfiguration.md) |  | [optional] 
**elasticsearch_destination_configuration** | [**CreateDeliveryStreamInputElasticsearchDestinationConfiguration**](CreateDeliveryStreamInputElasticsearchDestinationConfiguration.md) |  | [optional] 
**amazonopensearchservice_destination_configuration** | [**CreateDeliveryStreamInputAmazonopensearchserviceDestinationConfiguration**](CreateDeliveryStreamInputAmazonopensearchserviceDestinationConfiguration.md) |  | [optional] 
**splunk_destination_configuration** | [**CreateDeliveryStreamInputSplunkDestinationConfiguration**](CreateDeliveryStreamInputSplunkDestinationConfiguration.md) |  | [optional] 
**http_endpoint_destination_configuration** | [**CreateDeliveryStreamInputHttpEndpointDestinationConfiguration**](CreateDeliveryStreamInputHttpEndpointDestinationConfiguration.md) |  | [optional] 
**tags** | **List** |  | [optional] 
**amazon_open_search_serverless_destination_configuration** | [**CreateDeliveryStreamInputAmazonOpenSearchServerlessDestinationConfiguration**](CreateDeliveryStreamInputAmazonOpenSearchServerlessDestinationConfiguration.md) |  | [optional] 

## Example

```python
from openapi_client.models.create_delivery_stream_input import CreateDeliveryStreamInput

# TODO update the JSON string below
json = "{}"
# create an instance of CreateDeliveryStreamInput from a JSON string
create_delivery_stream_input_instance = CreateDeliveryStreamInput.from_json(json)
# print the JSON string representation of the object
print(CreateDeliveryStreamInput.to_json())

# convert the object into a dict
create_delivery_stream_input_dict = create_delivery_stream_input_instance.to_dict()
# create an instance of CreateDeliveryStreamInput from a dict
create_delivery_stream_input_from_dict = CreateDeliveryStreamInput.from_dict(create_delivery_stream_input_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


