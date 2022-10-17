# Id3Insertion

To insert ID3 tags in your output, specify two values. Use ID3 tag (Id3) to specify the base 64 encoded string and use Timecode (TimeCode) to specify the time when the tag should be inserted. To insert multiple ID3 tags in your output, create multiple instances of ID3 insertion (Id3Insertion).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id3** | **str** |  | [optional] 
**timecode** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.id3_insertion import Id3Insertion

# TODO update the JSON string below
json = "{}"
# create an instance of Id3Insertion from a JSON string
id3_insertion_instance = Id3Insertion.from_json(json)
# print the JSON string representation of the object
print(Id3Insertion.to_json())

# convert the object into a dict
id3_insertion_dict = id3_insertion_instance.to_dict()
# create an instance of Id3Insertion from a dict
id3_insertion_from_dict = Id3Insertion.from_dict(id3_insertion_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


