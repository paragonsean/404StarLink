# TimecodeBurnin

Settings for burning the output timecode and specified prefix into the output.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**font_size** | **int** |  | [optional] 
**position** | [**TimecodeBurninPosition**](TimecodeBurninPosition.md) |  | [optional] 
**prefix** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.timecode_burnin import TimecodeBurnin

# TODO update the JSON string below
json = "{}"
# create an instance of TimecodeBurnin from a JSON string
timecode_burnin_instance = TimecodeBurnin.from_json(json)
# print the JSON string representation of the object
print(TimecodeBurnin.to_json())

# convert the object into a dict
timecode_burnin_dict = timecode_burnin_instance.to_dict()
# create an instance of TimecodeBurnin from a dict
timecode_burnin_from_dict = TimecodeBurnin.from_dict(timecode_burnin_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


