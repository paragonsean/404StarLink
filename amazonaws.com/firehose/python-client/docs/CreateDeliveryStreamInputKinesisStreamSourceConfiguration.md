# CreateDeliveryStreamInputKinesisStreamSourceConfiguration


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**kinesis_stream_arn** | **str** |  | 
**role_arn** | **str** |  | 

## Example

```python
from openapi_client.models.create_delivery_stream_input_kinesis_stream_source_configuration import CreateDeliveryStreamInputKinesisStreamSourceConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of CreateDeliveryStreamInputKinesisStreamSourceConfiguration from a JSON string
create_delivery_stream_input_kinesis_stream_source_configuration_instance = CreateDeliveryStreamInputKinesisStreamSourceConfiguration.from_json(json)
# print the JSON string representation of the object
print(CreateDeliveryStreamInputKinesisStreamSourceConfiguration.to_json())

# convert the object into a dict
create_delivery_stream_input_kinesis_stream_source_configuration_dict = create_delivery_stream_input_kinesis_stream_source_configuration_instance.to_dict()
# create an instance of CreateDeliveryStreamInputKinesisStreamSourceConfiguration from a dict
create_delivery_stream_input_kinesis_stream_source_configuration_from_dict = CreateDeliveryStreamInputKinesisStreamSourceConfiguration.from_dict(create_delivery_stream_input_kinesis_stream_source_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


