# KinesisStreamSourceConfiguration

The stream and role Amazon Resource Names (ARNs) for a Kinesis data stream used as the source for a delivery stream.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**kinesis_stream_arn** | **str** |  | 
**role_arn** | **str** |  | 

## Example

```python
from openapi_client.models.kinesis_stream_source_configuration import KinesisStreamSourceConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of KinesisStreamSourceConfiguration from a JSON string
kinesis_stream_source_configuration_instance = KinesisStreamSourceConfiguration.from_json(json)
# print the JSON string representation of the object
print(KinesisStreamSourceConfiguration.to_json())

# convert the object into a dict
kinesis_stream_source_configuration_dict = kinesis_stream_source_configuration_instance.to_dict()
# create an instance of KinesisStreamSourceConfiguration from a dict
kinesis_stream_source_configuration_from_dict = KinesisStreamSourceConfiguration.from_dict(kinesis_stream_source_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


