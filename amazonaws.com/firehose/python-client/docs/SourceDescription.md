# SourceDescription

Details about a Kinesis data stream used as the source for a Kinesis Data Firehose delivery stream.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**kinesis_stream_source_description** | [**SourceDescriptionKinesisStreamSourceDescription**](SourceDescriptionKinesisStreamSourceDescription.md) |  | [optional] 

## Example

```python
from openapi_client.models.source_description import SourceDescription

# TODO update the JSON string below
json = "{}"
# create an instance of SourceDescription from a JSON string
source_description_instance = SourceDescription.from_json(json)
# print the JSON string representation of the object
print(SourceDescription.to_json())

# convert the object into a dict
source_description_dict = source_description_instance.to_dict()
# create an instance of SourceDescription from a dict
source_description_from_dict = SourceDescription.from_dict(source_description_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


