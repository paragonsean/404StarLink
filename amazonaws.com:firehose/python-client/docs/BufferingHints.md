# BufferingHints

Describes hints for the buffering to perform before delivering data to the destination. These options are treated as hints, and therefore Kinesis Data Firehose might choose to use different values when it is optimal. The <code>SizeInMBs</code> and <code>IntervalInSeconds</code> parameters are optional. However, if specify a value for one of them, you must also provide a value for the other.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**size_in_mbs** | **int** |  | [optional] 
**interval_in_seconds** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.buffering_hints import BufferingHints

# TODO update the JSON string below
json = "{}"
# create an instance of BufferingHints from a JSON string
buffering_hints_instance = BufferingHints.from_json(json)
# print the JSON string representation of the object
print(BufferingHints.to_json())

# convert the object into a dict
buffering_hints_dict = buffering_hints_instance.to_dict()
# create an instance of BufferingHints from a dict
buffering_hints_from_dict = BufferingHints.from_dict(buffering_hints_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


