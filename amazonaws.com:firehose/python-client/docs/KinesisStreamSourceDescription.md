# KinesisStreamSourceDescription

Details about a Kinesis data stream used as the source for a Kinesis Data Firehose delivery stream.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**kinesis_stream_arn** | **str** |  | [optional] 
**role_arn** | **str** |  | [optional] 
**delivery_start_timestamp** | **datetime** |  | [optional] 

## Example

```python
from openapi_client.models.kinesis_stream_source_description import KinesisStreamSourceDescription

# TODO update the JSON string below
json = "{}"
# create an instance of KinesisStreamSourceDescription from a JSON string
kinesis_stream_source_description_instance = KinesisStreamSourceDescription.from_json(json)
# print the JSON string representation of the object
print(KinesisStreamSourceDescription.to_json())

# convert the object into a dict
kinesis_stream_source_description_dict = kinesis_stream_source_description_instance.to_dict()
# create an instance of KinesisStreamSourceDescription from a dict
kinesis_stream_source_description_from_dict = KinesisStreamSourceDescription.from_dict(kinesis_stream_source_description_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


