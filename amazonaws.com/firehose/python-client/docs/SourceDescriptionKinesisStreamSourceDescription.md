# SourceDescriptionKinesisStreamSourceDescription


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**kinesis_stream_arn** | **str** |  | [optional] 
**role_arn** | **str** |  | [optional] 
**delivery_start_timestamp** | **datetime** |  | [optional] 

## Example

```python
from openapi_client.models.source_description_kinesis_stream_source_description import SourceDescriptionKinesisStreamSourceDescription

# TODO update the JSON string below
json = "{}"
# create an instance of SourceDescriptionKinesisStreamSourceDescription from a JSON string
source_description_kinesis_stream_source_description_instance = SourceDescriptionKinesisStreamSourceDescription.from_json(json)
# print the JSON string representation of the object
print(SourceDescriptionKinesisStreamSourceDescription.to_json())

# convert the object into a dict
source_description_kinesis_stream_source_description_dict = source_description_kinesis_stream_source_description_instance.to_dict()
# create an instance of SourceDescriptionKinesisStreamSourceDescription from a dict
source_description_kinesis_stream_source_description_from_dict = SourceDescriptionKinesisStreamSourceDescription.from_dict(source_description_kinesis_stream_source_description_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


