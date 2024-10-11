# TimedMetadataInsertion

Insert user-defined custom ID3 metadata (id3) at timecodes (timecode) that you specify. In each output that you want to include this metadata, you must set ID3 metadata (timedMetadata) to Passthrough (PASSTHROUGH).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id3_insertions** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.timed_metadata_insertion import TimedMetadataInsertion

# TODO update the JSON string below
json = "{}"
# create an instance of TimedMetadataInsertion from a JSON string
timed_metadata_insertion_instance = TimedMetadataInsertion.from_json(json)
# print the JSON string representation of the object
print(TimedMetadataInsertion.to_json())

# convert the object into a dict
timed_metadata_insertion_dict = timed_metadata_insertion_instance.to_dict()
# create an instance of TimedMetadataInsertion from a dict
timed_metadata_insertion_from_dict = TimedMetadataInsertion.from_dict(timed_metadata_insertion_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


